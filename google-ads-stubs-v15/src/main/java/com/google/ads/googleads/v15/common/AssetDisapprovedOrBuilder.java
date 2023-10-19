// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_policy.proto

package com.google.ads.googleads.v15.common;

public interface AssetDisapprovedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.AssetDisapproved)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return A list containing the offlineEvaluationErrorReasons.
   */
  java.util.List<com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons> getOfflineEvaluationErrorReasonsList();
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return The count of offlineEvaluationErrorReasons.
   */
  int getOfflineEvaluationErrorReasonsCount();
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @param index The index of the element to return.
   * @return The offlineEvaluationErrorReasons at the given index.
   */
  com.google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons getOfflineEvaluationErrorReasons(int index);
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @return A list containing the enum numeric values on the wire for offlineEvaluationErrorReasons.
   */
  java.util.List<java.lang.Integer>
  getOfflineEvaluationErrorReasonsValueList();
  /**
   * <pre>
   * Provides the quality evaluation disapproval reason of an asset.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetOfflineEvaluationErrorReasonsEnum.AssetOfflineEvaluationErrorReasons offline_evaluation_error_reasons = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of offlineEvaluationErrorReasons at the given index.
   */
  int getOfflineEvaluationErrorReasonsValue(int index);
}
