// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/feed_error.proto

package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible feed errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.FeedErrorEnum}
 */
public final class FeedErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.FeedErrorEnum)
    FeedErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedErrorEnum.newBuilder() to construct.
  private FeedErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.FeedErrorProto.internal_static_google_ads_googleads_v15_errors_FeedErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.FeedErrorProto.internal_static_google_ads_googleads_v15_errors_FeedErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.FeedErrorEnum.class, com.google.ads.googleads.v15.errors.FeedErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible feed errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.FeedErrorEnum.FeedError}
   */
  public enum FeedError
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
     * The names of the FeedAttributes must be unique.
     * </pre>
     *
     * <code>ATTRIBUTE_NAMES_NOT_UNIQUE = 2;</code>
     */
    ATTRIBUTE_NAMES_NOT_UNIQUE(2),
    /**
     * <pre>
     * The attribute list must be an exact copy of the existing list if the
     * attribute ID's are present.
     * </pre>
     *
     * <code>ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = 3;</code>
     */
    ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES(3),
    /**
     * <pre>
     * Cannot specify USER origin for a system generated feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = 4;</code>
     */
    CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED(4),
    /**
     * <pre>
     * Cannot specify GOOGLE origin for a non-system generated feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED = 5;</code>
     */
    CANNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED(5),
    /**
     * <pre>
     * Cannot specify feed attributes for system feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = 6;</code>
     */
    CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED(6),
    /**
     * <pre>
     * Cannot update FeedAttributes on feed with origin GOOGLE.
     * </pre>
     *
     * <code>CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_GOOGLE = 7;</code>
     */
    CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_GOOGLE(7),
    /**
     * <pre>
     * The given ID refers to a removed Feed. Removed Feeds are immutable.
     * </pre>
     *
     * <code>FEED_REMOVED = 8;</code>
     */
    FEED_REMOVED(8),
    /**
     * <pre>
     * The origin of the feed is not valid for the client.
     * </pre>
     *
     * <code>INVALID_ORIGIN_VALUE = 9;</code>
     */
    INVALID_ORIGIN_VALUE(9),
    /**
     * <pre>
     * A user can only create and modify feeds with USER origin.
     * </pre>
     *
     * <code>FEED_ORIGIN_IS_NOT_USER = 10;</code>
     */
    FEED_ORIGIN_IS_NOT_USER(10),
    /**
     * <pre>
     * Invalid auth token for the given email.
     * </pre>
     *
     * <code>INVALID_AUTH_TOKEN_FOR_EMAIL = 11;</code>
     */
    INVALID_AUTH_TOKEN_FOR_EMAIL(11),
    /**
     * <pre>
     * Invalid email specified.
     * </pre>
     *
     * <code>INVALID_EMAIL = 12;</code>
     */
    INVALID_EMAIL(12),
    /**
     * <pre>
     * Feed name matches that of another active Feed.
     * </pre>
     *
     * <code>DUPLICATE_FEED_NAME = 13;</code>
     */
    DUPLICATE_FEED_NAME(13),
    /**
     * <pre>
     * Name of feed is not allowed.
     * </pre>
     *
     * <code>INVALID_FEED_NAME = 14;</code>
     */
    INVALID_FEED_NAME(14),
    /**
     * <pre>
     * Missing OAuthInfo.
     * </pre>
     *
     * <code>MISSING_OAUTH_INFO = 15;</code>
     */
    MISSING_OAUTH_INFO(15),
    /**
     * <pre>
     * New FeedAttributes must not affect the unique key.
     * </pre>
     *
     * <code>NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = 16;</code>
     */
    NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY(16),
    /**
     * <pre>
     * Too many FeedAttributes for a Feed.
     * </pre>
     *
     * <code>TOO_MANY_ATTRIBUTES = 17;</code>
     */
    TOO_MANY_ATTRIBUTES(17),
    /**
     * <pre>
     * The business account is not valid.
     * </pre>
     *
     * <code>INVALID_BUSINESS_ACCOUNT = 18;</code>
     */
    INVALID_BUSINESS_ACCOUNT(18),
    /**
     * <pre>
     * Business account cannot access Business Profile.
     * </pre>
     *
     * <code>BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT = 19;</code>
     */
    BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT(19),
    /**
     * <pre>
     * Invalid chain ID provided for affiliate location feed.
     * </pre>
     *
     * <code>INVALID_AFFILIATE_CHAIN_ID = 20;</code>
     */
    INVALID_AFFILIATE_CHAIN_ID(20),
    /**
     * <pre>
     * There is already a feed with the given system feed generation data.
     * </pre>
     *
     * <code>DUPLICATE_SYSTEM_FEED = 21;</code>
     */
    DUPLICATE_SYSTEM_FEED(21),
    /**
     * <pre>
     * An error occurred accessing Business Profile.
     * </pre>
     *
     * <code>GMB_ACCESS_ERROR = 22;</code>
     */
    GMB_ACCESS_ERROR(22),
    /**
     * <pre>
     * A customer cannot have both LOCATION and AFFILIATE_LOCATION feeds.
     * </pre>
     *
     * <code>CANNOT_HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEEDS = 23;</code>
     */
    CANNOT_HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEEDS(23),
    /**
     * <pre>
     * Feed-based extension is read-only for this extension type.
     * </pre>
     *
     * <code>LEGACY_EXTENSION_TYPE_READ_ONLY = 24;</code>
     */
    LEGACY_EXTENSION_TYPE_READ_ONLY(24),
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
     * The names of the FeedAttributes must be unique.
     * </pre>
     *
     * <code>ATTRIBUTE_NAMES_NOT_UNIQUE = 2;</code>
     */
    public static final int ATTRIBUTE_NAMES_NOT_UNIQUE_VALUE = 2;
    /**
     * <pre>
     * The attribute list must be an exact copy of the existing list if the
     * attribute ID's are present.
     * </pre>
     *
     * <code>ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES = 3;</code>
     */
    public static final int ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES_VALUE = 3;
    /**
     * <pre>
     * Cannot specify USER origin for a system generated feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED = 4;</code>
     */
    public static final int CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED_VALUE = 4;
    /**
     * <pre>
     * Cannot specify GOOGLE origin for a non-system generated feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED = 5;</code>
     */
    public static final int CANNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED_VALUE = 5;
    /**
     * <pre>
     * Cannot specify feed attributes for system feed.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED = 6;</code>
     */
    public static final int CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED_VALUE = 6;
    /**
     * <pre>
     * Cannot update FeedAttributes on feed with origin GOOGLE.
     * </pre>
     *
     * <code>CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_GOOGLE = 7;</code>
     */
    public static final int CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_GOOGLE_VALUE = 7;
    /**
     * <pre>
     * The given ID refers to a removed Feed. Removed Feeds are immutable.
     * </pre>
     *
     * <code>FEED_REMOVED = 8;</code>
     */
    public static final int FEED_REMOVED_VALUE = 8;
    /**
     * <pre>
     * The origin of the feed is not valid for the client.
     * </pre>
     *
     * <code>INVALID_ORIGIN_VALUE = 9;</code>
     */
    public static final int INVALID_ORIGIN_VALUE_VALUE = 9;
    /**
     * <pre>
     * A user can only create and modify feeds with USER origin.
     * </pre>
     *
     * <code>FEED_ORIGIN_IS_NOT_USER = 10;</code>
     */
    public static final int FEED_ORIGIN_IS_NOT_USER_VALUE = 10;
    /**
     * <pre>
     * Invalid auth token for the given email.
     * </pre>
     *
     * <code>INVALID_AUTH_TOKEN_FOR_EMAIL = 11;</code>
     */
    public static final int INVALID_AUTH_TOKEN_FOR_EMAIL_VALUE = 11;
    /**
     * <pre>
     * Invalid email specified.
     * </pre>
     *
     * <code>INVALID_EMAIL = 12;</code>
     */
    public static final int INVALID_EMAIL_VALUE = 12;
    /**
     * <pre>
     * Feed name matches that of another active Feed.
     * </pre>
     *
     * <code>DUPLICATE_FEED_NAME = 13;</code>
     */
    public static final int DUPLICATE_FEED_NAME_VALUE = 13;
    /**
     * <pre>
     * Name of feed is not allowed.
     * </pre>
     *
     * <code>INVALID_FEED_NAME = 14;</code>
     */
    public static final int INVALID_FEED_NAME_VALUE = 14;
    /**
     * <pre>
     * Missing OAuthInfo.
     * </pre>
     *
     * <code>MISSING_OAUTH_INFO = 15;</code>
     */
    public static final int MISSING_OAUTH_INFO_VALUE = 15;
    /**
     * <pre>
     * New FeedAttributes must not affect the unique key.
     * </pre>
     *
     * <code>NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY = 16;</code>
     */
    public static final int NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY_VALUE = 16;
    /**
     * <pre>
     * Too many FeedAttributes for a Feed.
     * </pre>
     *
     * <code>TOO_MANY_ATTRIBUTES = 17;</code>
     */
    public static final int TOO_MANY_ATTRIBUTES_VALUE = 17;
    /**
     * <pre>
     * The business account is not valid.
     * </pre>
     *
     * <code>INVALID_BUSINESS_ACCOUNT = 18;</code>
     */
    public static final int INVALID_BUSINESS_ACCOUNT_VALUE = 18;
    /**
     * <pre>
     * Business account cannot access Business Profile.
     * </pre>
     *
     * <code>BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT = 19;</code>
     */
    public static final int BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT_VALUE = 19;
    /**
     * <pre>
     * Invalid chain ID provided for affiliate location feed.
     * </pre>
     *
     * <code>INVALID_AFFILIATE_CHAIN_ID = 20;</code>
     */
    public static final int INVALID_AFFILIATE_CHAIN_ID_VALUE = 20;
    /**
     * <pre>
     * There is already a feed with the given system feed generation data.
     * </pre>
     *
     * <code>DUPLICATE_SYSTEM_FEED = 21;</code>
     */
    public static final int DUPLICATE_SYSTEM_FEED_VALUE = 21;
    /**
     * <pre>
     * An error occurred accessing Business Profile.
     * </pre>
     *
     * <code>GMB_ACCESS_ERROR = 22;</code>
     */
    public static final int GMB_ACCESS_ERROR_VALUE = 22;
    /**
     * <pre>
     * A customer cannot have both LOCATION and AFFILIATE_LOCATION feeds.
     * </pre>
     *
     * <code>CANNOT_HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEEDS = 23;</code>
     */
    public static final int CANNOT_HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEEDS_VALUE = 23;
    /**
     * <pre>
     * Feed-based extension is read-only for this extension type.
     * </pre>
     *
     * <code>LEGACY_EXTENSION_TYPE_READ_ONLY = 24;</code>
     */
    public static final int LEGACY_EXTENSION_TYPE_READ_ONLY_VALUE = 24;


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
    public static FeedError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FeedError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ATTRIBUTE_NAMES_NOT_UNIQUE;
        case 3: return ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES;
        case 4: return CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED;
        case 5: return CANNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_FEED;
        case 6: return CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED;
        case 7: return CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_GOOGLE;
        case 8: return FEED_REMOVED;
        case 9: return INVALID_ORIGIN_VALUE;
        case 10: return FEED_ORIGIN_IS_NOT_USER;
        case 11: return INVALID_AUTH_TOKEN_FOR_EMAIL;
        case 12: return INVALID_EMAIL;
        case 13: return DUPLICATE_FEED_NAME;
        case 14: return INVALID_FEED_NAME;
        case 15: return MISSING_OAUTH_INFO;
        case 16: return NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY;
        case 17: return TOO_MANY_ATTRIBUTES;
        case 18: return INVALID_BUSINESS_ACCOUNT;
        case 19: return BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT;
        case 20: return INVALID_AFFILIATE_CHAIN_ID;
        case 21: return DUPLICATE_SYSTEM_FEED;
        case 22: return GMB_ACCESS_ERROR;
        case 23: return CANNOT_HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEEDS;
        case 24: return LEGACY_EXTENSION_TYPE_READ_ONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedError>() {
            public FeedError findValueByNumber(int number) {
              return FeedError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.FeedErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedError[] VALUES = values();

    public static FeedError valueOf(
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

    private FeedError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.FeedErrorEnum.FeedError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.FeedErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.FeedErrorEnum other = (com.google.ads.googleads.v15.errors.FeedErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.FeedErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.FeedErrorEnum prototype) {
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
   * Container for enum describing possible feed errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.FeedErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.FeedErrorEnum)
      com.google.ads.googleads.v15.errors.FeedErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.FeedErrorProto.internal_static_google_ads_googleads_v15_errors_FeedErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.FeedErrorProto.internal_static_google_ads_googleads_v15_errors_FeedErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.FeedErrorEnum.class, com.google.ads.googleads.v15.errors.FeedErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.FeedErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.FeedErrorProto.internal_static_google_ads_googleads_v15_errors_FeedErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.FeedErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.FeedErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.FeedErrorEnum build() {
      com.google.ads.googleads.v15.errors.FeedErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.FeedErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.FeedErrorEnum result = new com.google.ads.googleads.v15.errors.FeedErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.FeedErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.FeedErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.FeedErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.FeedErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.FeedErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.FeedErrorEnum)
  private static final com.google.ads.googleads.v15.errors.FeedErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.FeedErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.FeedErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedErrorEnum>() {
    @java.lang.Override
    public FeedErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.FeedErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

