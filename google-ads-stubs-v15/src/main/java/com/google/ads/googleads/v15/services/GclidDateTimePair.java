// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Uniquely identifies a conversion that was reported without an order ID
 * specified.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.GclidDateTimePair}
 */
public final class GclidDateTimePair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.GclidDateTimePair)
    GclidDateTimePairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GclidDateTimePair.newBuilder() to construct.
  private GclidDateTimePair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GclidDateTimePair() {
    gclid_ = "";
    conversionDateTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GclidDateTimePair();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v15_services_GclidDateTimePair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v15_services_GclidDateTimePair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.GclidDateTimePair.class, com.google.ads.googleads.v15.services.GclidDateTimePair.Builder.class);
  }

  private int bitField0_;
  public static final int GCLID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gclid_ = "";
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return Whether the gclid field is set.
   */
  @java.lang.Override
  public boolean hasGclid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return The gclid.
   */
  @java.lang.Override
  public java.lang.String getGclid() {
    java.lang.Object ref = gclid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gclid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return The bytes for gclid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGclidBytes() {
    java.lang.Object ref = gclid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gclid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERSION_DATE_TIME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object conversionDateTime_ = "";
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return Whether the conversionDateTime field is set.
   */
  @java.lang.Override
  public boolean hasConversionDateTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return The conversionDateTime.
   */
  @java.lang.Override
  public java.lang.String getConversionDateTime() {
    java.lang.Object ref = conversionDateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversionDateTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return The bytes for conversionDateTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConversionDateTimeBytes() {
    java.lang.Object ref = conversionDateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conversionDateTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gclid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, conversionDateTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gclid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, conversionDateTime_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.GclidDateTimePair)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.GclidDateTimePair other = (com.google.ads.googleads.v15.services.GclidDateTimePair) obj;

    if (hasGclid() != other.hasGclid()) return false;
    if (hasGclid()) {
      if (!getGclid()
          .equals(other.getGclid())) return false;
    }
    if (hasConversionDateTime() != other.hasConversionDateTime()) return false;
    if (hasConversionDateTime()) {
      if (!getConversionDateTime()
          .equals(other.getConversionDateTime())) return false;
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
    if (hasGclid()) {
      hash = (37 * hash) + GCLID_FIELD_NUMBER;
      hash = (53 * hash) + getGclid().hashCode();
    }
    if (hasConversionDateTime()) {
      hash = (37 * hash) + CONVERSION_DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getConversionDateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.GclidDateTimePair parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.GclidDateTimePair prototype) {
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
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.GclidDateTimePair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.GclidDateTimePair)
      com.google.ads.googleads.v15.services.GclidDateTimePairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v15_services_GclidDateTimePair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v15_services_GclidDateTimePair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.GclidDateTimePair.class, com.google.ads.googleads.v15.services.GclidDateTimePair.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.GclidDateTimePair.newBuilder()
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
      gclid_ = "";
      conversionDateTime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceProto.internal_static_google_ads_googleads_v15_services_GclidDateTimePair_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GclidDateTimePair getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.GclidDateTimePair.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GclidDateTimePair build() {
      com.google.ads.googleads.v15.services.GclidDateTimePair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GclidDateTimePair buildPartial() {
      com.google.ads.googleads.v15.services.GclidDateTimePair result = new com.google.ads.googleads.v15.services.GclidDateTimePair(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.GclidDateTimePair result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gclid_ = gclid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversionDateTime_ = conversionDateTime_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v15.services.GclidDateTimePair) {
        return mergeFrom((com.google.ads.googleads.v15.services.GclidDateTimePair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.GclidDateTimePair other) {
      if (other == com.google.ads.googleads.v15.services.GclidDateTimePair.getDefaultInstance()) return this;
      if (other.hasGclid()) {
        gclid_ = other.gclid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversionDateTime()) {
        conversionDateTime_ = other.conversionDateTime_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 26: {
              gclid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              conversionDateTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
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

    private java.lang.Object gclid_ = "";
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @return Whether the gclid field is set.
     */
    public boolean hasGclid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @return The gclid.
     */
    public java.lang.String getGclid() {
      java.lang.Object ref = gclid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gclid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @return The bytes for gclid.
     */
    public com.google.protobuf.ByteString
        getGclidBytes() {
      java.lang.Object ref = gclid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gclid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @param value The gclid to set.
     * @return This builder for chaining.
     */
    public Builder setGclid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gclid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGclid() {
      gclid_ = getDefaultInstance().getGclid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google click ID (gclid) associated with the original conversion for this
     * adjustment.
     * </pre>
     *
     * <code>optional string gclid = 3;</code>
     * @param value The bytes for gclid to set.
     * @return This builder for chaining.
     */
    public Builder setGclidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gclid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object conversionDateTime_ = "";
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @return Whether the conversionDateTime field is set.
     */
    public boolean hasConversionDateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @return The conversionDateTime.
     */
    public java.lang.String getConversionDateTime() {
      java.lang.Object ref = conversionDateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversionDateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @return The bytes for conversionDateTime.
     */
    public com.google.protobuf.ByteString
        getConversionDateTimeBytes() {
      java.lang.Object ref = conversionDateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conversionDateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @param value The conversionDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setConversionDateTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      conversionDateTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearConversionDateTime() {
      conversionDateTime_ = getDefaultInstance().getConversionDateTime();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The date time at which the original conversion for this adjustment
     * occurred. The timezone must be specified. The format is "yyyy-mm-dd
     * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
     * </pre>
     *
     * <code>optional string conversion_date_time = 4;</code>
     * @param value The bytes for conversionDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setConversionDateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      conversionDateTime_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.GclidDateTimePair)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.GclidDateTimePair)
  private static final com.google.ads.googleads.v15.services.GclidDateTimePair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.GclidDateTimePair();
  }

  public static com.google.ads.googleads.v15.services.GclidDateTimePair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GclidDateTimePair>
      PARSER = new com.google.protobuf.AbstractParser<GclidDateTimePair>() {
    @java.lang.Override
    public GclidDateTimePair parsePartialFrom(
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

  public static com.google.protobuf.Parser<GclidDateTimePair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GclidDateTimePair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.GclidDateTimePair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

