// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/criteria.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Represents an AdSchedule criterion.
 * AdSchedule is specified as the day of the week and a time interval
 * within which ads will be shown.
 * No more than six AdSchedules can be added for the same day.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.AdScheduleInfo}
 */
public final class AdScheduleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.AdScheduleInfo)
    AdScheduleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdScheduleInfo.newBuilder() to construct.
  private AdScheduleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdScheduleInfo() {
    startMinute_ = 0;
    endMinute_ = 0;
    dayOfWeek_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdScheduleInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_AdScheduleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_AdScheduleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.AdScheduleInfo.class, com.google.ads.googleads.v12.common.AdScheduleInfo.Builder.class);
  }

  private int bitField0_;
  public static final int START_MINUTE_FIELD_NUMBER = 1;
  private int startMinute_;
  /**
   * <pre>
   * Minutes after the start hour at which this schedule starts.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
   * @return The enum numeric value on the wire for startMinute.
   */
  @java.lang.Override public int getStartMinuteValue() {
    return startMinute_;
  }
  /**
   * <pre>
   * Minutes after the start hour at which this schedule starts.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
   * @return The startMinute.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour getStartMinute() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour result = com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.valueOf(startMinute_);
    return result == null ? com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNRECOGNIZED : result;
  }

  public static final int END_MINUTE_FIELD_NUMBER = 2;
  private int endMinute_;
  /**
   * <pre>
   * Minutes after the end hour at which this schedule ends. The schedule is
   * exclusive of the end minute.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
   * @return The enum numeric value on the wire for endMinute.
   */
  @java.lang.Override public int getEndMinuteValue() {
    return endMinute_;
  }
  /**
   * <pre>
   * Minutes after the end hour at which this schedule ends. The schedule is
   * exclusive of the end minute.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
   * @return The endMinute.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour getEndMinute() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour result = com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.valueOf(endMinute_);
    return result == null ? com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNRECOGNIZED : result;
  }

  public static final int START_HOUR_FIELD_NUMBER = 6;
  private int startHour_;
  /**
   * <pre>
   * Starting hour in 24 hour time.
   * This field must be between 0 and 23, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>optional int32 start_hour = 6;</code>
   * @return Whether the startHour field is set.
   */
  @java.lang.Override
  public boolean hasStartHour() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Starting hour in 24 hour time.
   * This field must be between 0 and 23, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>optional int32 start_hour = 6;</code>
   * @return The startHour.
   */
  @java.lang.Override
  public int getStartHour() {
    return startHour_;
  }

  public static final int END_HOUR_FIELD_NUMBER = 7;
  private int endHour_;
  /**
   * <pre>
   * Ending hour in 24 hour time; 24 signifies end of the day.
   * This field must be between 0 and 24, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>optional int32 end_hour = 7;</code>
   * @return Whether the endHour field is set.
   */
  @java.lang.Override
  public boolean hasEndHour() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Ending hour in 24 hour time; 24 signifies end of the day.
   * This field must be between 0 and 24, inclusive.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>optional int32 end_hour = 7;</code>
   * @return The endHour.
   */
  @java.lang.Override
  public int getEndHour() {
    return endHour_;
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 5;
  private int dayOfWeek_;
  /**
   * <pre>
   * Day of the week the schedule applies to.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  @java.lang.Override public int getDayOfWeekValue() {
    return dayOfWeek_;
  }
  /**
   * <pre>
   * Day of the week the schedule applies to.
   * This field is required for CREATE operations and is prohibited on UPDATE
   * operations.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
   * @return The dayOfWeek.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek getDayOfWeek() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek result = com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.valueOf(dayOfWeek_);
    return result == null ? com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.UNRECOGNIZED : result;
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
    if (startMinute_ != com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, startMinute_);
    }
    if (endMinute_ != com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, endMinute_);
    }
    if (dayOfWeek_ != com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, dayOfWeek_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(6, startHour_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(7, endHour_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startMinute_ != com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, startMinute_);
    }
    if (endMinute_ != com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, endMinute_);
    }
    if (dayOfWeek_ != com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, dayOfWeek_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, startHour_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, endHour_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.AdScheduleInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.AdScheduleInfo other = (com.google.ads.googleads.v12.common.AdScheduleInfo) obj;

    if (startMinute_ != other.startMinute_) return false;
    if (endMinute_ != other.endMinute_) return false;
    if (hasStartHour() != other.hasStartHour()) return false;
    if (hasStartHour()) {
      if (getStartHour()
          != other.getStartHour()) return false;
    }
    if (hasEndHour() != other.hasEndHour()) return false;
    if (hasEndHour()) {
      if (getEndHour()
          != other.getEndHour()) return false;
    }
    if (dayOfWeek_ != other.dayOfWeek_) return false;
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
    hash = (37 * hash) + START_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + startMinute_;
    hash = (37 * hash) + END_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + endMinute_;
    if (hasStartHour()) {
      hash = (37 * hash) + START_HOUR_FIELD_NUMBER;
      hash = (53 * hash) + getStartHour();
    }
    if (hasEndHour()) {
      hash = (37 * hash) + END_HOUR_FIELD_NUMBER;
      hash = (53 * hash) + getEndHour();
    }
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + dayOfWeek_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.AdScheduleInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.AdScheduleInfo prototype) {
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
   * Represents an AdSchedule criterion.
   * AdSchedule is specified as the day of the week and a time interval
   * within which ads will be shown.
   * No more than six AdSchedules can be added for the same day.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.AdScheduleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.AdScheduleInfo)
      com.google.ads.googleads.v12.common.AdScheduleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_AdScheduleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_AdScheduleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.AdScheduleInfo.class, com.google.ads.googleads.v12.common.AdScheduleInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.AdScheduleInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      startMinute_ = 0;

      endMinute_ = 0;

      startHour_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      endHour_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      dayOfWeek_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_AdScheduleInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.AdScheduleInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.AdScheduleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.AdScheduleInfo build() {
      com.google.ads.googleads.v12.common.AdScheduleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.AdScheduleInfo buildPartial() {
      com.google.ads.googleads.v12.common.AdScheduleInfo result = new com.google.ads.googleads.v12.common.AdScheduleInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.startMinute_ = startMinute_;
      result.endMinute_ = endMinute_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startHour_ = startHour_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endHour_ = endHour_;
        to_bitField0_ |= 0x00000002;
      }
      result.dayOfWeek_ = dayOfWeek_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v12.common.AdScheduleInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.AdScheduleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.AdScheduleInfo other) {
      if (other == com.google.ads.googleads.v12.common.AdScheduleInfo.getDefaultInstance()) return this;
      if (other.startMinute_ != 0) {
        setStartMinuteValue(other.getStartMinuteValue());
      }
      if (other.endMinute_ != 0) {
        setEndMinuteValue(other.getEndMinuteValue());
      }
      if (other.hasStartHour()) {
        setStartHour(other.getStartHour());
      }
      if (other.hasEndHour()) {
        setEndHour(other.getEndHour());
      }
      if (other.dayOfWeek_ != 0) {
        setDayOfWeekValue(other.getDayOfWeekValue());
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
            case 8: {
              startMinute_ = input.readEnum();

              break;
            } // case 8
            case 16: {
              endMinute_ = input.readEnum();

              break;
            } // case 16
            case 40: {
              dayOfWeek_ = input.readEnum();

              break;
            } // case 40
            case 48: {
              startHour_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 48
            case 56: {
              endHour_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 56
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

    private int startMinute_ = 0;
    /**
     * <pre>
     * Minutes after the start hour at which this schedule starts.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
     * @return The enum numeric value on the wire for startMinute.
     */
    @java.lang.Override public int getStartMinuteValue() {
      return startMinute_;
    }
    /**
     * <pre>
     * Minutes after the start hour at which this schedule starts.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
     * @param value The enum numeric value on the wire for startMinute to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinuteValue(int value) {
      
      startMinute_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minutes after the start hour at which this schedule starts.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
     * @return The startMinute.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour getStartMinute() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour result = com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.valueOf(startMinute_);
      return result == null ? com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Minutes after the start hour at which this schedule starts.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
     * @param value The startMinute to set.
     * @return This builder for chaining.
     */
    public Builder setStartMinute(com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      startMinute_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minutes after the start hour at which this schedule starts.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour start_minute = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartMinute() {
      
      startMinute_ = 0;
      onChanged();
      return this;
    }

    private int endMinute_ = 0;
    /**
     * <pre>
     * Minutes after the end hour at which this schedule ends. The schedule is
     * exclusive of the end minute.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
     * @return The enum numeric value on the wire for endMinute.
     */
    @java.lang.Override public int getEndMinuteValue() {
      return endMinute_;
    }
    /**
     * <pre>
     * Minutes after the end hour at which this schedule ends. The schedule is
     * exclusive of the end minute.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
     * @param value The enum numeric value on the wire for endMinute to set.
     * @return This builder for chaining.
     */
    public Builder setEndMinuteValue(int value) {
      
      endMinute_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minutes after the end hour at which this schedule ends. The schedule is
     * exclusive of the end minute.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
     * @return The endMinute.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour getEndMinute() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour result = com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.valueOf(endMinute_);
      return result == null ? com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Minutes after the end hour at which this schedule ends. The schedule is
     * exclusive of the end minute.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
     * @param value The endMinute to set.
     * @return This builder for chaining.
     */
    public Builder setEndMinute(com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      endMinute_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minutes after the end hour at which this schedule ends. The schedule is
     * exclusive of the end minute.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour end_minute = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndMinute() {
      
      endMinute_ = 0;
      onChanged();
      return this;
    }

    private int startHour_ ;
    /**
     * <pre>
     * Starting hour in 24 hour time.
     * This field must be between 0 and 23, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 start_hour = 6;</code>
     * @return Whether the startHour field is set.
     */
    @java.lang.Override
    public boolean hasStartHour() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Starting hour in 24 hour time.
     * This field must be between 0 and 23, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 start_hour = 6;</code>
     * @return The startHour.
     */
    @java.lang.Override
    public int getStartHour() {
      return startHour_;
    }
    /**
     * <pre>
     * Starting hour in 24 hour time.
     * This field must be between 0 and 23, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 start_hour = 6;</code>
     * @param value The startHour to set.
     * @return This builder for chaining.
     */
    public Builder setStartHour(int value) {
      bitField0_ |= 0x00000001;
      startHour_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Starting hour in 24 hour time.
     * This field must be between 0 and 23, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 start_hour = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartHour() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startHour_ = 0;
      onChanged();
      return this;
    }

    private int endHour_ ;
    /**
     * <pre>
     * Ending hour in 24 hour time; 24 signifies end of the day.
     * This field must be between 0 and 24, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 end_hour = 7;</code>
     * @return Whether the endHour field is set.
     */
    @java.lang.Override
    public boolean hasEndHour() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Ending hour in 24 hour time; 24 signifies end of the day.
     * This field must be between 0 and 24, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 end_hour = 7;</code>
     * @return The endHour.
     */
    @java.lang.Override
    public int getEndHour() {
      return endHour_;
    }
    /**
     * <pre>
     * Ending hour in 24 hour time; 24 signifies end of the day.
     * This field must be between 0 and 24, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 end_hour = 7;</code>
     * @param value The endHour to set.
     * @return This builder for chaining.
     */
    public Builder setEndHour(int value) {
      bitField0_ |= 0x00000002;
      endHour_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ending hour in 24 hour time; 24 signifies end of the day.
     * This field must be between 0 and 24, inclusive.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>optional int32 end_hour = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndHour() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endHour_ = 0;
      onChanged();
      return this;
    }

    private int dayOfWeek_ = 0;
    /**
     * <pre>
     * Day of the week the schedule applies to.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
     * @return The enum numeric value on the wire for dayOfWeek.
     */
    @java.lang.Override public int getDayOfWeekValue() {
      return dayOfWeek_;
    }
    /**
     * <pre>
     * Day of the week the schedule applies to.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
     * @param value The enum numeric value on the wire for dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeekValue(int value) {
      
      dayOfWeek_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Day of the week the schedule applies to.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek getDayOfWeek() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek result = com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.valueOf(dayOfWeek_);
      return result == null ? com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Day of the week the schedule applies to.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dayOfWeek_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Day of the week the schedule applies to.
     * This field is required for CREATE operations and is prohibited on UPDATE
     * operations.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek day_of_week = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      
      dayOfWeek_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.AdScheduleInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.AdScheduleInfo)
  private static final com.google.ads.googleads.v12.common.AdScheduleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.AdScheduleInfo();
  }

  public static com.google.ads.googleads.v12.common.AdScheduleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdScheduleInfo>
      PARSER = new com.google.protobuf.AbstractParser<AdScheduleInfo>() {
    @java.lang.Override
    public AdScheduleInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdScheduleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdScheduleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.AdScheduleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

