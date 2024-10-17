// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/enums/ad_group_ad_primary_status.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.enums;

/**
 * <pre>
 * Ad Group Ad Primary Status. Provides insight into why an ad group ad is not
 * serving or not serving optimally.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum}
 */
public final class AdGroupAdPrimaryStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)
    AdGroupAdPrimaryStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupAdPrimaryStatusEnum.newBuilder() to construct.
  private AdGroupAdPrimaryStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupAdPrimaryStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupAdPrimaryStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AdGroupAdPrimaryStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AdGroupAdPrimaryStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.class, com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible statuses of an AdGroupAd.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.AdGroupAdPrimaryStatus}
   */
  public enum AdGroupAdPrimaryStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
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
     * The ad group ad is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    ELIGIBLE(2),
    /**
     * <pre>
     * The ad group ad is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    PAUSED(3),
    /**
     * <pre>
     * The ad group ad is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    REMOVED(4),
    /**
     * <pre>
     * The ad cannot serve now, but may serve later without advertiser action.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    PENDING(5),
    /**
     * <pre>
     * The ad group ad is serving in a limited capacity.
     * </pre>
     *
     * <code>LIMITED = 6;</code>
     */
    LIMITED(6),
    /**
     * <pre>
     * The ad group ad is not eligible to serve.
     * </pre>
     *
     * <code>NOT_ELIGIBLE = 7;</code>
     */
    NOT_ELIGIBLE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
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
     * The ad group ad is eligible to serve.
     * </pre>
     *
     * <code>ELIGIBLE = 2;</code>
     */
    public static final int ELIGIBLE_VALUE = 2;
    /**
     * <pre>
     * The ad group ad is paused.
     * </pre>
     *
     * <code>PAUSED = 3;</code>
     */
    public static final int PAUSED_VALUE = 3;
    /**
     * <pre>
     * The ad group ad is removed.
     * </pre>
     *
     * <code>REMOVED = 4;</code>
     */
    public static final int REMOVED_VALUE = 4;
    /**
     * <pre>
     * The ad cannot serve now, but may serve later without advertiser action.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    public static final int PENDING_VALUE = 5;
    /**
     * <pre>
     * The ad group ad is serving in a limited capacity.
     * </pre>
     *
     * <code>LIMITED = 6;</code>
     */
    public static final int LIMITED_VALUE = 6;
    /**
     * <pre>
     * The ad group ad is not eligible to serve.
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
    public static AdGroupAdPrimaryStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupAdPrimaryStatus forNumber(int value) {
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

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupAdPrimaryStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupAdPrimaryStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupAdPrimaryStatus>() {
            public AdGroupAdPrimaryStatus findValueByNumber(int number) {
              return AdGroupAdPrimaryStatus.forNumber(number);
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
      return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupAdPrimaryStatus[] VALUES = values();

    public static AdGroupAdPrimaryStatus valueOf(
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

    private AdGroupAdPrimaryStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.AdGroupAdPrimaryStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum other = (com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum) obj;

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

  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum prototype) {
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
   * Ad Group Ad Primary Status. Provides insight into why an ad group ad is not
   * serving or not serving optimally.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)
      com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AdGroupAdPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AdGroupAdPrimaryStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.class, com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.internal_static_google_ads_googleads_v18_enums_AdGroupAdPrimaryStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum build() {
      com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum buildPartial() {
      com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum result = new com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum other) {
      if (other == com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum)
  private static final com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum();
  }

  public static com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupAdPrimaryStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupAdPrimaryStatusEnum>() {
    @java.lang.Override
    public AdGroupAdPrimaryStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupAdPrimaryStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupAdPrimaryStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

