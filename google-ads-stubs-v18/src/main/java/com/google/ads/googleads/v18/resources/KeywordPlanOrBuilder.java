// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/keyword_plan.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface KeywordPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.KeywordPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   *
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   *
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the keyword plan.
   *
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the keyword plan.
   *
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the keyword plan.
   *
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   * @return Whether the forecastPeriod field is set.
   */
  boolean hasForecastPeriod();
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   * @return The forecastPeriod.
   */
  com.google.ads.googleads.v18.resources.KeywordPlanForecastPeriod getForecastPeriod();
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   */
  com.google.ads.googleads.v18.resources.KeywordPlanForecastPeriodOrBuilder getForecastPeriodOrBuilder();
}
