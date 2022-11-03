// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_upload_service.proto

package com.google.ads.googleads.v12.services;

public interface UploadClickConversionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.UploadClickConversionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.ClickConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v12.services.ClickConversion> 
      getConversionsList();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.ClickConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.services.ClickConversion getConversions(int index);
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.ClickConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getConversionsCount();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.ClickConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.services.ClickConversionOrBuilder> 
      getConversionsOrBuilderList();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.ClickConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v12.services.ClickConversionOrBuilder getConversionsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * This should always be set to true.
   * See
   * https://developers.google.com/google-ads/api/docs/best-practices/partial-failures
   * for more information about partial failure.
   * </pre>
   *
   * <code>bool partial_failure = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * If true, the API will perform all upload checks and return errors if
   * any are found. If false, it will perform only basic input validation,
   * skip subsequent upload checks, and return success even if no click
   * was found for the provided `user_identifiers`.
   * This setting only affects Enhanced conversions for leads uploads that use
   * `user_identifiers` instead of `GCLID`, `GBRAID`, or `WBRAID`. When
   * uploading enhanced conversions for leads, you should upload all conversion
   * events to the API, including those that may not come from Google Ads
   * campaigns. The upload of an event that is not from a Google Ads campaign
   * will result in a `CLICK_NOT_FOUND` error if this field is set to `true`.
   * Since these errors are expected for such events, set this field to `false`
   * so you can confirm your uploads are properly formatted but ignore
   * `CLICK_NOT_FOUND` errors from all of the conversions that are not from a
   * Google Ads campaign. This will allow you to focus only on errors that you
   * can address.
   * Default is false.
   * </pre>
   *
   * <code>bool debug_enabled = 5;</code>
   * @return The debugEnabled.
   */
  boolean getDebugEnabled();
}
