// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/campaign_criterion.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v18/resources/cam" +
      "paign_criterion.proto\022\"google.ads.google" +
      "ads.v18.resources\032.google/ads/googleads/" +
      "v18/common/criteria.proto\032>google/ads/go" +
      "ogleads/v18/enums/campaign_criterion_sta" +
      "tus.proto\0323google/ads/googleads/v18/enum" +
      "s/criterion_type.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\"\345\030\n\021CampaignCriterion\022I\n\rresource_nam" +
      "e\030\001 \001(\tB2\340A\005\372A,\n*googleads.googleapis.co" +
      "m/CampaignCriterion\022@\n\010campaign\030% \001(\tB)\340" +
      "A\005\372A#\n!googleads.googleapis.com/Campaign" +
      "H\001\210\001\001\022\036\n\014criterion_id\030& \001(\003B\003\340A\003H\002\210\001\001\022\031\n" +
      "\014display_name\030+ \001(\tB\003\340A\003\022\031\n\014bid_modifier" +
      "\030\' \001(\002H\003\210\001\001\022\032\n\010negative\030( \001(\010B\003\340A\005H\004\210\001\001\022" +
      "R\n\004type\030\006 \001(\0162?.google.ads.googleads.v18" +
      ".enums.CriterionTypeEnum.CriterionTypeB\003" +
      "\340A\003\022c\n\006status\030# \001(\0162S.google.ads.googlea" +
      "ds.v18.enums.CampaignCriterionStatusEnum" +
      ".CampaignCriterionStatus\022D\n\007keyword\030\010 \001(" +
      "\0132,.google.ads.googleads.v18.common.Keyw" +
      "ordInfoB\003\340A\005H\000\022H\n\tplacement\030\t \001(\0132..goog" +
      "le.ads.googleads.v18.common.PlacementInf" +
      "oB\003\340A\005H\000\022Z\n\023mobile_app_category\030\n \001(\01326." +
      "google.ads.googleads.v18.common.MobileAp" +
      "pCategoryInfoB\003\340A\005H\000\022Y\n\022mobile_applicati" +
      "on\030\013 \001(\01326.google.ads.googleads.v18.comm" +
      "on.MobileApplicationInfoB\003\340A\005H\000\022F\n\010locat" +
      "ion\030\014 \001(\0132-.google.ads.googleads.v18.com" +
      "mon.LocationInfoB\003\340A\005H\000\022B\n\006device\030\r \001(\0132" +
      "+.google.ads.googleads.v18.common.Device" +
      "InfoB\003\340A\005H\000\022K\n\013ad_schedule\030\017 \001(\0132/.googl" +
      "e.ads.googleads.v18.common.AdScheduleInf" +
      "oB\003\340A\005H\000\022G\n\tage_range\030\020 \001(\0132-.google.ads" +
      ".googleads.v18.common.AgeRangeInfoB\003\340A\005H" +
      "\000\022B\n\006gender\030\021 \001(\0132+.google.ads.googleads" +
      ".v18.common.GenderInfoB\003\340A\005H\000\022M\n\014income_" +
      "range\030\022 \001(\01320.google.ads.googleads.v18.c" +
      "ommon.IncomeRangeInfoB\003\340A\005H\000\022S\n\017parental" +
      "_status\030\023 \001(\01323.google.ads.googleads.v18" +
      ".common.ParentalStatusInfoB\003\340A\005H\000\022G\n\tuse" +
      "r_list\030\026 \001(\0132-.google.ads.googleads.v18." +
      "common.UserListInfoB\003\340A\005H\000\022O\n\ryoutube_vi" +
      "deo\030\024 \001(\01321.google.ads.googleads.v18.com" +
      "mon.YouTubeVideoInfoB\003\340A\005H\000\022S\n\017youtube_c" +
      "hannel\030\025 \001(\01323.google.ads.googleads.v18." +
      "common.YouTubeChannelInfoB\003\340A\005H\000\022H\n\tprox" +
      "imity\030\027 \001(\0132..google.ads.googleads.v18.c" +
      "ommon.ProximityInfoB\003\340A\005H\000\022@\n\005topic\030\030 \001(" +
      "\0132*.google.ads.googleads.v18.common.Topi" +
      "cInfoB\003\340A\005H\000\022O\n\rlisting_scope\030\031 \001(\01321.go" +
      "ogle.ads.googleads.v18.common.ListingSco" +
      "peInfoB\003\340A\005H\000\022F\n\010language\030\032 \001(\0132-.google" +
      ".ads.googleads.v18.common.LanguageInfoB\003" +
      "\340A\005H\000\022E\n\010ip_block\030\033 \001(\0132,.google.ads.goo" +
      "gleads.v18.common.IpBlockInfoB\003\340A\005H\000\022O\n\r" +
      "content_label\030\034 \001(\01321.google.ads.googlea" +
      "ds.v18.common.ContentLabelInfoB\003\340A\005H\000\022D\n" +
      "\007carrier\030\035 \001(\0132,.google.ads.googleads.v1" +
      "8.common.CarrierInfoB\003\340A\005H\000\022O\n\ruser_inte" +
      "rest\030\036 \001(\01321.google.ads.googleads.v18.co" +
      "mmon.UserInterestInfoB\003\340A\005H\000\022D\n\007webpage\030" +
      "\037 \001(\0132,.google.ads.googleads.v18.common." +
      "WebpageInfoB\003\340A\005H\000\022d\n\030operating_system_v" +
      "ersion\030  \001(\0132;.google.ads.googleads.v18." +
      "common.OperatingSystemVersionInfoB\003\340A\005H\000" +
      "\022O\n\rmobile_device\030! \001(\01321.google.ads.goo" +
      "gleads.v18.common.MobileDeviceInfoB\003\340A\005H" +
      "\000\022Q\n\016location_group\030\" \001(\01322.google.ads.g" +
      "oogleads.v18.common.LocationGroupInfoB\003\340" +
      "A\005H\000\022S\n\017custom_affinity\030$ \001(\01323.google.a" +
      "ds.googleads.v18.common.CustomAffinityIn" +
      "foB\003\340A\005H\000\022S\n\017custom_audience\030) \001(\01323.goo" +
      "gle.ads.googleads.v18.common.CustomAudie" +
      "nceInfoB\003\340A\005H\000\022W\n\021combined_audience\030* \001(" +
      "\01325.google.ads.googleads.v18.common.Comb" +
      "inedAudienceInfoB\003\340A\005H\000\022O\n\rkeyword_theme" +
      "\030- \001(\01321.google.ads.googleads.v18.common" +
      ".KeywordThemeInfoB\003\340A\005H\000\022T\n\020local_servic" +
      "e_id\030. \001(\01323.google.ads.googleads.v18.co" +
      "mmon.LocalServiceIdInfoB\003\340A\005H\000\022I\n\nbrand_" +
      "list\030/ \001(\0132..google.ads.googleads.v18.co" +
      "mmon.BrandListInfoB\003\340A\005H\000:v\352As\n*googlead" +
      "s.googleapis.com/CampaignCriterion\022Ecust" +
      "omers/{customer_id}/campaignCriteria/{ca" +
      "mpaign_id}~{criterion_id}B\013\n\tcriterionB\013" +
      "\n\t_campaignB\017\n\r_criterion_idB\017\n\r_bid_mod" +
      "ifierB\013\n\t_negativeB\210\002\n&com.google.ads.go" +
      "ogleads.v18.resourcesB\026CampaignCriterion" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v18/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V18.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V18\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V18::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.CriterionTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "DisplayName", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "CustomAudience", "CombinedAudience", "KeywordTheme", "LocalServiceId", "BrandList", "Criterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v18.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.CriterionTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
