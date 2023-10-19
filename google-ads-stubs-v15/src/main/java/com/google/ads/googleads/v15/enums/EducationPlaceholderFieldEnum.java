// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/education_placeholder_field.proto

package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Values for Education placeholder fields.
 * For more information about dynamic remarketing feeds, see
 * https://support.google.com/google-ads/answer/6053288.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum}
 */
public final class EducationPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)
    EducationPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EducationPlaceholderFieldEnum.newBuilder() to construct.
  private EducationPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EducationPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EducationPlaceholderFieldEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_EducationPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_EducationPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.class, com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Education placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField}
   */
  public enum EducationPlaceholderField
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
     * Data Type: STRING. Required. Combination of PROGRAM ID and LOCATION ID
     * must be unique per offer.
     * </pre>
     *
     * <code>PROGRAM_ID = 2;</code>
     */
    PROGRAM_ID(2),
    /**
     * <pre>
     * Data Type: STRING. Combination of PROGRAM ID and LOCATION ID must be
     * unique per offer.
     * </pre>
     *
     * <code>LOCATION_ID = 3;</code>
     */
    LOCATION_ID(3),
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with program name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>PROGRAM_NAME = 4;</code>
     */
    PROGRAM_NAME(4),
    /**
     * <pre>
     * Data Type: STRING. Area of study that can be shown in dynamic ad.
     * </pre>
     *
     * <code>AREA_OF_STUDY = 5;</code>
     */
    AREA_OF_STUDY(5),
    /**
     * <pre>
     * Data Type: STRING. Description of program that can be shown in dynamic
     * ad.
     * </pre>
     *
     * <code>PROGRAM_DESCRIPTION = 6;</code>
     */
    PROGRAM_DESCRIPTION(6),
    /**
     * <pre>
     * Data Type: STRING. Name of school that can be shown in dynamic ad.
     * </pre>
     *
     * <code>SCHOOL_NAME = 7;</code>
     */
    SCHOOL_NAME(7),
    /**
     * <pre>
     * Data Type: STRING. Complete school address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 8;</code>
     */
    ADDRESS(8),
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in ads.
     * </pre>
     *
     * <code>THUMBNAIL_IMAGE_URL = 9;</code>
     */
    THUMBNAIL_IMAGE_URL(9),
    /**
     * <pre>
     * Data Type: URL. Alternative hosted file of image to be used in the ad.
     * </pre>
     *
     * <code>ALTERNATIVE_THUMBNAIL_IMAGE_URL = 10;</code>
     */
    ALTERNATIVE_THUMBNAIL_IMAGE_URL(10),
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (for example, the individual
     * URL of a specific program and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 11;</code>
     */
    FINAL_URLS(11),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 12;</code>
     */
    FINAL_MOBILE_URLS(12),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 13;</code>
     */
    TRACKING_URL(13),
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 14;</code>
     */
    CONTEXTUAL_KEYWORDS(14),
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
     * <code>ANDROID_APP_LINK = 15;</code>
     */
    ANDROID_APP_LINK(15),
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended program IDs to show together
     * with this item.
     * </pre>
     *
     * <code>SIMILAR_PROGRAM_IDS = 16;</code>
     */
    SIMILAR_PROGRAM_IDS(16),
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 17;</code>
     */
    IOS_APP_LINK(17),
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 18;</code>
     */
    IOS_APP_STORE_ID(18),
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
     * Data Type: STRING. Required. Combination of PROGRAM ID and LOCATION ID
     * must be unique per offer.
     * </pre>
     *
     * <code>PROGRAM_ID = 2;</code>
     */
    public static final int PROGRAM_ID_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Combination of PROGRAM ID and LOCATION ID must be
     * unique per offer.
     * </pre>
     *
     * <code>LOCATION_ID = 3;</code>
     */
    public static final int LOCATION_ID_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with program name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>PROGRAM_NAME = 4;</code>
     */
    public static final int PROGRAM_NAME_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. Area of study that can be shown in dynamic ad.
     * </pre>
     *
     * <code>AREA_OF_STUDY = 5;</code>
     */
    public static final int AREA_OF_STUDY_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Description of program that can be shown in dynamic
     * ad.
     * </pre>
     *
     * <code>PROGRAM_DESCRIPTION = 6;</code>
     */
    public static final int PROGRAM_DESCRIPTION_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Name of school that can be shown in dynamic ad.
     * </pre>
     *
     * <code>SCHOOL_NAME = 7;</code>
     */
    public static final int SCHOOL_NAME_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Complete school address, including postal code.
     * </pre>
     *
     * <code>ADDRESS = 8;</code>
     */
    public static final int ADDRESS_VALUE = 8;
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in ads.
     * </pre>
     *
     * <code>THUMBNAIL_IMAGE_URL = 9;</code>
     */
    public static final int THUMBNAIL_IMAGE_URL_VALUE = 9;
    /**
     * <pre>
     * Data Type: URL. Alternative hosted file of image to be used in the ad.
     * </pre>
     *
     * <code>ALTERNATIVE_THUMBNAIL_IMAGE_URL = 10;</code>
     */
    public static final int ALTERNATIVE_THUMBNAIL_IMAGE_URL_VALUE = 10;
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs to be used in ad when using
     * Upgraded URLs; the more specific the better (for example, the individual
     * URL of a specific program and its location).
     * </pre>
     *
     * <code>FINAL_URLS = 11;</code>
     */
    public static final int FINAL_URLS_VALUE = 11;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 12;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 12;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 13;</code>
     */
    public static final int TRACKING_URL_VALUE = 13;
    /**
     * <pre>
     * Data Type: STRING_LIST. Keywords used for product retrieval.
     * </pre>
     *
     * <code>CONTEXTUAL_KEYWORDS = 14;</code>
     */
    public static final int CONTEXTUAL_KEYWORDS_VALUE = 14;
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
     * <code>ANDROID_APP_LINK = 15;</code>
     */
    public static final int ANDROID_APP_LINK_VALUE = 15;
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended program IDs to show together
     * with this item.
     * </pre>
     *
     * <code>SIMILAR_PROGRAM_IDS = 16;</code>
     */
    public static final int SIMILAR_PROGRAM_IDS_VALUE = 16;
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 17;</code>
     */
    public static final int IOS_APP_LINK_VALUE = 17;
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 18;</code>
     */
    public static final int IOS_APP_STORE_ID_VALUE = 18;


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
    public static EducationPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EducationPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PROGRAM_ID;
        case 3: return LOCATION_ID;
        case 4: return PROGRAM_NAME;
        case 5: return AREA_OF_STUDY;
        case 6: return PROGRAM_DESCRIPTION;
        case 7: return SCHOOL_NAME;
        case 8: return ADDRESS;
        case 9: return THUMBNAIL_IMAGE_URL;
        case 10: return ALTERNATIVE_THUMBNAIL_IMAGE_URL;
        case 11: return FINAL_URLS;
        case 12: return FINAL_MOBILE_URLS;
        case 13: return TRACKING_URL;
        case 14: return CONTEXTUAL_KEYWORDS;
        case 15: return ANDROID_APP_LINK;
        case 16: return SIMILAR_PROGRAM_IDS;
        case 17: return IOS_APP_LINK;
        case 18: return IOS_APP_STORE_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EducationPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EducationPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EducationPlaceholderField>() {
            public EducationPlaceholderField findValueByNumber(int number) {
              return EducationPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final EducationPlaceholderField[] VALUES = values();

    public static EducationPlaceholderField valueOf(
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

    private EducationPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.EducationPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum other = (com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum prototype) {
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
   * Values for Education placeholder fields.
   * For more information about dynamic remarketing feeds, see
   * https://support.google.com/google-ads/answer/6053288.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)
      com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_EducationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_EducationPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.class, com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldProto.internal_static_google_ads_googleads_v15_enums_EducationPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum build() {
      com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum result = new com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EducationPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<EducationPlaceholderFieldEnum>() {
    @java.lang.Override
    public EducationPlaceholderFieldEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<EducationPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EducationPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.EducationPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

