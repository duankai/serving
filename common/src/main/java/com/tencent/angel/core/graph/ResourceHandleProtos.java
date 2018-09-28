// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/graph/resource_handle.proto

package com.tencent.angel.core.graph;

public final class ResourceHandleProtos {
  private ResourceHandleProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResourceHandleProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:angel.ResourceHandleProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique name for the device containing the resource.
     * </pre>
     *
     * <code>optional string device = 1;</code>
     */
    java.lang.String getDevice();
    /**
     * <pre>
     * Unique name for the device containing the resource.
     * </pre>
     *
     * <code>optional string device = 1;</code>
     */
    com.google.protobuf.ByteString
        getDeviceBytes();

    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>optional string container = 2;</code>
     */
    java.lang.String getContainer();
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>optional string container = 2;</code>
     */
    com.google.protobuf.ByteString
        getContainerBytes();

    /**
     * <pre>
     * Unique name of this resource.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Unique name of this resource.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Hash code for the type of the resource. Is only valid in the same device
     * and in the same execution.
     * </pre>
     *
     * <code>optional uint64 hash_code = 4;</code>
     */
    long getHashCode();

    /**
     * <pre>
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>optional string maybe_type_name = 5;</code>
     */
    java.lang.String getMaybeTypeName();
    /**
     * <pre>
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>optional string maybe_type_name = 5;</code>
     */
    com.google.protobuf.ByteString
        getMaybeTypeNameBytes();
  }
  /**
   * <pre>
   * Protocol buffer representing a handle to a tensorflow resource. Handles are
   * not valid across executions, but can be serialized back and forth from within
   * a single run.
   * </pre>
   *
   * Protobuf type {@code angel.ResourceHandleProto}
   */
  public  static final class ResourceHandleProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:angel.ResourceHandleProto)
      ResourceHandleProtoOrBuilder {
    // Use ResourceHandleProto.newBuilder() to construct.
    private ResourceHandleProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResourceHandleProto() {
      device_ = "";
      container_ = "";
      name_ = "";
      hashCode_ = 0L;
      maybeTypeName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ResourceHandleProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              device_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              container_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 32: {

              hashCode_ = input.readUInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              maybeTypeName_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.angel.core.graph.ResourceHandleProtos.internal_static_angel_ResourceHandleProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.angel.core.graph.ResourceHandleProtos.internal_static_angel_ResourceHandleProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.class, com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.Builder.class);
    }

    public static final int DEVICE_FIELD_NUMBER = 1;
    private volatile java.lang.Object device_;
    /**
     * <pre>
     * Unique name for the device containing the resource.
     * </pre>
     *
     * <code>optional string device = 1;</code>
     */
    public java.lang.String getDevice() {
      java.lang.Object ref = device_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        device_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Unique name for the device containing the resource.
     * </pre>
     *
     * <code>optional string device = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceBytes() {
      java.lang.Object ref = device_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        device_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTAINER_FIELD_NUMBER = 2;
    private volatile java.lang.Object container_;
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>optional string container = 2;</code>
     */
    public java.lang.String getContainer() {
      java.lang.Object ref = container_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        container_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Container in which this resource is placed.
     * </pre>
     *
     * <code>optional string container = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContainerBytes() {
      java.lang.Object ref = container_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        container_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Unique name of this resource.
     * </pre>
     *
     * <code>optional string name = 3;</code>
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
     * Unique name of this resource.
     * </pre>
     *
     * <code>optional string name = 3;</code>
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

    public static final int HASH_CODE_FIELD_NUMBER = 4;
    private long hashCode_;
    /**
     * <pre>
     * Hash code for the type of the resource. Is only valid in the same device
     * and in the same execution.
     * </pre>
     *
     * <code>optional uint64 hash_code = 4;</code>
     */
    public long getHashCode() {
      return hashCode_;
    }

    public static final int MAYBE_TYPE_NAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object maybeTypeName_;
    /**
     * <pre>
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>optional string maybe_type_name = 5;</code>
     */
    public java.lang.String getMaybeTypeName() {
      java.lang.Object ref = maybeTypeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        maybeTypeName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * </pre>
     *
     * <code>optional string maybe_type_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMaybeTypeNameBytes() {
      java.lang.Object ref = maybeTypeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maybeTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getDeviceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, device_);
      }
      if (!getContainerBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, container_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      if (hashCode_ != 0L) {
        output.writeUInt64(4, hashCode_);
      }
      if (!getMaybeTypeNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, maybeTypeName_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDeviceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, device_);
      }
      if (!getContainerBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, container_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
      }
      if (hashCode_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, hashCode_);
      }
      if (!getMaybeTypeNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, maybeTypeName_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto)) {
        return super.equals(obj);
      }
      com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto other = (com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto) obj;

      boolean result = true;
      result = result && getDevice()
          .equals(other.getDevice());
      result = result && getContainer()
          .equals(other.getContainer());
      result = result && getName()
          .equals(other.getName());
      result = result && (getHashCode()
          == other.getHashCode());
      result = result && getMaybeTypeName()
          .equals(other.getMaybeTypeName());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
      hash = (37 * hash) + CONTAINER_FIELD_NUMBER;
      hash = (53 * hash) + getContainer().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + HASH_CODE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHashCode());
      hash = (37 * hash) + MAYBE_TYPE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMaybeTypeName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parseFrom(
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
    public static Builder newBuilder(com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto prototype) {
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
     * Protocol buffer representing a handle to a tensorflow resource. Handles are
     * not valid across executions, but can be serialized back and forth from within
     * a single run.
     * </pre>
     *
     * Protobuf type {@code angel.ResourceHandleProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:angel.ResourceHandleProto)
        com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tencent.angel.core.graph.ResourceHandleProtos.internal_static_angel_ResourceHandleProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tencent.angel.core.graph.ResourceHandleProtos.internal_static_angel_ResourceHandleProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.class, com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.Builder.class);
      }

      // Construct using com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.newBuilder()
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
        device_ = "";

        container_ = "";

        name_ = "";

        hashCode_ = 0L;

        maybeTypeName_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tencent.angel.core.graph.ResourceHandleProtos.internal_static_angel_ResourceHandleProto_descriptor;
      }

      public com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto getDefaultInstanceForType() {
        return com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.getDefaultInstance();
      }

      public com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto build() {
        com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto buildPartial() {
        com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto result = new com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto(this);
        result.device_ = device_;
        result.container_ = container_;
        result.name_ = name_;
        result.hashCode_ = hashCode_;
        result.maybeTypeName_ = maybeTypeName_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto) {
          return mergeFrom((com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto other) {
        if (other == com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto.getDefaultInstance()) return this;
        if (!other.getDevice().isEmpty()) {
          device_ = other.device_;
          onChanged();
        }
        if (!other.getContainer().isEmpty()) {
          container_ = other.container_;
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getHashCode() != 0L) {
          setHashCode(other.getHashCode());
        }
        if (!other.getMaybeTypeName().isEmpty()) {
          maybeTypeName_ = other.maybeTypeName_;
          onChanged();
        }
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
        com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object device_ = "";
      /**
       * <pre>
       * Unique name for the device containing the resource.
       * </pre>
       *
       * <code>optional string device = 1;</code>
       */
      public java.lang.String getDevice() {
        java.lang.Object ref = device_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          device_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Unique name for the device containing the resource.
       * </pre>
       *
       * <code>optional string device = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceBytes() {
        java.lang.Object ref = device_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          device_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Unique name for the device containing the resource.
       * </pre>
       *
       * <code>optional string device = 1;</code>
       */
      public Builder setDevice(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        device_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique name for the device containing the resource.
       * </pre>
       *
       * <code>optional string device = 1;</code>
       */
      public Builder clearDevice() {
        
        device_ = getDefaultInstance().getDevice();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique name for the device containing the resource.
       * </pre>
       *
       * <code>optional string device = 1;</code>
       */
      public Builder setDeviceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        device_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object container_ = "";
      /**
       * <pre>
       * Container in which this resource is placed.
       * </pre>
       *
       * <code>optional string container = 2;</code>
       */
      public java.lang.String getContainer() {
        java.lang.Object ref = container_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          container_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Container in which this resource is placed.
       * </pre>
       *
       * <code>optional string container = 2;</code>
       */
      public com.google.protobuf.ByteString
          getContainerBytes() {
        java.lang.Object ref = container_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          container_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Container in which this resource is placed.
       * </pre>
       *
       * <code>optional string container = 2;</code>
       */
      public Builder setContainer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        container_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Container in which this resource is placed.
       * </pre>
       *
       * <code>optional string container = 2;</code>
       */
      public Builder clearContainer() {
        
        container_ = getDefaultInstance().getContainer();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Container in which this resource is placed.
       * </pre>
       *
       * <code>optional string container = 2;</code>
       */
      public Builder setContainerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        container_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Unique name of this resource.
       * </pre>
       *
       * <code>optional string name = 3;</code>
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
       * Unique name of this resource.
       * </pre>
       *
       * <code>optional string name = 3;</code>
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
       * Unique name of this resource.
       * </pre>
       *
       * <code>optional string name = 3;</code>
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
       * Unique name of this resource.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unique name of this resource.
       * </pre>
       *
       * <code>optional string name = 3;</code>
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

      private long hashCode_ ;
      /**
       * <pre>
       * Hash code for the type of the resource. Is only valid in the same device
       * and in the same execution.
       * </pre>
       *
       * <code>optional uint64 hash_code = 4;</code>
       */
      public long getHashCode() {
        return hashCode_;
      }
      /**
       * <pre>
       * Hash code for the type of the resource. Is only valid in the same device
       * and in the same execution.
       * </pre>
       *
       * <code>optional uint64 hash_code = 4;</code>
       */
      public Builder setHashCode(long value) {
        
        hashCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hash code for the type of the resource. Is only valid in the same device
       * and in the same execution.
       * </pre>
       *
       * <code>optional uint64 hash_code = 4;</code>
       */
      public Builder clearHashCode() {
        
        hashCode_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object maybeTypeName_ = "";
      /**
       * <pre>
       * For debug-only, the name of the type pointed to by this handle, if
       * available.
       * </pre>
       *
       * <code>optional string maybe_type_name = 5;</code>
       */
      public java.lang.String getMaybeTypeName() {
        java.lang.Object ref = maybeTypeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          maybeTypeName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * For debug-only, the name of the type pointed to by this handle, if
       * available.
       * </pre>
       *
       * <code>optional string maybe_type_name = 5;</code>
       */
      public com.google.protobuf.ByteString
          getMaybeTypeNameBytes() {
        java.lang.Object ref = maybeTypeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          maybeTypeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * For debug-only, the name of the type pointed to by this handle, if
       * available.
       * </pre>
       *
       * <code>optional string maybe_type_name = 5;</code>
       */
      public Builder setMaybeTypeName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        maybeTypeName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For debug-only, the name of the type pointed to by this handle, if
       * available.
       * </pre>
       *
       * <code>optional string maybe_type_name = 5;</code>
       */
      public Builder clearMaybeTypeName() {
        
        maybeTypeName_ = getDefaultInstance().getMaybeTypeName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For debug-only, the name of the type pointed to by this handle, if
       * available.
       * </pre>
       *
       * <code>optional string maybe_type_name = 5;</code>
       */
      public Builder setMaybeTypeNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        maybeTypeName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:angel.ResourceHandleProto)
    }

    // @@protoc_insertion_point(class_scope:angel.ResourceHandleProto)
    private static final com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto();
    }

    public static com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResourceHandleProto>
        PARSER = new com.google.protobuf.AbstractParser<ResourceHandleProto>() {
      public ResourceHandleProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResourceHandleProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResourceHandleProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceHandleProto> getParserForType() {
      return PARSER;
    }

    public com.tencent.angel.core.graph.ResourceHandleProtos.ResourceHandleProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_angel_ResourceHandleProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_angel_ResourceHandleProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n core/graph/resource_handle.proto\022\005ange" +
      "l\"r\n\023ResourceHandleProto\022\016\n\006device\030\001 \001(\t" +
      "\022\021\n\tcontainer\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\021\n\thas" +
      "h_code\030\004 \001(\004\022\027\n\017maybe_type_name\030\005 \001(\tB6\n" +
      "\034com.tencent.angel.core.graphB\024ResourceH" +
      "andleProtosP\000b\006proto3"
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
        }, assigner);
    internal_static_angel_ResourceHandleProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_angel_ResourceHandleProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_angel_ResourceHandleProto_descriptor,
        new java.lang.String[] { "Device", "Container", "Name", "HashCode", "MaybeTypeName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
