// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/stats/allocation_description.proto

package com.tencent.angel.core.stats;

public final class AllocationDescriptionProtos {
  private AllocationDescriptionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AllocationDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:angel.AllocationDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Total number of bytes requested
     * </pre>
     *
     * <code>optional int64 requested_bytes = 1;</code>
     */
    long getRequestedBytes();

    /**
     * <pre>
     * Total number of bytes allocated if known
     * </pre>
     *
     * <code>optional int64 allocated_bytes = 2;</code>
     */
    long getAllocatedBytes();

    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>optional string allocator_name = 3;</code>
     */
    java.lang.String getAllocatorName();
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>optional string allocator_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getAllocatorNameBytes();

    /**
     * <pre>
     * Identifier of the allocated buffer if known
     * </pre>
     *
     * <code>optional int64 allocation_id = 4;</code>
     */
    long getAllocationId();

    /**
     * <pre>
     * Set if this tensor only has one remaining reference
     * </pre>
     *
     * <code>optional bool has_single_reference = 5;</code>
     */
    boolean getHasSingleReference();

    /**
     * <pre>
     * Address of the allocation.
     * </pre>
     *
     * <code>optional uint64 ptr = 6;</code>
     */
    long getPtr();
  }
  /**
   * Protobuf type {@code angel.AllocationDescription}
   */
  public  static final class AllocationDescription extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:angel.AllocationDescription)
      AllocationDescriptionOrBuilder {
    // Use AllocationDescription.newBuilder() to construct.
    private AllocationDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AllocationDescription() {
      requestedBytes_ = 0L;
      allocatedBytes_ = 0L;
      allocatorName_ = "";
      allocationId_ = 0L;
      hasSingleReference_ = false;
      ptr_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AllocationDescription(
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
            case 8: {

              requestedBytes_ = input.readInt64();
              break;
            }
            case 16: {

              allocatedBytes_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              allocatorName_ = s;
              break;
            }
            case 32: {

              allocationId_ = input.readInt64();
              break;
            }
            case 40: {

              hasSingleReference_ = input.readBool();
              break;
            }
            case 48: {

              ptr_ = input.readUInt64();
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
      return com.tencent.angel.core.stats.AllocationDescriptionProtos.internal_static_angel_AllocationDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.angel.core.stats.AllocationDescriptionProtos.internal_static_angel_AllocationDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.class, com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.Builder.class);
    }

    public static final int REQUESTED_BYTES_FIELD_NUMBER = 1;
    private long requestedBytes_;
    /**
     * <pre>
     * Total number of bytes requested
     * </pre>
     *
     * <code>optional int64 requested_bytes = 1;</code>
     */
    public long getRequestedBytes() {
      return requestedBytes_;
    }

    public static final int ALLOCATED_BYTES_FIELD_NUMBER = 2;
    private long allocatedBytes_;
    /**
     * <pre>
     * Total number of bytes allocated if known
     * </pre>
     *
     * <code>optional int64 allocated_bytes = 2;</code>
     */
    public long getAllocatedBytes() {
      return allocatedBytes_;
    }

    public static final int ALLOCATOR_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object allocatorName_;
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>optional string allocator_name = 3;</code>
     */
    public java.lang.String getAllocatorName() {
      java.lang.Object ref = allocatorName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        allocatorName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Name of the allocator used
     * </pre>
     *
     * <code>optional string allocator_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAllocatorNameBytes() {
      java.lang.Object ref = allocatorName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        allocatorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOCATION_ID_FIELD_NUMBER = 4;
    private long allocationId_;
    /**
     * <pre>
     * Identifier of the allocated buffer if known
     * </pre>
     *
     * <code>optional int64 allocation_id = 4;</code>
     */
    public long getAllocationId() {
      return allocationId_;
    }

    public static final int HAS_SINGLE_REFERENCE_FIELD_NUMBER = 5;
    private boolean hasSingleReference_;
    /**
     * <pre>
     * Set if this tensor only has one remaining reference
     * </pre>
     *
     * <code>optional bool has_single_reference = 5;</code>
     */
    public boolean getHasSingleReference() {
      return hasSingleReference_;
    }

    public static final int PTR_FIELD_NUMBER = 6;
    private long ptr_;
    /**
     * <pre>
     * Address of the allocation.
     * </pre>
     *
     * <code>optional uint64 ptr = 6;</code>
     */
    public long getPtr() {
      return ptr_;
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
      if (requestedBytes_ != 0L) {
        output.writeInt64(1, requestedBytes_);
      }
      if (allocatedBytes_ != 0L) {
        output.writeInt64(2, allocatedBytes_);
      }
      if (!getAllocatorNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, allocatorName_);
      }
      if (allocationId_ != 0L) {
        output.writeInt64(4, allocationId_);
      }
      if (hasSingleReference_ != false) {
        output.writeBool(5, hasSingleReference_);
      }
      if (ptr_ != 0L) {
        output.writeUInt64(6, ptr_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (requestedBytes_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, requestedBytes_);
      }
      if (allocatedBytes_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, allocatedBytes_);
      }
      if (!getAllocatorNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, allocatorName_);
      }
      if (allocationId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, allocationId_);
      }
      if (hasSingleReference_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, hasSingleReference_);
      }
      if (ptr_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, ptr_);
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
      if (!(obj instanceof com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription)) {
        return super.equals(obj);
      }
      com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription other = (com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription) obj;

      boolean result = true;
      result = result && (getRequestedBytes()
          == other.getRequestedBytes());
      result = result && (getAllocatedBytes()
          == other.getAllocatedBytes());
      result = result && getAllocatorName()
          .equals(other.getAllocatorName());
      result = result && (getAllocationId()
          == other.getAllocationId());
      result = result && (getHasSingleReference()
          == other.getHasSingleReference());
      result = result && (getPtr()
          == other.getPtr());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + REQUESTED_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRequestedBytes());
      hash = (37 * hash) + ALLOCATED_BYTES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAllocatedBytes());
      hash = (37 * hash) + ALLOCATOR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getAllocatorName().hashCode();
      hash = (37 * hash) + ALLOCATION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAllocationId());
      hash = (37 * hash) + HAS_SINGLE_REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasSingleReference());
      hash = (37 * hash) + PTR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPtr());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parseFrom(
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
    public static Builder newBuilder(com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription prototype) {
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
     * Protobuf type {@code angel.AllocationDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:angel.AllocationDescription)
        com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tencent.angel.core.stats.AllocationDescriptionProtos.internal_static_angel_AllocationDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tencent.angel.core.stats.AllocationDescriptionProtos.internal_static_angel_AllocationDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.class, com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.Builder.class);
      }

      // Construct using com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.newBuilder()
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
        requestedBytes_ = 0L;

        allocatedBytes_ = 0L;

        allocatorName_ = "";

        allocationId_ = 0L;

        hasSingleReference_ = false;

        ptr_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tencent.angel.core.stats.AllocationDescriptionProtos.internal_static_angel_AllocationDescription_descriptor;
      }

      public com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription getDefaultInstanceForType() {
        return com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.getDefaultInstance();
      }

      public com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription build() {
        com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription buildPartial() {
        com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription result = new com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription(this);
        result.requestedBytes_ = requestedBytes_;
        result.allocatedBytes_ = allocatedBytes_;
        result.allocatorName_ = allocatorName_;
        result.allocationId_ = allocationId_;
        result.hasSingleReference_ = hasSingleReference_;
        result.ptr_ = ptr_;
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
        if (other instanceof com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription) {
          return mergeFrom((com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription other) {
        if (other == com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription.getDefaultInstance()) return this;
        if (other.getRequestedBytes() != 0L) {
          setRequestedBytes(other.getRequestedBytes());
        }
        if (other.getAllocatedBytes() != 0L) {
          setAllocatedBytes(other.getAllocatedBytes());
        }
        if (!other.getAllocatorName().isEmpty()) {
          allocatorName_ = other.allocatorName_;
          onChanged();
        }
        if (other.getAllocationId() != 0L) {
          setAllocationId(other.getAllocationId());
        }
        if (other.getHasSingleReference() != false) {
          setHasSingleReference(other.getHasSingleReference());
        }
        if (other.getPtr() != 0L) {
          setPtr(other.getPtr());
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
        com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long requestedBytes_ ;
      /**
       * <pre>
       * Total number of bytes requested
       * </pre>
       *
       * <code>optional int64 requested_bytes = 1;</code>
       */
      public long getRequestedBytes() {
        return requestedBytes_;
      }
      /**
       * <pre>
       * Total number of bytes requested
       * </pre>
       *
       * <code>optional int64 requested_bytes = 1;</code>
       */
      public Builder setRequestedBytes(long value) {
        
        requestedBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Total number of bytes requested
       * </pre>
       *
       * <code>optional int64 requested_bytes = 1;</code>
       */
      public Builder clearRequestedBytes() {
        
        requestedBytes_ = 0L;
        onChanged();
        return this;
      }

      private long allocatedBytes_ ;
      /**
       * <pre>
       * Total number of bytes allocated if known
       * </pre>
       *
       * <code>optional int64 allocated_bytes = 2;</code>
       */
      public long getAllocatedBytes() {
        return allocatedBytes_;
      }
      /**
       * <pre>
       * Total number of bytes allocated if known
       * </pre>
       *
       * <code>optional int64 allocated_bytes = 2;</code>
       */
      public Builder setAllocatedBytes(long value) {
        
        allocatedBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Total number of bytes allocated if known
       * </pre>
       *
       * <code>optional int64 allocated_bytes = 2;</code>
       */
      public Builder clearAllocatedBytes() {
        
        allocatedBytes_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object allocatorName_ = "";
      /**
       * <pre>
       * Name of the allocator used
       * </pre>
       *
       * <code>optional string allocator_name = 3;</code>
       */
      public java.lang.String getAllocatorName() {
        java.lang.Object ref = allocatorName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          allocatorName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Name of the allocator used
       * </pre>
       *
       * <code>optional string allocator_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAllocatorNameBytes() {
        java.lang.Object ref = allocatorName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          allocatorName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Name of the allocator used
       * </pre>
       *
       * <code>optional string allocator_name = 3;</code>
       */
      public Builder setAllocatorName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        allocatorName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the allocator used
       * </pre>
       *
       * <code>optional string allocator_name = 3;</code>
       */
      public Builder clearAllocatorName() {
        
        allocatorName_ = getDefaultInstance().getAllocatorName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the allocator used
       * </pre>
       *
       * <code>optional string allocator_name = 3;</code>
       */
      public Builder setAllocatorNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        allocatorName_ = value;
        onChanged();
        return this;
      }

      private long allocationId_ ;
      /**
       * <pre>
       * Identifier of the allocated buffer if known
       * </pre>
       *
       * <code>optional int64 allocation_id = 4;</code>
       */
      public long getAllocationId() {
        return allocationId_;
      }
      /**
       * <pre>
       * Identifier of the allocated buffer if known
       * </pre>
       *
       * <code>optional int64 allocation_id = 4;</code>
       */
      public Builder setAllocationId(long value) {
        
        allocationId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Identifier of the allocated buffer if known
       * </pre>
       *
       * <code>optional int64 allocation_id = 4;</code>
       */
      public Builder clearAllocationId() {
        
        allocationId_ = 0L;
        onChanged();
        return this;
      }

      private boolean hasSingleReference_ ;
      /**
       * <pre>
       * Set if this tensor only has one remaining reference
       * </pre>
       *
       * <code>optional bool has_single_reference = 5;</code>
       */
      public boolean getHasSingleReference() {
        return hasSingleReference_;
      }
      /**
       * <pre>
       * Set if this tensor only has one remaining reference
       * </pre>
       *
       * <code>optional bool has_single_reference = 5;</code>
       */
      public Builder setHasSingleReference(boolean value) {
        
        hasSingleReference_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Set if this tensor only has one remaining reference
       * </pre>
       *
       * <code>optional bool has_single_reference = 5;</code>
       */
      public Builder clearHasSingleReference() {
        
        hasSingleReference_ = false;
        onChanged();
        return this;
      }

      private long ptr_ ;
      /**
       * <pre>
       * Address of the allocation.
       * </pre>
       *
       * <code>optional uint64 ptr = 6;</code>
       */
      public long getPtr() {
        return ptr_;
      }
      /**
       * <pre>
       * Address of the allocation.
       * </pre>
       *
       * <code>optional uint64 ptr = 6;</code>
       */
      public Builder setPtr(long value) {
        
        ptr_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Address of the allocation.
       * </pre>
       *
       * <code>optional uint64 ptr = 6;</code>
       */
      public Builder clearPtr() {
        
        ptr_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:angel.AllocationDescription)
    }

    // @@protoc_insertion_point(class_scope:angel.AllocationDescription)
    private static final com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription();
    }

    public static com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AllocationDescription>
        PARSER = new com.google.protobuf.AbstractParser<AllocationDescription>() {
      public AllocationDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AllocationDescription(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AllocationDescription> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllocationDescription> getParserForType() {
      return PARSER;
    }

    public com.tencent.angel.core.stats.AllocationDescriptionProtos.AllocationDescription getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_angel_AllocationDescription_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_angel_AllocationDescription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'core/stats/allocation_description.prot" +
      "o\022\005angel\"\243\001\n\025AllocationDescription\022\027\n\017re" +
      "quested_bytes\030\001 \001(\003\022\027\n\017allocated_bytes\030\002" +
      " \001(\003\022\026\n\016allocator_name\030\003 \001(\t\022\025\n\rallocati" +
      "on_id\030\004 \001(\003\022\034\n\024has_single_reference\030\005 \001(" +
      "\010\022\013\n\003ptr\030\006 \001(\004B=\n\034com.tencent.angel.core" +
      ".statsB\033AllocationDescriptionProtosP\000b\006p" +
      "roto3"
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
    internal_static_angel_AllocationDescription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_angel_AllocationDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_angel_AllocationDescription_descriptor,
        new java.lang.String[] { "RequestedBytes", "AllocatedBytes", "AllocatorName", "AllocationId", "HasSingleReference", "Ptr", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
