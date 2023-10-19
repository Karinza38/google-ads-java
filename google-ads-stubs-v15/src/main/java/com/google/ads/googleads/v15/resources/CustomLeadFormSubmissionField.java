// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/lead_form_submission_data.proto

package com.google.ads.googleads.v15.resources;

/**
 * <pre>
 * Fields in the submitted custom question
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.resources.CustomLeadFormSubmissionField}
 */
public final class CustomLeadFormSubmissionField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)
    CustomLeadFormSubmissionFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomLeadFormSubmissionField.newBuilder() to construct.
  private CustomLeadFormSubmissionField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomLeadFormSubmissionField() {
    questionText_ = "";
    fieldValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomLeadFormSubmissionField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.class, com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.Builder.class);
  }

  public static final int QUESTION_TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object questionText_ = "";
  /**
   * <pre>
   * Output only. Question text for custom question, maximum number of
   * characters is 300.
   * </pre>
   *
   * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The questionText.
   */
  @java.lang.Override
  public java.lang.String getQuestionText() {
    java.lang.Object ref = questionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      questionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Question text for custom question, maximum number of
   * characters is 300.
   * </pre>
   *
   * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for questionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestionTextBytes() {
    java.lang.Object ref = questionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      questionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldValue_ = "";
  /**
   * <pre>
   * Output only. Field value for custom question response, maximum number of
   * characters is 70.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldValue.
   */
  @java.lang.Override
  public java.lang.String getFieldValue() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Field value for custom question response, maximum number of
   * characters is 70.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for fieldValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldValueBytes() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldValue_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(questionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, questionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(questionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, questionText_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldValue_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField other = (com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField) obj;

    if (!getQuestionText()
        .equals(other.getQuestionText())) return false;
    if (!getFieldValue()
        .equals(other.getFieldValue())) return false;
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
    hash = (37 * hash) + QUESTION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getQuestionText().hashCode();
    hash = (37 * hash) + FIELD_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFieldValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField prototype) {
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
   * Fields in the submitted custom question
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.resources.CustomLeadFormSubmissionField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)
      com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.class, com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.newBuilder()
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
      questionText_ = "";
      fieldValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v15_resources_CustomLeadFormSubmissionField_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField build() {
      com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField buildPartial() {
      com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField result = new com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.questionText_ = questionText_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldValue_ = fieldValue_;
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
      if (other instanceof com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField) {
        return mergeFrom((com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField other) {
      if (other == com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField.getDefaultInstance()) return this;
      if (!other.getQuestionText().isEmpty()) {
        questionText_ = other.questionText_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFieldValue().isEmpty()) {
        fieldValue_ = other.fieldValue_;
        bitField0_ |= 0x00000002;
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
              questionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fieldValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object questionText_ = "";
    /**
     * <pre>
     * Output only. Question text for custom question, maximum number of
     * characters is 300.
     * </pre>
     *
     * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The questionText.
     */
    public java.lang.String getQuestionText() {
      java.lang.Object ref = questionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        questionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Question text for custom question, maximum number of
     * characters is 300.
     * </pre>
     *
     * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for questionText.
     */
    public com.google.protobuf.ByteString
        getQuestionTextBytes() {
      java.lang.Object ref = questionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        questionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Question text for custom question, maximum number of
     * characters is 300.
     * </pre>
     *
     * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The questionText to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      questionText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Question text for custom question, maximum number of
     * characters is 300.
     * </pre>
     *
     * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestionText() {
      questionText_ = getDefaultInstance().getQuestionText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Question text for custom question, maximum number of
     * characters is 300.
     * </pre>
     *
     * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for questionText to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      questionText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fieldValue_ = "";
    /**
     * <pre>
     * Output only. Field value for custom question response, maximum number of
     * characters is 70.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The fieldValue.
     */
    public java.lang.String getFieldValue() {
      java.lang.Object ref = fieldValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Field value for custom question response, maximum number of
     * characters is 70.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for fieldValue.
     */
    public com.google.protobuf.ByteString
        getFieldValueBytes() {
      java.lang.Object ref = fieldValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Field value for custom question response, maximum number of
     * characters is 70.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field value for custom question response, maximum number of
     * characters is 70.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldValue() {
      fieldValue_ = getDefaultInstance().getFieldValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field value for custom question response, maximum number of
     * characters is 70.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.resources.CustomLeadFormSubmissionField)
  private static final com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField();
  }

  public static com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomLeadFormSubmissionField>
      PARSER = new com.google.protobuf.AbstractParser<CustomLeadFormSubmissionField>() {
    @java.lang.Override
    public CustomLeadFormSubmissionField parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomLeadFormSubmissionField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomLeadFormSubmissionField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.resources.CustomLeadFormSubmissionField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

