// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/smart_campaign_error.proto

package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible Smart campaign errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.SmartCampaignErrorEnum}
 */
public final class SmartCampaignErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.SmartCampaignErrorEnum)
    SmartCampaignErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartCampaignErrorEnum.newBuilder() to construct.
  private SmartCampaignErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartCampaignErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartCampaignErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.SmartCampaignErrorProto.internal_static_google_ads_googleads_v15_errors_SmartCampaignErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.SmartCampaignErrorProto.internal_static_google_ads_googleads_v15_errors_SmartCampaignErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.class, com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible Smart campaign errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.SmartCampaignErrorEnum.SmartCampaignError}
   */
  public enum SmartCampaignError
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
     * The business location id is invalid.
     * </pre>
     *
     * <code>INVALID_BUSINESS_LOCATION_ID = 2;</code>
     */
    INVALID_BUSINESS_LOCATION_ID(2),
    /**
     * <pre>
     * The SmartCampaignSetting resource is only applicable for campaigns
     * with advertising channel type SMART.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN = 3;</code>
     */
    INVALID_CAMPAIGN(3),
    /**
     * <pre>
     * The business name or business location id is required.
     * </pre>
     *
     * <code>BUSINESS_NAME_OR_BUSINESS_LOCATION_ID_MISSING = 4;</code>
     */
    BUSINESS_NAME_OR_BUSINESS_LOCATION_ID_MISSING(4),
    /**
     * <pre>
     * A Smart campaign suggestion request field is required.
     * </pre>
     *
     * <code>REQUIRED_SUGGESTION_FIELD_MISSING = 5;</code>
     */
    REQUIRED_SUGGESTION_FIELD_MISSING(5),
    /**
     * <pre>
     * A location list or proximity is required.
     * </pre>
     *
     * <code>GEO_TARGETS_REQUIRED = 6;</code>
     */
    GEO_TARGETS_REQUIRED(6),
    /**
     * <pre>
     * The locale could not be determined.
     * </pre>
     *
     * <code>CANNOT_DETERMINE_SUGGESTION_LOCALE = 7;</code>
     */
    CANNOT_DETERMINE_SUGGESTION_LOCALE(7),
    /**
     * <pre>
     * The final URL could not be crawled.
     * </pre>
     *
     * <code>FINAL_URL_NOT_CRAWLABLE = 8;</code>
     */
    FINAL_URL_NOT_CRAWLABLE(8),
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
     * The business location id is invalid.
     * </pre>
     *
     * <code>INVALID_BUSINESS_LOCATION_ID = 2;</code>
     */
    public static final int INVALID_BUSINESS_LOCATION_ID_VALUE = 2;
    /**
     * <pre>
     * The SmartCampaignSetting resource is only applicable for campaigns
     * with advertising channel type SMART.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN = 3;</code>
     */
    public static final int INVALID_CAMPAIGN_VALUE = 3;
    /**
     * <pre>
     * The business name or business location id is required.
     * </pre>
     *
     * <code>BUSINESS_NAME_OR_BUSINESS_LOCATION_ID_MISSING = 4;</code>
     */
    public static final int BUSINESS_NAME_OR_BUSINESS_LOCATION_ID_MISSING_VALUE = 4;
    /**
     * <pre>
     * A Smart campaign suggestion request field is required.
     * </pre>
     *
     * <code>REQUIRED_SUGGESTION_FIELD_MISSING = 5;</code>
     */
    public static final int REQUIRED_SUGGESTION_FIELD_MISSING_VALUE = 5;
    /**
     * <pre>
     * A location list or proximity is required.
     * </pre>
     *
     * <code>GEO_TARGETS_REQUIRED = 6;</code>
     */
    public static final int GEO_TARGETS_REQUIRED_VALUE = 6;
    /**
     * <pre>
     * The locale could not be determined.
     * </pre>
     *
     * <code>CANNOT_DETERMINE_SUGGESTION_LOCALE = 7;</code>
     */
    public static final int CANNOT_DETERMINE_SUGGESTION_LOCALE_VALUE = 7;
    /**
     * <pre>
     * The final URL could not be crawled.
     * </pre>
     *
     * <code>FINAL_URL_NOT_CRAWLABLE = 8;</code>
     */
    public static final int FINAL_URL_NOT_CRAWLABLE_VALUE = 8;


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
    public static SmartCampaignError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SmartCampaignError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_BUSINESS_LOCATION_ID;
        case 3: return INVALID_CAMPAIGN;
        case 4: return BUSINESS_NAME_OR_BUSINESS_LOCATION_ID_MISSING;
        case 5: return REQUIRED_SUGGESTION_FIELD_MISSING;
        case 6: return GEO_TARGETS_REQUIRED;
        case 7: return CANNOT_DETERMINE_SUGGESTION_LOCALE;
        case 8: return FINAL_URL_NOT_CRAWLABLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SmartCampaignError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SmartCampaignError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SmartCampaignError>() {
            public SmartCampaignError findValueByNumber(int number) {
              return SmartCampaignError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final SmartCampaignError[] VALUES = values();

    public static SmartCampaignError valueOf(
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

    private SmartCampaignError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.SmartCampaignErrorEnum.SmartCampaignError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum other = (com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum prototype) {
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
   * Container for enum describing possible Smart campaign errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.SmartCampaignErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.SmartCampaignErrorEnum)
      com.google.ads.googleads.v15.errors.SmartCampaignErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.SmartCampaignErrorProto.internal_static_google_ads_googleads_v15_errors_SmartCampaignErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.SmartCampaignErrorProto.internal_static_google_ads_googleads_v15_errors_SmartCampaignErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.class, com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.SmartCampaignErrorProto.internal_static_google_ads_googleads_v15_errors_SmartCampaignErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum build() {
      com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum result = new com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.SmartCampaignErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.SmartCampaignErrorEnum)
  private static final com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartCampaignErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<SmartCampaignErrorEnum>() {
    @java.lang.Override
    public SmartCampaignErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmartCampaignErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartCampaignErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.SmartCampaignErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

