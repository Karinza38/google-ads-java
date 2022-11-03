// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * An AdGroup/Campaign pair that could not be used as a suggestion for keywords.
 * AdGroups may not be usable if the AdGroup
 * * belongs to a Campaign that is not ENABLED or PAUSED
 * * is itself not ENABLED
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.UnusableAdGroup}
 */
public final class UnusableAdGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.UnusableAdGroup)
    UnusableAdGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnusableAdGroup.newBuilder() to construct.
  private UnusableAdGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnusableAdGroup() {
    adGroup_ = "";
    campaign_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnusableAdGroup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v11_services_UnusableAdGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v11_services_UnusableAdGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.UnusableAdGroup.class, com.google.ads.googleads.v11.services.UnusableAdGroup.Builder.class);
  }

  public static final int AD_GROUP_FIELD_NUMBER = 1;
  private volatile java.lang.Object adGroup_;
  /**
   * <pre>
   * The AdGroup resource name.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string ad_group = 1;</code>
   * @return The adGroup.
   */
  @java.lang.Override
  public java.lang.String getAdGroup() {
    java.lang.Object ref = adGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adGroup_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The AdGroup resource name.
   * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>string ad_group = 1;</code>
   * @return The bytes for adGroup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdGroupBytes() {
    java.lang.Object ref = adGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_FIELD_NUMBER = 2;
  private volatile java.lang.Object campaign_;
  /**
   * <pre>
   * The Campaign resource name.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string campaign = 2;</code>
   * @return The campaign.
   */
  @java.lang.Override
  public java.lang.String getCampaign() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Campaign resource name.
   * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
   * </pre>
   *
   * <code>string campaign = 2;</code>
   * @return The bytes for campaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignBytes() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaign_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adGroup_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, adGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, campaign_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(adGroup_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, adGroup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, campaign_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.UnusableAdGroup)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.UnusableAdGroup other = (com.google.ads.googleads.v11.services.UnusableAdGroup) obj;

    if (!getAdGroup()
        .equals(other.getAdGroup())) return false;
    if (!getCampaign()
        .equals(other.getCampaign())) return false;
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
    hash = (37 * hash) + AD_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getAdGroup().hashCode();
    hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
    hash = (53 * hash) + getCampaign().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.UnusableAdGroup parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.UnusableAdGroup prototype) {
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
   * An AdGroup/Campaign pair that could not be used as a suggestion for keywords.
   * AdGroups may not be usable if the AdGroup
   * * belongs to a Campaign that is not ENABLED or PAUSED
   * * is itself not ENABLED
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.UnusableAdGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.UnusableAdGroup)
      com.google.ads.googleads.v11.services.UnusableAdGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v11_services_UnusableAdGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v11_services_UnusableAdGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.UnusableAdGroup.class, com.google.ads.googleads.v11.services.UnusableAdGroup.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.UnusableAdGroup.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      adGroup_ = "";

      campaign_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanIdeaServiceProto.internal_static_google_ads_googleads_v11_services_UnusableAdGroup_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UnusableAdGroup getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.UnusableAdGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UnusableAdGroup build() {
      com.google.ads.googleads.v11.services.UnusableAdGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.UnusableAdGroup buildPartial() {
      com.google.ads.googleads.v11.services.UnusableAdGroup result = new com.google.ads.googleads.v11.services.UnusableAdGroup(this);
      result.adGroup_ = adGroup_;
      result.campaign_ = campaign_;
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
      if (other instanceof com.google.ads.googleads.v11.services.UnusableAdGroup) {
        return mergeFrom((com.google.ads.googleads.v11.services.UnusableAdGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.UnusableAdGroup other) {
      if (other == com.google.ads.googleads.v11.services.UnusableAdGroup.getDefaultInstance()) return this;
      if (!other.getAdGroup().isEmpty()) {
        adGroup_ = other.adGroup_;
        onChanged();
      }
      if (!other.getCampaign().isEmpty()) {
        campaign_ = other.campaign_;
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
            case 10: {
              adGroup_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              campaign_ = input.readStringRequireUtf8();

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

    private java.lang.Object adGroup_ = "";
    /**
     * <pre>
     * The AdGroup resource name.
     * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>string ad_group = 1;</code>
     * @return The adGroup.
     */
    public java.lang.String getAdGroup() {
      java.lang.Object ref = adGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The AdGroup resource name.
     * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>string ad_group = 1;</code>
     * @return The bytes for adGroup.
     */
    public com.google.protobuf.ByteString
        getAdGroupBytes() {
      java.lang.Object ref = adGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The AdGroup resource name.
     * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>string ad_group = 1;</code>
     * @param value The adGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      adGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The AdGroup resource name.
     * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>string ad_group = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdGroup() {
      
      adGroup_ = getDefaultInstance().getAdGroup();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The AdGroup resource name.
     * Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
     * </pre>
     *
     * <code>string ad_group = 1;</code>
     * @param value The bytes for adGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      adGroup_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * The Campaign resource name.
     * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
     * </pre>
     *
     * <code>string campaign = 2;</code>
     * @return The campaign.
     */
    public java.lang.String getCampaign() {
      java.lang.Object ref = campaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Campaign resource name.
     * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
     * </pre>
     *
     * <code>string campaign = 2;</code>
     * @return The bytes for campaign.
     */
    public com.google.protobuf.ByteString
        getCampaignBytes() {
      java.lang.Object ref = campaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Campaign resource name.
     * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
     * </pre>
     *
     * <code>string campaign = 2;</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaign_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Campaign resource name.
     * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
     * </pre>
     *
     * <code>string campaign = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      
      campaign_ = getDefaultInstance().getCampaign();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Campaign resource name.
     * Resource name format: `customers/{customer_id}/campaigns/{campaign_id}`
     * </pre>
     *
     * <code>string campaign = 2;</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaign_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.UnusableAdGroup)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.UnusableAdGroup)
  private static final com.google.ads.googleads.v11.services.UnusableAdGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.UnusableAdGroup();
  }

  public static com.google.ads.googleads.v11.services.UnusableAdGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnusableAdGroup>
      PARSER = new com.google.protobuf.AbstractParser<UnusableAdGroup>() {
    @java.lang.Override
    public UnusableAdGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<UnusableAdGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnusableAdGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.UnusableAdGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

