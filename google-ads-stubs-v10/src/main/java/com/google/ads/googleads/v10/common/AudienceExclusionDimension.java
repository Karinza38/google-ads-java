// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/audiences.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * Negative dimension specifying users to exclude from the audience.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.AudienceExclusionDimension}
 */
public final class AudienceExclusionDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.AudienceExclusionDimension)
    AudienceExclusionDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceExclusionDimension.newBuilder() to construct.
  private AudienceExclusionDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceExclusionDimension() {
    exclusions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceExclusionDimension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_AudienceExclusionDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_AudienceExclusionDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.AudienceExclusionDimension.class, com.google.ads.googleads.v10.common.AudienceExclusionDimension.Builder.class);
  }

  public static final int EXCLUSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v10.common.ExclusionSegment> exclusions_;
  /**
   * <pre>
   * Audience segment to be excluded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v10.common.ExclusionSegment> getExclusionsList() {
    return exclusions_;
  }
  /**
   * <pre>
   * Audience segment to be excluded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder> 
      getExclusionsOrBuilderList() {
    return exclusions_;
  }
  /**
   * <pre>
   * Audience segment to be excluded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
   */
  @java.lang.Override
  public int getExclusionsCount() {
    return exclusions_.size();
  }
  /**
   * <pre>
   * Audience segment to be excluded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.ExclusionSegment getExclusions(int index) {
    return exclusions_.get(index);
  }
  /**
   * <pre>
   * Audience segment to be excluded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder getExclusionsOrBuilder(
      int index) {
    return exclusions_.get(index);
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
    for (int i = 0; i < exclusions_.size(); i++) {
      output.writeMessage(1, exclusions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < exclusions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, exclusions_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.AudienceExclusionDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.AudienceExclusionDimension other = (com.google.ads.googleads.v10.common.AudienceExclusionDimension) obj;

    if (!getExclusionsList()
        .equals(other.getExclusionsList())) return false;
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
    if (getExclusionsCount() > 0) {
      hash = (37 * hash) + EXCLUSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExclusionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.AudienceExclusionDimension prototype) {
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
   * Negative dimension specifying users to exclude from the audience.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.AudienceExclusionDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.AudienceExclusionDimension)
      com.google.ads.googleads.v10.common.AudienceExclusionDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_AudienceExclusionDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_AudienceExclusionDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.AudienceExclusionDimension.class, com.google.ads.googleads.v10.common.AudienceExclusionDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.AudienceExclusionDimension.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (exclusionsBuilder_ == null) {
        exclusions_ = java.util.Collections.emptyList();
      } else {
        exclusions_ = null;
        exclusionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_AudienceExclusionDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.AudienceExclusionDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.AudienceExclusionDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.AudienceExclusionDimension build() {
      com.google.ads.googleads.v10.common.AudienceExclusionDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.AudienceExclusionDimension buildPartial() {
      com.google.ads.googleads.v10.common.AudienceExclusionDimension result = new com.google.ads.googleads.v10.common.AudienceExclusionDimension(this);
      int from_bitField0_ = bitField0_;
      if (exclusionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exclusions_ = java.util.Collections.unmodifiableList(exclusions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exclusions_ = exclusions_;
      } else {
        result.exclusions_ = exclusionsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.common.AudienceExclusionDimension) {
        return mergeFrom((com.google.ads.googleads.v10.common.AudienceExclusionDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.AudienceExclusionDimension other) {
      if (other == com.google.ads.googleads.v10.common.AudienceExclusionDimension.getDefaultInstance()) return this;
      if (exclusionsBuilder_ == null) {
        if (!other.exclusions_.isEmpty()) {
          if (exclusions_.isEmpty()) {
            exclusions_ = other.exclusions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExclusionsIsMutable();
            exclusions_.addAll(other.exclusions_);
          }
          onChanged();
        }
      } else {
        if (!other.exclusions_.isEmpty()) {
          if (exclusionsBuilder_.isEmpty()) {
            exclusionsBuilder_.dispose();
            exclusionsBuilder_ = null;
            exclusions_ = other.exclusions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exclusionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExclusionsFieldBuilder() : null;
          } else {
            exclusionsBuilder_.addAllMessages(other.exclusions_);
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
              com.google.ads.googleads.v10.common.ExclusionSegment m =
                  input.readMessage(
                      com.google.ads.googleads.v10.common.ExclusionSegment.parser(),
                      extensionRegistry);
              if (exclusionsBuilder_ == null) {
                ensureExclusionsIsMutable();
                exclusions_.add(m);
              } else {
                exclusionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v10.common.ExclusionSegment> exclusions_ =
      java.util.Collections.emptyList();
    private void ensureExclusionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exclusions_ = new java.util.ArrayList<com.google.ads.googleads.v10.common.ExclusionSegment>(exclusions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.common.ExclusionSegment, com.google.ads.googleads.v10.common.ExclusionSegment.Builder, com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder> exclusionsBuilder_;

    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.common.ExclusionSegment> getExclusionsList() {
      if (exclusionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exclusions_);
      } else {
        return exclusionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public int getExclusionsCount() {
      if (exclusionsBuilder_ == null) {
        return exclusions_.size();
      } else {
        return exclusionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public com.google.ads.googleads.v10.common.ExclusionSegment getExclusions(int index) {
      if (exclusionsBuilder_ == null) {
        return exclusions_.get(index);
      } else {
        return exclusionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder setExclusions(
        int index, com.google.ads.googleads.v10.common.ExclusionSegment value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.set(index, value);
        onChanged();
      } else {
        exclusionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder setExclusions(
        int index, com.google.ads.googleads.v10.common.ExclusionSegment.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.set(index, builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder addExclusions(com.google.ads.googleads.v10.common.ExclusionSegment value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.add(value);
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder addExclusions(
        int index, com.google.ads.googleads.v10.common.ExclusionSegment value) {
      if (exclusionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExclusionsIsMutable();
        exclusions_.add(index, value);
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder addExclusions(
        com.google.ads.googleads.v10.common.ExclusionSegment.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.add(builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder addExclusions(
        int index, com.google.ads.googleads.v10.common.ExclusionSegment.Builder builderForValue) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.add(index, builderForValue.build());
        onChanged();
      } else {
        exclusionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder addAllExclusions(
        java.lang.Iterable<? extends com.google.ads.googleads.v10.common.ExclusionSegment> values) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exclusions_);
        onChanged();
      } else {
        exclusionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder clearExclusions() {
      if (exclusionsBuilder_ == null) {
        exclusions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exclusionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public Builder removeExclusions(int index) {
      if (exclusionsBuilder_ == null) {
        ensureExclusionsIsMutable();
        exclusions_.remove(index);
        onChanged();
      } else {
        exclusionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public com.google.ads.googleads.v10.common.ExclusionSegment.Builder getExclusionsBuilder(
        int index) {
      return getExclusionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder getExclusionsOrBuilder(
        int index) {
      if (exclusionsBuilder_ == null) {
        return exclusions_.get(index);  } else {
        return exclusionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder> 
         getExclusionsOrBuilderList() {
      if (exclusionsBuilder_ != null) {
        return exclusionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exclusions_);
      }
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public com.google.ads.googleads.v10.common.ExclusionSegment.Builder addExclusionsBuilder() {
      return getExclusionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v10.common.ExclusionSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public com.google.ads.googleads.v10.common.ExclusionSegment.Builder addExclusionsBuilder(
        int index) {
      return getExclusionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v10.common.ExclusionSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Audience segment to be excluded.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.ExclusionSegment exclusions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.common.ExclusionSegment.Builder> 
         getExclusionsBuilderList() {
      return getExclusionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.common.ExclusionSegment, com.google.ads.googleads.v10.common.ExclusionSegment.Builder, com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder> 
        getExclusionsFieldBuilder() {
      if (exclusionsBuilder_ == null) {
        exclusionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v10.common.ExclusionSegment, com.google.ads.googleads.v10.common.ExclusionSegment.Builder, com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder>(
                exclusions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        exclusions_ = null;
      }
      return exclusionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.AudienceExclusionDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.AudienceExclusionDimension)
  private static final com.google.ads.googleads.v10.common.AudienceExclusionDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.AudienceExclusionDimension();
  }

  public static com.google.ads.googleads.v10.common.AudienceExclusionDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceExclusionDimension>
      PARSER = new com.google.protobuf.AbstractParser<AudienceExclusionDimension>() {
    @java.lang.Override
    public AudienceExclusionDimension parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceExclusionDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceExclusionDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.AudienceExclusionDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

