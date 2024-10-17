// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * A configuration of how leads are delivered to the advertiser.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.LeadFormDeliveryMethod}
 */
public final class LeadFormDeliveryMethod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.LeadFormDeliveryMethod)
    LeadFormDeliveryMethodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormDeliveryMethod.newBuilder() to construct.
  private LeadFormDeliveryMethod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormDeliveryMethod() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormDeliveryMethod();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_LeadFormDeliveryMethod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_LeadFormDeliveryMethod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.class, com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.Builder.class);
  }

  private int deliveryDetailsCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object deliveryDetails_;
  public enum DeliveryDetailsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    WEBHOOK(1),
    DELIVERYDETAILS_NOT_SET(0);
    private final int value;
    private DeliveryDetailsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DeliveryDetailsCase valueOf(int value) {
      return forNumber(value);
    }

    public static DeliveryDetailsCase forNumber(int value) {
      switch (value) {
        case 1: return WEBHOOK;
        case 0: return DELIVERYDETAILS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DeliveryDetailsCase
  getDeliveryDetailsCase() {
    return DeliveryDetailsCase.forNumber(
        deliveryDetailsCase_);
  }

  public static final int WEBHOOK_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
   * @return Whether the webhook field is set.
   */
  @java.lang.Override
  public boolean hasWebhook() {
    return deliveryDetailsCase_ == 1;
  }
  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
   * @return The webhook.
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.WebhookDelivery getWebhook() {
    if (deliveryDetailsCase_ == 1) {
       return (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_;
    }
    return com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
  }
  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.WebhookDeliveryOrBuilder getWebhookOrBuilder() {
    if (deliveryDetailsCase_ == 1) {
       return (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_;
    }
    return com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
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
    if (deliveryDetailsCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deliveryDetailsCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.LeadFormDeliveryMethod)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.LeadFormDeliveryMethod other = (com.google.ads.googleads.v18.common.LeadFormDeliveryMethod) obj;

    if (!getDeliveryDetailsCase().equals(other.getDeliveryDetailsCase())) return false;
    switch (deliveryDetailsCase_) {
      case 1:
        if (!getWebhook()
            .equals(other.getWebhook())) return false;
        break;
      case 0:
      default:
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
    switch (deliveryDetailsCase_) {
      case 1:
        hash = (37 * hash) + WEBHOOK_FIELD_NUMBER;
        hash = (53 * hash) + getWebhook().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.LeadFormDeliveryMethod prototype) {
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
   * A configuration of how leads are delivered to the advertiser.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.LeadFormDeliveryMethod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.LeadFormDeliveryMethod)
      com.google.ads.googleads.v18.common.LeadFormDeliveryMethodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_LeadFormDeliveryMethod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_LeadFormDeliveryMethod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.class, com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.newBuilder()
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
      if (webhookBuilder_ != null) {
        webhookBuilder_.clear();
      }
      deliveryDetailsCase_ = 0;
      deliveryDetails_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.AssetTypesProto.internal_static_google_ads_googleads_v18_common_LeadFormDeliveryMethod_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.LeadFormDeliveryMethod getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.LeadFormDeliveryMethod build() {
      com.google.ads.googleads.v18.common.LeadFormDeliveryMethod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.LeadFormDeliveryMethod buildPartial() {
      com.google.ads.googleads.v18.common.LeadFormDeliveryMethod result = new com.google.ads.googleads.v18.common.LeadFormDeliveryMethod(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.LeadFormDeliveryMethod result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v18.common.LeadFormDeliveryMethod result) {
      result.deliveryDetailsCase_ = deliveryDetailsCase_;
      result.deliveryDetails_ = this.deliveryDetails_;
      if (deliveryDetailsCase_ == 1 &&
          webhookBuilder_ != null) {
        result.deliveryDetails_ = webhookBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v18.common.LeadFormDeliveryMethod) {
        return mergeFrom((com.google.ads.googleads.v18.common.LeadFormDeliveryMethod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.LeadFormDeliveryMethod other) {
      if (other == com.google.ads.googleads.v18.common.LeadFormDeliveryMethod.getDefaultInstance()) return this;
      switch (other.getDeliveryDetailsCase()) {
        case WEBHOOK: {
          mergeWebhook(other.getWebhook());
          break;
        }
        case DELIVERYDETAILS_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getWebhookFieldBuilder().getBuilder(),
                  extensionRegistry);
              deliveryDetailsCase_ = 1;
              break;
            } // case 10
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
    private int deliveryDetailsCase_ = 0;
    private java.lang.Object deliveryDetails_;
    public DeliveryDetailsCase
        getDeliveryDetailsCase() {
      return DeliveryDetailsCase.forNumber(
          deliveryDetailsCase_);
    }

    public Builder clearDeliveryDetails() {
      deliveryDetailsCase_ = 0;
      deliveryDetails_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v18.common.WebhookDelivery, com.google.ads.googleads.v18.common.WebhookDelivery.Builder, com.google.ads.googleads.v18.common.WebhookDeliveryOrBuilder> webhookBuilder_;
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     * @return Whether the webhook field is set.
     */
    @java.lang.Override
    public boolean hasWebhook() {
      return deliveryDetailsCase_ == 1;
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     * @return The webhook.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.common.WebhookDelivery getWebhook() {
      if (webhookBuilder_ == null) {
        if (deliveryDetailsCase_ == 1) {
          return (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_;
        }
        return com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
      } else {
        if (deliveryDetailsCase_ == 1) {
          return webhookBuilder_.getMessage();
        }
        return com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    public Builder setWebhook(com.google.ads.googleads.v18.common.WebhookDelivery value) {
      if (webhookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deliveryDetails_ = value;
        onChanged();
      } else {
        webhookBuilder_.setMessage(value);
      }
      deliveryDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    public Builder setWebhook(
        com.google.ads.googleads.v18.common.WebhookDelivery.Builder builderForValue) {
      if (webhookBuilder_ == null) {
        deliveryDetails_ = builderForValue.build();
        onChanged();
      } else {
        webhookBuilder_.setMessage(builderForValue.build());
      }
      deliveryDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    public Builder mergeWebhook(com.google.ads.googleads.v18.common.WebhookDelivery value) {
      if (webhookBuilder_ == null) {
        if (deliveryDetailsCase_ == 1 &&
            deliveryDetails_ != com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance()) {
          deliveryDetails_ = com.google.ads.googleads.v18.common.WebhookDelivery.newBuilder((com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_)
              .mergeFrom(value).buildPartial();
        } else {
          deliveryDetails_ = value;
        }
        onChanged();
      } else {
        if (deliveryDetailsCase_ == 1) {
          webhookBuilder_.mergeFrom(value);
        } else {
          webhookBuilder_.setMessage(value);
        }
      }
      deliveryDetailsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    public Builder clearWebhook() {
      if (webhookBuilder_ == null) {
        if (deliveryDetailsCase_ == 1) {
          deliveryDetailsCase_ = 0;
          deliveryDetails_ = null;
          onChanged();
        }
      } else {
        if (deliveryDetailsCase_ == 1) {
          deliveryDetailsCase_ = 0;
          deliveryDetails_ = null;
        }
        webhookBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    public com.google.ads.googleads.v18.common.WebhookDelivery.Builder getWebhookBuilder() {
      return getWebhookFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.common.WebhookDeliveryOrBuilder getWebhookOrBuilder() {
      if ((deliveryDetailsCase_ == 1) && (webhookBuilder_ != null)) {
        return webhookBuilder_.getMessageOrBuilder();
      } else {
        if (deliveryDetailsCase_ == 1) {
          return (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_;
        }
        return com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Webhook method of delivery.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.common.WebhookDelivery webhook = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v18.common.WebhookDelivery, com.google.ads.googleads.v18.common.WebhookDelivery.Builder, com.google.ads.googleads.v18.common.WebhookDeliveryOrBuilder> 
        getWebhookFieldBuilder() {
      if (webhookBuilder_ == null) {
        if (!(deliveryDetailsCase_ == 1)) {
          deliveryDetails_ = com.google.ads.googleads.v18.common.WebhookDelivery.getDefaultInstance();
        }
        webhookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v18.common.WebhookDelivery, com.google.ads.googleads.v18.common.WebhookDelivery.Builder, com.google.ads.googleads.v18.common.WebhookDeliveryOrBuilder>(
                (com.google.ads.googleads.v18.common.WebhookDelivery) deliveryDetails_,
                getParentForChildren(),
                isClean());
        deliveryDetails_ = null;
      }
      deliveryDetailsCase_ = 1;
      onChanged();
      return webhookBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.LeadFormDeliveryMethod)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.LeadFormDeliveryMethod)
  private static final com.google.ads.googleads.v18.common.LeadFormDeliveryMethod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.LeadFormDeliveryMethod();
  }

  public static com.google.ads.googleads.v18.common.LeadFormDeliveryMethod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormDeliveryMethod>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormDeliveryMethod>() {
    @java.lang.Override
    public LeadFormDeliveryMethod parsePartialFrom(
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

  public static com.google.protobuf.Parser<LeadFormDeliveryMethod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormDeliveryMethod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.LeadFormDeliveryMethod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

