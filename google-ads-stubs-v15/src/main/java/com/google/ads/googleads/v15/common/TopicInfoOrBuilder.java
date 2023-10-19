// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/criteria.proto

package com.google.ads.googleads.v15.common;

public interface TopicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.TopicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>optional string topic_constant = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the topicConstant field is set.
   */
  boolean hasTopicConstant();
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>optional string topic_constant = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The topicConstant.
   */
  java.lang.String getTopicConstant();
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>optional string topic_constant = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for topicConstant.
   */
  com.google.protobuf.ByteString
      getTopicConstantBytes();

  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @return A list containing the path.
   */
  java.util.List<java.lang.String>
      getPathList();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @return The count of path.
   */
  int getPathCount();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  java.lang.String getPath(int index);
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated string path = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the path at the given index.
   */
  com.google.protobuf.ByteString
      getPathBytes(int index);
}
