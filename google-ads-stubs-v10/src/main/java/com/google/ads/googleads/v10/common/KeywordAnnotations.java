// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * The Annotations for the Keyword plan keywords.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.KeywordAnnotations}
 */
public final class KeywordAnnotations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.KeywordAnnotations)
    KeywordAnnotationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordAnnotations.newBuilder() to construct.
  private KeywordAnnotations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordAnnotations() {
    concepts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordAnnotations();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.KeywordAnnotations.class, com.google.ads.googleads.v10.common.KeywordAnnotations.Builder.class);
  }

  public static final int CONCEPTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v10.common.KeywordConcept> concepts_;
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v10.common.KeywordConcept> getConceptsList() {
    return concepts_;
  }
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v10.common.KeywordConceptOrBuilder> 
      getConceptsOrBuilderList() {
    return concepts_;
  }
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
   */
  @java.lang.Override
  public int getConceptsCount() {
    return concepts_.size();
  }
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordConcept getConcepts(int index) {
    return concepts_.get(index);
  }
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordConceptOrBuilder getConceptsOrBuilder(
      int index) {
    return concepts_.get(index);
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
    for (int i = 0; i < concepts_.size(); i++) {
      output.writeMessage(1, concepts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < concepts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, concepts_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.KeywordAnnotations)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.KeywordAnnotations other = (com.google.ads.googleads.v10.common.KeywordAnnotations) obj;

    if (!getConceptsList()
        .equals(other.getConceptsList())) return false;
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
    if (getConceptsCount() > 0) {
      hash = (37 * hash) + CONCEPTS_FIELD_NUMBER;
      hash = (53 * hash) + getConceptsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordAnnotations parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.KeywordAnnotations prototype) {
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
   * The Annotations for the Keyword plan keywords.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.KeywordAnnotations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.KeywordAnnotations)
      com.google.ads.googleads.v10.common.KeywordAnnotationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordAnnotations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.KeywordAnnotations.class, com.google.ads.googleads.v10.common.KeywordAnnotations.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.KeywordAnnotations.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (conceptsBuilder_ == null) {
        concepts_ = java.util.Collections.emptyList();
      } else {
        concepts_ = null;
        conceptsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordAnnotations_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordAnnotations getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.KeywordAnnotations.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordAnnotations build() {
      com.google.ads.googleads.v10.common.KeywordAnnotations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordAnnotations buildPartial() {
      com.google.ads.googleads.v10.common.KeywordAnnotations result = new com.google.ads.googleads.v10.common.KeywordAnnotations(this);
      int from_bitField0_ = bitField0_;
      if (conceptsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          concepts_ = java.util.Collections.unmodifiableList(concepts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.concepts_ = concepts_;
      } else {
        result.concepts_ = conceptsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.common.KeywordAnnotations) {
        return mergeFrom((com.google.ads.googleads.v10.common.KeywordAnnotations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.KeywordAnnotations other) {
      if (other == com.google.ads.googleads.v10.common.KeywordAnnotations.getDefaultInstance()) return this;
      if (conceptsBuilder_ == null) {
        if (!other.concepts_.isEmpty()) {
          if (concepts_.isEmpty()) {
            concepts_ = other.concepts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConceptsIsMutable();
            concepts_.addAll(other.concepts_);
          }
          onChanged();
        }
      } else {
        if (!other.concepts_.isEmpty()) {
          if (conceptsBuilder_.isEmpty()) {
            conceptsBuilder_.dispose();
            conceptsBuilder_ = null;
            concepts_ = other.concepts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conceptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConceptsFieldBuilder() : null;
          } else {
            conceptsBuilder_.addAllMessages(other.concepts_);
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
              com.google.ads.googleads.v10.common.KeywordConcept m =
                  input.readMessage(
                      com.google.ads.googleads.v10.common.KeywordConcept.parser(),
                      extensionRegistry);
              if (conceptsBuilder_ == null) {
                ensureConceptsIsMutable();
                concepts_.add(m);
              } else {
                conceptsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v10.common.KeywordConcept> concepts_ =
      java.util.Collections.emptyList();
    private void ensureConceptsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        concepts_ = new java.util.ArrayList<com.google.ads.googleads.v10.common.KeywordConcept>(concepts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.common.KeywordConcept, com.google.ads.googleads.v10.common.KeywordConcept.Builder, com.google.ads.googleads.v10.common.KeywordConceptOrBuilder> conceptsBuilder_;

    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.common.KeywordConcept> getConceptsList() {
      if (conceptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(concepts_);
      } else {
        return conceptsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public int getConceptsCount() {
      if (conceptsBuilder_ == null) {
        return concepts_.size();
      } else {
        return conceptsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordConcept getConcepts(int index) {
      if (conceptsBuilder_ == null) {
        return concepts_.get(index);
      } else {
        return conceptsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder setConcepts(
        int index, com.google.ads.googleads.v10.common.KeywordConcept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.set(index, value);
        onChanged();
      } else {
        conceptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder setConcepts(
        int index, com.google.ads.googleads.v10.common.KeywordConcept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.set(index, builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder addConcepts(com.google.ads.googleads.v10.common.KeywordConcept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.add(value);
        onChanged();
      } else {
        conceptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder addConcepts(
        int index, com.google.ads.googleads.v10.common.KeywordConcept value) {
      if (conceptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConceptsIsMutable();
        concepts_.add(index, value);
        onChanged();
      } else {
        conceptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder addConcepts(
        com.google.ads.googleads.v10.common.KeywordConcept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.add(builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder addConcepts(
        int index, com.google.ads.googleads.v10.common.KeywordConcept.Builder builderForValue) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.add(index, builderForValue.build());
        onChanged();
      } else {
        conceptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder addAllConcepts(
        java.lang.Iterable<? extends com.google.ads.googleads.v10.common.KeywordConcept> values) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, concepts_);
        onChanged();
      } else {
        conceptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder clearConcepts() {
      if (conceptsBuilder_ == null) {
        concepts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conceptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public Builder removeConcepts(int index) {
      if (conceptsBuilder_ == null) {
        ensureConceptsIsMutable();
        concepts_.remove(index);
        onChanged();
      } else {
        conceptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordConcept.Builder getConceptsBuilder(
        int index) {
      return getConceptsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordConceptOrBuilder getConceptsOrBuilder(
        int index) {
      if (conceptsBuilder_ == null) {
        return concepts_.get(index);  } else {
        return conceptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v10.common.KeywordConceptOrBuilder> 
         getConceptsOrBuilderList() {
      if (conceptsBuilder_ != null) {
        return conceptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(concepts_);
      }
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordConcept.Builder addConceptsBuilder() {
      return getConceptsFieldBuilder().addBuilder(
          com.google.ads.googleads.v10.common.KeywordConcept.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordConcept.Builder addConceptsBuilder(
        int index) {
      return getConceptsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v10.common.KeywordConcept.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of concepts for the keyword.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v10.common.KeywordConcept concepts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v10.common.KeywordConcept.Builder> 
         getConceptsBuilderList() {
      return getConceptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v10.common.KeywordConcept, com.google.ads.googleads.v10.common.KeywordConcept.Builder, com.google.ads.googleads.v10.common.KeywordConceptOrBuilder> 
        getConceptsFieldBuilder() {
      if (conceptsBuilder_ == null) {
        conceptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v10.common.KeywordConcept, com.google.ads.googleads.v10.common.KeywordConcept.Builder, com.google.ads.googleads.v10.common.KeywordConceptOrBuilder>(
                concepts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        concepts_ = null;
      }
      return conceptsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.KeywordAnnotations)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.KeywordAnnotations)
  private static final com.google.ads.googleads.v10.common.KeywordAnnotations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.KeywordAnnotations();
  }

  public static com.google.ads.googleads.v10.common.KeywordAnnotations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordAnnotations>
      PARSER = new com.google.protobuf.AbstractParser<KeywordAnnotations>() {
    @java.lang.Override
    public KeywordAnnotations parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordAnnotations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordAnnotations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordAnnotations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

