// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/lead_form_submission_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface CustomLeadFormSubmissionFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.CustomLeadFormSubmissionField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Question text for custom question, maximum number of
   * characters is 300.
   * </pre>
   *
   * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The questionText.
   */
  java.lang.String getQuestionText();
  /**
   * <pre>
   * Output only. Question text for custom question, maximum number of
   * characters is 300.
   * </pre>
   *
   * <code>string question_text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for questionText.
   */
  com.google.protobuf.ByteString
      getQuestionTextBytes();

  /**
   * <pre>
   * Output only. Field value for custom question response, maximum number of
   * characters is 70.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldValue.
   */
  java.lang.String getFieldValue();
  /**
   * <pre>
   * Output only. Field value for custom question response, maximum number of
   * characters is 70.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for fieldValue.
   */
  com.google.protobuf.ByteString
      getFieldValueBytes();
}
