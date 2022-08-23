// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/asset_types.proto

package com.google.ads.googleads.v11.common;

public interface DynamicJobsAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.DynamicJobsAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Job ID which can be any sequence of letters and digits, and must be
   * unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string job_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <pre>
   * Required. Job ID which can be any sequence of letters and digits, and must be
   * unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string job_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <pre>
   * Location ID which can be any sequence of letters and digits. The ID
   * sequence (job ID + location ID) must be unique.
   * </pre>
   *
   * <code>string location_id = 2;</code>
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   * <pre>
   * Location ID which can be any sequence of letters and digits. The ID
   * sequence (job ID + location ID) must be unique.
   * </pre>
   *
   * <code>string location_id = 2;</code>
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString
      getLocationIdBytes();

  /**
   * <pre>
   * Required. Job title, for example, Software engineer. Required.
   * </pre>
   *
   * <code>string job_title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The jobTitle.
   */
  java.lang.String getJobTitle();
  /**
   * <pre>
   * Required. Job title, for example, Software engineer. Required.
   * </pre>
   *
   * <code>string job_title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for jobTitle.
   */
  com.google.protobuf.ByteString
      getJobTitleBytes();

  /**
   * <pre>
   * Job subtitle, for example, Level II.
   * </pre>
   *
   * <code>string job_subtitle = 4;</code>
   * @return The jobSubtitle.
   */
  java.lang.String getJobSubtitle();
  /**
   * <pre>
   * Job subtitle, for example, Level II.
   * </pre>
   *
   * <code>string job_subtitle = 4;</code>
   * @return The bytes for jobSubtitle.
   */
  com.google.protobuf.ByteString
      getJobSubtitleBytes();

  /**
   * <pre>
   * Description, for example, Apply your technical skills.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description, for example, Apply your technical skills.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 6;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 6;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Job category, for example, Technical.
   * </pre>
   *
   * <code>string job_category = 7;</code>
   * @return The jobCategory.
   */
  java.lang.String getJobCategory();
  /**
   * <pre>
   * Job category, for example, Technical.
   * </pre>
   *
   * <code>string job_category = 7;</code>
   * @return The bytes for jobCategory.
   */
  com.google.protobuf.ByteString
      getJobCategoryBytes();

  /**
   * <pre>
   * Contextual keywords, for example, Software engineering job.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, Software engineering job.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, Software engineering job.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, Software engineering job.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string address = 9;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403.
   * </pre>
   *
   * <code>string address = 9;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Salary, for example, $100,000.
   * </pre>
   *
   * <code>string salary = 10;</code>
   * @return The salary.
   */
  java.lang.String getSalary();
  /**
   * <pre>
   * Salary, for example, $100,000.
   * </pre>
   *
   * <code>string salary = 10;</code>
   * @return The bytes for salary.
   */
  com.google.protobuf.ByteString
      getSalaryBytes();

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 11;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 11;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * Similar job IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_job_ids = 12;</code>
   * @return A list containing the similarJobIds.
   */
  java.util.List<java.lang.String>
      getSimilarJobIdsList();
  /**
   * <pre>
   * Similar job IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_job_ids = 12;</code>
   * @return The count of similarJobIds.
   */
  int getSimilarJobIdsCount();
  /**
   * <pre>
   * Similar job IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_job_ids = 12;</code>
   * @param index The index of the element to return.
   * @return The similarJobIds at the given index.
   */
  java.lang.String getSimilarJobIds(int index);
  /**
   * <pre>
   * Similar job IDs, for example, 1275.
   * </pre>
   *
   * <code>repeated string similar_job_ids = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarJobIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarJobIdsBytes(int index);

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 13;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 13;</code>
   * @return The bytes for iosAppLink.
   */
  com.google.protobuf.ByteString
      getIosAppLinkBytes();

  /**
   * <pre>
   * iOS app store ID. This is used to check if the user has the app installed
   * on their device before deep linking. If this field is set, then the
   * ios_app_link field must also be present.
   * </pre>
   *
   * <code>int64 ios_app_store_id = 14;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();
}