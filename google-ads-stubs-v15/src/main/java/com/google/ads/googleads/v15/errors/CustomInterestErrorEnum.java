// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/custom_interest_error.proto

package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible custom interest errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.CustomInterestErrorEnum}
 */
public final class CustomInterestErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.CustomInterestErrorEnum)
    CustomInterestErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomInterestErrorEnum.newBuilder() to construct.
  private CustomInterestErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomInterestErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomInterestErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.CustomInterestErrorProto.internal_static_google_ads_googleads_v15_errors_CustomInterestErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.CustomInterestErrorProto.internal_static_google_ads_googleads_v15_errors_CustomInterestErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.class, com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible custom interest errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.CustomInterestErrorEnum.CustomInterestError}
   */
  public enum CustomInterestError
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
     * Duplicate custom interest name ignoring case.
     * </pre>
     *
     * <code>NAME_ALREADY_USED = 2;</code>
     */
    NAME_ALREADY_USED(2),
    /**
     * <pre>
     * In the remove custom interest member operation, both member ID and
     * pair [type, parameter] are not present.
     * </pre>
     *
     * <code>CUSTOM_INTEREST_MEMBER_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE = 3;</code>
     */
    CUSTOM_INTEREST_MEMBER_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE(3),
    /**
     * <pre>
     * The pair of [type, parameter] does not exist.
     * </pre>
     *
     * <code>TYPE_AND_PARAMETER_NOT_FOUND = 4;</code>
     */
    TYPE_AND_PARAMETER_NOT_FOUND(4),
    /**
     * <pre>
     * The pair of [type, parameter] already exists.
     * </pre>
     *
     * <code>TYPE_AND_PARAMETER_ALREADY_EXISTED = 5;</code>
     */
    TYPE_AND_PARAMETER_ALREADY_EXISTED(5),
    /**
     * <pre>
     * Unsupported custom interest member type.
     * </pre>
     *
     * <code>INVALID_CUSTOM_INTEREST_MEMBER_TYPE = 6;</code>
     */
    INVALID_CUSTOM_INTEREST_MEMBER_TYPE(6),
    /**
     * <pre>
     * Cannot remove a custom interest while it's still being targeted.
     * </pre>
     *
     * <code>CANNOT_REMOVE_WHILE_IN_USE = 7;</code>
     */
    CANNOT_REMOVE_WHILE_IN_USE(7),
    /**
     * <pre>
     * Cannot mutate custom interest type.
     * </pre>
     *
     * <code>CANNOT_CHANGE_TYPE = 8;</code>
     */
    CANNOT_CHANGE_TYPE(8),
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
     * Duplicate custom interest name ignoring case.
     * </pre>
     *
     * <code>NAME_ALREADY_USED = 2;</code>
     */
    public static final int NAME_ALREADY_USED_VALUE = 2;
    /**
     * <pre>
     * In the remove custom interest member operation, both member ID and
     * pair [type, parameter] are not present.
     * </pre>
     *
     * <code>CUSTOM_INTEREST_MEMBER_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE = 3;</code>
     */
    public static final int CUSTOM_INTEREST_MEMBER_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE_VALUE = 3;
    /**
     * <pre>
     * The pair of [type, parameter] does not exist.
     * </pre>
     *
     * <code>TYPE_AND_PARAMETER_NOT_FOUND = 4;</code>
     */
    public static final int TYPE_AND_PARAMETER_NOT_FOUND_VALUE = 4;
    /**
     * <pre>
     * The pair of [type, parameter] already exists.
     * </pre>
     *
     * <code>TYPE_AND_PARAMETER_ALREADY_EXISTED = 5;</code>
     */
    public static final int TYPE_AND_PARAMETER_ALREADY_EXISTED_VALUE = 5;
    /**
     * <pre>
     * Unsupported custom interest member type.
     * </pre>
     *
     * <code>INVALID_CUSTOM_INTEREST_MEMBER_TYPE = 6;</code>
     */
    public static final int INVALID_CUSTOM_INTEREST_MEMBER_TYPE_VALUE = 6;
    /**
     * <pre>
     * Cannot remove a custom interest while it's still being targeted.
     * </pre>
     *
     * <code>CANNOT_REMOVE_WHILE_IN_USE = 7;</code>
     */
    public static final int CANNOT_REMOVE_WHILE_IN_USE_VALUE = 7;
    /**
     * <pre>
     * Cannot mutate custom interest type.
     * </pre>
     *
     * <code>CANNOT_CHANGE_TYPE = 8;</code>
     */
    public static final int CANNOT_CHANGE_TYPE_VALUE = 8;


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
    public static CustomInterestError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomInterestError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NAME_ALREADY_USED;
        case 3: return CUSTOM_INTEREST_MEMBER_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE;
        case 4: return TYPE_AND_PARAMETER_NOT_FOUND;
        case 5: return TYPE_AND_PARAMETER_ALREADY_EXISTED;
        case 6: return INVALID_CUSTOM_INTEREST_MEMBER_TYPE;
        case 7: return CANNOT_REMOVE_WHILE_IN_USE;
        case 8: return CANNOT_CHANGE_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomInterestError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomInterestError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomInterestError>() {
            public CustomInterestError findValueByNumber(int number) {
              return CustomInterestError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomInterestError[] VALUES = values();

    public static CustomInterestError valueOf(
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

    private CustomInterestError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.CustomInterestErrorEnum.CustomInterestError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.CustomInterestErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.CustomInterestErrorEnum other = (com.google.ads.googleads.v15.errors.CustomInterestErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.CustomInterestErrorEnum prototype) {
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
   * Container for enum describing possible custom interest errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.CustomInterestErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.CustomInterestErrorEnum)
      com.google.ads.googleads.v15.errors.CustomInterestErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.CustomInterestErrorProto.internal_static_google_ads_googleads_v15_errors_CustomInterestErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.CustomInterestErrorProto.internal_static_google_ads_googleads_v15_errors_CustomInterestErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.class, com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.CustomInterestErrorProto.internal_static_google_ads_googleads_v15_errors_CustomInterestErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CustomInterestErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CustomInterestErrorEnum build() {
      com.google.ads.googleads.v15.errors.CustomInterestErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.CustomInterestErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.CustomInterestErrorEnum result = new com.google.ads.googleads.v15.errors.CustomInterestErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.CustomInterestErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.CustomInterestErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.CustomInterestErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.CustomInterestErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.CustomInterestErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.CustomInterestErrorEnum)
  private static final com.google.ads.googleads.v15.errors.CustomInterestErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.CustomInterestErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.CustomInterestErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomInterestErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CustomInterestErrorEnum>() {
    @java.lang.Override
    public CustomInterestErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomInterestErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomInterestErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.CustomInterestErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

