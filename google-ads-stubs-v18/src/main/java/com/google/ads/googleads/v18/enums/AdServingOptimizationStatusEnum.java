// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/enums/ad_serving_optimization_status.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.enums;

/**
 * <pre>
 * Possible ad serving statuses of a campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum}
 */
public final class AdServingOptimizationStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)
    AdServingOptimizationStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdServingOptimizationStatusEnum.newBuilder() to construct.
  private AdServingOptimizationStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdServingOptimizationStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdServingOptimizationStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusProto.internal_static_google_ads_googleads_v18_enums_AdServingOptimizationStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusProto.internal_static_google_ads_googleads_v18_enums_AdServingOptimizationStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.class, com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible serving statuses.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus}
   */
  public enum AdServingOptimizationStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received value is not known in this version.
     *
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Ad serving is optimized based on CTR for the campaign.
     * </pre>
     *
     * <code>OPTIMIZE = 2;</code>
     */
    OPTIMIZE(2),
    /**
     * <pre>
     * Ad serving is optimized based on CTR * Conversion for the campaign. If
     * the campaign is not in the conversion optimizer bidding strategy, it will
     * default to OPTIMIZED.
     * </pre>
     *
     * <code>CONVERSION_OPTIMIZE = 3;</code>
     */
    CONVERSION_OPTIMIZE(3),
    /**
     * <pre>
     * Ads are rotated evenly for 90 days, then optimized for clicks.
     * </pre>
     *
     * <code>ROTATE = 4;</code>
     */
    ROTATE(4),
    /**
     * <pre>
     * Show lower performing ads more evenly with higher performing ads, and do
     * not optimize.
     * </pre>
     *
     * <code>ROTATE_INDEFINITELY = 5;</code>
     */
    ROTATE_INDEFINITELY(5),
    /**
     * <pre>
     * Ad serving optimization status is not available.
     * </pre>
     *
     * <code>UNAVAILABLE = 6;</code>
     */
    UNAVAILABLE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received value is not known in this version.
     *
     * This is a response-only value.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Ad serving is optimized based on CTR for the campaign.
     * </pre>
     *
     * <code>OPTIMIZE = 2;</code>
     */
    public static final int OPTIMIZE_VALUE = 2;
    /**
     * <pre>
     * Ad serving is optimized based on CTR * Conversion for the campaign. If
     * the campaign is not in the conversion optimizer bidding strategy, it will
     * default to OPTIMIZED.
     * </pre>
     *
     * <code>CONVERSION_OPTIMIZE = 3;</code>
     */
    public static final int CONVERSION_OPTIMIZE_VALUE = 3;
    /**
     * <pre>
     * Ads are rotated evenly for 90 days, then optimized for clicks.
     * </pre>
     *
     * <code>ROTATE = 4;</code>
     */
    public static final int ROTATE_VALUE = 4;
    /**
     * <pre>
     * Show lower performing ads more evenly with higher performing ads, and do
     * not optimize.
     * </pre>
     *
     * <code>ROTATE_INDEFINITELY = 5;</code>
     */
    public static final int ROTATE_INDEFINITELY_VALUE = 5;
    /**
     * <pre>
     * Ad serving optimization status is not available.
     * </pre>
     *
     * <code>UNAVAILABLE = 6;</code>
     */
    public static final int UNAVAILABLE_VALUE = 6;


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
    public static AdServingOptimizationStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdServingOptimizationStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return OPTIMIZE;
        case 3: return CONVERSION_OPTIMIZE;
        case 4: return ROTATE;
        case 5: return ROTATE_INDEFINITELY;
        case 6: return UNAVAILABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdServingOptimizationStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdServingOptimizationStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdServingOptimizationStatus>() {
            public AdServingOptimizationStatus findValueByNumber(int number) {
              return AdServingOptimizationStatus.forNumber(number);
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
      return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdServingOptimizationStatus[] VALUES = values();

    public static AdServingOptimizationStatus valueOf(
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

    private AdServingOptimizationStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum other = (com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum) obj;

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

  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum prototype) {
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
   * Possible ad serving statuses of a campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)
      com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusProto.internal_static_google_ads_googleads_v18_enums_AdServingOptimizationStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusProto.internal_static_google_ads_googleads_v18_enums_AdServingOptimizationStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.class, com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusProto.internal_static_google_ads_googleads_v18_enums_AdServingOptimizationStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum build() {
      com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum buildPartial() {
      com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum result = new com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum other) {
      if (other == com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum)
  private static final com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum();
  }

  public static com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdServingOptimizationStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdServingOptimizationStatusEnum>() {
    @java.lang.Override
    public AdServingOptimizationStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdServingOptimizationStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdServingOptimizationStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.enums.AdServingOptimizationStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

