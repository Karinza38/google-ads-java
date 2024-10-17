// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/keyword_theme_constant_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * Request message for
 * [KeywordThemeConstantService.SuggestKeywordThemeConstants][google.ads.googleads.v18.services.KeywordThemeConstantService.SuggestKeywordThemeConstants].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest}
 */
public final class SuggestKeywordThemeConstantsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)
    SuggestKeywordThemeConstantsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestKeywordThemeConstantsRequest.newBuilder() to construct.
  private SuggestKeywordThemeConstantsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestKeywordThemeConstantsRequest() {
    queryText_ = "";
    countryCode_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestKeywordThemeConstantsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v18_services_SuggestKeywordThemeConstantsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v18_services_SuggestKeywordThemeConstantsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.class, com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.Builder.class);
  }

  public static final int QUERY_TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object queryText_ = "";
  /**
   * <pre>
   * The query text of a keyword theme that will be used to map to similar
   * keyword themes. For example, "plumber" or "roofer".
   * </pre>
   *
   * <code>string query_text = 1;</code>
   * @return The queryText.
   */
  @java.lang.Override
  public java.lang.String getQueryText() {
    java.lang.Object ref = queryText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queryText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The query text of a keyword theme that will be used to map to similar
   * keyword themes. For example, "plumber" or "roofer".
   * </pre>
   *
   * <code>string query_text = 1;</code>
   * @return The bytes for queryText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueryTextBytes() {
    java.lang.Object ref = queryText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queryText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object countryCode_ = "";
  /**
   * <pre>
   * Upper-case, two-letter country code as defined by ISO-3166. This for
   * refining the scope of the query, default to 'US' if not set.
   * </pre>
   *
   * <code>string country_code = 2;</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public java.lang.String getCountryCode() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      countryCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Upper-case, two-letter country code as defined by ISO-3166. This for
   * refining the scope of the query, default to 'US' if not set.
   * </pre>
   *
   * <code>string country_code = 2;</code>
   * @return The bytes for countryCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryCodeBytes() {
    java.lang.Object ref = countryCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      countryCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   * <pre>
   * The two letter language code for get corresponding keyword theme for
   * refining the scope of the query, default to 'en' if not set.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The two letter language code for get corresponding keyword theme for
   * refining the scope of the query, default to 'en' if not set.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, queryText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queryText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, queryText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(countryCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, countryCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest other = (com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest) obj;

    if (!getQueryText()
        .equals(other.getQueryText())) return false;
    if (!getCountryCode()
        .equals(other.getCountryCode())) return false;
    if (!getLanguageCode()
        .equals(other.getLanguageCode())) return false;
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
    hash = (37 * hash) + QUERY_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getQueryText().hashCode();
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest prototype) {
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
   * Request message for
   * [KeywordThemeConstantService.SuggestKeywordThemeConstants][google.ads.googleads.v18.services.KeywordThemeConstantService.SuggestKeywordThemeConstants].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)
      com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v18_services_SuggestKeywordThemeConstantsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v18_services_SuggestKeywordThemeConstantsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.class, com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.newBuilder()
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
      queryText_ = "";
      countryCode_ = "";
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.KeywordThemeConstantServiceProto.internal_static_google_ads_googleads_v18_services_SuggestKeywordThemeConstantsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest build() {
      com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest buildPartial() {
      com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest result = new com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queryText_ = queryText_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.countryCode_ = countryCode_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.languageCode_ = languageCode_;
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
      if (other instanceof com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest) {
        return mergeFrom((com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest other) {
      if (other == com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest.getDefaultInstance()) return this;
      if (!other.getQueryText().isEmpty()) {
        queryText_ = other.queryText_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCountryCode().isEmpty()) {
        countryCode_ = other.countryCode_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        bitField0_ |= 0x00000004;
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
              queryText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              countryCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              languageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object queryText_ = "";
    /**
     * <pre>
     * The query text of a keyword theme that will be used to map to similar
     * keyword themes. For example, "plumber" or "roofer".
     * </pre>
     *
     * <code>string query_text = 1;</code>
     * @return The queryText.
     */
    public java.lang.String getQueryText() {
      java.lang.Object ref = queryText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queryText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The query text of a keyword theme that will be used to map to similar
     * keyword themes. For example, "plumber" or "roofer".
     * </pre>
     *
     * <code>string query_text = 1;</code>
     * @return The bytes for queryText.
     */
    public com.google.protobuf.ByteString
        getQueryTextBytes() {
      java.lang.Object ref = queryText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queryText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The query text of a keyword theme that will be used to map to similar
     * keyword themes. For example, "plumber" or "roofer".
     * </pre>
     *
     * <code>string query_text = 1;</code>
     * @param value The queryText to set.
     * @return This builder for chaining.
     */
    public Builder setQueryText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      queryText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The query text of a keyword theme that will be used to map to similar
     * keyword themes. For example, "plumber" or "roofer".
     * </pre>
     *
     * <code>string query_text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueryText() {
      queryText_ = getDefaultInstance().getQueryText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The query text of a keyword theme that will be used to map to similar
     * keyword themes. For example, "plumber" or "roofer".
     * </pre>
     *
     * <code>string query_text = 1;</code>
     * @param value The bytes for queryText to set.
     * @return This builder for chaining.
     */
    public Builder setQueryTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      queryText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object countryCode_ = "";
    /**
     * <pre>
     * Upper-case, two-letter country code as defined by ISO-3166. This for
     * refining the scope of the query, default to 'US' if not set.
     * </pre>
     *
     * <code>string country_code = 2;</code>
     * @return The countryCode.
     */
    public java.lang.String getCountryCode() {
      java.lang.Object ref = countryCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        countryCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Upper-case, two-letter country code as defined by ISO-3166. This for
     * refining the scope of the query, default to 'US' if not set.
     * </pre>
     *
     * <code>string country_code = 2;</code>
     * @return The bytes for countryCode.
     */
    public com.google.protobuf.ByteString
        getCountryCodeBytes() {
      java.lang.Object ref = countryCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        countryCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Upper-case, two-letter country code as defined by ISO-3166. This for
     * refining the scope of the query, default to 'US' if not set.
     * </pre>
     *
     * <code>string country_code = 2;</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      countryCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upper-case, two-letter country code as defined by ISO-3166. This for
     * refining the scope of the query, default to 'US' if not set.
     * </pre>
     *
     * <code>string country_code = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      countryCode_ = getDefaultInstance().getCountryCode();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Upper-case, two-letter country code as defined by ISO-3166. This for
     * refining the scope of the query, default to 'US' if not set.
     * </pre>
     *
     * <code>string country_code = 2;</code>
     * @param value The bytes for countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      countryCode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * The two letter language code for get corresponding keyword theme for
     * refining the scope of the query, default to 'en' if not set.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The two letter language code for get corresponding keyword theme for
     * refining the scope of the query, default to 'en' if not set.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The two letter language code for get corresponding keyword theme for
     * refining the scope of the query, default to 'en' if not set.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The two letter language code for get corresponding keyword theme for
     * refining the scope of the query, default to 'en' if not set.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The two letter language code for get corresponding keyword theme for
     * refining the scope of the query, default to 'en' if not set.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest)
  private static final com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest();
  }

  public static com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestKeywordThemeConstantsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SuggestKeywordThemeConstantsRequest>() {
    @java.lang.Override
    public SuggestKeywordThemeConstantsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestKeywordThemeConstantsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestKeywordThemeConstantsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.SuggestKeywordThemeConstantsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

