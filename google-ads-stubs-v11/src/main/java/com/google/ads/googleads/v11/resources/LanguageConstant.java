// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/language_constant.proto

package com.google.ads.googleads.v11.resources;

/**
 * <pre>
 * A language.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.resources.LanguageConstant}
 */
public final class LanguageConstant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.resources.LanguageConstant)
    LanguageConstantOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageConstant.newBuilder() to construct.
  private LanguageConstant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageConstant() {
    resourceName_ = "";
    code_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanguageConstant();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.resources.LanguageConstantProto.internal_static_google_ads_googleads_v11_resources_LanguageConstant_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.resources.LanguageConstantProto.internal_static_google_ads_googleads_v11_resources_LanguageConstant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.resources.LanguageConstant.class, com.google.ads.googleads.v11.resources.LanguageConstant.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 6;
  private long id_;
  /**
   * <pre>
   * Output only. The ID of the language constant.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The ID of the language constant.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CODE_FIELD_NUMBER = 7;
  private volatile java.lang.Object code_;
  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the code field is set.
   */
  @java.lang.Override
  public boolean hasCode() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 8;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGETABLE_FIELD_NUMBER = 9;
  private boolean targetable_;
  /**
   * <pre>
   * Output only. Whether the language is targetable.
   * </pre>
   *
   * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetable field is set.
   */
  @java.lang.Override
  public boolean hasTargetable() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Output only. Whether the language is targetable.
   * </pre>
   *
   * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetable.
   */
  @java.lang.Override
  public boolean getTargetable() {
    return targetable_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(6, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, code_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, name_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(9, targetable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, code_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, name_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, targetable_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.resources.LanguageConstant)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.resources.LanguageConstant other = (com.google.ads.googleads.v11.resources.LanguageConstant) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasCode() != other.hasCode()) return false;
    if (hasCode()) {
      if (!getCode()
          .equals(other.getCode())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasTargetable() != other.hasTargetable()) return false;
    if (hasTargetable()) {
      if (getTargetable()
          != other.getTargetable()) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasCode()) {
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasTargetable()) {
      hash = (37 * hash) + TARGETABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getTargetable());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.resources.LanguageConstant parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.resources.LanguageConstant prototype) {
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
   * A language.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.resources.LanguageConstant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.resources.LanguageConstant)
      com.google.ads.googleads.v11.resources.LanguageConstantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.resources.LanguageConstantProto.internal_static_google_ads_googleads_v11_resources_LanguageConstant_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.resources.LanguageConstantProto.internal_static_google_ads_googleads_v11_resources_LanguageConstant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.resources.LanguageConstant.class, com.google.ads.googleads.v11.resources.LanguageConstant.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.resources.LanguageConstant.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      targetable_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.resources.LanguageConstantProto.internal_static_google_ads_googleads_v11_resources_LanguageConstant_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.LanguageConstant getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.resources.LanguageConstant.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.LanguageConstant build() {
      com.google.ads.googleads.v11.resources.LanguageConstant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.resources.LanguageConstant buildPartial() {
      com.google.ads.googleads.v11.resources.LanguageConstant result = new com.google.ads.googleads.v11.resources.LanguageConstant(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.code_ = code_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.targetable_ = targetable_;
        to_bitField0_ |= 0x00000008;
      }
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
      if (other instanceof com.google.ads.googleads.v11.resources.LanguageConstant) {
        return mergeFrom((com.google.ads.googleads.v11.resources.LanguageConstant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.resources.LanguageConstant other) {
      if (other == com.google.ads.googleads.v11.resources.LanguageConstant.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasCode()) {
        bitField0_ |= 0x00000002;
        code_ = other.code_;
        onChanged();
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000004;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasTargetable()) {
        setTargetable(other.getTargetable());
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
              resourceName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 48: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 48
            case 58: {
              code_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 58
            case 66: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 66
            case 72: {
              targetable_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 72
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the language constant.
     * Language constant resource names have the form:
     * `languageConstants/{criterion_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the language constant.
     * Language constant resource names have the form:
     * `languageConstants/{criterion_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the language constant.
     * Language constant resource names have the form:
     * `languageConstants/{criterion_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the language constant.
     * Language constant resource names have the form:
     * `languageConstants/{criterion_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the language constant.
     * Language constant resource names have the form:
     * `languageConstants/{criterion_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * Output only. The ID of the language constant.
     * </pre>
     *
     * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The ID of the language constant.
     * </pre>
     *
     * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Output only. The ID of the language constant.
     * </pre>
     *
     * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the language constant.
     * </pre>
     *
     * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the code field is set.
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
     * </pre>
     *
     * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      code_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000004);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The full name of the language in English, for example, "English (US)",
     * "Spanish", etc.
     * </pre>
     *
     * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      name_ = value;
      onChanged();
      return this;
    }

    private boolean targetable_ ;
    /**
     * <pre>
     * Output only. Whether the language is targetable.
     * </pre>
     *
     * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the targetable field is set.
     */
    @java.lang.Override
    public boolean hasTargetable() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Output only. Whether the language is targetable.
     * </pre>
     *
     * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The targetable.
     */
    @java.lang.Override
    public boolean getTargetable() {
      return targetable_;
    }
    /**
     * <pre>
     * Output only. Whether the language is targetable.
     * </pre>
     *
     * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The targetable to set.
     * @return This builder for chaining.
     */
    public Builder setTargetable(boolean value) {
      bitField0_ |= 0x00000008;
      targetable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Whether the language is targetable.
     * </pre>
     *
     * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetable() {
      bitField0_ = (bitField0_ & ~0x00000008);
      targetable_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.resources.LanguageConstant)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.resources.LanguageConstant)
  private static final com.google.ads.googleads.v11.resources.LanguageConstant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.resources.LanguageConstant();
  }

  public static com.google.ads.googleads.v11.resources.LanguageConstant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageConstant>
      PARSER = new com.google.protobuf.AbstractParser<LanguageConstant>() {
    @java.lang.Override
    public LanguageConstant parsePartialFrom(
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

  public static com.google.protobuf.Parser<LanguageConstant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageConstant> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.resources.LanguageConstant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

