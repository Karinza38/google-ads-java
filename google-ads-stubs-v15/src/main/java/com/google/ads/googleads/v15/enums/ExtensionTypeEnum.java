// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/extension_type.proto

package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Container for enum describing possible data types for an extension in an
 * extension setting.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.ExtensionTypeEnum}
 */
public final class ExtensionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.ExtensionTypeEnum)
    ExtensionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExtensionTypeEnum.newBuilder() to construct.
  private ExtensionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExtensionTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.ExtensionTypeProto.internal_static_google_ads_googleads_v15_enums_ExtensionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.ExtensionTypeProto.internal_static_google_ads_googleads_v15_enums_ExtensionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.ExtensionTypeEnum.class, com.google.ads.googleads.v15.enums.ExtensionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible data types for an extension in an extension setting.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.ExtensionTypeEnum.ExtensionType}
   */
  public enum ExtensionType
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
     * None.
     * </pre>
     *
     * <code>NONE = 2;</code>
     */
    NONE(2),
    /**
     * <pre>
     * App.
     * </pre>
     *
     * <code>APP = 3;</code>
     */
    APP(3),
    /**
     * <pre>
     * Call.
     * </pre>
     *
     * <code>CALL = 4;</code>
     */
    CALL(4),
    /**
     * <pre>
     * Callout.
     * </pre>
     *
     * <code>CALLOUT = 5;</code>
     */
    CALLOUT(5),
    /**
     * <pre>
     * Message.
     * </pre>
     *
     * <code>MESSAGE = 6;</code>
     */
    MESSAGE(6),
    /**
     * <pre>
     * Price.
     * </pre>
     *
     * <code>PRICE = 7;</code>
     */
    PRICE(7),
    /**
     * <pre>
     * Promotion.
     * </pre>
     *
     * <code>PROMOTION = 8;</code>
     */
    PROMOTION(8),
    /**
     * <pre>
     * Sitelink.
     * </pre>
     *
     * <code>SITELINK = 10;</code>
     */
    SITELINK(10),
    /**
     * <pre>
     * Structured snippet.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 11;</code>
     */
    STRUCTURED_SNIPPET(11),
    /**
     * <pre>
     * Location.
     * </pre>
     *
     * <code>LOCATION = 12;</code>
     */
    LOCATION(12),
    /**
     * <pre>
     * Affiliate location.
     * </pre>
     *
     * <code>AFFILIATE_LOCATION = 13;</code>
     */
    AFFILIATE_LOCATION(13),
    /**
     * <pre>
     * Hotel callout
     * </pre>
     *
     * <code>HOTEL_CALLOUT = 15;</code>
     */
    HOTEL_CALLOUT(15),
    /**
     * <pre>
     * Image.
     * </pre>
     *
     * <code>IMAGE = 16;</code>
     */
    IMAGE(16),
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
     * None.
     * </pre>
     *
     * <code>NONE = 2;</code>
     */
    public static final int NONE_VALUE = 2;
    /**
     * <pre>
     * App.
     * </pre>
     *
     * <code>APP = 3;</code>
     */
    public static final int APP_VALUE = 3;
    /**
     * <pre>
     * Call.
     * </pre>
     *
     * <code>CALL = 4;</code>
     */
    public static final int CALL_VALUE = 4;
    /**
     * <pre>
     * Callout.
     * </pre>
     *
     * <code>CALLOUT = 5;</code>
     */
    public static final int CALLOUT_VALUE = 5;
    /**
     * <pre>
     * Message.
     * </pre>
     *
     * <code>MESSAGE = 6;</code>
     */
    public static final int MESSAGE_VALUE = 6;
    /**
     * <pre>
     * Price.
     * </pre>
     *
     * <code>PRICE = 7;</code>
     */
    public static final int PRICE_VALUE = 7;
    /**
     * <pre>
     * Promotion.
     * </pre>
     *
     * <code>PROMOTION = 8;</code>
     */
    public static final int PROMOTION_VALUE = 8;
    /**
     * <pre>
     * Sitelink.
     * </pre>
     *
     * <code>SITELINK = 10;</code>
     */
    public static final int SITELINK_VALUE = 10;
    /**
     * <pre>
     * Structured snippet.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 11;</code>
     */
    public static final int STRUCTURED_SNIPPET_VALUE = 11;
    /**
     * <pre>
     * Location.
     * </pre>
     *
     * <code>LOCATION = 12;</code>
     */
    public static final int LOCATION_VALUE = 12;
    /**
     * <pre>
     * Affiliate location.
     * </pre>
     *
     * <code>AFFILIATE_LOCATION = 13;</code>
     */
    public static final int AFFILIATE_LOCATION_VALUE = 13;
    /**
     * <pre>
     * Hotel callout
     * </pre>
     *
     * <code>HOTEL_CALLOUT = 15;</code>
     */
    public static final int HOTEL_CALLOUT_VALUE = 15;
    /**
     * <pre>
     * Image.
     * </pre>
     *
     * <code>IMAGE = 16;</code>
     */
    public static final int IMAGE_VALUE = 16;


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
    public static ExtensionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExtensionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NONE;
        case 3: return APP;
        case 4: return CALL;
        case 5: return CALLOUT;
        case 6: return MESSAGE;
        case 7: return PRICE;
        case 8: return PROMOTION;
        case 10: return SITELINK;
        case 11: return STRUCTURED_SNIPPET;
        case 12: return LOCATION;
        case 13: return AFFILIATE_LOCATION;
        case 15: return HOTEL_CALLOUT;
        case 16: return IMAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExtensionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExtensionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExtensionType>() {
            public ExtensionType findValueByNumber(int number) {
              return ExtensionType.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.ExtensionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExtensionType[] VALUES = values();

    public static ExtensionType valueOf(
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

    private ExtensionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.ExtensionTypeEnum.ExtensionType)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.ExtensionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.ExtensionTypeEnum other = (com.google.ads.googleads.v15.enums.ExtensionTypeEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.ExtensionTypeEnum prototype) {
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
   * Container for enum describing possible data types for an extension in an
   * extension setting.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.ExtensionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.ExtensionTypeEnum)
      com.google.ads.googleads.v15.enums.ExtensionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.ExtensionTypeProto.internal_static_google_ads_googleads_v15_enums_ExtensionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.ExtensionTypeProto.internal_static_google_ads_googleads_v15_enums_ExtensionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.ExtensionTypeEnum.class, com.google.ads.googleads.v15.enums.ExtensionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.ExtensionTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.ExtensionTypeProto.internal_static_google_ads_googleads_v15_enums_ExtensionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.ExtensionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.ExtensionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.ExtensionTypeEnum build() {
      com.google.ads.googleads.v15.enums.ExtensionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.ExtensionTypeEnum buildPartial() {
      com.google.ads.googleads.v15.enums.ExtensionTypeEnum result = new com.google.ads.googleads.v15.enums.ExtensionTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.ExtensionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.ExtensionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.ExtensionTypeEnum other) {
      if (other == com.google.ads.googleads.v15.enums.ExtensionTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.ExtensionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.ExtensionTypeEnum)
  private static final com.google.ads.googleads.v15.enums.ExtensionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.ExtensionTypeEnum();
  }

  public static com.google.ads.googleads.v15.enums.ExtensionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionTypeEnum>() {
    @java.lang.Override
    public ExtensionTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExtensionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.ExtensionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

