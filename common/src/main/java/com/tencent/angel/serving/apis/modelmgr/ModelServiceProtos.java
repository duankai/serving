// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/modelmgr/model_service.proto

package com.tencent.angel.serving.apis.modelmgr;

public final class ModelServiceProtos {
  private ModelServiceProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!apis/modelmgr/model_service.proto\022\rang" +
      "el.serving\032$apis/modelmgr/get_model_stat" +
      "us.proto\032$apis/modelmgr/model_management" +
      ".proto2\323\001\n\014ModelService\022]\n\016GetModelStatu" +
      "s\022$.angel.serving.GetModelStatusRequest\032" +
      "%.angel.serving.GetModelStatusResponse\022d" +
      "\n\031HandleReloadConfigRequest\022\".angel.serv" +
      "ing.ReloadConfigRequest\032#.angel.serving." +
      "ReloadConfigResponseB?\n\'com.tencent.ange" +
      "l.serving.apis.modelmgrB\022ModelServicePro" +
      "tosP\000b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tencent.angel.serving.apis.modelmgr.GetModelStatusProtos.getDescriptor(),
          com.tencent.angel.serving.apis.modelmgr.ModelManagement.getDescriptor(),
        }, assigner);
    com.tencent.angel.serving.apis.modelmgr.GetModelStatusProtos.getDescriptor();
    com.tencent.angel.serving.apis.modelmgr.ModelManagement.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
