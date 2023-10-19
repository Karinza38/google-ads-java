// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/batch_job_error.proto

package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible batch job errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.BatchJobErrorEnum}
 */
public final class BatchJobErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.BatchJobErrorEnum)
    BatchJobErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchJobErrorEnum.newBuilder() to construct.
  private BatchJobErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchJobErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchJobErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.BatchJobErrorProto.internal_static_google_ads_googleads_v15_errors_BatchJobErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.BatchJobErrorProto.internal_static_google_ads_googleads_v15_errors_BatchJobErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.BatchJobErrorEnum.class, com.google.ads.googleads.v15.errors.BatchJobErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible request errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.BatchJobErrorEnum.BatchJobError}
   */
  public enum BatchJobError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The batch job cannot add more operations or run after it has started
     * running.
     * </pre>
     *
     * <code>CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING = 2;</code>
     */
    CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING(2),
    /**
     * <pre>
     * The operations for an AddBatchJobOperations request were empty.
     * </pre>
     *
     * <code>EMPTY_OPERATIONS = 3;</code>
     */
    EMPTY_OPERATIONS(3),
    /**
     * <pre>
     * The sequence token for an AddBatchJobOperations request was invalid.
     * </pre>
     *
     * <code>INVALID_SEQUENCE_TOKEN = 4;</code>
     */
    INVALID_SEQUENCE_TOKEN(4),
    /**
     * <pre>
     * Batch job results can only be retrieved once the job is finished.
     * </pre>
     *
     * <code>RESULTS_NOT_READY = 5;</code>
     */
    RESULTS_NOT_READY(5),
    /**
     * <pre>
     * The page size for ListBatchJobResults was invalid.
     * </pre>
     *
     * <code>INVALID_PAGE_SIZE = 6;</code>
     */
    INVALID_PAGE_SIZE(6),
    /**
     * <pre>
     * The batch job cannot be removed because it has started running.
     * </pre>
     *
     * <code>CAN_ONLY_REMOVE_PENDING_JOB = 7;</code>
     */
    CAN_ONLY_REMOVE_PENDING_JOB(7),
    /**
     * <pre>
     * The batch job cannot be listed due to unexpected errors such as duplicate
     * checkpoints.
     * </pre>
     *
     * <code>CANNOT_LIST_RESULTS = 8;</code>
     */
    CANNOT_LIST_RESULTS(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The batch job cannot add more operations or run after it has started
     * running.
     * </pre>
     *
     * <code>CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING = 2;</code>
     */
    public static final int CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING_VALUE = 2;
    /**
     * <pre>
     * The operations for an AddBatchJobOperations request were empty.
     * </pre>
     *
     * <code>EMPTY_OPERATIONS = 3;</code>
     */
    public static final int EMPTY_OPERATIONS_VALUE = 3;
    /**
     * <pre>
     * The sequence token for an AddBatchJobOperations request was invalid.
     * </pre>
     *
     * <code>INVALID_SEQUENCE_TOKEN = 4;</code>
     */
    public static final int INVALID_SEQUENCE_TOKEN_VALUE = 4;
    /**
     * <pre>
     * Batch job results can only be retrieved once the job is finished.
     * </pre>
     *
     * <code>RESULTS_NOT_READY = 5;</code>
     */
    public static final int RESULTS_NOT_READY_VALUE = 5;
    /**
     * <pre>
     * The page size for ListBatchJobResults was invalid.
     * </pre>
     *
     * <code>INVALID_PAGE_SIZE = 6;</code>
     */
    public static final int INVALID_PAGE_SIZE_VALUE = 6;
    /**
     * <pre>
     * The batch job cannot be removed because it has started running.
     * </pre>
     *
     * <code>CAN_ONLY_REMOVE_PENDING_JOB = 7;</code>
     */
    public static final int CAN_ONLY_REMOVE_PENDING_JOB_VALUE = 7;
    /**
     * <pre>
     * The batch job cannot be listed due to unexpected errors such as duplicate
     * checkpoints.
     * </pre>
     *
     * <code>CANNOT_LIST_RESULTS = 8;</code>
     */
    public static final int CANNOT_LIST_RESULTS_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BatchJobError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BatchJobError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_MODIFY_JOB_AFTER_JOB_STARTS_RUNNING;
        case 3: return EMPTY_OPERATIONS;
        case 4: return INVALID_SEQUENCE_TOKEN;
        case 5: return RESULTS_NOT_READY;
        case 6: return INVALID_PAGE_SIZE;
        case 7: return CAN_ONLY_REMOVE_PENDING_JOB;
        case 8: return CANNOT_LIST_RESULTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BatchJobError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BatchJobError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BatchJobError>() {
            public BatchJobError findValueByNumber(int number) {
              return BatchJobError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.BatchJobErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BatchJobError[] VALUES = values();

    public static BatchJobError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BatchJobError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.BatchJobErrorEnum.BatchJobError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v15.errors.BatchJobErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.BatchJobErrorEnum other = (com.google.ads.googleads.v15.errors.BatchJobErrorEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.BatchJobErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Container for enum describing possible batch job errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.BatchJobErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.BatchJobErrorEnum)
      com.google.ads.googleads.v15.errors.BatchJobErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.BatchJobErrorProto.internal_static_google_ads_googleads_v15_errors_BatchJobErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.BatchJobErrorProto.internal_static_google_ads_googleads_v15_errors_BatchJobErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.BatchJobErrorEnum.class, com.google.ads.googleads.v15.errors.BatchJobErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.BatchJobErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.errors.BatchJobErrorProto.internal_static_google_ads_googleads_v15_errors_BatchJobErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.BatchJobErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.BatchJobErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.BatchJobErrorEnum build() {
      com.google.ads.googleads.v15.errors.BatchJobErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.BatchJobErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.BatchJobErrorEnum result = new com.google.ads.googleads.v15.errors.BatchJobErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v15.errors.BatchJobErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.BatchJobErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.BatchJobErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.BatchJobErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.BatchJobErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.BatchJobErrorEnum)
  private static final com.google.ads.googleads.v15.errors.BatchJobErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.BatchJobErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.BatchJobErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchJobErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<BatchJobErrorEnum>() {
    @java.lang.Override
    public BatchJobErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BatchJobErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchJobErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.BatchJobErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

