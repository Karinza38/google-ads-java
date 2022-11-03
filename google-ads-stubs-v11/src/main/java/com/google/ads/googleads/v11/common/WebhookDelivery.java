// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/asset_types.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Google notifies the advertiser of leads by making HTTP calls to an
 * endpoint they specify. The requests contain JSON matching a schema that
 * Google publishes as part of form ads documentation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.WebhookDelivery}
 */
public final class WebhookDelivery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.WebhookDelivery)
    WebhookDeliveryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebhookDelivery.newBuilder() to construct.
  private WebhookDelivery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebhookDelivery() {
    advertiserWebhookUrl_ = "";
    googleSecret_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebhookDelivery();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_WebhookDelivery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_WebhookDelivery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.WebhookDelivery.class, com.google.ads.googleads.v11.common.WebhookDelivery.Builder.class);
  }

  private int bitField0_;
  public static final int ADVERTISER_WEBHOOK_URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object advertiserWebhookUrl_;
  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return Whether the advertiserWebhookUrl field is set.
   */
  @java.lang.Override
  public boolean hasAdvertiserWebhookUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return The advertiserWebhookUrl.
   */
  @java.lang.Override
  public java.lang.String getAdvertiserWebhookUrl() {
    java.lang.Object ref = advertiserWebhookUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      advertiserWebhookUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Webhook url specified by advertiser to send the lead.
   * </pre>
   *
   * <code>optional string advertiser_webhook_url = 4;</code>
   * @return The bytes for advertiserWebhookUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdvertiserWebhookUrlBytes() {
    java.lang.Object ref = advertiserWebhookUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      advertiserWebhookUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOOGLE_SECRET_FIELD_NUMBER = 5;
  private volatile java.lang.Object googleSecret_;
  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return Whether the googleSecret field is set.
   */
  @java.lang.Override
  public boolean hasGoogleSecret() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return The googleSecret.
   */
  @java.lang.Override
  public java.lang.String getGoogleSecret() {
    java.lang.Object ref = googleSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      googleSecret_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Anti-spoofing secret set by the advertiser as part of the webhook payload.
   * </pre>
   *
   * <code>optional string google_secret = 5;</code>
   * @return The bytes for googleSecret.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGoogleSecretBytes() {
    java.lang.Object ref = googleSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      googleSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_SCHEMA_VERSION_FIELD_NUMBER = 6;
  private long payloadSchemaVersion_;
  /**
   * <pre>
   * The schema version that this delivery instance will use.
   * </pre>
   *
   * <code>optional int64 payload_schema_version = 6;</code>
   * @return Whether the payloadSchemaVersion field is set.
   */
  @java.lang.Override
  public boolean hasPayloadSchemaVersion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The schema version that this delivery instance will use.
   * </pre>
   *
   * <code>optional int64 payload_schema_version = 6;</code>
   * @return The payloadSchemaVersion.
   */
  @java.lang.Override
  public long getPayloadSchemaVersion() {
    return payloadSchemaVersion_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, advertiserWebhookUrl_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, googleSecret_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(6, payloadSchemaVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, advertiserWebhookUrl_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, googleSecret_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, payloadSchemaVersion_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.WebhookDelivery)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.WebhookDelivery other = (com.google.ads.googleads.v11.common.WebhookDelivery) obj;

    if (hasAdvertiserWebhookUrl() != other.hasAdvertiserWebhookUrl()) return false;
    if (hasAdvertiserWebhookUrl()) {
      if (!getAdvertiserWebhookUrl()
          .equals(other.getAdvertiserWebhookUrl())) return false;
    }
    if (hasGoogleSecret() != other.hasGoogleSecret()) return false;
    if (hasGoogleSecret()) {
      if (!getGoogleSecret()
          .equals(other.getGoogleSecret())) return false;
    }
    if (hasPayloadSchemaVersion() != other.hasPayloadSchemaVersion()) return false;
    if (hasPayloadSchemaVersion()) {
      if (getPayloadSchemaVersion()
          != other.getPayloadSchemaVersion()) return false;
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
    if (hasAdvertiserWebhookUrl()) {
      hash = (37 * hash) + ADVERTISER_WEBHOOK_URL_FIELD_NUMBER;
      hash = (53 * hash) + getAdvertiserWebhookUrl().hashCode();
    }
    if (hasGoogleSecret()) {
      hash = (37 * hash) + GOOGLE_SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleSecret().hashCode();
    }
    if (hasPayloadSchemaVersion()) {
      hash = (37 * hash) + PAYLOAD_SCHEMA_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPayloadSchemaVersion());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.WebhookDelivery parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.WebhookDelivery prototype) {
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
   * Google notifies the advertiser of leads by making HTTP calls to an
   * endpoint they specify. The requests contain JSON matching a schema that
   * Google publishes as part of form ads documentation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.WebhookDelivery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.WebhookDelivery)
      com.google.ads.googleads.v11.common.WebhookDeliveryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_WebhookDelivery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_WebhookDelivery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.WebhookDelivery.class, com.google.ads.googleads.v11.common.WebhookDelivery.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.WebhookDelivery.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      advertiserWebhookUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      googleSecret_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      payloadSchemaVersion_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.AssetTypesProto.internal_static_google_ads_googleads_v11_common_WebhookDelivery_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.WebhookDelivery getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.WebhookDelivery.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.WebhookDelivery build() {
      com.google.ads.googleads.v11.common.WebhookDelivery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.WebhookDelivery buildPartial() {
      com.google.ads.googleads.v11.common.WebhookDelivery result = new com.google.ads.googleads.v11.common.WebhookDelivery(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.advertiserWebhookUrl_ = advertiserWebhookUrl_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.googleSecret_ = googleSecret_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.payloadSchemaVersion_ = payloadSchemaVersion_;
        to_bitField0_ |= 0x00000004;
      }
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
      if (other instanceof com.google.ads.googleads.v11.common.WebhookDelivery) {
        return mergeFrom((com.google.ads.googleads.v11.common.WebhookDelivery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.WebhookDelivery other) {
      if (other == com.google.ads.googleads.v11.common.WebhookDelivery.getDefaultInstance()) return this;
      if (other.hasAdvertiserWebhookUrl()) {
        bitField0_ |= 0x00000001;
        advertiserWebhookUrl_ = other.advertiserWebhookUrl_;
        onChanged();
      }
      if (other.hasGoogleSecret()) {
        bitField0_ |= 0x00000002;
        googleSecret_ = other.googleSecret_;
        onChanged();
      }
      if (other.hasPayloadSchemaVersion()) {
        setPayloadSchemaVersion(other.getPayloadSchemaVersion());
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
            case 34: {
              advertiserWebhookUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              googleSecret_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
            case 48: {
              payloadSchemaVersion_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 48
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

    private java.lang.Object advertiserWebhookUrl_ = "";
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @return Whether the advertiserWebhookUrl field is set.
     */
    public boolean hasAdvertiserWebhookUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @return The advertiserWebhookUrl.
     */
    public java.lang.String getAdvertiserWebhookUrl() {
      java.lang.Object ref = advertiserWebhookUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        advertiserWebhookUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @return The bytes for advertiserWebhookUrl.
     */
    public com.google.protobuf.ByteString
        getAdvertiserWebhookUrlBytes() {
      java.lang.Object ref = advertiserWebhookUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        advertiserWebhookUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @param value The advertiserWebhookUrl to set.
     * @return This builder for chaining.
     */
    public Builder setAdvertiserWebhookUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      advertiserWebhookUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdvertiserWebhookUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      advertiserWebhookUrl_ = getDefaultInstance().getAdvertiserWebhookUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Webhook url specified by advertiser to send the lead.
     * </pre>
     *
     * <code>optional string advertiser_webhook_url = 4;</code>
     * @param value The bytes for advertiserWebhookUrl to set.
     * @return This builder for chaining.
     */
    public Builder setAdvertiserWebhookUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      advertiserWebhookUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object googleSecret_ = "";
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @return Whether the googleSecret field is set.
     */
    public boolean hasGoogleSecret() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @return The googleSecret.
     */
    public java.lang.String getGoogleSecret() {
      java.lang.Object ref = googleSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        googleSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @return The bytes for googleSecret.
     */
    public com.google.protobuf.ByteString
        getGoogleSecretBytes() {
      java.lang.Object ref = googleSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        googleSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @param value The googleSecret to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleSecret(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      googleSecret_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGoogleSecret() {
      bitField0_ = (bitField0_ & ~0x00000002);
      googleSecret_ = getDefaultInstance().getGoogleSecret();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Anti-spoofing secret set by the advertiser as part of the webhook payload.
     * </pre>
     *
     * <code>optional string google_secret = 5;</code>
     * @param value The bytes for googleSecret to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      googleSecret_ = value;
      onChanged();
      return this;
    }

    private long payloadSchemaVersion_ ;
    /**
     * <pre>
     * The schema version that this delivery instance will use.
     * </pre>
     *
     * <code>optional int64 payload_schema_version = 6;</code>
     * @return Whether the payloadSchemaVersion field is set.
     */
    @java.lang.Override
    public boolean hasPayloadSchemaVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The schema version that this delivery instance will use.
     * </pre>
     *
     * <code>optional int64 payload_schema_version = 6;</code>
     * @return The payloadSchemaVersion.
     */
    @java.lang.Override
    public long getPayloadSchemaVersion() {
      return payloadSchemaVersion_;
    }
    /**
     * <pre>
     * The schema version that this delivery instance will use.
     * </pre>
     *
     * <code>optional int64 payload_schema_version = 6;</code>
     * @param value The payloadSchemaVersion to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadSchemaVersion(long value) {
      bitField0_ |= 0x00000004;
      payloadSchemaVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The schema version that this delivery instance will use.
     * </pre>
     *
     * <code>optional int64 payload_schema_version = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadSchemaVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      payloadSchemaVersion_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.WebhookDelivery)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.WebhookDelivery)
  private static final com.google.ads.googleads.v11.common.WebhookDelivery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.WebhookDelivery();
  }

  public static com.google.ads.googleads.v11.common.WebhookDelivery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebhookDelivery>
      PARSER = new com.google.protobuf.AbstractParser<WebhookDelivery>() {
    @java.lang.Override
    public WebhookDelivery parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebhookDelivery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebhookDelivery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.WebhookDelivery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

