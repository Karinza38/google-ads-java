// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/third_party_app_analytics_link.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class ThirdPartyAppAnalyticsLinkProto {
  private ThirdPartyAppAnalyticsLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_ThirdPartyAppAnalyticsLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v18/resources/thi" +
      "rd_party_app_analytics_link.proto\022\"googl" +
      "e.ads.googleads.v18.resources\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\256\002\n\032ThirdPartyAppAnalyticsLink" +
      "\022R\n\rresource_name\030\001 \001(\tB;\340A\005\372A5\n3googlea" +
      "ds.googleapis.com/ThirdPartyAppAnalytics" +
      "Link\022#\n\021shareable_link_id\030\003 \001(\tB\003\340A\003H\000\210\001" +
      "\001:\200\001\352A}\n3googleads.googleapis.com/ThirdP" +
      "artyAppAnalyticsLink\022Fcustomers/{custome" +
      "r_id}/thirdPartyAppAnalyticsLinks/{custo" +
      "mer_link_id}B\024\n\022_shareable_link_idB\221\002\n&c" +
      "om.google.ads.googleads.v18.resourcesB\037T" +
      "hirdPartyAppAnalyticsLinkProtoP\001ZKgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v18/resources;resources\242\002\003GAA\252\002\"Go" +
      "ogle.Ads.GoogleAds.V18.Resources\312\002\"Googl" +
      "e\\Ads\\GoogleAds\\V18\\Resources\352\002&Google::" +
      "Ads::GoogleAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_ThirdPartyAppAnalyticsLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_ThirdPartyAppAnalyticsLink_descriptor,
        new java.lang.String[] { "ResourceName", "ShareableLinkId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
