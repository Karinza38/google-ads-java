// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/keyword_plan_idea_service.proto

package com.google.ads.googleads.v15.services;

public interface GenerateAdGroupThemesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GenerateAdGroupThemesRequest)
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
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the keywords.
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of keywords.
   */
  int getKeywordsCount();
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  java.lang.String getKeywords(int index);
  /**
   * <pre>
   * Required. A list of keywords to group into the provided AdGroups.
   * </pre>
   *
   * <code>repeated string keywords = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);

  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the adGroups.
   */
  java.util.List<java.lang.String>
      getAdGroupsList();
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of adGroups.
   */
  int getAdGroupsCount();
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The adGroups at the given index.
   */
  java.lang.String getAdGroups(int index);
  /**
   * <pre>
   * Required. A list of resource names of AdGroups to group keywords into.
   *  Resource name format: `customers/{customer_id}/adGroups/{ad_group_id}`
   * </pre>
   *
   * <code>repeated string ad_groups = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the adGroups at the given index.
   */
  com.google.protobuf.ByteString
      getAdGroupsBytes(int index);
}
