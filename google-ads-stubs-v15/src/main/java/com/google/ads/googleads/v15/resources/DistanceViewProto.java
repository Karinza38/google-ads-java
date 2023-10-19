// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/distance_view.proto

package com.google.ads.googleads.v15.resources;

public final class DistanceViewProto {
  private DistanceViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_DistanceView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_DistanceView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v15/resources/dis" +
      "tance_view.proto\022\"google.ads.googleads.v" +
      "15.resources\0324google/ads/googleads/v15/e" +
      "nums/distance_bucket.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\"\347\002\n\014DistanceView\022E\n\rresource_name" +
      "\030\001 \001(\tB.\342A\001\003\372A\'\n%googleads.googleapis.co" +
      "m/DistanceView\022`\n\017distance_bucket\030\002 \001(\0162" +
      "A.google.ads.googleads.v15.enums.Distanc" +
      "eBucketEnum.DistanceBucketB\004\342A\001\003\022 \n\rmetr" +
      "ic_system\030\004 \001(\010B\004\342A\001\003H\000\210\001\001:z\352Aw\n%googlea" +
      "ds.googleapis.com/DistanceView\022Ncustomer" +
      "s/{customer_id}/distanceViews/{placehold" +
      "er_chain_id}~{distance_bucket}B\020\n\016_metri" +
      "c_systemB\203\002\n&com.google.ads.googleads.v1" +
      "5.resourcesB\021DistanceViewProtoP\001ZKgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v15/resources;resources\242\002\003GAA\252\002\"Go" +
      "ogle.Ads.GoogleAds.V15.Resources\312\002\"Googl" +
      "e\\Ads\\GoogleAds\\V15\\Resources\352\002&Google::" +
      "Ads::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.DistanceBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_DistanceView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_DistanceView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_DistanceView_descriptor,
        new java.lang.String[] { "ResourceName", "DistanceBucket", "MetricSystem", "MetricSystem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.DistanceBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
