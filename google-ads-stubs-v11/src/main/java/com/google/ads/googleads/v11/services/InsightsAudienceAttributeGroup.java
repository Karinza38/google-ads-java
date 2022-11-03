// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/audience_insights_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * A list of AudienceInsightsAttributes.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.InsightsAudienceAttributeGroup}
 */
public final class InsightsAudienceAttributeGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)
    InsightsAudienceAttributeGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InsightsAudienceAttributeGroup.newBuilder() to construct.
  private InsightsAudienceAttributeGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InsightsAudienceAttributeGroup() {
    attributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InsightsAudienceAttributeGroup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v11_services_InsightsAudienceAttributeGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v11_services_InsightsAudienceAttributeGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.class, com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.Builder.class);
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v11.services.AudienceInsightsAttribute> attributes_;
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical OR.
   * Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v11.services.AudienceInsightsAttribute> getAttributesList() {
    return attributes_;
  }
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical OR.
   * Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder> 
      getAttributesOrBuilderList() {
    return attributes_;
  }
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical OR.
   * Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getAttributesCount() {
    return attributes_.size();
  }
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical OR.
   * Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.AudienceInsightsAttribute getAttributes(int index) {
    return attributes_.get(index);
  }
  /**
   * <pre>
   * Required. A collection of audience attributes to be combined with logical OR.
   * Attributes need not all be the same dimension.  Only Knowledge Graph
   * entities, Product &amp; Service Categories, and Affinity and In-Market
   * audiences are supported in this context.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder getAttributesOrBuilder(
      int index) {
    return attributes_.get(index);
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
    for (int i = 0; i < attributes_.size(); i++) {
      output.writeMessage(1, attributes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attributes_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup other = (com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup) obj;

    if (!getAttributesList()
        .equals(other.getAttributesList())) return false;
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
    if (getAttributesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup prototype) {
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
   * A list of AudienceInsightsAttributes.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.InsightsAudienceAttributeGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)
      com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v11_services_InsightsAudienceAttributeGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v11_services_InsightsAudienceAttributeGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.class, com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
      } else {
        attributes_ = null;
        attributesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v11_services_InsightsAudienceAttributeGroup_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup build() {
      com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup buildPartial() {
      com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup result = new com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup(this);
      int from_bitField0_ = bitField0_;
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attributes_ = java.util.Collections.unmodifiableList(attributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup) {
        return mergeFrom((com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup other) {
      if (other == com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup.getDefaultInstance()) return this;
      if (attributesBuilder_ == null) {
        if (!other.attributes_.isEmpty()) {
          if (attributes_.isEmpty()) {
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttributesIsMutable();
            attributes_.addAll(other.attributes_);
          }
          onChanged();
        }
      } else {
        if (!other.attributes_.isEmpty()) {
          if (attributesBuilder_.isEmpty()) {
            attributesBuilder_.dispose();
            attributesBuilder_ = null;
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttributesFieldBuilder() : null;
          } else {
            attributesBuilder_.addAllMessages(other.attributes_);
          }
        }
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
              com.google.ads.googleads.v11.services.AudienceInsightsAttribute m =
                  input.readMessage(
                      com.google.ads.googleads.v11.services.AudienceInsightsAttribute.parser(),
                      extensionRegistry);
              if (attributesBuilder_ == null) {
                ensureAttributesIsMutable();
                attributes_.add(m);
              } else {
                attributesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.ads.googleads.v11.services.AudienceInsightsAttribute> attributes_ =
      java.util.Collections.emptyList();
    private void ensureAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attributes_ = new java.util.ArrayList<com.google.ads.googleads.v11.services.AudienceInsightsAttribute>(attributes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.AudienceInsightsAttribute, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder> attributesBuilder_;

    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.AudienceInsightsAttribute> getAttributesList() {
      if (attributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attributes_);
      } else {
        return attributesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getAttributesCount() {
      if (attributesBuilder_ == null) {
        return attributes_.size();
      } else {
        return attributesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.services.AudienceInsightsAttribute getAttributes(int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);
      } else {
        return attributesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAttributes(
        int index, com.google.ads.googleads.v11.services.AudienceInsightsAttribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.set(index, value);
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAttributes(
        int index, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAttributes(com.google.ads.googleads.v11.services.AudienceInsightsAttribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAttributes(
        int index, com.google.ads.googleads.v11.services.AudienceInsightsAttribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(index, value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAttributes(
        com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAttributes(
        int index, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllAttributes(
        java.lang.Iterable<? extends com.google.ads.googleads.v11.services.AudienceInsightsAttribute> values) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attributes_);
        onChanged();
      } else {
        attributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeAttributes(int index) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.remove(index);
        onChanged();
      } else {
        attributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder getAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder getAttributesOrBuilder(
        int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);  } else {
        return attributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder> 
         getAttributesOrBuilderList() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attributes_);
      }
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder addAttributesBuilder() {
      return getAttributesFieldBuilder().addBuilder(
          com.google.ads.googleads.v11.services.AudienceInsightsAttribute.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder addAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A collection of audience attributes to be combined with logical OR.
     * Attributes need not all be the same dimension.  Only Knowledge Graph
     * entities, Product &amp; Service Categories, and Affinity and In-Market
     * audiences are supported in this context.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.AudienceInsightsAttribute attributes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder> 
         getAttributesBuilderList() {
      return getAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.AudienceInsightsAttribute, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v11.services.AudienceInsightsAttribute, com.google.ads.googleads.v11.services.AudienceInsightsAttribute.Builder, com.google.ads.googleads.v11.services.AudienceInsightsAttributeOrBuilder>(
                attributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.InsightsAudienceAttributeGroup)
  private static final com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup();
  }

  public static com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsightsAudienceAttributeGroup>
      PARSER = new com.google.protobuf.AbstractParser<InsightsAudienceAttributeGroup>() {
    @java.lang.Override
    public InsightsAudienceAttributeGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<InsightsAudienceAttributeGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsightsAudienceAttributeGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.InsightsAudienceAttributeGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

