package com.tencent.angel.client;

import com.tencent.angel.core.graph.TensorProtos.TensorProto;
import com.tencent.angel.core.graph.TensorShapeProtos.TensorShapeProto;
import com.tencent.angel.core.graph.TypesProtos;
import com.tencent.angel.serving.apis.common.ModelSpecProtos.ModelSpec;
import com.tencent.angel.serving.apis.modelmgr.GetModelStatusProtos.GetModelStatusRequest;
import com.tencent.angel.serving.apis.modelmgr.GetModelStatusProtos.GetModelStatusResponse;
import com.tencent.angel.serving.apis.modelmgr.ModelServiceGrpc;
import com.tencent.angel.serving.apis.prediction.PredictProtos.PredictRequest;
import com.tencent.angel.serving.apis.prediction.PredictProtos.PredictResponse;
import com.tencent.angel.serving.apis.prediction.PredictionServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

import io.grpc.channelz.v1.ChannelzGrpc;
import io.grpc.channelz.v1.GetChannelRequest;
import io.grpc.channelz.v1.GetServersRequest;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RpcClient {
    private static final Logger LOG = LoggerFactory.getLogger(RpcClient.class);

    private final ManagedChannel channel;
    private final PredictionServiceGrpc.PredictionServiceBlockingStub blockingStub;
    private final PredictionServiceGrpc.PredictionServiceStub asyncStub;
    private final ModelServiceGrpc.ModelServiceBlockingStub modelServiceBlockingStub;
    private final ModelServiceGrpc.ModelServiceStub modelServiceStub;
    private final ChannelzGrpc.ChannelzBlockingStub channelzBlockingStub;

    public RpcClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
//        this(NettyChannelBuilder.forAddress(host, port).usePlaintext(true)
//                .directExecutor().maxMessageSize(Integer.MAX_VALUE));
    }

    /** Construct client for accessing prediction service server using the existing channel. */
    public RpcClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = PredictionServiceGrpc.newBlockingStub(channel);
        asyncStub = PredictionServiceGrpc.newStub(channel);
        modelServiceBlockingStub = ModelServiceGrpc.newBlockingStub(channel);
        modelServiceStub = ModelServiceGrpc.newStub(channel);
        channelzBlockingStub = ChannelzGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void doPredict(String modelName, long modelVersion) {
        float inputs[] = new float[] {-0.515738f, 0.545345f, -1.020538f, 0.89946f, -0.397207f,
                -0.504616f, 0.435321f, -1.351367f, 0.70564f, -0.003322f};
        //build input tensor
        TensorProto.Builder featuresTensorBuilder = TensorProto.newBuilder();
        for (int j = 0; j < inputs.length; ++j) {
            featuresTensorBuilder.addFloatVal(inputs[j]);
        }
        TensorShapeProto.Dim featuresDim1 = TensorShapeProto.Dim.newBuilder().setSize(1).build();
        TensorShapeProto.Dim featuresDim2 = TensorShapeProto.Dim.newBuilder().setSize(inputs.length).build();
        TensorShapeProto featuresShape = TensorShapeProto.newBuilder().addDim(featuresDim1).addDim(featuresDim2)
                .build();
        featuresTensorBuilder.setDtype(TypesProtos.DataType.DT_FLOAT).setTensorShape(featuresShape);
        TensorProto featuresTensorProto = featuresTensorBuilder.build();

        // Generate gRPC request, signature inputs name should be correct or exceptions
        com.google.protobuf.Int64Value version = com.google.protobuf.Int64Value.newBuilder().setValue(modelVersion)
                .build();
        ModelSpec modelSpec = ModelSpec.newBuilder().setName(modelName).setVersion(version)
                .setSignatureName("predict").build();
        PredictRequest request = PredictRequest.newBuilder().setModelSpec(modelSpec)
                .putInputs("inputs", featuresTensorProto).build();
        GetModelStatusRequest statusRequest = GetModelStatusRequest.newBuilder().setModelSpec(modelSpec).build();
        // Request gRPC server
        try {
            /*StreamObserver<PredictResponse> responseStreamObserver = new StreamObserver<PredictResponse>() {
                @Override
                public void onNext(PredictResponse value) {
                    java.util.Map<String, TensorProto> outputs = value.getOutputsMap();
                    LOG.info(outputs.toString());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {
                    LOG.info("finished.");
                }
            };
            asyncStub.predict(request, responseStreamObserver);
            LOG.info("Finished prediction with {} ms", (System.currentTimeMillis() - start));*/
            long start = System.currentTimeMillis();
            PredictResponse response = blockingStub.predict(request);
            LOG.info("Finished prediction with {} ms", (System.currentTimeMillis() - start));
            java.util.Map<String, TensorProto> outputs = response.getOutputsMap();
            LOG.info(outputs.toString());
            start = System.currentTimeMillis();
            GetModelStatusResponse statusResponse = modelServiceBlockingStub.getModelStatus(statusRequest);
            LOG.info("Finished get model status with {} ms", (System.currentTimeMillis() - start));
            LOG.info(statusResponse.toString());
            //LOG.info(channelzBlockingStub.getServers(GetServersRequest.newBuilder().build()).toString());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        for(int i=0; i<10; i++) {
            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    LOG.info("Now in thread.");
                    RpcClient client = new RpcClient("localhost", 8500);
                    String modelName = "default";
                    long modelVersion = 1L;
                    try {
                        for(int i = 0; i < 10; i++) {
                            client.doPredict(modelName, modelVersion);
                        }
                    } finally {
                        client.shutdown();
                    }
                    return null;
                }
            });
        }
        List<Future<String>> futures = executorService.invokeAll(callables);
        executorService.shutdown();
    }
}
