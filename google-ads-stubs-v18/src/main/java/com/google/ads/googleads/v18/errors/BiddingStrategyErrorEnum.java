// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/bidding_strategy_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible bidding strategy errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.BiddingStrategyErrorEnum}
 */
public final class BiddingStrategyErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)
    BiddingStrategyErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BiddingStrategyErrorEnum.newBuilder() to construct.
  private BiddingStrategyErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BiddingStrategyErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BiddingStrategyErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.BiddingStrategyErrorProto.internal_static_google_ads_googleads_v18_errors_BiddingStrategyErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.BiddingStrategyErrorProto.internal_static_google_ads_googleads_v18_errors_BiddingStrategyErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.class, com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible bidding strategy errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.BiddingStrategyError}
   */
  public enum BiddingStrategyError
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
     * Each bidding strategy must have a unique name.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    DUPLICATE_NAME(2),
    /**
     * <pre>
     * Bidding strategy type is immutable.
     * </pre>
     *
     * <code>CANNOT_CHANGE_BIDDING_STRATEGY_TYPE = 3;</code>
     */
    CANNOT_CHANGE_BIDDING_STRATEGY_TYPE(3),
    /**
     * <pre>
     * Only bidding strategies not linked to campaigns, adgroups or adgroup
     * criteria can be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_ASSOCIATED_STRATEGY = 4;</code>
     */
    CANNOT_REMOVE_ASSOCIATED_STRATEGY(4),
    /**
     * <pre>
     * The specified bidding strategy is not supported.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED = 5;</code>
     */
    BIDDING_STRATEGY_NOT_SUPPORTED(5),
    /**
     * <pre>
     * The bidding strategy is incompatible with the campaign's bidding
     * strategy goal type.
     * </pre>
     *
     * <code>INCOMPATIBLE_BIDDING_STRATEGY_AND_BIDDING_STRATEGY_GOAL_TYPE = 6;</code>
     */
    INCOMPATIBLE_BIDDING_STRATEGY_AND_BIDDING_STRATEGY_GOAL_TYPE(6),
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
     * Each bidding strategy must have a unique name.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 2;
    /**
     * <pre>
     * Bidding strategy type is immutable.
     * </pre>
     *
     * <code>CANNOT_CHANGE_BIDDING_STRATEGY_TYPE = 3;</code>
     */
    public static final int CANNOT_CHANGE_BIDDING_STRATEGY_TYPE_VALUE = 3;
    /**
     * <pre>
     * Only bidding strategies not linked to campaigns, adgroups or adgroup
     * criteria can be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_ASSOCIATED_STRATEGY = 4;</code>
     */
    public static final int CANNOT_REMOVE_ASSOCIATED_STRATEGY_VALUE = 4;
    /**
     * <pre>
     * The specified bidding strategy is not supported.
     * </pre>
     *
     * <code>BIDDING_STRATEGY_NOT_SUPPORTED = 5;</code>
     */
    public static final int BIDDING_STRATEGY_NOT_SUPPORTED_VALUE = 5;
    /**
     * <pre>
     * The bidding strategy is incompatible with the campaign's bidding
     * strategy goal type.
     * </pre>
     *
     * <code>INCOMPATIBLE_BIDDING_STRATEGY_AND_BIDDING_STRATEGY_GOAL_TYPE = 6;</code>
     */
    public static final int INCOMPATIBLE_BIDDING_STRATEGY_AND_BIDDING_STRATEGY_GOAL_TYPE_VALUE = 6;


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
    public static BiddingStrategyError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BiddingStrategyError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_NAME;
        case 3: return CANNOT_CHANGE_BIDDING_STRATEGY_TYPE;
        case 4: return CANNOT_REMOVE_ASSOCIATED_STRATEGY;
        case 5: return BIDDING_STRATEGY_NOT_SUPPORTED;
        case 6: return INCOMPATIBLE_BIDDING_STRATEGY_AND_BIDDING_STRATEGY_GOAL_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BiddingStrategyError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BiddingStrategyError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BiddingStrategyError>() {
            public BiddingStrategyError findValueByNumber(int number) {
              return BiddingStrategyError.forNumber(number);
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
      return com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BiddingStrategyError[] VALUES = values();

    public static BiddingStrategyError valueOf(
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

    private BiddingStrategyError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.BiddingStrategyError)
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
    if (!(obj instanceof com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum other = (com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum) obj;

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

  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum prototype) {
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
   * Container for enum describing possible bidding strategy errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.BiddingStrategyErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)
      com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.BiddingStrategyErrorProto.internal_static_google_ads_googleads_v18_errors_BiddingStrategyErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.BiddingStrategyErrorProto.internal_static_google_ads_googleads_v18_errors_BiddingStrategyErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.class, com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v18.errors.BiddingStrategyErrorProto.internal_static_google_ads_googleads_v18_errors_BiddingStrategyErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum build() {
      com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum result = new com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.BiddingStrategyErrorEnum)
  private static final com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BiddingStrategyErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<BiddingStrategyErrorEnum>() {
    @java.lang.Override
    public BiddingStrategyErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<BiddingStrategyErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BiddingStrategyErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.BiddingStrategyErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

