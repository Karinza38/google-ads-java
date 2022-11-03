// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/user_list_string_rule_item_operator.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Supported rule operator for string type.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum}
 */
public final class UserListStringRuleItemOperatorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)
    UserListStringRuleItemOperatorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListStringRuleItemOperatorEnum.newBuilder() to construct.
  private UserListStringRuleItemOperatorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListStringRuleItemOperatorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListStringRuleItemOperatorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.internal_static_google_ads_googleads_v10_enums_UserListStringRuleItemOperatorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.internal_static_google_ads_googleads_v10_enums_UserListStringRuleItemOperatorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.class, com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible user list string rule item operators.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator}
   */
  public enum UserListStringRuleItemOperator
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
     * Contains.
     * </pre>
     *
     * <code>CONTAINS = 2;</code>
     */
    CONTAINS(2),
    /**
     * <pre>
     * Equals.
     * </pre>
     *
     * <code>EQUALS = 3;</code>
     */
    EQUALS(3),
    /**
     * <pre>
     * Starts with.
     * </pre>
     *
     * <code>STARTS_WITH = 4;</code>
     */
    STARTS_WITH(4),
    /**
     * <pre>
     * Ends with.
     * </pre>
     *
     * <code>ENDS_WITH = 5;</code>
     */
    ENDS_WITH(5),
    /**
     * <pre>
     * Not equals.
     * </pre>
     *
     * <code>NOT_EQUALS = 6;</code>
     */
    NOT_EQUALS(6),
    /**
     * <pre>
     * Not contains.
     * </pre>
     *
     * <code>NOT_CONTAINS = 7;</code>
     */
    NOT_CONTAINS(7),
    /**
     * <pre>
     * Not starts with.
     * </pre>
     *
     * <code>NOT_STARTS_WITH = 8;</code>
     */
    NOT_STARTS_WITH(8),
    /**
     * <pre>
     * Not ends with.
     * </pre>
     *
     * <code>NOT_ENDS_WITH = 9;</code>
     */
    NOT_ENDS_WITH(9),
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
     * Contains.
     * </pre>
     *
     * <code>CONTAINS = 2;</code>
     */
    public static final int CONTAINS_VALUE = 2;
    /**
     * <pre>
     * Equals.
     * </pre>
     *
     * <code>EQUALS = 3;</code>
     */
    public static final int EQUALS_VALUE = 3;
    /**
     * <pre>
     * Starts with.
     * </pre>
     *
     * <code>STARTS_WITH = 4;</code>
     */
    public static final int STARTS_WITH_VALUE = 4;
    /**
     * <pre>
     * Ends with.
     * </pre>
     *
     * <code>ENDS_WITH = 5;</code>
     */
    public static final int ENDS_WITH_VALUE = 5;
    /**
     * <pre>
     * Not equals.
     * </pre>
     *
     * <code>NOT_EQUALS = 6;</code>
     */
    public static final int NOT_EQUALS_VALUE = 6;
    /**
     * <pre>
     * Not contains.
     * </pre>
     *
     * <code>NOT_CONTAINS = 7;</code>
     */
    public static final int NOT_CONTAINS_VALUE = 7;
    /**
     * <pre>
     * Not starts with.
     * </pre>
     *
     * <code>NOT_STARTS_WITH = 8;</code>
     */
    public static final int NOT_STARTS_WITH_VALUE = 8;
    /**
     * <pre>
     * Not ends with.
     * </pre>
     *
     * <code>NOT_ENDS_WITH = 9;</code>
     */
    public static final int NOT_ENDS_WITH_VALUE = 9;


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
    public static UserListStringRuleItemOperator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserListStringRuleItemOperator forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CONTAINS;
        case 3: return EQUALS;
        case 4: return STARTS_WITH;
        case 5: return ENDS_WITH;
        case 6: return NOT_EQUALS;
        case 7: return NOT_CONTAINS;
        case 8: return NOT_STARTS_WITH;
        case 9: return NOT_ENDS_WITH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserListStringRuleItemOperator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserListStringRuleItemOperator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserListStringRuleItemOperator>() {
            public UserListStringRuleItemOperator findValueByNumber(int number) {
              return UserListStringRuleItemOperator.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserListStringRuleItemOperator[] VALUES = values();

    public static UserListStringRuleItemOperator valueOf(
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

    private UserListStringRuleItemOperator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator)
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
    if (!(obj instanceof com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum other = (com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum) obj;

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

  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum prototype) {
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
   * Supported rule operator for string type.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)
      com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.internal_static_google_ads_googleads_v10_enums_UserListStringRuleItemOperatorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.internal_static_google_ads_googleads_v10_enums_UserListStringRuleItemOperatorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.class, com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.newBuilder()
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
      return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorProto.internal_static_google_ads_googleads_v10_enums_UserListStringRuleItemOperatorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum build() {
      com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum buildPartial() {
      com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum result = new com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum other) {
      if (other == com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum)
  private static final com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum();
  }

  public static com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListStringRuleItemOperatorEnum>
      PARSER = new com.google.protobuf.AbstractParser<UserListStringRuleItemOperatorEnum>() {
    @java.lang.Override
    public UserListStringRuleItemOperatorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListStringRuleItemOperatorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListStringRuleItemOperatorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.UserListStringRuleItemOperatorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

