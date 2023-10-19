// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_service.proto

package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Response message for
 * [CustomerService.ListAccessibleCustomers][google.ads.googleads.v15.services.CustomerService.ListAccessibleCustomers].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.ListAccessibleCustomersResponse}
 */
public final class ListAccessibleCustomersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.ListAccessibleCustomersResponse)
    ListAccessibleCustomersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAccessibleCustomersResponse.newBuilder() to construct.
  private ListAccessibleCustomersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAccessibleCustomersResponse() {
    resourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAccessibleCustomersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.CustomerServiceProto.internal_static_google_ads_googleads_v15_services_ListAccessibleCustomersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.CustomerServiceProto.internal_static_google_ads_googleads_v15_services_ListAccessibleCustomersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.class, com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.Builder.class);
  }

  public static final int RESOURCE_NAMES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList resourceNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Resource name of customers directly accessible by the
   * user authenticating the call.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   * @return A list containing the resourceNames.
   */
  public com.google.protobuf.ProtocolStringList
      getResourceNamesList() {
    return resourceNames_;
  }
  /**
   * <pre>
   * Resource name of customers directly accessible by the
   * user authenticating the call.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   * @return The count of resourceNames.
   */
  public int getResourceNamesCount() {
    return resourceNames_.size();
  }
  /**
   * <pre>
   * Resource name of customers directly accessible by the
   * user authenticating the call.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  public java.lang.String getResourceNames(int index) {
    return resourceNames_.get(index);
  }
  /**
   * <pre>
   * Resource name of customers directly accessible by the
   * user authenticating the call.
   * </pre>
   *
   * <code>repeated string resource_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  public com.google.protobuf.ByteString
      getResourceNamesBytes(int index) {
    return resourceNames_.getByteString(index);
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
    for (int i = 0; i < resourceNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < resourceNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceNamesList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse other = (com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse) obj;

    if (!getResourceNamesList()
        .equals(other.getResourceNamesList())) return false;
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
    if (getResourceNamesCount() > 0) {
      hash = (37 * hash) + RESOURCE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getResourceNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse prototype) {
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
   * Response message for
   * [CustomerService.ListAccessibleCustomers][google.ads.googleads.v15.services.CustomerService.ListAccessibleCustomers].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.ListAccessibleCustomersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.ListAccessibleCustomersResponse)
      com.google.ads.googleads.v15.services.ListAccessibleCustomersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.CustomerServiceProto.internal_static_google_ads_googleads_v15_services_ListAccessibleCustomersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.CustomerServiceProto.internal_static_google_ads_googleads_v15_services_ListAccessibleCustomersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.class, com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.CustomerServiceProto.internal_static_google_ads_googleads_v15_services_ListAccessibleCustomersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse build() {
      com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse buildPartial() {
      com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse result = new com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        resourceNames_.makeImmutable();
        result.resourceNames_ = resourceNames_;
      }
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
      if (other instanceof com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse) {
        return mergeFrom((com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse other) {
      if (other == com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse.getDefaultInstance()) return this;
      if (!other.resourceNames_.isEmpty()) {
        if (resourceNames_.isEmpty()) {
          resourceNames_ = other.resourceNames_;
          bitField0_ |= 0x00000001;
        } else {
          ensureResourceNamesIsMutable();
          resourceNames_.addAll(other.resourceNames_);
        }
        onChanged();
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureResourceNamesIsMutable();
              resourceNames_.add(s);
              break;
            } // case 10
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
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList resourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureResourceNamesIsMutable() {
      if (!resourceNames_.isModifiable()) {
        resourceNames_ = new com.google.protobuf.LazyStringArrayList(resourceNames_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @return A list containing the resourceNames.
     */
    public com.google.protobuf.ProtocolStringList
        getResourceNamesList() {
      resourceNames_.makeImmutable();
      return resourceNames_;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @return The count of resourceNames.
     */
    public int getResourceNamesCount() {
      return resourceNames_.size();
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param index The index of the element to return.
     * @return The resourceNames at the given index.
     */
    public java.lang.String getResourceNames(int index) {
      return resourceNames_.get(index);
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the resourceNames at the given index.
     */
    public com.google.protobuf.ByteString
        getResourceNamesBytes(int index) {
      return resourceNames_.getByteString(index);
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param index The index to set the value at.
     * @param value The resourceNames to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureResourceNamesIsMutable();
      resourceNames_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param value The resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addResourceNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureResourceNamesIsMutable();
      resourceNames_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param values The resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureResourceNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourceNames_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceNames() {
      resourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     *
     * <code>repeated string resource_names = 1;</code>
     * @param value The bytes of the resourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addResourceNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureResourceNamesIsMutable();
      resourceNames_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.ListAccessibleCustomersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.ListAccessibleCustomersResponse)
  private static final com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse();
  }

  public static com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAccessibleCustomersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAccessibleCustomersResponse>() {
    @java.lang.Override
    public ListAccessibleCustomersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAccessibleCustomersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAccessibleCustomersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

