// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/campaign_feed.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class CampaignFeedProto {
  private CampaignFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_CampaignFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_CampaignFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v18/resources/cam" +
      "paign_feed.proto\022\"google.ads.googleads.v" +
      "18.resources\0327google/ads/googleads/v18/c" +
      "ommon/matching_function.proto\0325google/ad" +
      "s/googleads/v18/enums/feed_link_status.p" +
      "roto\0325google/ads/googleads/v18/enums/pla" +
      "ceholder_type.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\327\004\n\014CampaignFeed\022D\n\rresource_name\030\001 \001(\tB" +
      "-\340A\005\372A\'\n%googleads.googleapis.com/Campai" +
      "gnFeed\0228\n\004feed\030\007 \001(\tB%\340A\005\372A\037\n\035googleads." +
      "googleapis.com/FeedH\000\210\001\001\022@\n\010campaign\030\010 \001" +
      "(\tB)\340A\005\372A#\n!googleads.googleapis.com/Cam" +
      "paignH\001\210\001\001\022^\n\021placeholder_types\030\004 \003(\0162C." +
      "google.ads.googleads.v18.enums.Placehold" +
      "erTypeEnum.PlaceholderType\022L\n\021matching_f" +
      "unction\030\005 \001(\01321.google.ads.googleads.v18" +
      ".common.MatchingFunction\022V\n\006status\030\006 \001(\016" +
      "2A.google.ads.googleads.v18.enums.FeedLi" +
      "nkStatusEnum.FeedLinkStatusB\003\340A\003:i\352Af\n%g" +
      "oogleads.googleapis.com/CampaignFeed\022=cu" +
      "stomers/{customer_id}/campaignFeeds/{cam" +
      "paign_id}~{feed_id}B\007\n\005_feedB\013\n\t_campaig" +
      "nB\203\002\n&com.google.ads.googleads.v18.resou" +
      "rcesB\021CampaignFeedProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "18/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V18.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V18\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_CampaignFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_CampaignFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_CampaignFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Campaign", "PlaceholderTypes", "MatchingFunction", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v18.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
