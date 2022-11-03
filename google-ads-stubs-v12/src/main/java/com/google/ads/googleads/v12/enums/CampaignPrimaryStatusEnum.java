// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/enums/campaign_primary_status.proto

package com.google.ads.googleads.v12.enums;

/**
 * <pre>
 * Container for enum describing possible campaign primary status.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum}
 */
public final class CampaignPrimaryStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)
    CampaignPrimaryStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignPrimaryStatusEnum.newBuilder() to construct.
  private CampaignPrimaryStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignPrimaryStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignPrimaryStatusEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusProto.internal_static_google_ads_googleads_v12_enums_CampaignPrimaryStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusProto.internal_static_google_ads_googleads_v12_enums_CampaignPrimaryStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.class, com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the possible campaign primary status. Provides insight into
   * why a campaign is not serving or not serving optimally. Modification to the
   * campaign and its related entities might take a while to be reflected in
   * this status.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.CampaignPrimaryStatus}
   */
  public enum CampaignPrimaryStatus
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
     * The campaign is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    ELIGIBLE(2),
    /**
     * <pre>
     * The user-specified campaign status is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    PAUSED(3),
    /**
     * <pre>
     * The user-specified campaign status is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    REMOVED(4),
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed.
     * </pre>
     *
     * <code>ENDED = 5;</code>
     */
    ENDED(5),
    /**
     * <pre>
     * The campaign may serve in the future.
     * </pre>
     *
     * <code>PENDING = 6;</code>
     */
    PENDING(6),
    /**
     * <pre>
     * The campaign or its associated entities have incorrect user-specified
     * settings.
     * </pre>
     *
     * <code>MISCONFIGURED = 7;</code>
     */
    MISCONFIGURED(7),
    /**
     * <pre>
     * The campaign or its associated entities are limited by user-specified
     * settings.
     * </pre>
     *
     * <code>LIMITED = 8;</code>
     */
    LIMITED(8),
    /**
     * <pre>
     * The automated bidding system is adjusting to user-specified changes to
     * the campaign or associated entities.
     * </pre>
     *
     * <code>LEARNING = 9;</code>
     */
    LEARNING(9),
    /**
     * <pre>
     * The campaign is not eligible to serve.
     * </pre>
     *
     * <code>NOT_ELIGIBLE = 10;</code>
     */
    NOT_ELIGIBLE(10),
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
     * The campaign is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    public static final int ELIGIBLE_VALUE = 2;
    /**
     * <pre>
     * The user-specified campaign status is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    public static final int PAUSED_VALUE = 3;
    /**
     * <pre>
     * The user-specified campaign status is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    public static final int REMOVED_VALUE = 4;
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed.
     * </pre>
     *
     * <code>ENDED = 5;</code>
     */
    public static final int ENDED_VALUE = 5;
    /**
     * <pre>
     * The campaign may serve in the future.
     * </pre>
     *
     * <code>PENDING = 6;</code>
     */
    public static final int PENDING_VALUE = 6;
    /**
     * <pre>
     * The campaign or its associated entities have incorrect user-specified
     * settings.
     * </pre>
     *
     * <code>MISCONFIGURED = 7;</code>
     */
    public static final int MISCONFIGURED_VALUE = 7;
    /**
     * <pre>
     * The campaign or its associated entities are limited by user-specified
     * settings.
     * </pre>
     *
     * <code>LIMITED = 8;</code>
     */
    public static final int LIMITED_VALUE = 8;
    /**
     * <pre>
     * The automated bidding system is adjusting to user-specified changes to
     * the campaign or associated entities.
     * </pre>
     *
     * <code>LEARNING = 9;</code>
     */
    public static final int LEARNING_VALUE = 9;
    /**
     * <pre>
     * The campaign is not eligible to serve.
     * </pre>
     *
     * <code>NOT_ELIGIBLE = 10;</code>
     */
    public static final int NOT_ELIGIBLE_VALUE = 10;


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
    public static CampaignPrimaryStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignPrimaryStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ELIGIBLE;
        case 3: return PAUSED;
        case 4: return REMOVED;
        case 5: return ENDED;
        case 6: return PENDING;
        case 7: return MISCONFIGURED;
        case 8: return LIMITED;
        case 9: return LEARNING;
        case 10: return NOT_ELIGIBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignPrimaryStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignPrimaryStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignPrimaryStatus>() {
            public CampaignPrimaryStatus findValueByNumber(int number) {
              return CampaignPrimaryStatus.forNumber(number);
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
      return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignPrimaryStatus[] VALUES = values();

    public static CampaignPrimaryStatus valueOf(
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

    private CampaignPrimaryStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.CampaignPrimaryStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum other = (com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum) obj;

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

  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum prototype) {
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
   * Container for enum describing possible campaign primary status.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)
      com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusProto.internal_static_google_ads_googleads_v12_enums_CampaignPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusProto.internal_static_google_ads_googleads_v12_enums_CampaignPrimaryStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.class, com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusProto.internal_static_google_ads_googleads_v12_enums_CampaignPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum build() {
      com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum buildPartial() {
      com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum result = new com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum other) {
      if (other == com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum)
  private static final com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum();
  }

  public static com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignPrimaryStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignPrimaryStatusEnum>() {
    @java.lang.Override
    public CampaignPrimaryStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignPrimaryStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignPrimaryStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.enums.CampaignPrimaryStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

