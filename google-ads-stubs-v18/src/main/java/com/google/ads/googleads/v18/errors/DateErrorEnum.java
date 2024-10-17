// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/date_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible date errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.DateErrorEnum}
 */
public final class DateErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.DateErrorEnum)
    DateErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateErrorEnum.newBuilder() to construct.
  private DateErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DateErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.DateErrorProto.internal_static_google_ads_googleads_v18_errors_DateErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.DateErrorProto.internal_static_google_ads_googleads_v18_errors_DateErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.DateErrorEnum.class, com.google.ads.googleads.v18.errors.DateErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible date errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.DateErrorEnum.DateError}
   */
  public enum DateError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Given field values do not correspond to a valid date.
     * </pre>
     *
     * <code>INVALID_FIELD_VALUES_IN_DATE = 2;</code>
     */
    INVALID_FIELD_VALUES_IN_DATE(2),
    /**
     * <pre>
     * Given field values do not correspond to a valid date time.
     * </pre>
     *
     * <code>INVALID_FIELD_VALUES_IN_DATE_TIME = 3;</code>
     */
    INVALID_FIELD_VALUES_IN_DATE_TIME(3),
    /**
     * <pre>
     * The string date's format should be yyyy-mm-dd.
     * </pre>
     *
     * <code>INVALID_STRING_DATE = 4;</code>
     */
    INVALID_STRING_DATE(4),
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss.ssssss.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_MICROS = 6;</code>
     */
    INVALID_STRING_DATE_TIME_MICROS(6),
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_SECONDS = 11;</code>
     */
    INVALID_STRING_DATE_TIME_SECONDS(11),
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss+|-hh:mm.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_SECONDS_WITH_OFFSET = 12;</code>
     */
    INVALID_STRING_DATE_TIME_SECONDS_WITH_OFFSET(12),
    /**
     * <pre>
     * Date is before allowed minimum.
     * </pre>
     *
     * <code>EARLIER_THAN_MINIMUM_DATE = 7;</code>
     */
    EARLIER_THAN_MINIMUM_DATE(7),
    /**
     * <pre>
     * Date is after allowed maximum.
     * </pre>
     *
     * <code>LATER_THAN_MAXIMUM_DATE = 8;</code>
     */
    LATER_THAN_MAXIMUM_DATE(8),
    /**
     * <pre>
     * Date range bounds are not in order.
     * </pre>
     *
     * <code>DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE = 9;</code>
     */
    DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE(9),
    /**
     * <pre>
     * Both dates in range are null.
     * </pre>
     *
     * <code>DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL = 10;</code>
     */
    DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Given field values do not correspond to a valid date.
     * </pre>
     *
     * <code>INVALID_FIELD_VALUES_IN_DATE = 2;</code>
     */
    public static final int INVALID_FIELD_VALUES_IN_DATE_VALUE = 2;
    /**
     * <pre>
     * Given field values do not correspond to a valid date time.
     * </pre>
     *
     * <code>INVALID_FIELD_VALUES_IN_DATE_TIME = 3;</code>
     */
    public static final int INVALID_FIELD_VALUES_IN_DATE_TIME_VALUE = 3;
    /**
     * <pre>
     * The string date's format should be yyyy-mm-dd.
     * </pre>
     *
     * <code>INVALID_STRING_DATE = 4;</code>
     */
    public static final int INVALID_STRING_DATE_VALUE = 4;
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss.ssssss.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_MICROS = 6;</code>
     */
    public static final int INVALID_STRING_DATE_TIME_MICROS_VALUE = 6;
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_SECONDS = 11;</code>
     */
    public static final int INVALID_STRING_DATE_TIME_SECONDS_VALUE = 11;
    /**
     * <pre>
     * The string date time's format should be yyyy-mm-dd hh:mm:ss+|-hh:mm.
     * </pre>
     *
     * <code>INVALID_STRING_DATE_TIME_SECONDS_WITH_OFFSET = 12;</code>
     */
    public static final int INVALID_STRING_DATE_TIME_SECONDS_WITH_OFFSET_VALUE = 12;
    /**
     * <pre>
     * Date is before allowed minimum.
     * </pre>
     *
     * <code>EARLIER_THAN_MINIMUM_DATE = 7;</code>
     */
    public static final int EARLIER_THAN_MINIMUM_DATE_VALUE = 7;
    /**
     * <pre>
     * Date is after allowed maximum.
     * </pre>
     *
     * <code>LATER_THAN_MAXIMUM_DATE = 8;</code>
     */
    public static final int LATER_THAN_MAXIMUM_DATE_VALUE = 8;
    /**
     * <pre>
     * Date range bounds are not in order.
     * </pre>
     *
     * <code>DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE = 9;</code>
     */
    public static final int DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE_VALUE = 9;
    /**
     * <pre>
     * Both dates in range are null.
     * </pre>
     *
     * <code>DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL = 10;</code>
     */
    public static final int DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL_VALUE = 10;


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
    public static DateError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DateError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return INVALID_FIELD_VALUES_IN_DATE;
        case 3: return INVALID_FIELD_VALUES_IN_DATE_TIME;
        case 4: return INVALID_STRING_DATE;
        case 6: return INVALID_STRING_DATE_TIME_MICROS;
        case 11: return INVALID_STRING_DATE_TIME_SECONDS;
        case 12: return INVALID_STRING_DATE_TIME_SECONDS_WITH_OFFSET;
        case 7: return EARLIER_THAN_MINIMUM_DATE;
        case 8: return LATER_THAN_MAXIMUM_DATE;
        case 9: return DATE_RANGE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE;
        case 10: return DATE_RANGE_MINIMUM_AND_MAXIMUM_DATES_BOTH_NULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DateError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DateError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DateError>() {
            public DateError findValueByNumber(int number) {
              return DateError.forNumber(number);
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
      return com.google.ads.googleads.v18.errors.DateErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final DateError[] VALUES = values();

    public static DateError valueOf(
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

    private DateError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.DateErrorEnum.DateError)
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
    if (!(obj instanceof com.google.ads.googleads.v18.errors.DateErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.DateErrorEnum other = (com.google.ads.googleads.v18.errors.DateErrorEnum) obj;

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

  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.DateErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.DateErrorEnum prototype) {
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
   * Container for enum describing possible date errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.DateErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.DateErrorEnum)
      com.google.ads.googleads.v18.errors.DateErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.DateErrorProto.internal_static_google_ads_googleads_v18_errors_DateErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.DateErrorProto.internal_static_google_ads_googleads_v18_errors_DateErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.DateErrorEnum.class, com.google.ads.googleads.v18.errors.DateErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.DateErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v18.errors.DateErrorProto.internal_static_google_ads_googleads_v18_errors_DateErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.DateErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.DateErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.DateErrorEnum build() {
      com.google.ads.googleads.v18.errors.DateErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.DateErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.DateErrorEnum result = new com.google.ads.googleads.v18.errors.DateErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.errors.DateErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.DateErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.DateErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.DateErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.DateErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.DateErrorEnum)
  private static final com.google.ads.googleads.v18.errors.DateErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.DateErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.DateErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<DateErrorEnum>() {
    @java.lang.Override
    public DateErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<DateErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.DateErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

