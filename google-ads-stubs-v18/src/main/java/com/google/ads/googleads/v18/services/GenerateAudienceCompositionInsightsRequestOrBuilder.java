// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface GenerateAudienceCompositionInsightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.GenerateAudienceCompositionInsightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The audience of interest for which insights are being requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the audience field is set.
   */
  boolean hasAudience();
  /**
   * <pre>
   * Required. The audience of interest for which insights are being requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audience.
   */
  com.google.ads.googleads.v18.services.InsightsAudience getAudience();
  /**
   * <pre>
   * Required. The audience of interest for which insights are being requested.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.services.InsightsAudienceOrBuilder getAudienceOrBuilder();

  /**
   * <pre>
   * The baseline audience to which the audience of interest is being
   * compared.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience baseline_audience = 6;</code>
   * @return Whether the baselineAudience field is set.
   */
  boolean hasBaselineAudience();
  /**
   * <pre>
   * The baseline audience to which the audience of interest is being
   * compared.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience baseline_audience = 6;</code>
   * @return The baselineAudience.
   */
  com.google.ads.googleads.v18.services.InsightsAudience getBaselineAudience();
  /**
   * <pre>
   * The baseline audience to which the audience of interest is being
   * compared.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.InsightsAudience baseline_audience = 6;</code>
   */
  com.google.ads.googleads.v18.services.InsightsAudienceOrBuilder getBaselineAudienceOrBuilder();

  /**
   * <pre>
   * The one-month range of historical data to use for insights, in the format
   * "yyyy-mm". If unset, insights will be returned for the last thirty days of
   * data.
   * </pre>
   *
   * <code>string data_month = 3;</code>
   * @return The dataMonth.
   */
  java.lang.String getDataMonth();
  /**
   * <pre>
   * The one-month range of historical data to use for insights, in the format
   * "yyyy-mm". If unset, insights will be returned for the last thirty days of
   * data.
   * </pre>
   *
   * <code>string data_month = 3;</code>
   * @return The bytes for dataMonth.
   */
  com.google.protobuf.ByteString
      getDataMonthBytes();

  /**
   * <pre>
   * Required. The audience dimensions for which composition insights should be
   * returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the dimensions.
   */
  java.util.List<com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension> getDimensionsList();
  /**
   * <pre>
   * Required. The audience dimensions for which composition insights should be
   * returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of dimensions.
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Required. The audience dimensions for which composition insights should be
   * returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The dimensions at the given index.
   */
  com.google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension getDimensions(int index);
  /**
   * <pre>
   * Required. The audience dimensions for which composition insights should be
   * returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for dimensions.
   */
  java.util.List<java.lang.Integer>
  getDimensionsValueList();
  /**
   * <pre>
   * Required. The audience dimensions for which composition insights should be
   * returned.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension dimensions = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dimensions at the given index.
   */
  int getDimensionsValue(int index);

  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 5;</code>
   * @return The customerInsightsGroup.
   */
  java.lang.String getCustomerInsightsGroup();
  /**
   * <pre>
   * The name of the customer being planned for.  This is a user-defined value.
   * </pre>
   *
   * <code>string customer_insights_group = 5;</code>
   * @return The bytes for customerInsightsGroup.
   */
  com.google.protobuf.ByteString
      getCustomerInsightsGroupBytes();
}
