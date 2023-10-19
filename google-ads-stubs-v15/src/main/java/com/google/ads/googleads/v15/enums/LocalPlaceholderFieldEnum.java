// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/local_placeholder_field.proto

package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Values for Local placeholder fields.
 * For more information about dynamic remarketing feeds, see
 * https://support.google.com/google-ads/answer/6053288.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum}
 */
public final class LocalPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)
    LocalPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalPlaceholderFieldEnum.newBuilder() to construct.
  private LocalPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalPlaceholderFieldEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_LocalPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_LocalPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.class, com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Local placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField}
   */
  public enum LocalPlaceholderField
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Data Type: STRING. Required. Unique ID.
     * </pre>
     *
     * <code>DEAL_ID = 2;</code>
     */
    DEAL_ID(2),
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with local deal title to be
     * shown in dynamic ad.
     * </pre>
     *
     * <code>DEAL_NAME = 3;</code>
     */
    DEAL_NAME(3),
    /**
     * <pre>
     * Data Type: STRING. Local deal subtitle to be shown in dynamic ad.
     * </pre>
     *
     * <code>SUBTITLE = 4;</code>
     */
    SUBTITLE(4),
    /**
     * <pre>
     * Data Type: STRING. Description of local deal to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 5;</code>
     */
    DESCRIPTION(5),
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad. Highly recommended for
     * dynamic ads. Example: "100.00 USD"
     * </pre>
     *
     * <code>PRICE = 6;</code>
     */
    PRICE(6),
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 7;</code>
     */
    FORMATTED_PRICE(7),
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>SALE_PRICE = 8;</code>
     */
    SALE_PRICE(8),
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 9;</code>
     */
    FORMATTED_SALE_PRICE(9),
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 10;</code>
     */
    IMAGE_URL(10),
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 11;</code>
     */
    ADDRESS(11),
    /**
     * <pre>
     * Data Type: STRING. Category of local deal used to group like items
     * together for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 12;</code>
     */
    CATEGORY(12),
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 13;</code>
     */
    CONTEXTUAL_KEYWORDS(13),
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (for example, the individual
     * URL of a specific local deal and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 14;</code>
     */
    FINAL_URLS(14),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 15;</code>
     */
    FINAL_MOBILE_URLS(15),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 16;</code>
     */
    TRACKING_URL(16),
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 17;</code>
     */
    ANDROID_APP_LINK(17),
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended local deal IDs to show
     * together with this item.
     * </pre>
     *
     * <code>SIMILAR_DEAL_IDS = 18;</code>
     */
    SIMILAR_DEAL_IDS(18),
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 19;</code>
     */
    IOS_APP_LINK(19),
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 20;</code>
     */
    IOS_APP_STORE_ID(20),
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Data Type: STRING. Required. Unique ID.
     * </pre>
     *
     * <code>DEAL_ID = 2;</code>
     */
    public static final int DEAL_ID_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with local deal title to be
     * shown in dynamic ad.
     * </pre>
     *
     * <code>DEAL_NAME = 3;</code>
     */
    public static final int DEAL_NAME_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Local deal subtitle to be shown in dynamic ad.
     * </pre>
     *
     * <code>SUBTITLE = 4;</code>
     */
    public static final int SUBTITLE_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. Description of local deal to be shown in dynamic ad.
     * </pre>
     *
     * <code>DESCRIPTION = 5;</code>
     */
    public static final int DESCRIPTION_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad. Highly recommended for
     * dynamic ads. Example: "100.00 USD"
     * </pre>
     *
     * <code>PRICE = 6;</code>
     */
    public static final int PRICE_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 7;</code>
     */
    public static final int FORMATTED_PRICE_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>SALE_PRICE = 8;</code>
     */
    public static final int SALE_PRICE_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 9;</code>
     */
    public static final int FORMATTED_SALE_PRICE_VALUE = 9;
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 10;</code>
     */
    public static final int IMAGE_URL_VALUE = 10;
    /**
     * <pre>
     * Data Type: STRING. Complete property address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 11;</code>
     */
    public static final int ADDRESS_VALUE = 11;
    /**
     * <pre>
     * Data Type: STRING. Category of local deal used to group like items
     * together for recommendation engine.
     * </pre>
     *
     * <code>CATEGORY = 12;</code>
     */
    public static final int CATEGORY_VALUE = 12;
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 13;</code>
     */
    public static final int CONTEXTUAL_KEYWORDS_VALUE = 13;
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (for example, the individual
     * URL of a specific local deal and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 14;</code>
     */
    public static final int FINAL_URLS_VALUE = 14;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 15;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 15;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 16;</code>
     */
    public static final int TRACKING_URL_VALUE = 16;
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 17;</code>
     */
    public static final int ANDROID_APP_LINK_VALUE = 17;
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended local deal IDs to show
     * together with this item.
     * </pre>
     *
     * <code>SIMILAR_DEAL_IDS = 18;</code>
     */
    public static final int SIMILAR_DEAL_IDS_VALUE = 18;
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 19;</code>
     */
    public static final int IOS_APP_LINK_VALUE = 19;
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 20;</code>
     */
    public static final int IOS_APP_STORE_ID_VALUE = 20;


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
    public static LocalPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LocalPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DEAL_ID;
        case 3: return DEAL_NAME;
        case 4: return SUBTITLE;
        case 5: return DESCRIPTION;
        case 6: return PRICE;
        case 7: return FORMATTED_PRICE;
        case 8: return SALE_PRICE;
        case 9: return FORMATTED_SALE_PRICE;
        case 10: return IMAGE_URL;
        case 11: return ADDRESS;
        case 12: return CATEGORY;
        case 13: return CONTEXTUAL_KEYWORDS;
        case 14: return FINAL_URLS;
        case 15: return FINAL_MOBILE_URLS;
        case 16: return TRACKING_URL;
        case 17: return ANDROID_APP_LINK;
        case 18: return SIMILAR_DEAL_IDS;
        case 19: return IOS_APP_LINK;
        case 20: return IOS_APP_STORE_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocalPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LocalPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocalPlaceholderField>() {
            public LocalPlaceholderField findValueByNumber(int number) {
              return LocalPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final LocalPlaceholderField[] VALUES = values();

    public static LocalPlaceholderField valueOf(
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

    private LocalPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.LocalPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum other = (com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum prototype) {
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
   * Values for Local placeholder fields.
   * For more information about dynamic remarketing feeds, see
   * https://support.google.com/google-ads/answer/6053288.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)
      com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_LocalPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_LocalPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.class, com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_LocalPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum build() {
      com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum result = new com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<LocalPlaceholderFieldEnum>() {
    @java.lang.Override
    public LocalPlaceholderFieldEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocalPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.LocalPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

