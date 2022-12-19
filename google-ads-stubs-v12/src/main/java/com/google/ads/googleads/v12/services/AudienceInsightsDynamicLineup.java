// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/audience_insights_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * A YouTube Dynamic Lineup.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.AudienceInsightsDynamicLineup}
 */
public final class AudienceInsightsDynamicLineup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)
    AudienceInsightsDynamicLineupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceInsightsDynamicLineup.newBuilder() to construct.
  private AudienceInsightsDynamicLineup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceInsightsDynamicLineup() {
    dynamicLineupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceInsightsDynamicLineup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_AudienceInsightsDynamicLineup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_AudienceInsightsDynamicLineup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.class, com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.Builder.class);
  }

  public static final int DYNAMIC_LINEUP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object dynamicLineupId_;
  /**
   * <pre>
   * Required. The numeric ID of the dynamic lineup.
   * </pre>
   *
   * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dynamicLineupId.
   */
  @java.lang.Override
  public java.lang.String getDynamicLineupId() {
    java.lang.Object ref = dynamicLineupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynamicLineupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The numeric ID of the dynamic lineup.
   * </pre>
   *
   * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for dynamicLineupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynamicLineupIdBytes() {
    java.lang.Object ref = dynamicLineupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynamicLineupId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicLineupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dynamicLineupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dynamicLineupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dynamicLineupId_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup other = (com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup) obj;

    if (!getDynamicLineupId()
        .equals(other.getDynamicLineupId())) return false;
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
    hash = (37 * hash) + DYNAMIC_LINEUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicLineupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup prototype) {
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
   * A YouTube Dynamic Lineup.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.AudienceInsightsDynamicLineup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)
      com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_AudienceInsightsDynamicLineup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_AudienceInsightsDynamicLineup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.class, com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dynamicLineupId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v12_services_AudienceInsightsDynamicLineup_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup build() {
      com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup buildPartial() {
      com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup result = new com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup(this);
      result.dynamicLineupId_ = dynamicLineupId_;
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
      if (other instanceof com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup) {
        return mergeFrom((com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup other) {
      if (other == com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup.getDefaultInstance()) return this;
      if (!other.getDynamicLineupId().isEmpty()) {
        dynamicLineupId_ = other.dynamicLineupId_;
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
              dynamicLineupId_ = input.readStringRequireUtf8();

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

    private java.lang.Object dynamicLineupId_ = "";
    /**
     * <pre>
     * Required. The numeric ID of the dynamic lineup.
     * </pre>
     *
     * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dynamicLineupId.
     */
    public java.lang.String getDynamicLineupId() {
      java.lang.Object ref = dynamicLineupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynamicLineupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The numeric ID of the dynamic lineup.
     * </pre>
     *
     * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for dynamicLineupId.
     */
    public com.google.protobuf.ByteString
        getDynamicLineupIdBytes() {
      java.lang.Object ref = dynamicLineupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynamicLineupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The numeric ID of the dynamic lineup.
     * </pre>
     *
     * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The dynamicLineupId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicLineupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dynamicLineupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The numeric ID of the dynamic lineup.
     * </pre>
     *
     * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearDynamicLineupId() {
      
      dynamicLineupId_ = getDefaultInstance().getDynamicLineupId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The numeric ID of the dynamic lineup.
     * </pre>
     *
     * <code>string dynamic_lineup_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for dynamicLineupId to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicLineupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dynamicLineupId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.AudienceInsightsDynamicLineup)
  private static final com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup();
  }

  public static com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceInsightsDynamicLineup>
      PARSER = new com.google.protobuf.AbstractParser<AudienceInsightsDynamicLineup>() {
    @java.lang.Override
    public AudienceInsightsDynamicLineup parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceInsightsDynamicLineup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceInsightsDynamicLineup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.AudienceInsightsDynamicLineup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
