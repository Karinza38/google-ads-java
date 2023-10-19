// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_set_types.proto

package com.google.ads.googleads.v15.common;

public interface ChainSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.ChainSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. Relationship type the specified chains have with this
   * advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for relationshipType.
   */
  int getRelationshipTypeValue();
  /**
   * <pre>
   * Required. Immutable. Relationship type the specified chains have with this
   * advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The relationshipType.
   */
  com.google.ads.googleads.v15.enums.ChainRelationshipTypeEnum.ChainRelationshipType getRelationshipType();

  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.ChainFilter> 
      getChainsList();
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.common.ChainFilter getChains(int index);
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getChainsCount();
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.ChainFilterOrBuilder> 
      getChainsOrBuilderList();
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.common.ChainFilterOrBuilder getChainsOrBuilder(
      int index);
}
