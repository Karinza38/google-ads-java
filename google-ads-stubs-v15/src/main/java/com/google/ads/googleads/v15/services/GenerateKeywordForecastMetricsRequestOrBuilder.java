// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v15.services;

public interface GenerateKeywordForecastMetricsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GenerateKeywordForecastMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The currency used for exchange rate conversion.
   * By default, the account currency of the customer is used.
   * Set this field only if the currency is different from the account currency.
   * The list of valid currency codes can be found at
   * https://developers.google.com/google-ads/api/data/codes-formats#currency-codes.
   * </pre>
   *
   * <code>optional string currency_code = 2;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * The currency used for exchange rate conversion.
   * By default, the account currency of the customer is used.
   * Set this field only if the currency is different from the account currency.
   * The list of valid currency codes can be found at
   * https://developers.google.com/google-ads/api/data/codes-formats#currency-codes.
   * </pre>
   *
   * <code>optional string currency_code = 2;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * The currency used for exchange rate conversion.
   * By default, the account currency of the customer is used.
   * Set this field only if the currency is different from the account currency.
   * The list of valid currency codes can be found at
   * https://developers.google.com/google-ads/api/data/codes-formats#currency-codes.
   * </pre>
   *
   * <code>optional string currency_code = 2;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * The date range for the forecast. The start date must be in the future and
   * end date must be within 1 year from today. The reference timezone used is
   * the one of the Google Ads account belonging to the customer. If not set, a
   * default date range from next Sunday to the following Saturday will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange forecast_period = 3;</code>
   * @return Whether the forecastPeriod field is set.
   */
  boolean hasForecastPeriod();
  /**
   * <pre>
   * The date range for the forecast. The start date must be in the future and
   * end date must be within 1 year from today. The reference timezone used is
   * the one of the Google Ads account belonging to the customer. If not set, a
   * default date range from next Sunday to the following Saturday will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange forecast_period = 3;</code>
   * @return The forecastPeriod.
   */
  com.google.ads.googleads.v15.common.DateRange getForecastPeriod();
  /**
   * <pre>
   * The date range for the forecast. The start date must be in the future and
   * end date must be within 1 year from today. The reference timezone used is
   * the one of the Google Ads account belonging to the customer. If not set, a
   * default date range from next Sunday to the following Saturday will be used.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.DateRange forecast_period = 3;</code>
   */
  com.google.ads.googleads.v15.common.DateRangeOrBuilder getForecastPeriodOrBuilder();

  /**
   * <pre>
   * Required. The campaign used in the forecast.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.CampaignToForecast campaign = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Required. The campaign used in the forecast.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.CampaignToForecast campaign = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The campaign.
   */
  com.google.ads.googleads.v15.services.CampaignToForecast getCampaign();
  /**
   * <pre>
   * Required. The campaign used in the forecast.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.CampaignToForecast campaign = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.CampaignToForecastOrBuilder getCampaignOrBuilder();
}
