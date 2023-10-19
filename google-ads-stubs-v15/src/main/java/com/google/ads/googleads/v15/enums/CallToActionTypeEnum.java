// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/call_to_action_type.proto

package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Container for enum describing the call to action types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.CallToActionTypeEnum}
 */
public final class CallToActionTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.CallToActionTypeEnum)
    CallToActionTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallToActionTypeEnum.newBuilder() to construct.
  private CallToActionTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallToActionTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CallToActionTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.CallToActionTypeProto.internal_static_google_ads_googleads_v15_enums_CallToActionTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.CallToActionTypeProto.internal_static_google_ads_googleads_v15_enums_CallToActionTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.CallToActionTypeEnum.class, com.google.ads.googleads.v15.enums.CallToActionTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible types of call to action.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.CallToActionTypeEnum.CallToActionType}
   */
  public enum CallToActionType
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
     * The call to action type is learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 2;</code>
     */
    LEARN_MORE(2),
    /**
     * <pre>
     * The call to action type is get quote.
     * </pre>
     *
     * <code>GET_QUOTE = 3;</code>
     */
    GET_QUOTE(3),
    /**
     * <pre>
     * The call to action type is apply now.
     * </pre>
     *
     * <code>APPLY_NOW = 4;</code>
     */
    APPLY_NOW(4),
    /**
     * <pre>
     * The call to action type is sign up.
     * </pre>
     *
     * <code>SIGN_UP = 5;</code>
     */
    SIGN_UP(5),
    /**
     * <pre>
     * The call to action type is contact us.
     * </pre>
     *
     * <code>CONTACT_US = 6;</code>
     */
    CONTACT_US(6),
    /**
     * <pre>
     * The call to action type is subscribe.
     * </pre>
     *
     * <code>SUBSCRIBE = 7;</code>
     */
    SUBSCRIBE(7),
    /**
     * <pre>
     * The call to action type is download.
     * </pre>
     *
     * <code>DOWNLOAD = 8;</code>
     */
    DOWNLOAD(8),
    /**
     * <pre>
     * The call to action type is book now.
     * </pre>
     *
     * <code>BOOK_NOW = 9;</code>
     */
    BOOK_NOW(9),
    /**
     * <pre>
     * The call to action type is shop now.
     * </pre>
     *
     * <code>SHOP_NOW = 10;</code>
     */
    SHOP_NOW(10),
    /**
     * <pre>
     * The call to action type is buy now.
     * </pre>
     *
     * <code>BUY_NOW = 11;</code>
     */
    BUY_NOW(11),
    /**
     * <pre>
     * The call to action type is donate now.
     * </pre>
     *
     * <code>DONATE_NOW = 12;</code>
     */
    DONATE_NOW(12),
    /**
     * <pre>
     * The call to action type is order now.
     * </pre>
     *
     * <code>ORDER_NOW = 13;</code>
     */
    ORDER_NOW(13),
    /**
     * <pre>
     * The call to action type is play now.
     * </pre>
     *
     * <code>PLAY_NOW = 14;</code>
     */
    PLAY_NOW(14),
    /**
     * <pre>
     * The call to action type is see more.
     * </pre>
     *
     * <code>SEE_MORE = 15;</code>
     */
    SEE_MORE(15),
    /**
     * <pre>
     * The call to action type is start now.
     * </pre>
     *
     * <code>START_NOW = 16;</code>
     */
    START_NOW(16),
    /**
     * <pre>
     * The call to action type is visit site.
     * </pre>
     *
     * <code>VISIT_SITE = 17;</code>
     */
    VISIT_SITE(17),
    /**
     * <pre>
     * The call to action type is watch now.
     * </pre>
     *
     * <code>WATCH_NOW = 18;</code>
     */
    WATCH_NOW(18),
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
     * The call to action type is learn more.
     * </pre>
     *
     * <code>LEARN_MORE = 2;</code>
     */
    public static final int LEARN_MORE_VALUE = 2;
    /**
     * <pre>
     * The call to action type is get quote.
     * </pre>
     *
     * <code>GET_QUOTE = 3;</code>
     */
    public static final int GET_QUOTE_VALUE = 3;
    /**
     * <pre>
     * The call to action type is apply now.
     * </pre>
     *
     * <code>APPLY_NOW = 4;</code>
     */
    public static final int APPLY_NOW_VALUE = 4;
    /**
     * <pre>
     * The call to action type is sign up.
     * </pre>
     *
     * <code>SIGN_UP = 5;</code>
     */
    public static final int SIGN_UP_VALUE = 5;
    /**
     * <pre>
     * The call to action type is contact us.
     * </pre>
     *
     * <code>CONTACT_US = 6;</code>
     */
    public static final int CONTACT_US_VALUE = 6;
    /**
     * <pre>
     * The call to action type is subscribe.
     * </pre>
     *
     * <code>SUBSCRIBE = 7;</code>
     */
    public static final int SUBSCRIBE_VALUE = 7;
    /**
     * <pre>
     * The call to action type is download.
     * </pre>
     *
     * <code>DOWNLOAD = 8;</code>
     */
    public static final int DOWNLOAD_VALUE = 8;
    /**
     * <pre>
     * The call to action type is book now.
     * </pre>
     *
     * <code>BOOK_NOW = 9;</code>
     */
    public static final int BOOK_NOW_VALUE = 9;
    /**
     * <pre>
     * The call to action type is shop now.
     * </pre>
     *
     * <code>SHOP_NOW = 10;</code>
     */
    public static final int SHOP_NOW_VALUE = 10;
    /**
     * <pre>
     * The call to action type is buy now.
     * </pre>
     *
     * <code>BUY_NOW = 11;</code>
     */
    public static final int BUY_NOW_VALUE = 11;
    /**
     * <pre>
     * The call to action type is donate now.
     * </pre>
     *
     * <code>DONATE_NOW = 12;</code>
     */
    public static final int DONATE_NOW_VALUE = 12;
    /**
     * <pre>
     * The call to action type is order now.
     * </pre>
     *
     * <code>ORDER_NOW = 13;</code>
     */
    public static final int ORDER_NOW_VALUE = 13;
    /**
     * <pre>
     * The call to action type is play now.
     * </pre>
     *
     * <code>PLAY_NOW = 14;</code>
     */
    public static final int PLAY_NOW_VALUE = 14;
    /**
     * <pre>
     * The call to action type is see more.
     * </pre>
     *
     * <code>SEE_MORE = 15;</code>
     */
    public static final int SEE_MORE_VALUE = 15;
    /**
     * <pre>
     * The call to action type is start now.
     * </pre>
     *
     * <code>START_NOW = 16;</code>
     */
    public static final int START_NOW_VALUE = 16;
    /**
     * <pre>
     * The call to action type is visit site.
     * </pre>
     *
     * <code>VISIT_SITE = 17;</code>
     */
    public static final int VISIT_SITE_VALUE = 17;
    /**
     * <pre>
     * The call to action type is watch now.
     * </pre>
     *
     * <code>WATCH_NOW = 18;</code>
     */
    public static final int WATCH_NOW_VALUE = 18;


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
    public static CallToActionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CallToActionType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return LEARN_MORE;
        case 3: return GET_QUOTE;
        case 4: return APPLY_NOW;
        case 5: return SIGN_UP;
        case 6: return CONTACT_US;
        case 7: return SUBSCRIBE;
        case 8: return DOWNLOAD;
        case 9: return BOOK_NOW;
        case 10: return SHOP_NOW;
        case 11: return BUY_NOW;
        case 12: return DONATE_NOW;
        case 13: return ORDER_NOW;
        case 14: return PLAY_NOW;
        case 15: return SEE_MORE;
        case 16: return START_NOW;
        case 17: return VISIT_SITE;
        case 18: return WATCH_NOW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CallToActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CallToActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CallToActionType>() {
            public CallToActionType findValueByNumber(int number) {
              return CallToActionType.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.CallToActionTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CallToActionType[] VALUES = values();

    public static CallToActionType valueOf(
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

    private CallToActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.CallToActionTypeEnum.CallToActionType)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.CallToActionTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.CallToActionTypeEnum other = (com.google.ads.googleads.v15.enums.CallToActionTypeEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.CallToActionTypeEnum prototype) {
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
   * Container for enum describing the call to action types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.CallToActionTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.CallToActionTypeEnum)
      com.google.ads.googleads.v15.enums.CallToActionTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.CallToActionTypeProto.internal_static_google_ads_googleads_v15_enums_CallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.CallToActionTypeProto.internal_static_google_ads_googleads_v15_enums_CallToActionTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.CallToActionTypeEnum.class, com.google.ads.googleads.v15.enums.CallToActionTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.CallToActionTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.CallToActionTypeProto.internal_static_google_ads_googleads_v15_enums_CallToActionTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.CallToActionTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.CallToActionTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.CallToActionTypeEnum build() {
      com.google.ads.googleads.v15.enums.CallToActionTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.CallToActionTypeEnum buildPartial() {
      com.google.ads.googleads.v15.enums.CallToActionTypeEnum result = new com.google.ads.googleads.v15.enums.CallToActionTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.CallToActionTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.CallToActionTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.CallToActionTypeEnum other) {
      if (other == com.google.ads.googleads.v15.enums.CallToActionTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.CallToActionTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.CallToActionTypeEnum)
  private static final com.google.ads.googleads.v15.enums.CallToActionTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.CallToActionTypeEnum();
  }

  public static com.google.ads.googleads.v15.enums.CallToActionTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallToActionTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<CallToActionTypeEnum>() {
    @java.lang.Override
    public CallToActionTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CallToActionTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallToActionTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.CallToActionTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

