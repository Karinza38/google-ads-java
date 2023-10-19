// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/asset_link_primary_status_reason.proto

package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Provides the reason of a primary status.
 * For example: a sitelink may be paused for a particular campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum}
 */
public final class AssetLinkPrimaryStatusReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)
    AssetLinkPrimaryStatusReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetLinkPrimaryStatusReasonEnum.newBuilder() to construct.
  private AssetLinkPrimaryStatusReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetLinkPrimaryStatusReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetLinkPrimaryStatusReasonEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.internal_static_google_ads_googleads_v15_enums_AssetLinkPrimaryStatusReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.internal_static_google_ads_googleads_v15_enums_AssetLinkPrimaryStatusReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.class, com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum Provides insight into why an asset is not serving or not serving
   * at full capacity for a particular link level. These reasons are
   * aggregated to determine a final PrimaryStatus.
   * For example, a sitelink might be paused by the user,
   * but also limited in serving due to violation of an alcohol policy. In
   * this case, the PrimaryStatus will be returned as PAUSED, since the asset's
   * effective status is determined by its paused state.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason}
   */
  public enum AssetLinkPrimaryStatusReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The asset is paused for its linked rollup level. Contributes to a
     * PrimaryStatus of PAUSED.
     * </pre>
     *
     * <code>ASSET_LINK_PAUSED = 2;</code>
     */
    ASSET_LINK_PAUSED(2),
    /**
     * <pre>
     * The asset is removed for its linked rollup level. Contributes to a
     * PrimaryStatus of REMOVED.
     * </pre>
     *
     * <code>ASSET_LINK_REMOVED = 3;</code>
     */
    ASSET_LINK_REMOVED(3),
    /**
     * <pre>
     * The asset has been marked as disapproved. Contributes to a PrimaryStatus
     * of NOT_ELIGIBLE
     * </pre>
     *
     * <code>ASSET_DISAPPROVED = 4;</code>
     */
    ASSET_DISAPPROVED(4),
    /**
     * <pre>
     * The asset has not completed policy review. Contributes to a PrimaryStatus
     * of PENDING.
     * </pre>
     *
     * <code>ASSET_UNDER_REVIEW = 5;</code>
     */
    ASSET_UNDER_REVIEW(5),
    /**
     * <pre>
     * The asset is approved with policies applied. Contributes to a
     * PrimaryStatus of LIMITED.
     * </pre>
     *
     * <code>ASSET_APPROVED_LABELED = 6;</code>
     */
    ASSET_APPROVED_LABELED(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The asset is paused for its linked rollup level. Contributes to a
     * PrimaryStatus of PAUSED.
     * </pre>
     *
     * <code>ASSET_LINK_PAUSED = 2;</code>
     */
    public static final int ASSET_LINK_PAUSED_VALUE = 2;
    /**
     * <pre>
     * The asset is removed for its linked rollup level. Contributes to a
     * PrimaryStatus of REMOVED.
     * </pre>
     *
     * <code>ASSET_LINK_REMOVED = 3;</code>
     */
    public static final int ASSET_LINK_REMOVED_VALUE = 3;
    /**
     * <pre>
     * The asset has been marked as disapproved. Contributes to a PrimaryStatus
     * of NOT_ELIGIBLE
     * </pre>
     *
     * <code>ASSET_DISAPPROVED = 4;</code>
     */
    public static final int ASSET_DISAPPROVED_VALUE = 4;
    /**
     * <pre>
     * The asset has not completed policy review. Contributes to a PrimaryStatus
     * of PENDING.
     * </pre>
     *
     * <code>ASSET_UNDER_REVIEW = 5;</code>
     */
    public static final int ASSET_UNDER_REVIEW_VALUE = 5;
    /**
     * <pre>
     * The asset is approved with policies applied. Contributes to a
     * PrimaryStatus of LIMITED.
     * </pre>
     *
     * <code>ASSET_APPROVED_LABELED = 6;</code>
     */
    public static final int ASSET_APPROVED_LABELED_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssetLinkPrimaryStatusReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetLinkPrimaryStatusReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ASSET_LINK_PAUSED;
        case 3: return ASSET_LINK_REMOVED;
        case 4: return ASSET_DISAPPROVED;
        case 5: return ASSET_UNDER_REVIEW;
        case 6: return ASSET_APPROVED_LABELED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetLinkPrimaryStatusReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetLinkPrimaryStatusReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetLinkPrimaryStatusReason>() {
            public AssetLinkPrimaryStatusReason findValueByNumber(int number) {
              return AssetLinkPrimaryStatusReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetLinkPrimaryStatusReason[] VALUES = values();

    public static AssetLinkPrimaryStatusReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AssetLinkPrimaryStatusReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum other = (com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum prototype) {
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
   * Provides the reason of a primary status.
   * For example: a sitelink may be paused for a particular campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)
      com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.internal_static_google_ads_googleads_v15_enums_AssetLinkPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.internal_static_google_ads_googleads_v15_enums_AssetLinkPrimaryStatusReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.class, com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonProto.internal_static_google_ads_googleads_v15_enums_AssetLinkPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum build() {
      com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum buildPartial() {
      com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum result = new com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum other) {
      if (other == com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum)
  private static final com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum();
  }

  public static com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetLinkPrimaryStatusReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetLinkPrimaryStatusReasonEnum>() {
    @java.lang.Override
    public AssetLinkPrimaryStatusReasonEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetLinkPrimaryStatusReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetLinkPrimaryStatusReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

