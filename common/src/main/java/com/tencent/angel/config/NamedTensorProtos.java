// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: config/named_tensor.proto

package com.tencent.angel.config;

public final class NamedTensorProtos {
  private NamedTensorProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NamedTensorProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:angel.NamedTensorProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    boolean hasTensor();
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    com.tencent.angel.core.graph.TensorProtos.TensorProto getTensor();
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder getTensorOrBuilder();
  }
  /**
   * <pre>
   * A pair of tensor name and tensor values.
   * </pre>
   *
   * Protobuf type {@code angel.NamedTensorProto}
   */
  public  static final class NamedTensorProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:angel.NamedTensorProto)
      NamedTensorProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NamedTensorProto.newBuilder() to construct.
    private NamedTensorProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NamedTensorProto() {
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NamedTensorProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder subBuilder = null;
              if (tensor_ != null) {
                subBuilder = tensor_.toBuilder();
              }
              tensor_ = input.readMessage(com.tencent.angel.core.graph.TensorProtos.TensorProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tensor_);
                tensor_ = subBuilder.buildPartial();
              }

              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.angel.config.NamedTensorProtos.internal_static_angel_NamedTensorProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.angel.config.NamedTensorProtos.internal_static_angel_NamedTensorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.class, com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Name of the tensor.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TENSOR_FIELD_NUMBER = 2;
    private com.tencent.angel.core.graph.TensorProtos.TensorProto tensor_;
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    public boolean hasTensor() {
      return tensor_ != null;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    public com.tencent.angel.core.graph.TensorProtos.TensorProto getTensor() {
      return tensor_ == null ? com.tencent.angel.core.graph.TensorProtos.TensorProto.getDefaultInstance() : tensor_;
    }
    /**
     * <pre>
     * The client can populate a TensorProto using a tensorflow::Tensor`, or
     * directly using the protobuf field accessors.
     * The client specifies whether the returned tensor values should be
     * filled tensor fields (float_val, int_val, etc.) or encoded in a
     * compact form in tensor.tensor_content.
     * </pre>
     *
     * <code>.angel.TensorProto tensor = 2;</code>
     */
    public com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder getTensorOrBuilder() {
      return getTensor();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (tensor_ != null) {
        output.writeMessage(2, getTensor());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (tensor_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getTensor());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.tencent.angel.config.NamedTensorProtos.NamedTensorProto)) {
        return super.equals(obj);
      }
      com.tencent.angel.config.NamedTensorProtos.NamedTensorProto other = (com.tencent.angel.config.NamedTensorProtos.NamedTensorProto) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && (hasTensor() == other.hasTensor());
      if (hasTensor()) {
        result = result && getTensor()
            .equals(other.getTensor());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (hasTensor()) {
        hash = (37 * hash) + TENSOR_FIELD_NUMBER;
        hash = (53 * hash) + getTensor().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.tencent.angel.config.NamedTensorProtos.NamedTensorProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * A pair of tensor name and tensor values.
     * </pre>
     *
     * Protobuf type {@code angel.NamedTensorProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:angel.NamedTensorProto)
        com.tencent.angel.config.NamedTensorProtos.NamedTensorProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tencent.angel.config.NamedTensorProtos.internal_static_angel_NamedTensorProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tencent.angel.config.NamedTensorProtos.internal_static_angel_NamedTensorProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.class, com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.Builder.class);
      }

      // Construct using com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        name_ = "";

        if (tensorBuilder_ == null) {
          tensor_ = null;
        } else {
          tensor_ = null;
          tensorBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tencent.angel.config.NamedTensorProtos.internal_static_angel_NamedTensorProto_descriptor;
      }

      public com.tencent.angel.config.NamedTensorProtos.NamedTensorProto getDefaultInstanceForType() {
        return com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.getDefaultInstance();
      }

      public com.tencent.angel.config.NamedTensorProtos.NamedTensorProto build() {
        com.tencent.angel.config.NamedTensorProtos.NamedTensorProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.tencent.angel.config.NamedTensorProtos.NamedTensorProto buildPartial() {
        com.tencent.angel.config.NamedTensorProtos.NamedTensorProto result = new com.tencent.angel.config.NamedTensorProtos.NamedTensorProto(this);
        result.name_ = name_;
        if (tensorBuilder_ == null) {
          result.tensor_ = tensor_;
        } else {
          result.tensor_ = tensorBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tencent.angel.config.NamedTensorProtos.NamedTensorProto) {
          return mergeFrom((com.tencent.angel.config.NamedTensorProtos.NamedTensorProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tencent.angel.config.NamedTensorProtos.NamedTensorProto other) {
        if (other == com.tencent.angel.config.NamedTensorProtos.NamedTensorProto.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.hasTensor()) {
          mergeTensor(other.getTensor());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.tencent.angel.config.NamedTensorProtos.NamedTensorProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tencent.angel.config.NamedTensorProtos.NamedTensorProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Name of the tensor.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Name of the tensor.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Name of the tensor.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the tensor.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the tensor.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private com.tencent.angel.core.graph.TensorProtos.TensorProto tensor_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.tencent.angel.core.graph.TensorProtos.TensorProto, com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder, com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder> tensorBuilder_;
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public boolean hasTensor() {
        return tensorBuilder_ != null || tensor_ != null;
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public com.tencent.angel.core.graph.TensorProtos.TensorProto getTensor() {
        if (tensorBuilder_ == null) {
          return tensor_ == null ? com.tencent.angel.core.graph.TensorProtos.TensorProto.getDefaultInstance() : tensor_;
        } else {
          return tensorBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public Builder setTensor(com.tencent.angel.core.graph.TensorProtos.TensorProto value) {
        if (tensorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tensor_ = value;
          onChanged();
        } else {
          tensorBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public Builder setTensor(
          com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder builderForValue) {
        if (tensorBuilder_ == null) {
          tensor_ = builderForValue.build();
          onChanged();
        } else {
          tensorBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public Builder mergeTensor(com.tencent.angel.core.graph.TensorProtos.TensorProto value) {
        if (tensorBuilder_ == null) {
          if (tensor_ != null) {
            tensor_ =
              com.tencent.angel.core.graph.TensorProtos.TensorProto.newBuilder(tensor_).mergeFrom(value).buildPartial();
          } else {
            tensor_ = value;
          }
          onChanged();
        } else {
          tensorBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public Builder clearTensor() {
        if (tensorBuilder_ == null) {
          tensor_ = null;
          onChanged();
        } else {
          tensor_ = null;
          tensorBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder getTensorBuilder() {
        
        onChanged();
        return getTensorFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      public com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder getTensorOrBuilder() {
        if (tensorBuilder_ != null) {
          return tensorBuilder_.getMessageOrBuilder();
        } else {
          return tensor_ == null ?
              com.tencent.angel.core.graph.TensorProtos.TensorProto.getDefaultInstance() : tensor_;
        }
      }
      /**
       * <pre>
       * The client can populate a TensorProto using a tensorflow::Tensor`, or
       * directly using the protobuf field accessors.
       * The client specifies whether the returned tensor values should be
       * filled tensor fields (float_val, int_val, etc.) or encoded in a
       * compact form in tensor.tensor_content.
       * </pre>
       *
       * <code>.angel.TensorProto tensor = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.tencent.angel.core.graph.TensorProtos.TensorProto, com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder, com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder> 
          getTensorFieldBuilder() {
        if (tensorBuilder_ == null) {
          tensorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.tencent.angel.core.graph.TensorProtos.TensorProto, com.tencent.angel.core.graph.TensorProtos.TensorProto.Builder, com.tencent.angel.core.graph.TensorProtos.TensorProtoOrBuilder>(
                  getTensor(),
                  getParentForChildren(),
                  isClean());
          tensor_ = null;
        }
        return tensorBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:angel.NamedTensorProto)
    }

    // @@protoc_insertion_point(class_scope:angel.NamedTensorProto)
    private static final com.tencent.angel.config.NamedTensorProtos.NamedTensorProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.tencent.angel.config.NamedTensorProtos.NamedTensorProto();
    }

    public static com.tencent.angel.config.NamedTensorProtos.NamedTensorProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NamedTensorProto>
        PARSER = new com.google.protobuf.AbstractParser<NamedTensorProto>() {
      public NamedTensorProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NamedTensorProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NamedTensorProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NamedTensorProto> getParserForType() {
      return PARSER;
    }

    public com.tencent.angel.config.NamedTensorProtos.NamedTensorProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_angel_NamedTensorProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_angel_NamedTensorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031config/named_tensor.proto\022\005angel\032\027core" +
      "/graph/tensor.proto\"D\n\020NamedTensorProto\022" +
      "\014\n\004name\030\001 \001(\t\022\"\n\006tensor\030\002 \001(\0132\022.angel.Te" +
      "nsorProtoB/\n\030com.tencent.angel.configB\021N" +
      "amedTensorProtosP\000b\006proto3"
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
          com.tencent.angel.core.graph.TensorProtos.getDescriptor(),
        }, assigner);
    internal_static_angel_NamedTensorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_angel_NamedTensorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_angel_NamedTensorProto_descriptor,
        new java.lang.String[] { "Name", "Tensor", });
    com.tencent.angel.core.graph.TensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
