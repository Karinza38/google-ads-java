// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/enums/ad_destination_type.proto

package com.google.ads.googleads.v11.enums;

/**
 * <pre>
 * Container for enumeration of Google Ads destination types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.enums.AdDestinationTypeEnum}
 */
public final class AdDestinationTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.enums.AdDestinationTypeEnum)
    AdDestinationTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdDestinationTypeEnum.newBuilder() to construct.
  private AdDestinationTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdDestinationTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdDestinationTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.enums.AdDestinationTypeProto.internal_static_google_ads_googleads_v11_enums_AdDestinationTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.enums.AdDestinationTypeProto.internal_static_google_ads_googleads_v11_enums_AdDestinationTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.class, com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates Google Ads destination types
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.enums.AdDestinationTypeEnum.AdDestinationType}
   */
  public enum AdDestinationType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Ads that don't intend to drive users off from ads to other destinations
     * </pre>
     *
     * <code>NOT_APPLICABLE = 2;</code>
     */
    NOT_APPLICABLE(2),
    /**
     * <pre>
     * Website
     * </pre>
     *
     * <code>WEBSITE = 3;</code>
     */
    WEBSITE(3),
    /**
     * <pre>
     * App Deep Link
     * </pre>
     *
     * <code>APP_DEEP_LINK = 4;</code>
     */
    APP_DEEP_LINK(4),
    /**
     * <pre>
     * iOS App Store or Play Store
     * </pre>
     *
     * <code>APP_STORE = 5;</code>
     */
    APP_STORE(5),
    /**
     * <pre>
     * Call Dialer
     * </pre>
     *
     * <code>PHONE_CALL = 6;</code>
     */
    PHONE_CALL(6),
    /**
     * <pre>
     * Map App
     * </pre>
     *
     * <code>MAP_DIRECTIONS = 7;</code>
     */
    MAP_DIRECTIONS(7),
    /**
     * <pre>
     * Location Dedicated Page
     * </pre>
     *
     * <code>LOCATION_LISTING = 8;</code>
     */
    LOCATION_LISTING(8),
    /**
     * <pre>
     * Text Message
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    MESSAGE(9),
    /**
     * <pre>
     * Lead Generation Form
     * </pre>
     *
     * <code>LEAD_FORM = 10;</code>
     */
    LEAD_FORM(10),
    /**
     * <pre>
     * YouTube
     * </pre>
     *
     * <code>YOUTUBE = 11;</code>
     */
    YOUTUBE(11),
    /**
     * <pre>
     * Ad Destination for Conversions with keys unknown
     * </pre>
     *
     * <code>UNMODELED_FOR_CONVERSIONS = 12;</code>
     */
    UNMODELED_FOR_CONVERSIONS(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Ads that don't intend to drive users off from ads to other destinations
     * </pre>
     *
     * <code>NOT_APPLICABLE = 2;</code>
     */
    public static final int NOT_APPLICABLE_VALUE = 2;
    /**
     * <pre>
     * Website
     * </pre>
     *
     * <code>WEBSITE = 3;</code>
     */
    public static final int WEBSITE_VALUE = 3;
    /**
     * <pre>
     * App Deep Link
     * </pre>
     *
     * <code>APP_DEEP_LINK = 4;</code>
     */
    public static final int APP_DEEP_LINK_VALUE = 4;
    /**
     * <pre>
     * iOS App Store or Play Store
     * </pre>
     *
     * <code>APP_STORE = 5;</code>
     */
    public static final int APP_STORE_VALUE = 5;
    /**
     * <pre>
     * Call Dialer
     * </pre>
     *
     * <code>PHONE_CALL = 6;</code>
     */
    public static final int PHONE_CALL_VALUE = 6;
    /**
     * <pre>
     * Map App
     * </pre>
     *
     * <code>MAP_DIRECTIONS = 7;</code>
     */
    public static final int MAP_DIRECTIONS_VALUE = 7;
    /**
     * <pre>
     * Location Dedicated Page
     * </pre>
     *
     * <code>LOCATION_LISTING = 8;</code>
     */
    public static final int LOCATION_LISTING_VALUE = 8;
    /**
     * <pre>
     * Text Message
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    public static final int MESSAGE_VALUE = 9;
    /**
     * <pre>
     * Lead Generation Form
     * </pre>
     *
     * <code>LEAD_FORM = 10;</code>
     */
    public static final int LEAD_FORM_VALUE = 10;
    /**
     * <pre>
     * YouTube
     * </pre>
     *
     * <code>YOUTUBE = 11;</code>
     */
    public static final int YOUTUBE_VALUE = 11;
    /**
     * <pre>
     * Ad Destination for Conversions with keys unknown
     * </pre>
     *
     * <code>UNMODELED_FOR_CONVERSIONS = 12;</code>
     */
    public static final int UNMODELED_FOR_CONVERSIONS_VALUE = 12;


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
    public static AdDestinationType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdDestinationType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NOT_APPLICABLE;
        case 3: return WEBSITE;
        case 4: return APP_DEEP_LINK;
        case 5: return APP_STORE;
        case 6: return PHONE_CALL;
        case 7: return MAP_DIRECTIONS;
        case 8: return LOCATION_LISTING;
        case 9: return MESSAGE;
        case 10: return LEAD_FORM;
        case 11: return YOUTUBE;
        case 12: return UNMODELED_FOR_CONVERSIONS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdDestinationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdDestinationType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdDestinationType>() {
            public AdDestinationType findValueByNumber(int number) {
              return AdDestinationType.forNumber(number);
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
      return com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdDestinationType[] VALUES = values();

    public static AdDestinationType valueOf(
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

    private AdDestinationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.enums.AdDestinationTypeEnum.AdDestinationType)
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
    if (!(obj instanceof com.google.ads.googleads.v11.enums.AdDestinationTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.enums.AdDestinationTypeEnum other = (com.google.ads.googleads.v11.enums.AdDestinationTypeEnum) obj;

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

  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.enums.AdDestinationTypeEnum prototype) {
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
   * Container for enumeration of Google Ads destination types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.enums.AdDestinationTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.enums.AdDestinationTypeEnum)
      com.google.ads.googleads.v11.enums.AdDestinationTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.enums.AdDestinationTypeProto.internal_static_google_ads_googleads_v11_enums_AdDestinationTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.enums.AdDestinationTypeProto.internal_static_google_ads_googleads_v11_enums_AdDestinationTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.class, com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v11.enums.AdDestinationTypeProto.internal_static_google_ads_googleads_v11_enums_AdDestinationTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AdDestinationTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AdDestinationTypeEnum build() {
      com.google.ads.googleads.v11.enums.AdDestinationTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AdDestinationTypeEnum buildPartial() {
      com.google.ads.googleads.v11.enums.AdDestinationTypeEnum result = new com.google.ads.googleads.v11.enums.AdDestinationTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.enums.AdDestinationTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v11.enums.AdDestinationTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.enums.AdDestinationTypeEnum other) {
      if (other == com.google.ads.googleads.v11.enums.AdDestinationTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.enums.AdDestinationTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.enums.AdDestinationTypeEnum)
  private static final com.google.ads.googleads.v11.enums.AdDestinationTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.enums.AdDestinationTypeEnum();
  }

  public static com.google.ads.googleads.v11.enums.AdDestinationTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdDestinationTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdDestinationTypeEnum>() {
    @java.lang.Override
    public AdDestinationTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdDestinationTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdDestinationTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.enums.AdDestinationTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

