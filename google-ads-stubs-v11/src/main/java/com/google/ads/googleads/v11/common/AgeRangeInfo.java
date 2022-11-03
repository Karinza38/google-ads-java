// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/criteria.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * An age range criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.AgeRangeInfo}
 */
public final class AgeRangeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.AgeRangeInfo)
    AgeRangeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeRangeInfo.newBuilder() to construct.
  private AgeRangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeRangeInfo() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeRangeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_AgeRangeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_AgeRangeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.AgeRangeInfo.class, com.google.ads.googleads.v11.common.AgeRangeInfo.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of the age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of the age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType result = com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.UNRECOGNIZED : result;
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
    if (type_ != com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.AgeRangeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.AgeRangeInfo other = (com.google.ads.googleads.v11.common.AgeRangeInfo) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.AgeRangeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.AgeRangeInfo prototype) {
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
   * An age range criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.AgeRangeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.AgeRangeInfo)
      com.google.ads.googleads.v11.common.AgeRangeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_AgeRangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_AgeRangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.AgeRangeInfo.class, com.google.ads.googleads.v11.common.AgeRangeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.AgeRangeInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.CriteriaProto.internal_static_google_ads_googleads_v11_common_AgeRangeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeRangeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.AgeRangeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeRangeInfo build() {
      com.google.ads.googleads.v11.common.AgeRangeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.AgeRangeInfo buildPartial() {
      com.google.ads.googleads.v11.common.AgeRangeInfo result = new com.google.ads.googleads.v11.common.AgeRangeInfo(this);
      result.type_ = type_;
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
      if (other instanceof com.google.ads.googleads.v11.common.AgeRangeInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.AgeRangeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.AgeRangeInfo other) {
      if (other == com.google.ads.googleads.v11.common.AgeRangeInfo.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              type_ = input.readEnum();

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

    private int type_ = 0;
    /**
     * <pre>
     * Type of the age range.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the age range.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the age range.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType result = com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the age range.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the age range.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.AgeRangeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.AgeRangeInfo)
  private static final com.google.ads.googleads.v11.common.AgeRangeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.AgeRangeInfo();
  }

  public static com.google.ads.googleads.v11.common.AgeRangeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeRangeInfo>
      PARSER = new com.google.protobuf.AbstractParser<AgeRangeInfo>() {
    @java.lang.Override
    public AgeRangeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgeRangeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeRangeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.AgeRangeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

