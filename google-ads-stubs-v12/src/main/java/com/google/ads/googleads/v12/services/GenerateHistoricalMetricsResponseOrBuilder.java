// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_service.proto

package com.google.ads.googleads.v12.services;

public interface GenerateHistoricalMetricsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.GenerateHistoricalMetricsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics> 
      getMetricsList();
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  com.google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics getMetrics(int index);
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetricsOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * List of keyword historical metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics metrics = 1;</code>
   */
  com.google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetricsOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * The aggregate metrics for all the keywords in the keyword planner plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   * @return Whether the aggregateMetricResults field is set.
   */
  boolean hasAggregateMetricResults();
  /**
   * <pre>
   * The aggregate metrics for all the keywords in the keyword planner plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   * @return The aggregateMetricResults.
   */
  com.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults getAggregateMetricResults();
  /**
   * <pre>
   * The aggregate metrics for all the keywords in the keyword planner plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults aggregate_metric_results = 2;</code>
   */
  com.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResultsOrBuilder getAggregateMetricResultsOrBuilder();
}
