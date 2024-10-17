// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/local_services_verification_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface BackgroundCheckVerificationArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.BackgroundCheckVerificationArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. URL to access background case.
   * </pre>
   *
   * <code>optional string case_url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the caseUrl field is set.
   */
  boolean hasCaseUrl();
  /**
   * <pre>
   * Output only. URL to access background case.
   * </pre>
   *
   * <code>optional string case_url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The caseUrl.
   */
  java.lang.String getCaseUrl();
  /**
   * <pre>
   * Output only. URL to access background case.
   * </pre>
   *
   * <code>optional string case_url = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for caseUrl.
   */
  com.google.protobuf.ByteString
      getCaseUrlBytes();

  /**
   * <pre>
   * Output only. The timestamp when this background check case result was
   * adjudicated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads
   * account's timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01
   * 14:34:30"
   * </pre>
   *
   * <code>optional string final_adjudication_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the finalAdjudicationDateTime field is set.
   */
  boolean hasFinalAdjudicationDateTime();
  /**
   * <pre>
   * Output only. The timestamp when this background check case result was
   * adjudicated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads
   * account's timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01
   * 14:34:30"
   * </pre>
   *
   * <code>optional string final_adjudication_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The finalAdjudicationDateTime.
   */
  java.lang.String getFinalAdjudicationDateTime();
  /**
   * <pre>
   * Output only. The timestamp when this background check case result was
   * adjudicated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads
   * account's timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01
   * 14:34:30"
   * </pre>
   *
   * <code>optional string final_adjudication_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for finalAdjudicationDateTime.
   */
  com.google.protobuf.ByteString
      getFinalAdjudicationDateTimeBytes();
}
