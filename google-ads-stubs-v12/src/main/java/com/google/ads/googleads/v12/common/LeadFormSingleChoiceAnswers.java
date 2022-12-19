// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Defines possible answers for a single choice question, usually presented as
 * a single-choice drop-down list.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers}
 */
public final class LeadFormSingleChoiceAnswers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)
    LeadFormSingleChoiceAnswersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormSingleChoiceAnswers.newBuilder() to construct.
  private LeadFormSingleChoiceAnswers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormSingleChoiceAnswers() {
    answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormSingleChoiceAnswers();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormSingleChoiceAnswers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormSingleChoiceAnswers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.class, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder.class);
  }

  public static final int ANSWERS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList answers_;
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @return A list containing the answers.
   */
  public com.google.protobuf.ProtocolStringList
      getAnswersList() {
    return answers_;
  }
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @return The count of answers.
   */
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  public java.lang.String getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  public com.google.protobuf.ByteString
      getAnswersBytes(int index) {
    return answers_.getByteString(index);
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
    for (int i = 0; i < answers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, answers_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < answers_.size(); i++) {
        dataSize += computeStringSizeNoTag(answers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnswersList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers other = (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) obj;

    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
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
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers prototype) {
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
   * Defines possible answers for a single choice question, usually presented as
   * a single-choice drop-down list.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)
      com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormSingleChoiceAnswers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormSingleChoiceAnswers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.class, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormSingleChoiceAnswers_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers build() {
      com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers buildPartial() {
      com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers result = new com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        answers_ = answers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.answers_ = answers_;
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
      if (other instanceof com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) {
        return mergeFrom((com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers other) {
      if (other == com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance()) return this;
      if (!other.answers_.isEmpty()) {
        if (answers_.isEmpty()) {
          answers_ = other.answers_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnswersIsMutable();
          answers_.addAll(other.answers_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAnswersIsMutable();
              answers_.add(s);
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

    private com.google.protobuf.LazyStringList answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answers_ = new com.google.protobuf.LazyStringArrayList(answers_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @return A list containing the answers.
     */
    public com.google.protobuf.ProtocolStringList
        getAnswersList() {
      return answers_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @return The count of answers.
     */
    public int getAnswersCount() {
      return answers_.size();
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param index The index of the element to return.
     * @return The answers at the given index.
     */
    public java.lang.String getAnswers(int index) {
      return answers_.get(index);
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the answers at the given index.
     */
    public com.google.protobuf.ByteString
        getAnswersBytes(int index) {
      return answers_.getByteString(index);
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param index The index to set the value at.
     * @param value The answers to set.
     * @return This builder for chaining.
     */
    public Builder setAnswers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param value The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param values The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswers(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnswersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answers_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswers() {
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of choices for a single question field. The order of entries defines
     * UI order. Minimum of 2 answers required and maximum of 12 allowed.
     * </pre>
     *
     * <code>repeated string answers = 1;</code>
     * @param value The bytes of the answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAnswersIsMutable();
      answers_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers)
  private static final com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers();
  }

  public static com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormSingleChoiceAnswers>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormSingleChoiceAnswers>() {
    @java.lang.Override
    public LeadFormSingleChoiceAnswers parsePartialFrom(
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

  public static com.google.protobuf.Parser<LeadFormSingleChoiceAnswers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormSingleChoiceAnswers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
