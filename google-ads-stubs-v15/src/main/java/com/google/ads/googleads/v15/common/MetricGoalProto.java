// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/metric_goal.proto

package com.google.ads.googleads.v15.common;

public final class MetricGoalProto {
  private MetricGoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_common_MetricGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_common_MetricGoal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v15/common/metric" +
      "_goal.proto\022\037google.ads.googleads.v15.co" +
      "mmon\0326google/ads/googleads/v15/enums/exp" +
      "eriment_metric.proto\032@google/ads/googlea" +
      "ds/v15/enums/experiment_metric_direction" +
      ".proto\"\317\001\n\nMetricGoal\022U\n\006metric\030\001 \001(\0162E." +
      "google.ads.googleads.v15.enums.Experimen" +
      "tMetricEnum.ExperimentMetric\022j\n\tdirectio" +
      "n\030\002 \001(\0162W.google.ads.googleads.v15.enums" +
      ".ExperimentMetricDirectionEnum.Experimen" +
      "tMetricDirectionB\357\001\n#com.google.ads.goog" +
      "leads.v15.commonB\017MetricGoalProtoP\001ZEgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v15/common;common\242\002\003GAA\252\002\037Googl" +
      "e.Ads.GoogleAds.V15.Common\312\002\037Google\\Ads\\" +
      "GoogleAds\\V15\\Common\352\002#Google::Ads::Goog" +
      "leAds::V15::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ExperimentMetricProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.ExperimentMetricDirectionProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_common_MetricGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_common_MetricGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_common_MetricGoal_descriptor,
        new java.lang.String[] { "Metric", "Direction", });
    com.google.ads.googleads.v15.enums.ExperimentMetricProto.getDescriptor();
    com.google.ads.googleads.v15.enums.ExperimentMetricDirectionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
