// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The result for the Smart campaign setting mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.MutateSmartCampaignSettingResult}
 */
public final class MutateSmartCampaignSettingResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)
    MutateSmartCampaignSettingResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateSmartCampaignSettingResult.newBuilder() to construct.
  private MutateSmartCampaignSettingResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateSmartCampaignSettingResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateSmartCampaignSettingResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.class, com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
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
   * Returned for successful operations.
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

  public static final int SMART_CAMPAIGN_SETTING_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.resources.SmartCampaignSetting smartCampaignSetting_;
  /**
   * <pre>
   * The mutated Smart campaign setting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
   * @return Whether the smartCampaignSetting field is set.
   */
  @java.lang.Override
  public boolean hasSmartCampaignSetting() {
    return smartCampaignSetting_ != null;
  }
  /**
   * <pre>
   * The mutated Smart campaign setting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
   * @return The smartCampaignSetting.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.SmartCampaignSetting getSmartCampaignSetting() {
    return smartCampaignSetting_ == null ? com.google.ads.googleads.v11.resources.SmartCampaignSetting.getDefaultInstance() : smartCampaignSetting_;
  }
  /**
   * <pre>
   * The mutated Smart campaign setting with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.resources.SmartCampaignSettingOrBuilder getSmartCampaignSettingOrBuilder() {
    return getSmartCampaignSetting();
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
    if (smartCampaignSetting_ != null) {
      output.writeMessage(2, getSmartCampaignSetting());
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
    if (smartCampaignSetting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSmartCampaignSetting());
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult other = (com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasSmartCampaignSetting() != other.hasSmartCampaignSetting()) return false;
    if (hasSmartCampaignSetting()) {
      if (!getSmartCampaignSetting()
          .equals(other.getSmartCampaignSetting())) return false;
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
    if (hasSmartCampaignSetting()) {
      hash = (37 * hash) + SMART_CAMPAIGN_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getSmartCampaignSetting().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult prototype) {
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
   * The result for the Smart campaign setting mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.MutateSmartCampaignSettingResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)
      com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.class, com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      if (smartCampaignSettingBuilder_ == null) {
        smartCampaignSetting_ = null;
      } else {
        smartCampaignSetting_ = null;
        smartCampaignSettingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v11_services_MutateSmartCampaignSettingResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult build() {
      com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult buildPartial() {
      com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult result = new com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult(this);
      result.resourceName_ = resourceName_;
      if (smartCampaignSettingBuilder_ == null) {
        result.smartCampaignSetting_ = smartCampaignSetting_;
      } else {
        result.smartCampaignSetting_ = smartCampaignSettingBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult) {
        return mergeFrom((com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult other) {
      if (other == com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasSmartCampaignSetting()) {
        mergeSmartCampaignSetting(other.getSmartCampaignSetting());
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

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSmartCampaignSettingFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
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
     * Returned for successful operations.
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.resources.SmartCampaignSetting smartCampaignSetting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.SmartCampaignSetting, com.google.ads.googleads.v11.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v11.resources.SmartCampaignSettingOrBuilder> smartCampaignSettingBuilder_;
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     * @return Whether the smartCampaignSetting field is set.
     */
    public boolean hasSmartCampaignSetting() {
      return smartCampaignSettingBuilder_ != null || smartCampaignSetting_ != null;
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     * @return The smartCampaignSetting.
     */
    public com.google.ads.googleads.v11.resources.SmartCampaignSetting getSmartCampaignSetting() {
      if (smartCampaignSettingBuilder_ == null) {
        return smartCampaignSetting_ == null ? com.google.ads.googleads.v11.resources.SmartCampaignSetting.getDefaultInstance() : smartCampaignSetting_;
      } else {
        return smartCampaignSettingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public Builder setSmartCampaignSetting(com.google.ads.googleads.v11.resources.SmartCampaignSetting value) {
      if (smartCampaignSettingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        smartCampaignSetting_ = value;
        onChanged();
      } else {
        smartCampaignSettingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public Builder setSmartCampaignSetting(
        com.google.ads.googleads.v11.resources.SmartCampaignSetting.Builder builderForValue) {
      if (smartCampaignSettingBuilder_ == null) {
        smartCampaignSetting_ = builderForValue.build();
        onChanged();
      } else {
        smartCampaignSettingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public Builder mergeSmartCampaignSetting(com.google.ads.googleads.v11.resources.SmartCampaignSetting value) {
      if (smartCampaignSettingBuilder_ == null) {
        if (smartCampaignSetting_ != null) {
          smartCampaignSetting_ =
            com.google.ads.googleads.v11.resources.SmartCampaignSetting.newBuilder(smartCampaignSetting_).mergeFrom(value).buildPartial();
        } else {
          smartCampaignSetting_ = value;
        }
        onChanged();
      } else {
        smartCampaignSettingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public Builder clearSmartCampaignSetting() {
      if (smartCampaignSettingBuilder_ == null) {
        smartCampaignSetting_ = null;
        onChanged();
      } else {
        smartCampaignSetting_ = null;
        smartCampaignSettingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public com.google.ads.googleads.v11.resources.SmartCampaignSetting.Builder getSmartCampaignSettingBuilder() {
      
      onChanged();
      return getSmartCampaignSettingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    public com.google.ads.googleads.v11.resources.SmartCampaignSettingOrBuilder getSmartCampaignSettingOrBuilder() {
      if (smartCampaignSettingBuilder_ != null) {
        return smartCampaignSettingBuilder_.getMessageOrBuilder();
      } else {
        return smartCampaignSetting_ == null ?
            com.google.ads.googleads.v11.resources.SmartCampaignSetting.getDefaultInstance() : smartCampaignSetting_;
      }
    }
    /**
     * <pre>
     * The mutated Smart campaign setting with only mutable fields after mutate.
     * The field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v11.resources.SmartCampaignSetting smart_campaign_setting = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.resources.SmartCampaignSetting, com.google.ads.googleads.v11.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v11.resources.SmartCampaignSettingOrBuilder> 
        getSmartCampaignSettingFieldBuilder() {
      if (smartCampaignSettingBuilder_ == null) {
        smartCampaignSettingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.resources.SmartCampaignSetting, com.google.ads.googleads.v11.resources.SmartCampaignSetting.Builder, com.google.ads.googleads.v11.resources.SmartCampaignSettingOrBuilder>(
                getSmartCampaignSetting(),
                getParentForChildren(),
                isClean());
        smartCampaignSetting_ = null;
      }
      return smartCampaignSettingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.MutateSmartCampaignSettingResult)
  private static final com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult();
  }

  public static com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateSmartCampaignSettingResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateSmartCampaignSettingResult>() {
    @java.lang.Override
    public MutateSmartCampaignSettingResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateSmartCampaignSettingResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateSmartCampaignSettingResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateSmartCampaignSettingResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

