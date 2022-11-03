// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/enums/conversion_origin.proto

package com.google.ads.googleads.v11.enums;

/**
 * <pre>
 * Container for enum describing possible conversion origins.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.enums.ConversionOriginEnum}
 */
public final class ConversionOriginEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.enums.ConversionOriginEnum)
    ConversionOriginEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionOriginEnum.newBuilder() to construct.
  private ConversionOriginEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionOriginEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionOriginEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.enums.ConversionOriginProto.internal_static_google_ads_googleads_v11_enums_ConversionOriginEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.enums.ConversionOriginProto.internal_static_google_ads_googleads_v11_enums_ConversionOriginEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.enums.ConversionOriginEnum.class, com.google.ads.googleads.v11.enums.ConversionOriginEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible places where a conversion can occur.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.enums.ConversionOriginEnum.ConversionOrigin}
   */
  public enum ConversionOrigin
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The conversion origin has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The conversion origin is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Conversion that occurs when a user visits a website or takes an action
     * there after viewing an ad.
     * </pre>
     *
     * <code>WEBSITE = 2;</code>
     */
    WEBSITE(2),
    /**
     * <pre>
     * Conversions reported by an offline pipeline which collects local actions
     * from Google-hosted pages (for example, Google Maps, Google Place Page,
     * etc) and attributes them to relevant ad events.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 3;</code>
     */
    GOOGLE_HOSTED(3),
    /**
     * <pre>
     * Conversion that occurs when a user performs an action through any app
     * platforms.
     * </pre>
     *
     * <code>APP = 4;</code>
     */
    APP(4),
    /**
     * <pre>
     * Conversion that occurs when a user makes a call from ads.
     * </pre>
     *
     * <code>CALL_FROM_ADS = 5;</code>
     */
    CALL_FROM_ADS(5),
    /**
     * <pre>
     * Conversion that occurs when a user visits or makes a purchase at a
     * physical store.
     * </pre>
     *
     * <code>STORE = 6;</code>
     */
    STORE(6),
    /**
     * <pre>
     * Conversion that occurs on YouTube.
     * </pre>
     *
     * <code>YOUTUBE_HOSTED = 7;</code>
     */
    YOUTUBE_HOSTED(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The conversion origin has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The conversion origin is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Conversion that occurs when a user visits a website or takes an action
     * there after viewing an ad.
     * </pre>
     *
     * <code>WEBSITE = 2;</code>
     */
    public static final int WEBSITE_VALUE = 2;
    /**
     * <pre>
     * Conversions reported by an offline pipeline which collects local actions
     * from Google-hosted pages (for example, Google Maps, Google Place Page,
     * etc) and attributes them to relevant ad events.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 3;</code>
     */
    public static final int GOOGLE_HOSTED_VALUE = 3;
    /**
     * <pre>
     * Conversion that occurs when a user performs an action through any app
     * platforms.
     * </pre>
     *
     * <code>APP = 4;</code>
     */
    public static final int APP_VALUE = 4;
    /**
     * <pre>
     * Conversion that occurs when a user makes a call from ads.
     * </pre>
     *
     * <code>CALL_FROM_ADS = 5;</code>
     */
    public static final int CALL_FROM_ADS_VALUE = 5;
    /**
     * <pre>
     * Conversion that occurs when a user visits or makes a purchase at a
     * physical store.
     * </pre>
     *
     * <code>STORE = 6;</code>
     */
    public static final int STORE_VALUE = 6;
    /**
     * <pre>
     * Conversion that occurs on YouTube.
     * </pre>
     *
     * <code>YOUTUBE_HOSTED = 7;</code>
     */
    public static final int YOUTUBE_HOSTED_VALUE = 7;


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
    public static ConversionOrigin valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionOrigin forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return WEBSITE;
        case 3: return GOOGLE_HOSTED;
        case 4: return APP;
        case 5: return CALL_FROM_ADS;
        case 6: return STORE;
        case 7: return YOUTUBE_HOSTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionOrigin>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionOrigin> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionOrigin>() {
            public ConversionOrigin findValueByNumber(int number) {
              return ConversionOrigin.forNumber(number);
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
      return com.google.ads.googleads.v11.enums.ConversionOriginEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionOrigin[] VALUES = values();

    public static ConversionOrigin valueOf(
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

    private ConversionOrigin(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.enums.ConversionOriginEnum.ConversionOrigin)
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
    if (!(obj instanceof com.google.ads.googleads.v11.enums.ConversionOriginEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.enums.ConversionOriginEnum other = (com.google.ads.googleads.v11.enums.ConversionOriginEnum) obj;

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

  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.enums.ConversionOriginEnum prototype) {
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
   * Container for enum describing possible conversion origins.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.enums.ConversionOriginEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.enums.ConversionOriginEnum)
      com.google.ads.googleads.v11.enums.ConversionOriginEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.enums.ConversionOriginProto.internal_static_google_ads_googleads_v11_enums_ConversionOriginEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.enums.ConversionOriginProto.internal_static_google_ads_googleads_v11_enums_ConversionOriginEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.enums.ConversionOriginEnum.class, com.google.ads.googleads.v11.enums.ConversionOriginEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.enums.ConversionOriginEnum.newBuilder()
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
      return com.google.ads.googleads.v11.enums.ConversionOriginProto.internal_static_google_ads_googleads_v11_enums_ConversionOriginEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ConversionOriginEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.enums.ConversionOriginEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ConversionOriginEnum build() {
      com.google.ads.googleads.v11.enums.ConversionOriginEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ConversionOriginEnum buildPartial() {
      com.google.ads.googleads.v11.enums.ConversionOriginEnum result = new com.google.ads.googleads.v11.enums.ConversionOriginEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.enums.ConversionOriginEnum) {
        return mergeFrom((com.google.ads.googleads.v11.enums.ConversionOriginEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.enums.ConversionOriginEnum other) {
      if (other == com.google.ads.googleads.v11.enums.ConversionOriginEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.enums.ConversionOriginEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.enums.ConversionOriginEnum)
  private static final com.google.ads.googleads.v11.enums.ConversionOriginEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.enums.ConversionOriginEnum();
  }

  public static com.google.ads.googleads.v11.enums.ConversionOriginEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionOriginEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionOriginEnum>() {
    @java.lang.Override
    public ConversionOriginEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionOriginEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionOriginEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.enums.ConversionOriginEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

