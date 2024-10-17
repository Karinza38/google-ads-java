// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/extension_feed_item.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class ExtensionFeedItemProto {
  private ExtensionFeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_ExtensionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_ExtensionFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v18/resources/ext" +
      "ension_feed_item.proto\022\"google.ads.googl" +
      "eads.v18.resources\032.google/ads/googleads" +
      "/v18/common/criteria.proto\0320google/ads/g" +
      "oogleads/v18/common/extensions.proto\0323go" +
      "ogle/ads/googleads/v18/enums/extension_t" +
      "ype.proto\0325google/ads/googleads/v18/enum" +
      "s/feed_item_status.proto\032<google/ads/goo" +
      "gleads/v18/enums/feed_item_target_device" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\217\020\n\021Extension" +
      "FeedItem\022I\n\rresource_name\030\001 \001(\tB2\340A\005\372A,\n" +
      "*googleads.googleapis.com/ExtensionFeedI" +
      "tem\022\024\n\002id\030\031 \001(\003B\003\340A\003H\002\210\001\001\022\\\n\016extension_t" +
      "ype\030\r \001(\0162?.google.ads.googleads.v18.enu" +
      "ms.ExtensionTypeEnum.ExtensionTypeB\003\340A\003\022" +
      "\034\n\017start_date_time\030\032 \001(\tH\003\210\001\001\022\032\n\rend_dat" +
      "e_time\030\033 \001(\tH\004\210\001\001\022E\n\014ad_schedules\030\020 \003(\0132" +
      "/.google.ads.googleads.v18.common.AdSche" +
      "duleInfo\022]\n\006device\030\021 \001(\0162M.google.ads.go" +
      "ogleads.v18.enums.FeedItemTargetDeviceEn" +
      "um.FeedItemTargetDevice\022Z\n\034targeted_geo_" +
      "target_constant\030\036 \001(\tB/\372A,\n*googleads.go" +
      "ogleapis.com/GeoTargetConstantH\005\210\001\001\022F\n\020t" +
      "argeted_keyword\030\026 \001(\0132,.google.ads.googl" +
      "eads.v18.common.KeywordInfo\022V\n\006status\030\004 " +
      "\001(\0162A.google.ads.googleads.v18.enums.Fee" +
      "dItemStatusEnum.FeedItemStatusB\003\340A\003\022O\n\022s" +
      "itelink_feed_item\030\002 \001(\01321.google.ads.goo" +
      "gleads.v18.common.SitelinkFeedItemH\000\022b\n\034" +
      "structured_snippet_feed_item\030\003 \001(\0132:.goo" +
      "gle.ads.googleads.v18.common.StructuredS" +
      "nippetFeedItemH\000\022E\n\rapp_feed_item\030\007 \001(\0132" +
      ",.google.ads.googleads.v18.common.AppFee" +
      "dItemH\000\022G\n\016call_feed_item\030\010 \001(\0132-.google" +
      ".ads.googleads.v18.common.CallFeedItemH\000" +
      "\022M\n\021callout_feed_item\030\t \001(\01320.google.ads" +
      ".googleads.v18.common.CalloutFeedItemH\000\022" +
      "V\n\026text_message_feed_item\030\n \001(\01324.google" +
      ".ads.googleads.v18.common.TextMessageFee" +
      "dItemH\000\022I\n\017price_feed_item\030\013 \001(\0132..googl" +
      "e.ads.googleads.v18.common.PriceFeedItem" +
      "H\000\022Q\n\023promotion_feed_item\030\014 \001(\01322.google" +
      ".ads.googleads.v18.common.PromotionFeedI" +
      "temH\000\022T\n\022location_feed_item\030\016 \001(\01321.goog" +
      "le.ads.googleads.v18.common.LocationFeed" +
      "ItemB\003\340A\003H\000\022g\n\034affiliate_location_feed_i" +
      "tem\030\017 \001(\0132:.google.ads.googleads.v18.com" +
      "mon.AffiliateLocationFeedItemB\003\340A\003H\000\022X\n\027" +
      "hotel_callout_feed_item\030\027 \001(\01325.google.a" +
      "ds.googleads.v18.common.HotelCalloutFeed" +
      "ItemH\000\022N\n\017image_feed_item\030\037 \001(\0132..google" +
      ".ads.googleads.v18.common.ImageFeedItemB" +
      "\003\340A\005H\000\022C\n\021targeted_campaign\030\034 \001(\tB&\372A#\n!" +
      "googleads.googleapis.com/CampaignH\001\022B\n\021t" +
      "argeted_ad_group\030\035 \001(\tB%\372A\"\n googleads.g" +
      "oogleapis.com/AdGroupH\001:j\352Ag\n*googleads." +
      "googleapis.com/ExtensionFeedItem\0229custom" +
      "ers/{customer_id}/extensionFeedItems/{fe" +
      "ed_item_id}B\013\n\textensionB\034\n\032serving_reso" +
      "urce_targetingB\005\n\003_idB\022\n\020_start_date_tim" +
      "eB\020\n\016_end_date_timeB\037\n\035_targeted_geo_tar" +
      "get_constantB\210\002\n&com.google.ads.googlead" +
      "s.v18.resourcesB\026ExtensionFeedItemProtoP" +
      "\001ZKgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v18/resources;resources\242\002" +
      "\003GAA\252\002\"Google.Ads.GoogleAds.V18.Resource" +
      "s\312\002\"Google\\Ads\\GoogleAds\\V18\\Resources\352\002" +
      "&Google::Ads::GoogleAds::V18::Resourcesb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v18.common.ExtensionsProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.ExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_ExtensionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_ExtensionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_ExtensionFeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExtensionType", "StartDateTime", "EndDateTime", "AdSchedules", "Device", "TargetedGeoTargetConstant", "TargetedKeyword", "Status", "SitelinkFeedItem", "StructuredSnippetFeedItem", "AppFeedItem", "CallFeedItem", "CalloutFeedItem", "TextMessageFeedItem", "PriceFeedItem", "PromotionFeedItem", "LocationFeedItem", "AffiliateLocationFeedItem", "HotelCalloutFeedItem", "ImageFeedItem", "TargetedCampaign", "TargetedAdGroup", "Extension", "ServingResourceTargeting", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v18.common.ExtensionsProto.getDescriptor();
    com.google.ads.googleads.v18.enums.ExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
