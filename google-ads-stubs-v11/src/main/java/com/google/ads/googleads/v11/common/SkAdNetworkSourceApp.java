// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/segments.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * A SkAdNetworkSourceApp segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.SkAdNetworkSourceApp}
 */
public final class SkAdNetworkSourceApp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.SkAdNetworkSourceApp)
    SkAdNetworkSourceAppOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkAdNetworkSourceApp.newBuilder() to construct.
  private SkAdNetworkSourceApp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkAdNetworkSourceApp() {
    skAdNetworkSourceAppId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkAdNetworkSourceApp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.SegmentsProto.internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.SegmentsProto.internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.class, com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.Builder.class);
  }

  private int bitField0_;
  public static final int SK_AD_NETWORK_SOURCE_APP_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object skAdNetworkSourceAppId_;
  /**
   * <pre>
   * App id where the ad that drove the iOS Store Kit Ad Network install was
   * shown.
   * </pre>
   *
   * <code>optional string sk_ad_network_source_app_id = 1;</code>
   * @return Whether the skAdNetworkSourceAppId field is set.
   */
  @java.lang.Override
  public boolean hasSkAdNetworkSourceAppId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * App id where the ad that drove the iOS Store Kit Ad Network install was
   * shown.
   * </pre>
   *
   * <code>optional string sk_ad_network_source_app_id = 1;</code>
   * @return The skAdNetworkSourceAppId.
   */
  @java.lang.Override
  public java.lang.String getSkAdNetworkSourceAppId() {
    java.lang.Object ref = skAdNetworkSourceAppId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skAdNetworkSourceAppId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * App id where the ad that drove the iOS Store Kit Ad Network install was
   * shown.
   * </pre>
   *
   * <code>optional string sk_ad_network_source_app_id = 1;</code>
   * @return The bytes for skAdNetworkSourceAppId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkAdNetworkSourceAppIdBytes() {
    java.lang.Object ref = skAdNetworkSourceAppId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skAdNetworkSourceAppId_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skAdNetworkSourceAppId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skAdNetworkSourceAppId_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.SkAdNetworkSourceApp)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.SkAdNetworkSourceApp other = (com.google.ads.googleads.v11.common.SkAdNetworkSourceApp) obj;

    if (hasSkAdNetworkSourceAppId() != other.hasSkAdNetworkSourceAppId()) return false;
    if (hasSkAdNetworkSourceAppId()) {
      if (!getSkAdNetworkSourceAppId()
          .equals(other.getSkAdNetworkSourceAppId())) return false;
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
    if (hasSkAdNetworkSourceAppId()) {
      hash = (37 * hash) + SK_AD_NETWORK_SOURCE_APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkAdNetworkSourceAppId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.SkAdNetworkSourceApp prototype) {
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
   * A SkAdNetworkSourceApp segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.SkAdNetworkSourceApp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.SkAdNetworkSourceApp)
      com.google.ads.googleads.v11.common.SkAdNetworkSourceAppOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.SegmentsProto.internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.SegmentsProto.internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.class, com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      skAdNetworkSourceAppId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.SegmentsProto.internal_static_google_ads_googleads_v11_common_SkAdNetworkSourceApp_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.SkAdNetworkSourceApp getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.SkAdNetworkSourceApp build() {
      com.google.ads.googleads.v11.common.SkAdNetworkSourceApp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.SkAdNetworkSourceApp buildPartial() {
      com.google.ads.googleads.v11.common.SkAdNetworkSourceApp result = new com.google.ads.googleads.v11.common.SkAdNetworkSourceApp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.skAdNetworkSourceAppId_ = skAdNetworkSourceAppId_;
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
      if (other instanceof com.google.ads.googleads.v11.common.SkAdNetworkSourceApp) {
        return mergeFrom((com.google.ads.googleads.v11.common.SkAdNetworkSourceApp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.SkAdNetworkSourceApp other) {
      if (other == com.google.ads.googleads.v11.common.SkAdNetworkSourceApp.getDefaultInstance()) return this;
      if (other.hasSkAdNetworkSourceAppId()) {
        bitField0_ |= 0x00000001;
        skAdNetworkSourceAppId_ = other.skAdNetworkSourceAppId_;
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
              skAdNetworkSourceAppId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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
    private int bitField0_;

    private java.lang.Object skAdNetworkSourceAppId_ = "";
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @return Whether the skAdNetworkSourceAppId field is set.
     */
    public boolean hasSkAdNetworkSourceAppId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @return The skAdNetworkSourceAppId.
     */
    public java.lang.String getSkAdNetworkSourceAppId() {
      java.lang.Object ref = skAdNetworkSourceAppId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skAdNetworkSourceAppId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @return The bytes for skAdNetworkSourceAppId.
     */
    public com.google.protobuf.ByteString
        getSkAdNetworkSourceAppIdBytes() {
      java.lang.Object ref = skAdNetworkSourceAppId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skAdNetworkSourceAppId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @param value The skAdNetworkSourceAppId to set.
     * @return This builder for chaining.
     */
    public Builder setSkAdNetworkSourceAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      skAdNetworkSourceAppId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkAdNetworkSourceAppId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skAdNetworkSourceAppId_ = getDefaultInstance().getSkAdNetworkSourceAppId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * App id where the ad that drove the iOS Store Kit Ad Network install was
     * shown.
     * </pre>
     *
     * <code>optional string sk_ad_network_source_app_id = 1;</code>
     * @param value The bytes for skAdNetworkSourceAppId to set.
     * @return This builder for chaining.
     */
    public Builder setSkAdNetworkSourceAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      skAdNetworkSourceAppId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.SkAdNetworkSourceApp)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.SkAdNetworkSourceApp)
  private static final com.google.ads.googleads.v11.common.SkAdNetworkSourceApp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.SkAdNetworkSourceApp();
  }

  public static com.google.ads.googleads.v11.common.SkAdNetworkSourceApp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkAdNetworkSourceApp>
      PARSER = new com.google.protobuf.AbstractParser<SkAdNetworkSourceApp>() {
    @java.lang.Override
    public SkAdNetworkSourceApp parsePartialFrom(
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

  public static com.google.protobuf.Parser<SkAdNetworkSourceApp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkAdNetworkSourceApp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.SkAdNetworkSourceApp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

