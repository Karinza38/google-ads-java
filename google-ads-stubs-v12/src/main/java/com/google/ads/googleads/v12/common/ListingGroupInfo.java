// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/criteria.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * A listing group criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.ListingGroupInfo}
 */
public final class ListingGroupInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.ListingGroupInfo)
    ListingGroupInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListingGroupInfo.newBuilder() to construct.
  private ListingGroupInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListingGroupInfo() {
    type_ = 0;
    parentAdGroupCriterion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListingGroupInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ListingGroupInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ListingGroupInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.ListingGroupInfo.class, com.google.ads.googleads.v12.common.ListingGroupInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType result = com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.UNRECOGNIZED : result;
  }

  public static final int CASE_VALUE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.common.ListingDimensionInfo caseValue_;
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
   * @return Whether the caseValue field is set.
   */
  @java.lang.Override
  public boolean hasCaseValue() {
    return caseValue_ != null;
  }
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
   * @return The caseValue.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.ListingDimensionInfo getCaseValue() {
    return caseValue_ == null ? com.google.ads.googleads.v12.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
  }
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.ListingDimensionInfoOrBuilder getCaseValueOrBuilder() {
    return getCaseValue();
  }

  public static final int PARENT_AD_GROUP_CRITERION_FIELD_NUMBER = 4;
  private volatile java.lang.Object parentAdGroupCriterion_;
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>optional string parent_ad_group_criterion = 4;</code>
   * @return Whether the parentAdGroupCriterion field is set.
   */
  @java.lang.Override
  public boolean hasParentAdGroupCriterion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>optional string parent_ad_group_criterion = 4;</code>
   * @return The parentAdGroupCriterion.
   */
  @java.lang.Override
  public java.lang.String getParentAdGroupCriterion() {
    java.lang.Object ref = parentAdGroupCriterion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentAdGroupCriterion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>optional string parent_ad_group_criterion = 4;</code>
   * @return The bytes for parentAdGroupCriterion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentAdGroupCriterionBytes() {
    java.lang.Object ref = parentAdGroupCriterion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentAdGroupCriterion_ = b;
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
    if (type_ != com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (caseValue_ != null) {
      output.writeMessage(2, getCaseValue());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parentAdGroupCriterion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (caseValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCaseValue());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parentAdGroupCriterion_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.ListingGroupInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.ListingGroupInfo other = (com.google.ads.googleads.v12.common.ListingGroupInfo) obj;

    if (type_ != other.type_) return false;
    if (hasCaseValue() != other.hasCaseValue()) return false;
    if (hasCaseValue()) {
      if (!getCaseValue()
          .equals(other.getCaseValue())) return false;
    }
    if (hasParentAdGroupCriterion() != other.hasParentAdGroupCriterion()) return false;
    if (hasParentAdGroupCriterion()) {
      if (!getParentAdGroupCriterion()
          .equals(other.getParentAdGroupCriterion())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasCaseValue()) {
      hash = (37 * hash) + CASE_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getCaseValue().hashCode();
    }
    if (hasParentAdGroupCriterion()) {
      hash = (37 * hash) + PARENT_AD_GROUP_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getParentAdGroupCriterion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ListingGroupInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.ListingGroupInfo prototype) {
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
   * A listing group criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.ListingGroupInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.ListingGroupInfo)
      com.google.ads.googleads.v12.common.ListingGroupInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ListingGroupInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ListingGroupInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.ListingGroupInfo.class, com.google.ads.googleads.v12.common.ListingGroupInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.ListingGroupInfo.newBuilder()
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

      if (caseValueBuilder_ == null) {
        caseValue_ = null;
      } else {
        caseValue_ = null;
        caseValueBuilder_ = null;
      }
      parentAdGroupCriterion_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_ListingGroupInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ListingGroupInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.ListingGroupInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ListingGroupInfo build() {
      com.google.ads.googleads.v12.common.ListingGroupInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ListingGroupInfo buildPartial() {
      com.google.ads.googleads.v12.common.ListingGroupInfo result = new com.google.ads.googleads.v12.common.ListingGroupInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      if (caseValueBuilder_ == null) {
        result.caseValue_ = caseValue_;
      } else {
        result.caseValue_ = caseValueBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.parentAdGroupCriterion_ = parentAdGroupCriterion_;
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
      if (other instanceof com.google.ads.googleads.v12.common.ListingGroupInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.ListingGroupInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.ListingGroupInfo other) {
      if (other == com.google.ads.googleads.v12.common.ListingGroupInfo.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasCaseValue()) {
        mergeCaseValue(other.getCaseValue());
      }
      if (other.hasParentAdGroupCriterion()) {
        bitField0_ |= 0x00000001;
        parentAdGroupCriterion_ = other.parentAdGroupCriterion_;
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
            case 8: {
              type_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getCaseValueFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 34: {
              parentAdGroupCriterion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
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

    private int type_ = 0;
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
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
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType result = com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the listing group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.common.ListingDimensionInfo caseValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.ListingDimensionInfo, com.google.ads.googleads.v12.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v12.common.ListingDimensionInfoOrBuilder> caseValueBuilder_;
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     * @return Whether the caseValue field is set.
     */
    public boolean hasCaseValue() {
      return caseValueBuilder_ != null || caseValue_ != null;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     * @return The caseValue.
     */
    public com.google.ads.googleads.v12.common.ListingDimensionInfo getCaseValue() {
      if (caseValueBuilder_ == null) {
        return caseValue_ == null ? com.google.ads.googleads.v12.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
      } else {
        return caseValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder setCaseValue(com.google.ads.googleads.v12.common.ListingDimensionInfo value) {
      if (caseValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        caseValue_ = value;
        onChanged();
      } else {
        caseValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder setCaseValue(
        com.google.ads.googleads.v12.common.ListingDimensionInfo.Builder builderForValue) {
      if (caseValueBuilder_ == null) {
        caseValue_ = builderForValue.build();
        onChanged();
      } else {
        caseValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder mergeCaseValue(com.google.ads.googleads.v12.common.ListingDimensionInfo value) {
      if (caseValueBuilder_ == null) {
        if (caseValue_ != null) {
          caseValue_ =
            com.google.ads.googleads.v12.common.ListingDimensionInfo.newBuilder(caseValue_).mergeFrom(value).buildPartial();
        } else {
          caseValue_ = value;
        }
        onChanged();
      } else {
        caseValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public Builder clearCaseValue() {
      if (caseValueBuilder_ == null) {
        caseValue_ = null;
        onChanged();
      } else {
        caseValue_ = null;
        caseValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public com.google.ads.googleads.v12.common.ListingDimensionInfo.Builder getCaseValueBuilder() {
      
      onChanged();
      return getCaseValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    public com.google.ads.googleads.v12.common.ListingDimensionInfoOrBuilder getCaseValueOrBuilder() {
      if (caseValueBuilder_ != null) {
        return caseValueBuilder_.getMessageOrBuilder();
      } else {
        return caseValue_ == null ?
            com.google.ads.googleads.v12.common.ListingDimensionInfo.getDefaultInstance() : caseValue_;
      }
    }
    /**
     * <pre>
     * Dimension value with which this listing group is refining its parent.
     * Undefined for the root group.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.ListingDimensionInfo case_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.ListingDimensionInfo, com.google.ads.googleads.v12.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v12.common.ListingDimensionInfoOrBuilder> 
        getCaseValueFieldBuilder() {
      if (caseValueBuilder_ == null) {
        caseValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.ListingDimensionInfo, com.google.ads.googleads.v12.common.ListingDimensionInfo.Builder, com.google.ads.googleads.v12.common.ListingDimensionInfoOrBuilder>(
                getCaseValue(),
                getParentForChildren(),
                isClean());
        caseValue_ = null;
      }
      return caseValueBuilder_;
    }

    private java.lang.Object parentAdGroupCriterion_ = "";
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @return Whether the parentAdGroupCriterion field is set.
     */
    public boolean hasParentAdGroupCriterion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @return The parentAdGroupCriterion.
     */
    public java.lang.String getParentAdGroupCriterion() {
      java.lang.Object ref = parentAdGroupCriterion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentAdGroupCriterion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @return The bytes for parentAdGroupCriterion.
     */
    public com.google.protobuf.ByteString
        getParentAdGroupCriterionBytes() {
      java.lang.Object ref = parentAdGroupCriterion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentAdGroupCriterion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @param value The parentAdGroupCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setParentAdGroupCriterion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      parentAdGroupCriterion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearParentAdGroupCriterion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parentAdGroupCriterion_ = getDefaultInstance().getParentAdGroupCriterion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of ad group criterion which is the parent listing group
     * subdivision. Null for the root group.
     * </pre>
     *
     * <code>optional string parent_ad_group_criterion = 4;</code>
     * @param value The bytes for parentAdGroupCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setParentAdGroupCriterionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      parentAdGroupCriterion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.ListingGroupInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.ListingGroupInfo)
  private static final com.google.ads.googleads.v12.common.ListingGroupInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.ListingGroupInfo();
  }

  public static com.google.ads.googleads.v12.common.ListingGroupInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListingGroupInfo>
      PARSER = new com.google.protobuf.AbstractParser<ListingGroupInfo>() {
    @java.lang.Override
    public ListingGroupInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListingGroupInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListingGroupInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.ListingGroupInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

