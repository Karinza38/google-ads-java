// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * A rule specifying the maximum number of times an ad can be shown to a user
 * over a particular time period.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.FrequencyCap}
 */
public final class FrequencyCap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.FrequencyCap)
    FrequencyCapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyCap.newBuilder() to construct.
  private FrequencyCap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyCap() {
    timeUnit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyCap();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v18_services_FrequencyCap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v18_services_FrequencyCap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.FrequencyCap.class, com.google.ads.googleads.v18.services.FrequencyCap.Builder.class);
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 3;
  private int impressions_ = 0;
  /**
   * <pre>
   * Required. The number of impressions, inclusive.
   * </pre>
   *
   * <code>int32 impressions = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The impressions.
   */
  @java.lang.Override
  public int getImpressions() {
    return impressions_;
  }

  public static final int TIME_UNIT_FIELD_NUMBER = 2;
  private int timeUnit_ = 0;
  /**
   * <pre>
   * Required. The type of time unit.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  @java.lang.Override public int getTimeUnitValue() {
    return timeUnit_;
  }
  /**
   * <pre>
   * Required. The type of time unit.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The timeUnit.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
    com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.forNumber(timeUnit_);
    return result == null ? com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
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
    if (timeUnit_ != com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, timeUnit_);
    }
    if (impressions_ != 0) {
      output.writeInt32(3, impressions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeUnit_ != com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, timeUnit_);
    }
    if (impressions_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, impressions_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.FrequencyCap)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.FrequencyCap other = (com.google.ads.googleads.v18.services.FrequencyCap) obj;

    if (getImpressions()
        != other.getImpressions()) return false;
    if (timeUnit_ != other.timeUnit_) return false;
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
    hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
    hash = (53 * hash) + getImpressions();
    hash = (37 * hash) + TIME_UNIT_FIELD_NUMBER;
    hash = (53 * hash) + timeUnit_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.FrequencyCap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.FrequencyCap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.FrequencyCap parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.FrequencyCap prototype) {
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
   * A rule specifying the maximum number of times an ad can be shown to a user
   * over a particular time period.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.FrequencyCap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.FrequencyCap)
      com.google.ads.googleads.v18.services.FrequencyCapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v18_services_FrequencyCap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v18_services_FrequencyCap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.FrequencyCap.class, com.google.ads.googleads.v18.services.FrequencyCap.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.FrequencyCap.newBuilder()
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
      impressions_ = 0;
      timeUnit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v18_services_FrequencyCap_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.FrequencyCap getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.FrequencyCap.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.FrequencyCap build() {
      com.google.ads.googleads.v18.services.FrequencyCap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.FrequencyCap buildPartial() {
      com.google.ads.googleads.v18.services.FrequencyCap result = new com.google.ads.googleads.v18.services.FrequencyCap(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.FrequencyCap result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.impressions_ = impressions_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeUnit_ = timeUnit_;
      }
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
      if (other instanceof com.google.ads.googleads.v18.services.FrequencyCap) {
        return mergeFrom((com.google.ads.googleads.v18.services.FrequencyCap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.FrequencyCap other) {
      if (other == com.google.ads.googleads.v18.services.FrequencyCap.getDefaultInstance()) return this;
      if (other.getImpressions() != 0) {
        setImpressions(other.getImpressions());
      }
      if (other.timeUnit_ != 0) {
        setTimeUnitValue(other.getTimeUnitValue());
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
              timeUnit_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              impressions_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
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

    private int impressions_ ;
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>int32 impressions = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The impressions.
     */
    @java.lang.Override
    public int getImpressions() {
      return impressions_;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>int32 impressions = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The impressions to set.
     * @return This builder for chaining.
     */
    public Builder setImpressions(int value) {

      impressions_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The number of impressions, inclusive.
     * </pre>
     *
     * <code>int32 impressions = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearImpressions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      impressions_ = 0;
      onChanged();
      return this;
    }

    private int timeUnit_ = 0;
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for timeUnit.
     */
    @java.lang.Override public int getTimeUnitValue() {
      return timeUnit_;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnitValue(int value) {
      timeUnit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The timeUnit.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit() {
      com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit result = com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.forNumber(timeUnit_);
      return result == null ? com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The timeUnit to set.
     * @return This builder for chaining.
     */
    public Builder setTimeUnit(com.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      timeUnit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The type of time unit.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeUnit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeUnit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.FrequencyCap)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.FrequencyCap)
  private static final com.google.ads.googleads.v18.services.FrequencyCap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.FrequencyCap();
  }

  public static com.google.ads.googleads.v18.services.FrequencyCap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyCap>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyCap>() {
    @java.lang.Override
    public FrequencyCap parsePartialFrom(
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

  public static com.google.protobuf.Parser<FrequencyCap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyCap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.FrequencyCap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

