// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/offline_user_data_job_match_rate_range.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Container for enum describing reasons match rate ranges for a customer match
 * list upload.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum}
 */
public final class OfflineUserDataJobMatchRateRangeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)
    OfflineUserDataJobMatchRateRangeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfflineUserDataJobMatchRateRangeEnum.newBuilder() to construct.
  private OfflineUserDataJobMatchRateRangeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfflineUserDataJobMatchRateRangeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfflineUserDataJobMatchRateRangeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeProto.internal_static_google_ads_googleads_v10_enums_OfflineUserDataJobMatchRateRangeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeProto.internal_static_google_ads_googleads_v10_enums_OfflineUserDataJobMatchRateRangeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.class, com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.Builder.class);
  }

  /**
   * <pre>
   * The match rate range of an offline user data job.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange}
   */
  public enum OfflineUserDataJobMatchRateRange
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
     * Default value for match rate range.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 0% and 19%.
     * </pre>
     *
     * <code>MATCH_RANGE_LESS_THAN_20 = 2;</code>
     */
    MATCH_RANGE_LESS_THAN_20(2),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 20% and 30%.
     * </pre>
     *
     * <code>MATCH_RANGE_20_TO_30 = 3;</code>
     */
    MATCH_RANGE_20_TO_30(3),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 31% and 40%.
     * </pre>
     *
     * <code>MATCH_RANGE_31_TO_40 = 4;</code>
     */
    MATCH_RANGE_31_TO_40(4),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 41% and 50%.
     * </pre>
     *
     * <code>MATCH_RANGE_41_TO_50 = 5;</code>
     */
    MATCH_RANGE_41_TO_50(5),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 51% and 60%.
     * </pre>
     *
     * <code>MATCH_RANGE_51_TO_60 = 6;</code>
     */
    MATCH_RANGE_51_TO_60(6),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 61% and 70%.
     * </pre>
     *
     * <code>MATCH_RANGE_61_TO_70 = 7;</code>
     */
    MATCH_RANGE_61_TO_70(7),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 71% and 80%.
     * </pre>
     *
     * <code>MATCH_RANGE_71_TO_80 = 8;</code>
     */
    MATCH_RANGE_71_TO_80(8),
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 81% and 90%.
     * </pre>
     *
     * <code>MATCH_RANGE_81_TO_90 = 9;</code>
     */
    MATCH_RANGE_81_TO_90(9),
    /**
     * <pre>
     * Match rate range for offline data upload entity is more than or equal to
     * 91%.
     * </pre>
     *
     * <code>MATCH_RANGE_91_TO_100 = 10;</code>
     */
    MATCH_RANGE_91_TO_100(10),
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
     * Default value for match rate range.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 0% and 19%.
     * </pre>
     *
     * <code>MATCH_RANGE_LESS_THAN_20 = 2;</code>
     */
    public static final int MATCH_RANGE_LESS_THAN_20_VALUE = 2;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 20% and 30%.
     * </pre>
     *
     * <code>MATCH_RANGE_20_TO_30 = 3;</code>
     */
    public static final int MATCH_RANGE_20_TO_30_VALUE = 3;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 31% and 40%.
     * </pre>
     *
     * <code>MATCH_RANGE_31_TO_40 = 4;</code>
     */
    public static final int MATCH_RANGE_31_TO_40_VALUE = 4;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 41% and 50%.
     * </pre>
     *
     * <code>MATCH_RANGE_41_TO_50 = 5;</code>
     */
    public static final int MATCH_RANGE_41_TO_50_VALUE = 5;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 51% and 60%.
     * </pre>
     *
     * <code>MATCH_RANGE_51_TO_60 = 6;</code>
     */
    public static final int MATCH_RANGE_51_TO_60_VALUE = 6;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 61% and 70%.
     * </pre>
     *
     * <code>MATCH_RANGE_61_TO_70 = 7;</code>
     */
    public static final int MATCH_RANGE_61_TO_70_VALUE = 7;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 71% and 80%.
     * </pre>
     *
     * <code>MATCH_RANGE_71_TO_80 = 8;</code>
     */
    public static final int MATCH_RANGE_71_TO_80_VALUE = 8;
    /**
     * <pre>
     * Match rate range for offline data upload entity is between 81% and 90%.
     * </pre>
     *
     * <code>MATCH_RANGE_81_TO_90 = 9;</code>
     */
    public static final int MATCH_RANGE_81_TO_90_VALUE = 9;
    /**
     * <pre>
     * Match rate range for offline data upload entity is more than or equal to
     * 91%.
     * </pre>
     *
     * <code>MATCH_RANGE_91_TO_100 = 10;</code>
     */
    public static final int MATCH_RANGE_91_TO_100_VALUE = 10;


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
    public static OfflineUserDataJobMatchRateRange valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OfflineUserDataJobMatchRateRange forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return MATCH_RANGE_LESS_THAN_20;
        case 3: return MATCH_RANGE_20_TO_30;
        case 4: return MATCH_RANGE_31_TO_40;
        case 5: return MATCH_RANGE_41_TO_50;
        case 6: return MATCH_RANGE_51_TO_60;
        case 7: return MATCH_RANGE_61_TO_70;
        case 8: return MATCH_RANGE_71_TO_80;
        case 9: return MATCH_RANGE_81_TO_90;
        case 10: return MATCH_RANGE_91_TO_100;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OfflineUserDataJobMatchRateRange>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OfflineUserDataJobMatchRateRange> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OfflineUserDataJobMatchRateRange>() {
            public OfflineUserDataJobMatchRateRange findValueByNumber(int number) {
              return OfflineUserDataJobMatchRateRange.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final OfflineUserDataJobMatchRateRange[] VALUES = values();

    public static OfflineUserDataJobMatchRateRange valueOf(
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

    private OfflineUserDataJobMatchRateRange(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange)
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
    if (!(obj instanceof com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum other = (com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum) obj;

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

  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum prototype) {
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
   * Container for enum describing reasons match rate ranges for a customer match
   * list upload.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)
      com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeProto.internal_static_google_ads_googleads_v10_enums_OfflineUserDataJobMatchRateRangeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeProto.internal_static_google_ads_googleads_v10_enums_OfflineUserDataJobMatchRateRangeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.class, com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.newBuilder()
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
      return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeProto.internal_static_google_ads_googleads_v10_enums_OfflineUserDataJobMatchRateRangeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum build() {
      com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum buildPartial() {
      com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum result = new com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum other) {
      if (other == com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum)
  private static final com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum();
  }

  public static com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfflineUserDataJobMatchRateRangeEnum>
      PARSER = new com.google.protobuf.AbstractParser<OfflineUserDataJobMatchRateRangeEnum>() {
    @java.lang.Override
    public OfflineUserDataJobMatchRateRangeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfflineUserDataJobMatchRateRangeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfflineUserDataJobMatchRateRangeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.OfflineUserDataJobMatchRateRangeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

