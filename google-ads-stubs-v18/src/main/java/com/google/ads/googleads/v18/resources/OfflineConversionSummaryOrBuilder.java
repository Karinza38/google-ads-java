// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/offline_conversion_upload_client_summary.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface OfflineConversionSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.OfflineConversionSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Total count of successful event.
   * </pre>
   *
   * <code>int64 successful_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The successfulCount.
   */
  long getSuccessfulCount();

  /**
   * <pre>
   * Output only. Total count of failed event.
   * </pre>
   *
   * <code>int64 failed_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failedCount.
   */
  long getFailedCount();

  /**
   * <pre>
   * Output only. Total count of pending uploaded event.
   * </pre>
   *
   * <code>int64 pending_count = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pendingCount.
   */
  long getPendingCount();

  /**
   * <pre>
   * Output only. Dimension key for last N jobs.
   * </pre>
   *
   * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the jobId field is set.
   */
  boolean hasJobId();
  /**
   * <pre>
   * Output only. Dimension key for last N jobs.
   * </pre>
   *
   * <code>int64 job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The jobId.
   */
  long getJobId();

  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the uploadDate field is set.
   */
  boolean hasUploadDate();
  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uploadDate.
   */
  java.lang.String getUploadDate();
  /**
   * <pre>
   * Output only. Dimension key for last N days.
   * </pre>
   *
   * <code>string upload_date = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uploadDate.
   */
  com.google.protobuf.ByteString
      getUploadDateBytes();

  com.google.ads.googleads.v18.resources.OfflineConversionSummary.DimensionKeyCase getDimensionKeyCase();
}
