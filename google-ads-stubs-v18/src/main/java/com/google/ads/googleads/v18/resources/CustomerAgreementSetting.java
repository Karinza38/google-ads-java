// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

/**
 * <pre>
 * Customer Agreement Setting for a customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.resources.CustomerAgreementSetting}
 */
public final class CustomerAgreementSetting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.resources.CustomerAgreementSetting)
    CustomerAgreementSettingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerAgreementSetting.newBuilder() to construct.
  private CustomerAgreementSetting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerAgreementSetting() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerAgreementSetting();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.resources.CustomerProto.internal_static_google_ads_googleads_v18_resources_CustomerAgreementSetting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.resources.CustomerProto.internal_static_google_ads_googleads_v18_resources_CustomerAgreementSetting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.resources.CustomerAgreementSetting.class, com.google.ads.googleads.v18.resources.CustomerAgreementSetting.Builder.class);
  }

  public static final int ACCEPTED_LEAD_FORM_TERMS_FIELD_NUMBER = 1;
  private boolean acceptedLeadFormTerms_ = false;
  /**
   * <pre>
   * Output only. Whether the customer has accepted lead form term of service.
   * </pre>
   *
   * <code>bool accepted_lead_form_terms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The acceptedLeadFormTerms.
   */
  @java.lang.Override
  public boolean getAcceptedLeadFormTerms() {
    return acceptedLeadFormTerms_;
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
    if (acceptedLeadFormTerms_ != false) {
      output.writeBool(1, acceptedLeadFormTerms_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acceptedLeadFormTerms_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, acceptedLeadFormTerms_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.resources.CustomerAgreementSetting)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.resources.CustomerAgreementSetting other = (com.google.ads.googleads.v18.resources.CustomerAgreementSetting) obj;

    if (getAcceptedLeadFormTerms()
        != other.getAcceptedLeadFormTerms()) return false;
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
    hash = (37 * hash) + ACCEPTED_LEAD_FORM_TERMS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAcceptedLeadFormTerms());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.resources.CustomerAgreementSetting prototype) {
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
   * Customer Agreement Setting for a customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.resources.CustomerAgreementSetting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.resources.CustomerAgreementSetting)
      com.google.ads.googleads.v18.resources.CustomerAgreementSettingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.resources.CustomerProto.internal_static_google_ads_googleads_v18_resources_CustomerAgreementSetting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.resources.CustomerProto.internal_static_google_ads_googleads_v18_resources_CustomerAgreementSetting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.resources.CustomerAgreementSetting.class, com.google.ads.googleads.v18.resources.CustomerAgreementSetting.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.resources.CustomerAgreementSetting.newBuilder()
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
      acceptedLeadFormTerms_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.resources.CustomerProto.internal_static_google_ads_googleads_v18_resources_CustomerAgreementSetting_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CustomerAgreementSetting getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.resources.CustomerAgreementSetting.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CustomerAgreementSetting build() {
      com.google.ads.googleads.v18.resources.CustomerAgreementSetting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CustomerAgreementSetting buildPartial() {
      com.google.ads.googleads.v18.resources.CustomerAgreementSetting result = new com.google.ads.googleads.v18.resources.CustomerAgreementSetting(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.resources.CustomerAgreementSetting result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acceptedLeadFormTerms_ = acceptedLeadFormTerms_;
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
      if (other instanceof com.google.ads.googleads.v18.resources.CustomerAgreementSetting) {
        return mergeFrom((com.google.ads.googleads.v18.resources.CustomerAgreementSetting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.resources.CustomerAgreementSetting other) {
      if (other == com.google.ads.googleads.v18.resources.CustomerAgreementSetting.getDefaultInstance()) return this;
      if (other.getAcceptedLeadFormTerms() != false) {
        setAcceptedLeadFormTerms(other.getAcceptedLeadFormTerms());
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
              acceptedLeadFormTerms_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean acceptedLeadFormTerms_ ;
    /**
     * <pre>
     * Output only. Whether the customer has accepted lead form term of service.
     * </pre>
     *
     * <code>bool accepted_lead_form_terms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The acceptedLeadFormTerms.
     */
    @java.lang.Override
    public boolean getAcceptedLeadFormTerms() {
      return acceptedLeadFormTerms_;
    }
    /**
     * <pre>
     * Output only. Whether the customer has accepted lead form term of service.
     * </pre>
     *
     * <code>bool accepted_lead_form_terms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The acceptedLeadFormTerms to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedLeadFormTerms(boolean value) {

      acceptedLeadFormTerms_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Whether the customer has accepted lead form term of service.
     * </pre>
     *
     * <code>bool accepted_lead_form_terms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptedLeadFormTerms() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acceptedLeadFormTerms_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.resources.CustomerAgreementSetting)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.resources.CustomerAgreementSetting)
  private static final com.google.ads.googleads.v18.resources.CustomerAgreementSetting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.resources.CustomerAgreementSetting();
  }

  public static com.google.ads.googleads.v18.resources.CustomerAgreementSetting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerAgreementSetting>
      PARSER = new com.google.protobuf.AbstractParser<CustomerAgreementSetting>() {
    @java.lang.Override
    public CustomerAgreementSetting parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerAgreementSetting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerAgreementSetting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.resources.CustomerAgreementSetting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

