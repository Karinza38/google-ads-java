// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * The duration of a planned campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.CampaignDuration}
 */
public final class CampaignDuration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.CampaignDuration)
    CampaignDurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignDuration.newBuilder() to construct.
  private CampaignDuration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignDuration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignDuration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_CampaignDuration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_CampaignDuration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.CampaignDuration.class, com.google.ads.googleads.v15.services.CampaignDuration.Builder.class);
  }

  private int bitField0_;
  public static final int DURATION_IN_DAYS_FIELD_NUMBER = 2;
  private int durationInDays_ = 0;
  /**
   * <pre>
   * The duration value in days.
   *
   * This field cannot be combined with the date_range field.
   * </pre>
   *
   * <code>optional int32 duration_in_days = 2;</code>
   * @return Whether the durationInDays field is set.
   */
  @java.lang.Override
  public boolean hasDurationInDays() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The duration value in days.
   *
   * This field cannot be combined with the date_range field.
   * </pre>
   *
   * <code>optional int32 duration_in_days = 2;</code>
   * @return The durationInDays.
   */
  @java.lang.Override
  public int getDurationInDays() {
    return durationInDays_;
  }

  public static final int DATE_RANGE_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v15.common.DateRange dateRange_;
  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   *
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
   * @return Whether the dateRange field is set.
   */
  @java.lang.Override
  public boolean hasDateRange() {
    return dateRange_ != null;
  }
  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   *
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
   * @return The dateRange.
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.DateRange getDateRange() {
    return dateRange_ == null ? com.google.ads.googleads.v15.common.DateRange.getDefaultInstance() : dateRange_;
  }
  /**
   * <pre>
   * Date range of the campaign.
   * Dates are in the yyyy-mm-dd format and inclusive.
   * The end date must be &lt; 1 year in the future and the
   * date range must be &lt;= 92 days long.
   *
   * This field cannot be combined with the duration_in_days field.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.DateRangeOrBuilder getDateRangeOrBuilder() {
    return dateRange_ == null ? com.google.ads.googleads.v15.common.DateRange.getDefaultInstance() : dateRange_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(2, durationInDays_);
    }
    if (dateRange_ != null) {
      output.writeMessage(3, getDateRange());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, durationInDays_);
    }
    if (dateRange_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDateRange());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v15.services.CampaignDuration)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.CampaignDuration other = (com.google.ads.googleads.v15.services.CampaignDuration) obj;

    if (hasDurationInDays() != other.hasDurationInDays()) return false;
    if (hasDurationInDays()) {
      if (getDurationInDays()
          != other.getDurationInDays()) return false;
    }
    if (hasDateRange() != other.hasDateRange()) return false;
    if (hasDateRange()) {
      if (!getDateRange()
          .equals(other.getDateRange())) return false;
    }
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
    if (hasDurationInDays()) {
      hash = (37 * hash) + DURATION_IN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getDurationInDays();
    }
    if (hasDateRange()) {
      hash = (37 * hash) + DATE_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getDateRange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.CampaignDuration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.CampaignDuration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.CampaignDuration parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.CampaignDuration prototype) {
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
   * The duration of a planned campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.CampaignDuration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.CampaignDuration)
      com.google.ads.googleads.v15.services.CampaignDurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_CampaignDuration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_CampaignDuration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.CampaignDuration.class, com.google.ads.googleads.v15.services.CampaignDuration.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.CampaignDuration.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      durationInDays_ = 0;
      dateRange_ = null;
      if (dateRangeBuilder_ != null) {
        dateRangeBuilder_.dispose();
        dateRangeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_CampaignDuration_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CampaignDuration getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.CampaignDuration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CampaignDuration build() {
      com.google.ads.googleads.v15.services.CampaignDuration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CampaignDuration buildPartial() {
      com.google.ads.googleads.v15.services.CampaignDuration result = new com.google.ads.googleads.v15.services.CampaignDuration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.CampaignDuration result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.durationInDays_ = durationInDays_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dateRange_ = dateRangeBuilder_ == null
            ? dateRange_
            : dateRangeBuilder_.build();
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v15.services.CampaignDuration) {
        return mergeFrom((com.google.ads.googleads.v15.services.CampaignDuration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.CampaignDuration other) {
      if (other == com.google.ads.googleads.v15.services.CampaignDuration.getDefaultInstance()) return this;
      if (other.hasDurationInDays()) {
        setDurationInDays(other.getDurationInDays());
      }
      if (other.hasDateRange()) {
        mergeDateRange(other.getDateRange());
      }
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
            case 16: {
              durationInDays_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getDateRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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
    private int bitField0_;

    private int durationInDays_ ;
    /**
     * <pre>
     * The duration value in days.
     *
     * This field cannot be combined with the date_range field.
     * </pre>
     *
     * <code>optional int32 duration_in_days = 2;</code>
     * @return Whether the durationInDays field is set.
     */
    @java.lang.Override
    public boolean hasDurationInDays() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The duration value in days.
     *
     * This field cannot be combined with the date_range field.
     * </pre>
     *
     * <code>optional int32 duration_in_days = 2;</code>
     * @return The durationInDays.
     */
    @java.lang.Override
    public int getDurationInDays() {
      return durationInDays_;
    }
    /**
     * <pre>
     * The duration value in days.
     *
     * This field cannot be combined with the date_range field.
     * </pre>
     *
     * <code>optional int32 duration_in_days = 2;</code>
     * @param value The durationInDays to set.
     * @return This builder for chaining.
     */
    public Builder setDurationInDays(int value) {

      durationInDays_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration value in days.
     *
     * This field cannot be combined with the date_range field.
     * </pre>
     *
     * <code>optional int32 duration_in_days = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationInDays() {
      bitField0_ = (bitField0_ & ~0x00000001);
      durationInDays_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v15.common.DateRange dateRange_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.common.DateRange, com.google.ads.googleads.v15.common.DateRange.Builder, com.google.ads.googleads.v15.common.DateRangeOrBuilder> dateRangeBuilder_;
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     * @return Whether the dateRange field is set.
     */
    public boolean hasDateRange() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     * @return The dateRange.
     */
    public com.google.ads.googleads.v15.common.DateRange getDateRange() {
      if (dateRangeBuilder_ == null) {
        return dateRange_ == null ? com.google.ads.googleads.v15.common.DateRange.getDefaultInstance() : dateRange_;
      } else {
        return dateRangeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public Builder setDateRange(com.google.ads.googleads.v15.common.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateRange_ = value;
      } else {
        dateRangeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public Builder setDateRange(
        com.google.ads.googleads.v15.common.DateRange.Builder builderForValue) {
      if (dateRangeBuilder_ == null) {
        dateRange_ = builderForValue.build();
      } else {
        dateRangeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public Builder mergeDateRange(com.google.ads.googleads.v15.common.DateRange value) {
      if (dateRangeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dateRange_ != null &&
          dateRange_ != com.google.ads.googleads.v15.common.DateRange.getDefaultInstance()) {
          getDateRangeBuilder().mergeFrom(value);
        } else {
          dateRange_ = value;
        }
      } else {
        dateRangeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public Builder clearDateRange() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dateRange_ = null;
      if (dateRangeBuilder_ != null) {
        dateRangeBuilder_.dispose();
        dateRangeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public com.google.ads.googleads.v15.common.DateRange.Builder getDateRangeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDateRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    public com.google.ads.googleads.v15.common.DateRangeOrBuilder getDateRangeOrBuilder() {
      if (dateRangeBuilder_ != null) {
        return dateRangeBuilder_.getMessageOrBuilder();
      } else {
        return dateRange_ == null ?
            com.google.ads.googleads.v15.common.DateRange.getDefaultInstance() : dateRange_;
      }
    }
    /**
     * <pre>
     * Date range of the campaign.
     * Dates are in the yyyy-mm-dd format and inclusive.
     * The end date must be &lt; 1 year in the future and the
     * date range must be &lt;= 92 days long.
     *
     * This field cannot be combined with the duration_in_days field.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.common.DateRange date_range = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.common.DateRange, com.google.ads.googleads.v15.common.DateRange.Builder, com.google.ads.googleads.v15.common.DateRangeOrBuilder> 
        getDateRangeFieldBuilder() {
      if (dateRangeBuilder_ == null) {
        dateRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v15.common.DateRange, com.google.ads.googleads.v15.common.DateRange.Builder, com.google.ads.googleads.v15.common.DateRangeOrBuilder>(
                getDateRange(),
                getParentForChildren(),
                isClean());
        dateRange_ = null;
      }
      return dateRangeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.CampaignDuration)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.CampaignDuration)
  private static final com.google.ads.googleads.v15.services.CampaignDuration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.CampaignDuration();
  }

  public static com.google.ads.googleads.v15.services.CampaignDuration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignDuration>
      PARSER = new com.google.protobuf.AbstractParser<CampaignDuration>() {
    @java.lang.Override
    public CampaignDuration parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignDuration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignDuration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.CampaignDuration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

