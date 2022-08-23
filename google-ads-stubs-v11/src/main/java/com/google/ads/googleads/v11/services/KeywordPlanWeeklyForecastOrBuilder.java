// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

public interface KeywordPlanWeeklyForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   * @return Whether the forecast field is set.
   */
  boolean hasForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   * @return The forecast.
   */
  com.google.ads.googleads.v11.services.ForecastMetrics getForecast();
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   */
  com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder getForecastOrBuilder();
}