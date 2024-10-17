// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/ad_group_ad_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * The result for the ad mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.MutateAdGroupAdResult}
 */
public final class MutateAdGroupAdResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.MutateAdGroupAdResult)
    MutateAdGroupAdResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAdGroupAdResult.newBuilder() to construct.
  private MutateAdGroupAdResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAdGroupAdResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAdGroupAdResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.internal_static_google_ads_googleads_v18_services_MutateAdGroupAdResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.internal_static_google_ads_googleads_v18_services_MutateAdGroupAdResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.MutateAdGroupAdResult.class, com.google.ads.googleads.v18.services.MutateAdGroupAdResult.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AD_GROUP_AD_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v18.resources.AdGroupAd adGroupAd_;
  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
   * @return Whether the adGroupAd field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupAd() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
   * @return The adGroupAd.
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.resources.AdGroupAd getAdGroupAd() {
    return adGroupAd_ == null ? com.google.ads.googleads.v18.resources.AdGroupAd.getDefaultInstance() : adGroupAd_;
  }
  /**
   * <pre>
   * The mutated ad group ad with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.resources.AdGroupAdOrBuilder getAdGroupAdOrBuilder() {
    return adGroupAd_ == null ? com.google.ads.googleads.v18.resources.AdGroupAd.getDefaultInstance() : adGroupAd_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAdGroupAd());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupAd());
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.MutateAdGroupAdResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.MutateAdGroupAdResult other = (com.google.ads.googleads.v18.services.MutateAdGroupAdResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdGroupAd() != other.hasAdGroupAd()) return false;
    if (hasAdGroupAd()) {
      if (!getAdGroupAd()
          .equals(other.getAdGroupAd())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasAdGroupAd()) {
      hash = (37 * hash) + AD_GROUP_AD_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupAd().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.MutateAdGroupAdResult prototype) {
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
   * The result for the ad mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.MutateAdGroupAdResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.MutateAdGroupAdResult)
      com.google.ads.googleads.v18.services.MutateAdGroupAdResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.internal_static_google_ads_googleads_v18_services_MutateAdGroupAdResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.internal_static_google_ads_googleads_v18_services_MutateAdGroupAdResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.MutateAdGroupAdResult.class, com.google.ads.googleads.v18.services.MutateAdGroupAdResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.MutateAdGroupAdResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAdGroupAdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      adGroupAd_ = null;
      if (adGroupAdBuilder_ != null) {
        adGroupAdBuilder_.dispose();
        adGroupAdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.AdGroupAdServiceProto.internal_static_google_ads_googleads_v18_services_MutateAdGroupAdResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.MutateAdGroupAdResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.MutateAdGroupAdResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.MutateAdGroupAdResult build() {
      com.google.ads.googleads.v18.services.MutateAdGroupAdResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.MutateAdGroupAdResult buildPartial() {
      com.google.ads.googleads.v18.services.MutateAdGroupAdResult result = new com.google.ads.googleads.v18.services.MutateAdGroupAdResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.MutateAdGroupAdResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adGroupAd_ = adGroupAdBuilder_ == null
            ? adGroupAd_
            : adGroupAdBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v18.services.MutateAdGroupAdResult) {
        return mergeFrom((com.google.ads.googleads.v18.services.MutateAdGroupAdResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.MutateAdGroupAdResult other) {
      if (other == com.google.ads.googleads.v18.services.MutateAdGroupAdResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdGroupAd()) {
        mergeAdGroupAd(other.getAdGroupAd());
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
            case 10: {
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAdGroupAdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v18.resources.AdGroupAd adGroupAd_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v18.resources.AdGroupAd, com.google.ads.googleads.v18.resources.AdGroupAd.Builder, com.google.ads.googleads.v18.resources.AdGroupAdOrBuilder> adGroupAdBuilder_;
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     * @return Whether the adGroupAd field is set.
     */
    public boolean hasAdGroupAd() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     * @return The adGroupAd.
     */
    public com.google.ads.googleads.v18.resources.AdGroupAd getAdGroupAd() {
      if (adGroupAdBuilder_ == null) {
        return adGroupAd_ == null ? com.google.ads.googleads.v18.resources.AdGroupAd.getDefaultInstance() : adGroupAd_;
      } else {
        return adGroupAdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public Builder setAdGroupAd(com.google.ads.googleads.v18.resources.AdGroupAd value) {
      if (adGroupAdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupAd_ = value;
      } else {
        adGroupAdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public Builder setAdGroupAd(
        com.google.ads.googleads.v18.resources.AdGroupAd.Builder builderForValue) {
      if (adGroupAdBuilder_ == null) {
        adGroupAd_ = builderForValue.build();
      } else {
        adGroupAdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public Builder mergeAdGroupAd(com.google.ads.googleads.v18.resources.AdGroupAd value) {
      if (adGroupAdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adGroupAd_ != null &&
          adGroupAd_ != com.google.ads.googleads.v18.resources.AdGroupAd.getDefaultInstance()) {
          getAdGroupAdBuilder().mergeFrom(value);
        } else {
          adGroupAd_ = value;
        }
      } else {
        adGroupAdBuilder_.mergeFrom(value);
      }
      if (adGroupAd_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public Builder clearAdGroupAd() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adGroupAd_ = null;
      if (adGroupAdBuilder_ != null) {
        adGroupAdBuilder_.dispose();
        adGroupAdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public com.google.ads.googleads.v18.resources.AdGroupAd.Builder getAdGroupAdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdGroupAdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    public com.google.ads.googleads.v18.resources.AdGroupAdOrBuilder getAdGroupAdOrBuilder() {
      if (adGroupAdBuilder_ != null) {
        return adGroupAdBuilder_.getMessageOrBuilder();
      } else {
        return adGroupAd_ == null ?
            com.google.ads.googleads.v18.resources.AdGroupAd.getDefaultInstance() : adGroupAd_;
      }
    }
    /**
     * <pre>
     * The mutated ad group ad with only mutable fields after mutate. The field
     * will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v18.resources.AdGroupAd ad_group_ad = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v18.resources.AdGroupAd, com.google.ads.googleads.v18.resources.AdGroupAd.Builder, com.google.ads.googleads.v18.resources.AdGroupAdOrBuilder> 
        getAdGroupAdFieldBuilder() {
      if (adGroupAdBuilder_ == null) {
        adGroupAdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v18.resources.AdGroupAd, com.google.ads.googleads.v18.resources.AdGroupAd.Builder, com.google.ads.googleads.v18.resources.AdGroupAdOrBuilder>(
                getAdGroupAd(),
                getParentForChildren(),
                isClean());
        adGroupAd_ = null;
      }
      return adGroupAdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.MutateAdGroupAdResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.MutateAdGroupAdResult)
  private static final com.google.ads.googleads.v18.services.MutateAdGroupAdResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.MutateAdGroupAdResult();
  }

  public static com.google.ads.googleads.v18.services.MutateAdGroupAdResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAdGroupAdResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAdGroupAdResult>() {
    @java.lang.Override
    public MutateAdGroupAdResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateAdGroupAdResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAdGroupAdResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.MutateAdGroupAdResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

