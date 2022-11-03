// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/user_lists.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * A rule item composed of a number operation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.UserListNumberRuleItemInfo}
 */
public final class UserListNumberRuleItemInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.UserListNumberRuleItemInfo)
    UserListNumberRuleItemInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListNumberRuleItemInfo.newBuilder() to construct.
  private UserListNumberRuleItemInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListNumberRuleItemInfo() {
    operator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListNumberRuleItemInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.common.UserListsProto.internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.UserListsProto.internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.class, com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_;
  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator getOperator() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator result = com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.valueOf(operator_);
    return result == null ? com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private double value_;
  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>optional double value = 3;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>optional double value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
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
    if (operator_ != com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, value_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo other = (com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo) obj;

    if (operator_ != other.operator_) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (java.lang.Double.doubleToLongBits(getValue())
          != java.lang.Double.doubleToLongBits(
              other.getValue())) return false;
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getValue()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo prototype) {
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
   * A rule item composed of a number operation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.UserListNumberRuleItemInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.UserListNumberRuleItemInfo)
      com.google.ads.googleads.v10.common.UserListNumberRuleItemInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.UserListsProto.internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.UserListsProto.internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.class, com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      operator_ = 0;

      value_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.UserListsProto.internal_static_google_ads_googleads_v10_common_UserListNumberRuleItemInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo build() {
      com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo buildPartial() {
      com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo result = new com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.operator_ = operator_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo) {
        return mergeFrom((com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo other) {
      if (other == com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasValue()) {
        setValue(other.getValue());
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
              operator_ = input.readEnum();

              break;
            } // case 8
            case 25: {
              value_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 25
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

    private int operator_ = 0;
    /**
     * <pre>
     * Number comparison operator.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * Number comparison operator.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number comparison operator.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator getOperator() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator result = com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.valueOf(operator_);
      return result == null ? com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Number comparison operator.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number comparison operator.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      
      operator_ = 0;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <pre>
     * Number value to be compared with the variable.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>optional double value = 3;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number value to be compared with the variable.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>optional double value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <pre>
     * Number value to be compared with the variable.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>optional double value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number value to be compared with the variable.
     * This field is required and must be populated when creating a new number
     * rule item.
     * </pre>
     *
     * <code>optional double value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.UserListNumberRuleItemInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.UserListNumberRuleItemInfo)
  private static final com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo();
  }

  public static com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListNumberRuleItemInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListNumberRuleItemInfo>() {
    @java.lang.Override
    public UserListNumberRuleItemInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListNumberRuleItemInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListNumberRuleItemInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.UserListNumberRuleItemInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

