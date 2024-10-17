// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group_ad.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class AdGroupAdProto {
  private AdGroupAdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupAd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupAd_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupAdPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupAdPolicySummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupAdAssetAutomationSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupAdAssetAutomationSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v18/resources/ad_" +
      "group_ad.proto\022\"google.ads.googleads.v18" +
      ".resources\032,google/ads/googleads/v18/com" +
      "mon/policy.proto\032?google/ads/googleads/v" +
      "18/enums/ad_group_ad_primary_status.prot" +
      "o\032Fgoogle/ads/googleads/v18/enums/ad_gro" +
      "up_ad_primary_status_reason.proto\0327googl" +
      "e/ads/googleads/v18/enums/ad_group_ad_st" +
      "atus.proto\0320google/ads/googleads/v18/enu" +
      "ms/ad_strength.proto\032<google/ads/googlea" +
      "ds/v18/enums/asset_automation_status.pro" +
      "to\032:google/ads/googleads/v18/enums/asset" +
      "_automation_type.proto\032;google/ads/googl" +
      "eads/v18/enums/policy_approval_status.pr" +
      "oto\0329google/ads/googleads/v18/enums/poli" +
      "cy_review_status.proto\032+google/ads/googl" +
      "eads/v18/resources/ad.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\200\010\n\tAdGroupAd\022A\n\rresource_name\030\001" +
      " \001(\tB*\340A\005\372A$\n\"googleads.googleapis.com/A" +
      "dGroupAd\022S\n\006status\030\003 \001(\0162C.google.ads.go" +
      "ogleads.v18.enums.AdGroupAdStatusEnum.Ad" +
      "GroupAdStatus\022?\n\010ad_group\030\t \001(\tB(\340A\005\372A\"\n" +
      " googleads.googleapis.com/AdGroupH\000\210\001\001\0227" +
      "\n\002ad\030\005 \001(\0132&.google.ads.googleads.v18.re" +
      "sources.AdB\003\340A\005\022W\n\016policy_summary\030\006 \001(\0132" +
      ":.google.ads.googleads.v18.resources.AdG" +
      "roupAdPolicySummaryB\003\340A\003\022S\n\013ad_strength\030" +
      "\007 \001(\01629.google.ads.googleads.v18.enums.A" +
      "dStrengthEnum.AdStrengthB\003\340A\003\022\031\n\014action_" +
      "items\030\r \003(\tB\003\340A\003\022?\n\006labels\030\n \003(\tB/\340A\003\372A)" +
      "\n\'googleads.googleapis.com/AdGroupAdLabe" +
      "l\022n\n\016primary_status\030\020 \001(\0162Q.google.ads.g" +
      "oogleads.v18.enums.AdGroupAdPrimaryStatu" +
      "sEnum.AdGroupAdPrimaryStatusB\003\340A\003\022\202\001\n\026pr" +
      "imary_status_reasons\030\021 \003(\0162].google.ads." +
      "googleads.v18.enums.AdGroupAdPrimaryStat" +
      "usReasonEnum.AdGroupAdPrimaryStatusReaso" +
      "nB\003\340A\003\022r\n%ad_group_ad_asset_automation_s" +
      "ettings\030\022 \003(\0132C.google.ads.googleads.v18" +
      ".resources.AdGroupAdAssetAutomationSetti" +
      "ng:a\352A^\n\"googleads.googleapis.com/AdGrou" +
      "pAd\0228customers/{customer_id}/adGroupAds/" +
      "{ad_group_id}~{ad_id}B\013\n\t_ad_group\"\302\002\n\026A" +
      "dGroupAdPolicySummary\022T\n\024policy_topic_en" +
      "tries\030\001 \003(\01321.google.ads.googleads.v18.c" +
      "ommon.PolicyTopicEntryB\003\340A\003\022e\n\rreview_st" +
      "atus\030\002 \001(\0162I.google.ads.googleads.v18.en" +
      "ums.PolicyReviewStatusEnum.PolicyReviewS" +
      "tatusB\003\340A\003\022k\n\017approval_status\030\003 \001(\0162M.go" +
      "ogle.ads.googleads.v18.enums.PolicyAppro" +
      "valStatusEnum.PolicyApprovalStatusB\003\340A\003\"" +
      "\277\002\n\037AdGroupAdAssetAutomationSetting\022o\n\025a" +
      "sset_automation_type\030\001 \001(\0162K.google.ads." +
      "googleads.v18.enums.AssetAutomationTypeE" +
      "num.AssetAutomationTypeH\000\210\001\001\022u\n\027asset_au" +
      "tomation_status\030\002 \001(\0162O.google.ads.googl" +
      "eads.v18.enums.AssetAutomationStatusEnum" +
      ".AssetAutomationStatusH\001\210\001\001B\030\n\026_asset_au" +
      "tomation_typeB\032\n\030_asset_automation_statu" +
      "sB\200\002\n&com.google.ads.googleads.v18.resou" +
      "rcesB\016AdGroupAdProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v18/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V18.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V18\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupAdStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AssetAutomationStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AssetAutomationTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.AdProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdGroupAd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroupAd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupAd_descriptor,
        new java.lang.String[] { "ResourceName", "Status", "AdGroup", "Ad", "PolicySummary", "AdStrength", "ActionItems", "Labels", "PrimaryStatus", "PrimaryStatusReasons", "AdGroupAdAssetAutomationSettings", });
    internal_static_google_ads_googleads_v18_resources_AdGroupAdPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_resources_AdGroupAdPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupAdPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    internal_static_google_ads_googleads_v18_resources_AdGroupAdAssetAutomationSetting_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_resources_AdGroupAdAssetAutomationSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupAdAssetAutomationSetting_descriptor,
        new java.lang.String[] { "AssetAutomationType", "AssetAutomationStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupAdPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupAdStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AssetAutomationStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AssetAutomationTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v18.resources.AdProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
