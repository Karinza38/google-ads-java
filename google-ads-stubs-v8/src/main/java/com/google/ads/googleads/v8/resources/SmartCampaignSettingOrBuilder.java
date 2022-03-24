// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/smart_campaign_setting.proto

package com.google.ads.googleads.v8.resources;

public interface SmartCampaignSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.SmartCampaignSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Smart campaign setting.
   * Smart campaign setting resource names have the form:
   * `customers/{customer_id}/smartCampaignSettings/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Smart campaign setting.
   * Smart campaign setting resource names have the form:
   * `customers/{customer_id}/smartCampaignSettings/{campaign_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The campaign to which these settings apply.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The campaign to which these settings apply.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Phone number and country code.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.SmartCampaignSetting.PhoneNumber phone_number = 3;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * Phone number and country code.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.SmartCampaignSetting.PhoneNumber phone_number = 3;</code>
   * @return The phoneNumber.
   */
  com.google.ads.googleads.v8.resources.SmartCampaignSetting.PhoneNumber getPhoneNumber();
  /**
   * <pre>
   * Phone number and country code.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.resources.SmartCampaignSetting.PhoneNumber phone_number = 3;</code>
   */
  com.google.ads.googleads.v8.resources.SmartCampaignSetting.PhoneNumberOrBuilder getPhoneNumberOrBuilder();

  /**
   * <pre>
   * Landing page url given by user for this Campaign.
   * </pre>
   *
   * <code>string final_url = 4;</code>
   * @return The finalUrl.
   */
  java.lang.String getFinalUrl();
  /**
   * <pre>
   * Landing page url given by user for this Campaign.
   * </pre>
   *
   * <code>string final_url = 4;</code>
   * @return The bytes for finalUrl.
   */
  com.google.protobuf.ByteString
      getFinalUrlBytes();

  /**
   * <pre>
   * The ISO-639-1 language code to advertise in.
   * </pre>
   *
   * <code>string advertising_language_code = 7;</code>
   * @return The advertisingLanguageCode.
   */
  java.lang.String getAdvertisingLanguageCode();
  /**
   * <pre>
   * The ISO-639-1 language code to advertise in.
   * </pre>
   *
   * <code>string advertising_language_code = 7;</code>
   * @return The bytes for advertisingLanguageCode.
   */
  com.google.protobuf.ByteString
      getAdvertisingLanguageCodeBytes();

  /**
   * <pre>
   * The name of the business.
   * </pre>
   *
   * <code>string business_name = 5;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The name of the business.
   * </pre>
   *
   * <code>string business_name = 5;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The name of the business.
   * </pre>
   *
   * <code>string business_name = 5;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * The ID of the Business Profile location.
   * The location ID can be fetched by Business Profile API with its form:
   * accounts/{accountId}/locations/{locationId}. The last {locationId}
   * component from the Business Profile API represents the
   * business_location_id. See the [Business Profile API]
   * (https://developers.google.com/my-business/reference/rest/v4/accounts.locations)
   * </pre>
   *
   * <code>int64 business_location_id = 6;</code>
   * @return Whether the businessLocationId field is set.
   */
  boolean hasBusinessLocationId();
  /**
   * <pre>
   * The ID of the Business Profile location.
   * The location ID can be fetched by Business Profile API with its form:
   * accounts/{accountId}/locations/{locationId}. The last {locationId}
   * component from the Business Profile API represents the
   * business_location_id. See the [Business Profile API]
   * (https://developers.google.com/my-business/reference/rest/v4/accounts.locations)
   * </pre>
   *
   * <code>int64 business_location_id = 6;</code>
   * @return The businessLocationId.
   */
  long getBusinessLocationId();

  public com.google.ads.googleads.v8.resources.SmartCampaignSetting.BusinessSettingCase getBusinessSettingCase();
}