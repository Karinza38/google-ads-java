// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/campaign_lifecycle_goal_error.proto

package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible campaign lifecycle goal errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum}
 */
public final class CampaignLifecycleGoalErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)
    CampaignLifecycleGoalErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignLifecycleGoalErrorEnum.newBuilder() to construct.
  private CampaignLifecycleGoalErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignLifecycleGoalErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignLifecycleGoalErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorProto.internal_static_google_ads_googleads_v15_errors_CampaignLifecycleGoalErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorProto.internal_static_google_ads_googleads_v15_errors_CampaignLifecycleGoalErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.class, com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible campaign lifecycle goal errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.CampaignLifecycleGoalError}
   */
  public enum CampaignLifecycleGoalError
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
     * Campaign is not specified.
     * </pre>
     *
     * <code>CAMPAIGN_MISSING = 2;</code>
     */
    CAMPAIGN_MISSING(2),
    /**
     * <pre>
     * Cannot find the specified campaign.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN = 3;</code>
     */
    INVALID_CAMPAIGN(3),
    /**
     * <pre>
     * Optimization mode is unspecified or invalid.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_OPTIMIZATION_MODE = 4;</code>
     */
    CUSTOMER_ACQUISITION_INVALID_OPTIMIZATION_MODE(4),
    /**
     * <pre>
     * The configured lifecycle goal setting is not compatible with the bidding
     * strategy the campaign is using. Specifically, BID_HIGHER_FOR_NEW_CUSTOMER
     * requires conversion-value based bidding strategy type such as
     * MAXIMIZE_CONVERSION_VALUE.
     * </pre>
     *
     * <code>INCOMPATIBLE_BIDDING_STRATEGY = 5;</code>
     */
    INCOMPATIBLE_BIDDING_STRATEGY(5),
    /**
     * <pre>
     * Lifecycle goals require the campaign to optimize towards purchase
     * conversion goal.
     * </pre>
     *
     * <code>MISSING_PURCHASE_GOAL = 6;</code>
     */
    MISSING_PURCHASE_GOAL(6),
    /**
     * <pre>
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.high_lifetime_value
     * is invalid or not allowed, such as when the specified value is smaller
     * than 0.01, when the optimization mode is not BID_HIGHER_FOR_NEW_CUSTOMER,
     * or when
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.high_lifetime_value
     * is specified smaller than/without
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_HIGH_LIFETIME_VALUE = 7;</code>
     */
    CUSTOMER_ACQUISITION_INVALID_HIGH_LIFETIME_VALUE(7),
    /**
     * <pre>
     * Customer acquisition goal is not supported on this campaign type.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_UNSUPPORTED_CAMPAIGN_TYPE = 8;</code>
     */
    CUSTOMER_ACQUISITION_UNSUPPORTED_CAMPAIGN_TYPE(8),
    /**
     * <pre>
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value
     * is invalid or not allowed, such as when the specified value is smaller
     * than 0.01, or when the optimization mode is not
     * BID_HIGHER_FOR_NEW_CUSTOMER.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_VALUE = 9;</code>
     */
    CUSTOMER_ACQUISITION_INVALID_VALUE(9),
    /**
     * <pre>
     * To use BID_HIGHER_FOR_NEW_CUSTOMER mode, either
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value
     * or CustomerLifecycleGoal.customer_acquisition_goal_value_settings.value
     * must have been specified. If a manager account is managing your account's
     * conversion tracking, then only the CustomerLifecycleGoal of that manager
     * account is used.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_VALUE_MISSING = 10;</code>
     */
    CUSTOMER_ACQUISITION_VALUE_MISSING(10),
    /**
     * <pre>
     * In order for a campaign to adopt the customer acquisition goal,
     * CustomerLifecycleGoal.lifecycle_goal_customer_definition_settings.existing_user_lists
     * must include active and accessible userlist with more than 1000 members
     * in the Search/Youtube network. If a manager account is managing your
     * account's conversion tracking, then only the CustomerLifecycleGoal of
     * that manager account is used. Also make sure that the manager account
     * shares audience segments with sub-accounts with continuous audience
     * sharing.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_MISSING_EXISTING_CUSTOMER_DEFINITION = 11;</code>
     */
    CUSTOMER_ACQUISITION_MISSING_EXISTING_CUSTOMER_DEFINITION(11),
    /**
     * <pre>
     * In order for a campaign to adopt the customer acquisition goal with high
     * lifetime value optimization,
     * CustomerLifecycleGoal.lifecycle_goal_customer_definition_settings.high_lifetime_value_user_lists
     * must include active and accessible userlist with more than 1000 members
     * in the Search/Youtube network. If a manager account is managing your
     * account's conversion tracking, then only the CustomerLifecycleGoal of
     * that manager account is used. Also make sure that the manager account
     * shares audience segments with sub-accounts using continuous audience
     * sharing.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_MISSING_HIGH_VALUE_CUSTOMER_DEFINITION = 12;</code>
     */
    CUSTOMER_ACQUISITION_MISSING_HIGH_VALUE_CUSTOMER_DEFINITION(12),
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
     * Campaign is not specified.
     * </pre>
     *
     * <code>CAMPAIGN_MISSING = 2;</code>
     */
    public static final int CAMPAIGN_MISSING_VALUE = 2;
    /**
     * <pre>
     * Cannot find the specified campaign.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN = 3;</code>
     */
    public static final int INVALID_CAMPAIGN_VALUE = 3;
    /**
     * <pre>
     * Optimization mode is unspecified or invalid.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_OPTIMIZATION_MODE = 4;</code>
     */
    public static final int CUSTOMER_ACQUISITION_INVALID_OPTIMIZATION_MODE_VALUE = 4;
    /**
     * <pre>
     * The configured lifecycle goal setting is not compatible with the bidding
     * strategy the campaign is using. Specifically, BID_HIGHER_FOR_NEW_CUSTOMER
     * requires conversion-value based bidding strategy type such as
     * MAXIMIZE_CONVERSION_VALUE.
     * </pre>
     *
     * <code>INCOMPATIBLE_BIDDING_STRATEGY = 5;</code>
     */
    public static final int INCOMPATIBLE_BIDDING_STRATEGY_VALUE = 5;
    /**
     * <pre>
     * Lifecycle goals require the campaign to optimize towards purchase
     * conversion goal.
     * </pre>
     *
     * <code>MISSING_PURCHASE_GOAL = 6;</code>
     */
    public static final int MISSING_PURCHASE_GOAL_VALUE = 6;
    /**
     * <pre>
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.high_lifetime_value
     * is invalid or not allowed, such as when the specified value is smaller
     * than 0.01, when the optimization mode is not BID_HIGHER_FOR_NEW_CUSTOMER,
     * or when
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.high_lifetime_value
     * is specified smaller than/without
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_HIGH_LIFETIME_VALUE = 7;</code>
     */
    public static final int CUSTOMER_ACQUISITION_INVALID_HIGH_LIFETIME_VALUE_VALUE = 7;
    /**
     * <pre>
     * Customer acquisition goal is not supported on this campaign type.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_UNSUPPORTED_CAMPAIGN_TYPE = 8;</code>
     */
    public static final int CUSTOMER_ACQUISITION_UNSUPPORTED_CAMPAIGN_TYPE_VALUE = 8;
    /**
     * <pre>
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value
     * is invalid or not allowed, such as when the specified value is smaller
     * than 0.01, or when the optimization mode is not
     * BID_HIGHER_FOR_NEW_CUSTOMER.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_INVALID_VALUE = 9;</code>
     */
    public static final int CUSTOMER_ACQUISITION_INVALID_VALUE_VALUE = 9;
    /**
     * <pre>
     * To use BID_HIGHER_FOR_NEW_CUSTOMER mode, either
     * CampaignLifecycleGoal.customer_acquisition_goal_settings.value_settings.value
     * or CustomerLifecycleGoal.customer_acquisition_goal_value_settings.value
     * must have been specified. If a manager account is managing your account's
     * conversion tracking, then only the CustomerLifecycleGoal of that manager
     * account is used.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_VALUE_MISSING = 10;</code>
     */
    public static final int CUSTOMER_ACQUISITION_VALUE_MISSING_VALUE = 10;
    /**
     * <pre>
     * In order for a campaign to adopt the customer acquisition goal,
     * CustomerLifecycleGoal.lifecycle_goal_customer_definition_settings.existing_user_lists
     * must include active and accessible userlist with more than 1000 members
     * in the Search/Youtube network. If a manager account is managing your
     * account's conversion tracking, then only the CustomerLifecycleGoal of
     * that manager account is used. Also make sure that the manager account
     * shares audience segments with sub-accounts with continuous audience
     * sharing.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_MISSING_EXISTING_CUSTOMER_DEFINITION = 11;</code>
     */
    public static final int CUSTOMER_ACQUISITION_MISSING_EXISTING_CUSTOMER_DEFINITION_VALUE = 11;
    /**
     * <pre>
     * In order for a campaign to adopt the customer acquisition goal with high
     * lifetime value optimization,
     * CustomerLifecycleGoal.lifecycle_goal_customer_definition_settings.high_lifetime_value_user_lists
     * must include active and accessible userlist with more than 1000 members
     * in the Search/Youtube network. If a manager account is managing your
     * account's conversion tracking, then only the CustomerLifecycleGoal of
     * that manager account is used. Also make sure that the manager account
     * shares audience segments with sub-accounts using continuous audience
     * sharing.
     * </pre>
     *
     * <code>CUSTOMER_ACQUISITION_MISSING_HIGH_VALUE_CUSTOMER_DEFINITION = 12;</code>
     */
    public static final int CUSTOMER_ACQUISITION_MISSING_HIGH_VALUE_CUSTOMER_DEFINITION_VALUE = 12;


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
    public static CampaignLifecycleGoalError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignLifecycleGoalError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CAMPAIGN_MISSING;
        case 3: return INVALID_CAMPAIGN;
        case 4: return CUSTOMER_ACQUISITION_INVALID_OPTIMIZATION_MODE;
        case 5: return INCOMPATIBLE_BIDDING_STRATEGY;
        case 6: return MISSING_PURCHASE_GOAL;
        case 7: return CUSTOMER_ACQUISITION_INVALID_HIGH_LIFETIME_VALUE;
        case 8: return CUSTOMER_ACQUISITION_UNSUPPORTED_CAMPAIGN_TYPE;
        case 9: return CUSTOMER_ACQUISITION_INVALID_VALUE;
        case 10: return CUSTOMER_ACQUISITION_VALUE_MISSING;
        case 11: return CUSTOMER_ACQUISITION_MISSING_EXISTING_CUSTOMER_DEFINITION;
        case 12: return CUSTOMER_ACQUISITION_MISSING_HIGH_VALUE_CUSTOMER_DEFINITION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignLifecycleGoalError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignLifecycleGoalError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignLifecycleGoalError>() {
            public CampaignLifecycleGoalError findValueByNumber(int number) {
              return CampaignLifecycleGoalError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignLifecycleGoalError[] VALUES = values();

    public static CampaignLifecycleGoalError valueOf(
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

    private CampaignLifecycleGoalError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.CampaignLifecycleGoalError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum other = (com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum prototype) {
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
   * Container for enum describing possible campaign lifecycle goal errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)
      com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorProto.internal_static_google_ads_googleads_v15_errors_CampaignLifecycleGoalErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorProto.internal_static_google_ads_googleads_v15_errors_CampaignLifecycleGoalErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.class, com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorProto.internal_static_google_ads_googleads_v15_errors_CampaignLifecycleGoalErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum build() {
      com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum result = new com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum)
  private static final com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignLifecycleGoalErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignLifecycleGoalErrorEnum>() {
    @java.lang.Override
    public CampaignLifecycleGoalErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignLifecycleGoalErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignLifecycleGoalErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.CampaignLifecycleGoalErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

