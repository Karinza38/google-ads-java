// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/enums/asset_link_primary_status.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.enums;

/**
 * <pre>
 * Provides the primary status of an asset link.
 * For example: a sitelink may be paused for a particular campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum}
 */
public final class AssetLinkPrimaryStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)
    AssetLinkPrimaryStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetLinkPrimaryStatusEnum.newBuilder() to construct.
  private AssetLinkPrimaryStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetLinkPrimaryStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetLinkPrimaryStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AssetLinkPrimaryStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AssetLinkPrimaryStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.class, com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum Provides insight into why an asset is not serving or not serving
   * at full capacity for a particular link level. There could be one status
   * with multiple reasons. For example, a sitelink might be paused by the user,
   * but also limited in serving due to violation of an alcohol policy. In
   * this case, the PrimaryStatus will be returned as PAUSED, since the asset's
   * effective status is determined by its paused state.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus}
   */
  public enum AssetLinkPrimaryStatus
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
     * The asset is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    ELIGIBLE(2),
    /**
     * <pre>
     * The user-specified asset link status is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    PAUSED(3),
    /**
     * <pre>
     * The user-specified asset link status is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    REMOVED(4),
    /**
     * <pre>
     * The asset may serve in the future.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    PENDING(5),
    /**
     * <pre>
     * The asset is serving in a partial capacity.
     * </pre>
     *
     * <code>LIMITED = 6;</code>
     */
    LIMITED(6),
    /**
     * <pre>
     * The asset is not eligible to serve.
     * </pre>
     *
     * <code>NOT_ELIGIBLE = 7;</code>
     */
    NOT_ELIGIBLE(7),
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
     * The asset is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    public static final int ELIGIBLE_VALUE = 2;
    /**
     * <pre>
     * The user-specified asset link status is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    public static final int PAUSED_VALUE = 3;
    /**
     * <pre>
     * The user-specified asset link status is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    public static final int REMOVED_VALUE = 4;
    /**
     * <pre>
     * The asset may serve in the future.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    public static final int PENDING_VALUE = 5;
    /**
     * <pre>
     * The asset is serving in a partial capacity.
     * </pre>
     *
     * <code>LIMITED = 6;</code>
     */
    public static final int LIMITED_VALUE = 6;
    /**
     * <pre>
     * The asset is not eligible to serve.
     * </pre>
     *
     * <code>NOT_ELIGIBLE = 7;</code>
     */
    public static final int NOT_ELIGIBLE_VALUE = 7;


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
    public static AssetLinkPrimaryStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetLinkPrimaryStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ELIGIBLE;
        case 3: return PAUSED;
        case 4: return REMOVED;
        case 5: return PENDING;
        case 6: return LIMITED;
        case 7: return NOT_ELIGIBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetLinkPrimaryStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetLinkPrimaryStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetLinkPrimaryStatus>() {
            public AssetLinkPrimaryStatus findValueByNumber(int number) {
              return AssetLinkPrimaryStatus.forNumber(number);
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
      return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetLinkPrimaryStatus[] VALUES = values();

    public static AssetLinkPrimaryStatus valueOf(
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

    private AssetLinkPrimaryStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum other = (com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum) obj;

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

  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum prototype) {
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
   * Provides the primary status of an asset link.
   * For example: a sitelink may be paused for a particular campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)
      com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AssetLinkPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AssetLinkPrimaryStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.class, com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AssetLinkPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum build() {
      com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum buildPartial() {
      com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum result = new com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum other) {
      if (other == com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum)
  private static final com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum();
  }

  public static com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetLinkPrimaryStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetLinkPrimaryStatusEnum>() {
    @java.lang.Override
    public AssetLinkPrimaryStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetLinkPrimaryStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetLinkPrimaryStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.enums.AssetLinkPrimaryStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

