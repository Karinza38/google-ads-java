// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/audience_insights_service.proto

package com.google.ads.googleads.v15.services;

public interface AudienceCompositionAttributeClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AudienceCompositionAttributeCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of this cluster of attributes
   * </pre>
   *
   * <code>string cluster_display_name = 1;</code>
   * @return The clusterDisplayName.
   */
  java.lang.String getClusterDisplayName();
  /**
   * <pre>
   * The name of this cluster of attributes
   * </pre>
   *
   * <code>string cluster_display_name = 1;</code>
   * @return The bytes for clusterDisplayName.
   */
  com.google.protobuf.ByteString
      getClusterDisplayNameBytes();

  /**
   * <pre>
   * If the dimension associated with this cluster is YOUTUBE_CHANNEL, then
   * cluster_metrics are metrics associated with the cluster as a whole.
   * For other dimensions, this field is unset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceCompositionMetrics cluster_metrics = 3;</code>
   * @return Whether the clusterMetrics field is set.
   */
  boolean hasClusterMetrics();
  /**
   * <pre>
   * If the dimension associated with this cluster is YOUTUBE_CHANNEL, then
   * cluster_metrics are metrics associated with the cluster as a whole.
   * For other dimensions, this field is unset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceCompositionMetrics cluster_metrics = 3;</code>
   * @return The clusterMetrics.
   */
  com.google.ads.googleads.v15.services.AudienceCompositionMetrics getClusterMetrics();
  /**
   * <pre>
   * If the dimension associated with this cluster is YOUTUBE_CHANNEL, then
   * cluster_metrics are metrics associated with the cluster as a whole.
   * For other dimensions, this field is unset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceCompositionMetrics cluster_metrics = 3;</code>
   */
  com.google.ads.googleads.v15.services.AudienceCompositionMetricsOrBuilder getClusterMetricsOrBuilder();

  /**
   * <pre>
   * The individual attributes that make up this cluster, with metadata and
   * metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceCompositionAttribute attributes = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.AudienceCompositionAttribute> 
      getAttributesList();
  /**
   * <pre>
   * The individual attributes that make up this cluster, with metadata and
   * metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceCompositionAttribute attributes = 4;</code>
   */
  com.google.ads.googleads.v15.services.AudienceCompositionAttribute getAttributes(int index);
  /**
   * <pre>
   * The individual attributes that make up this cluster, with metadata and
   * metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceCompositionAttribute attributes = 4;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * The individual attributes that make up this cluster, with metadata and
   * metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceCompositionAttribute attributes = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.AudienceCompositionAttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * The individual attributes that make up this cluster, with metadata and
   * metrics.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceCompositionAttribute attributes = 4;</code>
   */
  com.google.ads.googleads.v15.services.AudienceCompositionAttributeOrBuilder getAttributesOrBuilder(
      int index);
}
