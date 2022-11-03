// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * Response message for
 * [SmartCampaignSuggestService.SuggestKeywordThemes][google.ads.googleads.v10.services.SmartCampaignSuggestService.SuggestKeywordThemes].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.SuggestKeywordThemesResponse}
 */
public final class SuggestKeywordThemesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.SuggestKeywordThemesResponse)
    SuggestKeywordThemesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestKeywordThemesResponse.newBuilder() to construct.
  private SuggestKeywordThemesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestKeywordThemesResponse() {
    keywordThemes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestKeywordThemesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v10_services_SuggestKeywordThemesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v10_services_SuggestKeywordThemesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.class, com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.Builder.class);
  }

  public static final int KEYWORD_THEMES_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v10.resources.KeywordThemeConstant> keywordThemes_;
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v10.resources.KeywordThemeConstant> getKeywordThemesList() {
    return keywordThemes_;
  }
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder> 
      getKeywordThemesOrBuilderList() {
    return keywordThemes_;
  }
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  @java.lang.Override
  public int getKeywordThemesCount() {
    return keywordThemes_.size();
  }
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.KeywordThemeConstant getKeywordThemes(int index) {
    return keywordThemes_.get(index);
  }
  /**
   * <pre>
   * Smart campaign keyword theme suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder getKeywordThemesOrBuilder(
      int index) {
    return keywordThemes_.get(index);
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
    for (int i = 0; i < keywordThemes_.size(); i++) {
      output.writeMessage(1, keywordThemes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keywordThemes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keywordThemes_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse other = (com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse) obj;

    if (!getKeywordThemesList()
        .equals(other.getKeywordThemesList())) return false;
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
    if (getKeywordThemesCount() > 0) {
      hash = (37 * hash) + KEYWORD_THEMES_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordThemesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse prototype) {
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
   * Response message for
   * [SmartCampaignSuggestService.SuggestKeywordThemes][google.ads.googleads.v10.services.SmartCampaignSuggestService.SuggestKeywordThemes].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.SuggestKeywordThemesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.SuggestKeywordThemesResponse)
      com.google.ads.googleads.v10.services.SuggestKeywordThemesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v10_services_SuggestKeywordThemesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v10_services_SuggestKeywordThemesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.class, com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keywordThemesBuilder_ == null) {
        keywordThemes_ = java.util.Collections.emptyList();
      } else {
        keywordThemes_ = null;
        keywordThemesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v10_services_SuggestKeywordThemesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse build() {
      com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse buildPartial() {
      com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse result = new com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse(this);
      int from_bitField0_ = bitField0_;
      if (keywordThemesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keywordThemes_ = java.util.Collections.unmodifiableList(keywordThemes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keywordThemes_ = keywordThemes_;
      } else {
        result.keywordThemes_ = keywordThemesBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse) {
        return mergeFrom((com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse other) {
      if (other == com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse.getDefaultInstance()) return this;
      if (keywordThemesBuilder_ == null) {
        if (!other.keywordThemes_.isEmpty()) {
          if (keywordThemes_.isEmpty()) {
            keywordThemes_ = other.keywordThemes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeywordThemesIsMutable();
            keywordThemes_.addAll(other.keywordThemes_);
          }
          onChanged();
        }
      } else {
        if (!other.keywordThemes_.isEmpty()) {
          if (keywordThemesBuilder_.isEmpty()) {
            keywordThemesBuilder_.dispose();
            keywordThemesBuilder_ = null;
            keywordThemes_ = other.keywordThemes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keywordThemesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeywordThemesFieldBuilder() : null;
          } else {
            keywordThemesBuilder_.addAllMessages(other.keywordThemes_);
          }
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
              com.google.ads.googleads.v10.resources.KeywordThemeConstant m =
                  input.readMessage(
                      com.google.ads.googleads.v10.resources.KeywordThemeConstant.parser(),
                      extensionRegistry);
              if (keywordThemesBuilder_ == null) {
                ensureKeywordThemesIsMutable();
                keywordThemes_.add(m);
              } else {
                keywordThemesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.ads.googleads.v10.resources.KeywordThemeConstant> keywordThemes_ =
      java.util.Collections.emptyList();
    private void ensureKeywordThemesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keywordThemes_ = new java.util.ArrayList<com.google.ads.googleads.v10.resources.KeywordThemeConstant>(keywordThemes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.resources.KeywordThemeConstant, com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder> keywordThemesBuilder_;

    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.resources.KeywordThemeConstant> getKeywordThemesList() {
      if (keywordThemesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keywordThemes_);
      } else {
        return keywordThemesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public int getKeywordThemesCount() {
      if (keywordThemesBuilder_ == null) {
        return keywordThemes_.size();
      } else {
        return keywordThemesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordThemeConstant getKeywordThemes(int index) {
      if (keywordThemesBuilder_ == null) {
        return keywordThemes_.get(index);
      } else {
        return keywordThemesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder setKeywordThemes(
        int index, com.google.ads.googleads.v10.resources.KeywordThemeConstant value) {
      if (keywordThemesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemesIsMutable();
        keywordThemes_.set(index, value);
        onChanged();
      } else {
        keywordThemesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder setKeywordThemes(
        int index, com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemesBuilder_ == null) {
        ensureKeywordThemesIsMutable();
        keywordThemes_.set(index, builderForValue.build());
        onChanged();
      } else {
        keywordThemesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder addKeywordThemes(com.google.ads.googleads.v10.resources.KeywordThemeConstant value) {
      if (keywordThemesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemesIsMutable();
        keywordThemes_.add(value);
        onChanged();
      } else {
        keywordThemesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder addKeywordThemes(
        int index, com.google.ads.googleads.v10.resources.KeywordThemeConstant value) {
      if (keywordThemesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeywordThemesIsMutable();
        keywordThemes_.add(index, value);
        onChanged();
      } else {
        keywordThemesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder addKeywordThemes(
        com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemesBuilder_ == null) {
        ensureKeywordThemesIsMutable();
        keywordThemes_.add(builderForValue.build());
        onChanged();
      } else {
        keywordThemesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder addKeywordThemes(
        int index, com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder builderForValue) {
      if (keywordThemesBuilder_ == null) {
        ensureKeywordThemesIsMutable();
        keywordThemes_.add(index, builderForValue.build());
        onChanged();
      } else {
        keywordThemesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder addAllKeywordThemes(
        java.lang.Iterable<? extends com.google.ads.googleads.v10.resources.KeywordThemeConstant> values) {
      if (keywordThemesBuilder_ == null) {
        ensureKeywordThemesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keywordThemes_);
        onChanged();
      } else {
        keywordThemesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder clearKeywordThemes() {
      if (keywordThemesBuilder_ == null) {
        keywordThemes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keywordThemesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public Builder removeKeywordThemes(int index) {
      if (keywordThemesBuilder_ == null) {
        ensureKeywordThemesIsMutable();
        keywordThemes_.remove(index);
        onChanged();
      } else {
        keywordThemesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder getKeywordThemesBuilder(
        int index) {
      return getKeywordThemesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder getKeywordThemesOrBuilder(
        int index) {
      if (keywordThemesBuilder_ == null) {
        return keywordThemes_.get(index);  } else {
        return keywordThemesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder> 
         getKeywordThemesOrBuilderList() {
      if (keywordThemesBuilder_ != null) {
        return keywordThemesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keywordThemes_);
      }
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder addKeywordThemesBuilder() {
      return getKeywordThemesFieldBuilder().addBuilder(
          com.google.ads.googleads.v10.resources.KeywordThemeConstant.getDefaultInstance());
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder addKeywordThemesBuilder(
        int index) {
      return getKeywordThemesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v10.resources.KeywordThemeConstant.getDefaultInstance());
    }
    /**
     * <pre>
     * Smart campaign keyword theme suggestions.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.resources.KeywordThemeConstant keyword_themes = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder> 
         getKeywordThemesBuilderList() {
      return getKeywordThemesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.resources.KeywordThemeConstant, com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder> 
        getKeywordThemesFieldBuilder() {
      if (keywordThemesBuilder_ == null) {
        keywordThemesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v10.resources.KeywordThemeConstant, com.google.ads.googleads.v10.resources.KeywordThemeConstant.Builder, com.google.ads.googleads.v10.resources.KeywordThemeConstantOrBuilder>(
                keywordThemes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keywordThemes_ = null;
      }
      return keywordThemesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.SuggestKeywordThemesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.SuggestKeywordThemesResponse)
  private static final com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse();
  }

  public static com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestKeywordThemesResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestKeywordThemesResponse>() {
    @java.lang.Override
    public SuggestKeywordThemesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestKeywordThemesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestKeywordThemesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.SuggestKeywordThemesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

