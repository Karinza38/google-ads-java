// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/conversion_action_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

/**
 * <pre>
 * Container for enum describing possible conversion action errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.errors.ConversionActionErrorEnum}
 */
public final class ConversionActionErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.errors.ConversionActionErrorEnum)
    ConversionActionErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionActionErrorEnum.newBuilder() to construct.
  private ConversionActionErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionActionErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionActionErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.errors.ConversionActionErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionActionErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.errors.ConversionActionErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionActionErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.class, com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion action errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v18.errors.ConversionActionErrorEnum.ConversionActionError}
   */
  public enum ConversionActionError
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
     * The specified conversion action name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    DUPLICATE_NAME(2),
    /**
     * <pre>
     * Another conversion action with the specified app id already exists.
     * </pre>
     *
     * <code>DUPLICATE_APP_ID = 3;</code>
     */
    DUPLICATE_APP_ID(3),
    /**
     * <pre>
     * Android first open action conflicts with Google play codeless download
     * action tracking the same app.
     * </pre>
     *
     * <code>TWO_CONVERSION_ACTIONS_BIDDING_ON_SAME_APP_DOWNLOAD = 4;</code>
     */
    TWO_CONVERSION_ACTIONS_BIDDING_ON_SAME_APP_DOWNLOAD(4),
    /**
     * <pre>
     * Android first open action conflicts with Google play codeless download
     * action tracking the same app.
     * </pre>
     *
     * <code>BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_ACTION = 5;</code>
     */
    BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_ACTION(5),
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because a data-driven
     * model has never been generated.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED = 6;</code>
     */
    DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED(6),
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is expired.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_EXPIRED = 7;</code>
     */
    DATA_DRIVEN_MODEL_EXPIRED(7),
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is stale.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_STALE = 8;</code>
     */
    DATA_DRIVEN_MODEL_STALE(8),
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is unavailable or the conversion action was newly
     * added.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_UNKNOWN = 9;</code>
     */
    DATA_DRIVEN_MODEL_UNKNOWN(9),
    /**
     * <pre>
     * Creation of this conversion action type isn't supported by Google
     * Ads API.
     * </pre>
     *
     * <code>CREATION_NOT_SUPPORTED = 10;</code>
     */
    CREATION_NOT_SUPPORTED(10),
    /**
     * <pre>
     * Update of this conversion action isn't supported by Google Ads API.
     * </pre>
     *
     * <code>UPDATE_NOT_SUPPORTED = 11;</code>
     */
    UPDATE_NOT_SUPPORTED(11),
    /**
     * <pre>
     * Rule-based attribution models are deprecated and not allowed to be set
     * by conversion action.
     * </pre>
     *
     * <code>CANNOT_SET_RULE_BASED_ATTRIBUTION_MODELS = 12;</code>
     */
    CANNOT_SET_RULE_BASED_ATTRIBUTION_MODELS(12),
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
     * The specified conversion action name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 2;
    /**
     * <pre>
     * Another conversion action with the specified app id already exists.
     * </pre>
     *
     * <code>DUPLICATE_APP_ID = 3;</code>
     */
    public static final int DUPLICATE_APP_ID_VALUE = 3;
    /**
     * <pre>
     * Android first open action conflicts with Google play codeless download
     * action tracking the same app.
     * </pre>
     *
     * <code>TWO_CONVERSION_ACTIONS_BIDDING_ON_SAME_APP_DOWNLOAD = 4;</code>
     */
    public static final int TWO_CONVERSION_ACTIONS_BIDDING_ON_SAME_APP_DOWNLOAD_VALUE = 4;
    /**
     * <pre>
     * Android first open action conflicts with Google play codeless download
     * action tracking the same app.
     * </pre>
     *
     * <code>BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_ACTION = 5;</code>
     */
    public static final int BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_ACTION_VALUE = 5;
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because a data-driven
     * model has never been generated.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED = 6;</code>
     */
    public static final int DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED_VALUE = 6;
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is expired.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_EXPIRED = 7;</code>
     */
    public static final int DATA_DRIVEN_MODEL_EXPIRED_VALUE = 7;
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is stale.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_STALE = 8;</code>
     */
    public static final int DATA_DRIVEN_MODEL_STALE_VALUE = 8;
    /**
     * <pre>
     * The attribution model cannot be set to DATA_DRIVEN because the
     * data-driven model is unavailable or the conversion action was newly
     * added.
     * </pre>
     *
     * <code>DATA_DRIVEN_MODEL_UNKNOWN = 9;</code>
     */
    public static final int DATA_DRIVEN_MODEL_UNKNOWN_VALUE = 9;
    /**
     * <pre>
     * Creation of this conversion action type isn't supported by Google
     * Ads API.
     * </pre>
     *
     * <code>CREATION_NOT_SUPPORTED = 10;</code>
     */
    public static final int CREATION_NOT_SUPPORTED_VALUE = 10;
    /**
     * <pre>
     * Update of this conversion action isn't supported by Google Ads API.
     * </pre>
     *
     * <code>UPDATE_NOT_SUPPORTED = 11;</code>
     */
    public static final int UPDATE_NOT_SUPPORTED_VALUE = 11;
    /**
     * <pre>
     * Rule-based attribution models are deprecated and not allowed to be set
     * by conversion action.
     * </pre>
     *
     * <code>CANNOT_SET_RULE_BASED_ATTRIBUTION_MODELS = 12;</code>
     */
    public static final int CANNOT_SET_RULE_BASED_ATTRIBUTION_MODELS_VALUE = 12;


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
    public static ConversionActionError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionActionError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_NAME;
        case 3: return DUPLICATE_APP_ID;
        case 4: return TWO_CONVERSION_ACTIONS_BIDDING_ON_SAME_APP_DOWNLOAD;
        case 5: return BIDDING_ON_SAME_APP_DOWNLOAD_AS_GLOBAL_ACTION;
        case 6: return DATA_DRIVEN_MODEL_WAS_NEVER_GENERATED;
        case 7: return DATA_DRIVEN_MODEL_EXPIRED;
        case 8: return DATA_DRIVEN_MODEL_STALE;
        case 9: return DATA_DRIVEN_MODEL_UNKNOWN;
        case 10: return CREATION_NOT_SUPPORTED;
        case 11: return UPDATE_NOT_SUPPORTED;
        case 12: return CANNOT_SET_RULE_BASED_ATTRIBUTION_MODELS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionActionError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionActionError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionActionError>() {
            public ConversionActionError findValueByNumber(int number) {
              return ConversionActionError.forNumber(number);
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
      return com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionActionError[] VALUES = values();

    public static ConversionActionError valueOf(
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

    private ConversionActionError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v18.errors.ConversionActionErrorEnum.ConversionActionError)
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
    if (!(obj instanceof com.google.ads.googleads.v18.errors.ConversionActionErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.errors.ConversionActionErrorEnum other = (com.google.ads.googleads.v18.errors.ConversionActionErrorEnum) obj;

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

  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.errors.ConversionActionErrorEnum prototype) {
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
   * Container for enum describing possible conversion action errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.errors.ConversionActionErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.errors.ConversionActionErrorEnum)
      com.google.ads.googleads.v18.errors.ConversionActionErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.errors.ConversionActionErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionActionErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.errors.ConversionActionErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionActionErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.class, com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v18.errors.ConversionActionErrorProto.internal_static_google_ads_googleads_v18_errors_ConversionActionErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionActionErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionActionErrorEnum build() {
      com.google.ads.googleads.v18.errors.ConversionActionErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.errors.ConversionActionErrorEnum buildPartial() {
      com.google.ads.googleads.v18.errors.ConversionActionErrorEnum result = new com.google.ads.googleads.v18.errors.ConversionActionErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v18.errors.ConversionActionErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v18.errors.ConversionActionErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.errors.ConversionActionErrorEnum other) {
      if (other == com.google.ads.googleads.v18.errors.ConversionActionErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.errors.ConversionActionErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.errors.ConversionActionErrorEnum)
  private static final com.google.ads.googleads.v18.errors.ConversionActionErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.errors.ConversionActionErrorEnum();
  }

  public static com.google.ads.googleads.v18.errors.ConversionActionErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionActionErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionActionErrorEnum>() {
    @java.lang.Override
    public ConversionActionErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionActionErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionActionErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.errors.ConversionActionErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

