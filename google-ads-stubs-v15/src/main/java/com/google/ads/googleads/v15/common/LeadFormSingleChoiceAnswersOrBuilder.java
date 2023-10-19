// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

package com.google.ads.googleads.v15.common;

public interface LeadFormSingleChoiceAnswersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.LeadFormSingleChoiceAnswers)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @return A list containing the answers.
   */
  java.util.List<java.lang.String>
      getAnswersList();
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @return The count of answers.
   */
  int getAnswersCount();
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  java.lang.String getAnswers(int index);
  /**
   * <pre>
   * List of choices for a single question field. The order of entries defines
   * UI order. Minimum of 2 answers required and maximum of 12 allowed.
   * </pre>
   *
   * <code>repeated string answers = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  com.google.protobuf.ByteString
      getAnswersBytes(int index);
}
