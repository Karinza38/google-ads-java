// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * A list of audience attributes of a single dimension, including their overlap
 * with a primary attribute, returned as part of a
 * [GenerateAudienceOverlapInsightsResponse][google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.DimensionOverlapResult}
 */
public final class DimensionOverlapResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.DimensionOverlapResult)
    DimensionOverlapResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DimensionOverlapResult.newBuilder() to construct.
  private DimensionOverlapResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DimensionOverlapResult() {
    dimension_ = 0;
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DimensionOverlapResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v18_services_DimensionOverlapResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v18_services_DimensionOverlapResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.DimensionOverlapResult.class, com.google.ads.googleads.v18.services.DimensionOverlapResult.Builder.class);
  }

  public static final int DIMENSION_FIELD_NUMBER = 1;
  private int dimension_ = 0;
  /**
   * <pre>
   * The dimension of all the attributes in this section.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The enum numeric value on the wire for dimension.
   */
  @java.lang.Override public int getDimensionValue() {
    return dimension_;
  }
  /**
   * <pre>
   * The dimension of all the attributes in this section.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
   * @return The dimension.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimension() {
    com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension result = com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.forNumber(dimension_);
    return result == null ? com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.UNRECOGNIZED : result;
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v18.services.AudienceOverlapItem> items_;
  /**
   * <pre>
   * The attributes and their overlap with the primary attribute.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v18.services.AudienceOverlapItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * The attributes and their overlap with the primary attribute.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * The attributes and their overlap with the primary attribute.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * The attributes and their overlap with the primary attribute.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.services.AudienceOverlapItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * The attributes and their overlap with the primary attribute.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    if (dimension_ != com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, dimension_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dimension_ != com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dimension_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.DimensionOverlapResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.DimensionOverlapResult other = (com.google.ads.googleads.v18.services.DimensionOverlapResult) obj;

    if (dimension_ != other.dimension_) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
    hash = (53 * hash) + dimension_;
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.DimensionOverlapResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.DimensionOverlapResult prototype) {
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
   * A list of audience attributes of a single dimension, including their overlap
   * with a primary attribute, returned as part of a
   * [GenerateAudienceOverlapInsightsResponse][google.ads.googleads.v18.services.GenerateAudienceOverlapInsightsResponse].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.DimensionOverlapResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.DimensionOverlapResult)
      com.google.ads.googleads.v18.services.DimensionOverlapResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v18_services_DimensionOverlapResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v18_services_DimensionOverlapResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.DimensionOverlapResult.class, com.google.ads.googleads.v18.services.DimensionOverlapResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.DimensionOverlapResult.newBuilder()
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
      dimension_ = 0;
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v18_services_DimensionOverlapResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.DimensionOverlapResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.DimensionOverlapResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.DimensionOverlapResult build() {
      com.google.ads.googleads.v18.services.DimensionOverlapResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.DimensionOverlapResult buildPartial() {
      com.google.ads.googleads.v18.services.DimensionOverlapResult result = new com.google.ads.googleads.v18.services.DimensionOverlapResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v18.services.DimensionOverlapResult result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.DimensionOverlapResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dimension_ = dimension_;
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
      if (other instanceof com.google.ads.googleads.v18.services.DimensionOverlapResult) {
        return mergeFrom((com.google.ads.googleads.v18.services.DimensionOverlapResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.DimensionOverlapResult other) {
      if (other == com.google.ads.googleads.v18.services.DimensionOverlapResult.getDefaultInstance()) return this;
      if (other.dimension_ != 0) {
        setDimensionValue(other.getDimensionValue());
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000002);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
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
            case 8: {
              dimension_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.ads.googleads.v18.services.AudienceOverlapItem m =
                  input.readMessage(
                      com.google.ads.googleads.v18.services.AudienceOverlapItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
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

    private int dimension_ = 0;
    /**
     * <pre>
     * The dimension of all the attributes in this section.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
     * @return The enum numeric value on the wire for dimension.
     */
    @java.lang.Override public int getDimensionValue() {
      return dimension_;
    }
    /**
     * <pre>
     * The dimension of all the attributes in this section.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
     * @param value The enum numeric value on the wire for dimension to set.
     * @return This builder for chaining.
     */
    public Builder setDimensionValue(int value) {
      dimension_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The dimension of all the attributes in this section.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
     * @return The dimension.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimension() {
      com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension result = com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.forNumber(dimension_);
      return result == null ? com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The dimension of all the attributes in this section.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
     * @param value The dimension to set.
     * @return This builder for chaining.
     */
    public Builder setDimension(com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      dimension_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The dimension of all the attributes in this section.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimension = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDimension() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dimension_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v18.services.AudienceOverlapItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        items_ = new java.util.ArrayList<com.google.ads.googleads.v18.services.AudienceOverlapItem>(items_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.services.AudienceOverlapItem, com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder, com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.services.AudienceOverlapItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public com.google.ads.googleads.v18.services.AudienceOverlapItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.ads.googleads.v18.services.AudienceOverlapItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder setItems(
        int index, com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder addItems(com.google.ads.googleads.v18.services.AudienceOverlapItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.ads.googleads.v18.services.AudienceOverlapItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder addItems(
        com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder addItems(
        int index, com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.google.ads.googleads.v18.services.AudienceOverlapItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.google.ads.googleads.v18.services.AudienceOverlapItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v18.services.AudienceOverlapItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The attributes and their overlap with the primary attribute.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.AudienceOverlapItem items = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.services.AudienceOverlapItem, com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder, com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v18.services.AudienceOverlapItem, com.google.ads.googleads.v18.services.AudienceOverlapItem.Builder, com.google.ads.googleads.v18.services.AudienceOverlapItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.DimensionOverlapResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.DimensionOverlapResult)
  private static final com.google.ads.googleads.v18.services.DimensionOverlapResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.DimensionOverlapResult();
  }

  public static com.google.ads.googleads.v18.services.DimensionOverlapResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DimensionOverlapResult>
      PARSER = new com.google.protobuf.AbstractParser<DimensionOverlapResult>() {
    @java.lang.Override
    public DimensionOverlapResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<DimensionOverlapResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DimensionOverlapResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.DimensionOverlapResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

