// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/user_lists.proto

package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * Represents a user list that is a custom combination of user lists.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.LogicalUserListInfo}
 */
public final class LogicalUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.LogicalUserListInfo)
    LogicalUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogicalUserListInfo.newBuilder() to construct.
  private LogicalUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogicalUserListInfo() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogicalUserListInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.LogicalUserListInfo.class, com.google.ads.googleads.v15.common.LogicalUserListInfo.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo> rules_;
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   *
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   *
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   *
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   *
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.UserListLogicalRuleInfo getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   *
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
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
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rules_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.LogicalUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.LogicalUserListInfo other = (com.google.ads.googleads.v15.common.LogicalUserListInfo) obj;

    if (!getRulesList()
        .equals(other.getRulesList())) return false;
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
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.LogicalUserListInfo prototype) {
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
   * Represents a user list that is a custom combination of user lists.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.LogicalUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.LogicalUserListInfo)
      com.google.ads.googleads.v15.common.LogicalUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.LogicalUserListInfo.class, com.google.ads.googleads.v15.common.LogicalUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.LogicalUserListInfo.newBuilder()
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
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
      } else {
        rules_ = null;
        rulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.LogicalUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListInfo build() {
      com.google.ads.googleads.v15.common.LogicalUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListInfo buildPartial() {
      com.google.ads.googleads.v15.common.LogicalUserListInfo result = new com.google.ads.googleads.v15.common.LogicalUserListInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v15.common.LogicalUserListInfo result) {
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.LogicalUserListInfo result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v15.common.LogicalUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v15.common.LogicalUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.LogicalUserListInfo other) {
      if (other == com.google.ads.googleads.v15.common.LogicalUserListInfo.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
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
              com.google.ads.googleads.v15.common.UserListLogicalRuleInfo m =
                  input.readMessage(
                      com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.parser(),
                      extensionRegistry);
              if (rulesBuilder_ == null) {
                ensureRulesIsMutable();
                rules_.add(m);
              } else {
                rulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rules_ = new java.util.ArrayList<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo>(rules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.common.UserListLogicalRuleInfo, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder, com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder> rulesBuilder_;

    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public com.google.ads.googleads.v15.common.UserListLogicalRuleInfo getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder setRules(
        int index, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder setRules(
        int index, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder addRules(com.google.ads.googleads.v15.common.UserListLogicalRuleInfo value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder addRules(
        int index, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder addRules(
        com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder addRules(
        int index, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.ads.googleads.v15.common.UserListLogicalRuleInfo> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Logical list rules that define this user list. The rules are defined as a
     * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
     * ANDed when they are evaluated.
     *
     * Required for creating a logical user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.UserListLogicalRuleInfo rules = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.common.UserListLogicalRuleInfo, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder, com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v15.common.UserListLogicalRuleInfo, com.google.ads.googleads.v15.common.UserListLogicalRuleInfo.Builder, com.google.ads.googleads.v15.common.UserListLogicalRuleInfoOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.LogicalUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.LogicalUserListInfo)
  private static final com.google.ads.googleads.v15.common.LogicalUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.LogicalUserListInfo();
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogicalUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<LogicalUserListInfo>() {
    @java.lang.Override
    public LogicalUserListInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogicalUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogicalUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.LogicalUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

