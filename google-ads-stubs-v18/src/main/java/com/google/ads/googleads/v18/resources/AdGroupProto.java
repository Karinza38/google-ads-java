// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroup_AudienceSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroup_AudienceSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v18/resources/ad_" +
      "group.proto\022\"google.ads.googleads.v18.re" +
      "sources\0326google/ads/googleads/v18/common" +
      "/custom_parameter.proto\0327google/ads/goog" +
      "leads/v18/common/targeting_setting.proto" +
      "\032>google/ads/googleads/v18/enums/ad_grou" +
      "p_ad_rotation_mode.proto\032<google/ads/goo" +
      "gleads/v18/enums/ad_group_primary_status" +
      ".proto\032Cgoogle/ads/googleads/v18/enums/a" +
      "d_group_primary_status_reason.proto\0324goo" +
      "gle/ads/googleads/v18/enums/ad_group_sta" +
      "tus.proto\0322google/ads/googleads/v18/enum" +
      "s/ad_group_type.proto\0325google/ads/google" +
      "ads/v18/enums/asset_field_type.proto\0323go" +
      "ogle/ads/googleads/v18/enums/asset_set_t" +
      "ype.proto\0323google/ads/googleads/v18/enum" +
      "s/bidding_source.proto\0328google/ads/googl" +
      "eads/v18/enums/targeting_dimension.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\360\024\n\007AdGroup\022?\n\rreso" +
      "urce_name\030\001 \001(\tB(\340A\005\372A\"\n googleads.googl" +
      "eapis.com/AdGroup\022\024\n\002id\030\" \001(\003B\003\340A\003H\000\210\001\001\022" +
      "\021\n\004name\030# \001(\tH\001\210\001\001\022O\n\006status\030\005 \001(\0162?.goo" +
      "gle.ads.googleads.v18.enums.AdGroupStatu" +
      "sEnum.AdGroupStatus\022N\n\004type\030\014 \001(\0162;.goog" +
      "le.ads.googleads.v18.enums.AdGroupTypeEn" +
      "um.AdGroupTypeB\003\340A\005\022i\n\020ad_rotation_mode\030" +
      "\026 \001(\0162O.google.ads.googleads.v18.enums.A" +
      "dGroupAdRotationModeEnum.AdGroupAdRotati" +
      "onMode\022D\n\rbase_ad_group\030$ \001(\tB(\340A\003\372A\"\n g" +
      "oogleads.googleapis.com/AdGroupH\002\210\001\001\022\"\n\025" +
      "tracking_url_template\030% \001(\tH\003\210\001\001\022O\n\025url_" +
      "custom_parameters\030\006 \003(\01320.google.ads.goo" +
      "gleads.v18.common.CustomParameter\022@\n\010cam" +
      "paign\030& \001(\tB)\340A\005\372A#\n!googleads.googleapi" +
      "s.com/CampaignH\004\210\001\001\022\033\n\016cpc_bid_micros\030\' " +
      "\001(\003H\005\210\001\001\022*\n\030effective_cpc_bid_micros\0309 \001" +
      "(\003B\003\340A\003H\006\210\001\001\022\033\n\016cpm_bid_micros\030( \001(\003H\007\210\001" +
      "\001\022\036\n\021target_cpa_micros\030) \001(\003H\010\210\001\001\022\033\n\016cpv" +
      "_bid_micros\030* \001(\003H\t\210\001\001\022\036\n\021target_cpm_mic" +
      "ros\030+ \001(\003H\n\210\001\001\022\030\n\013target_roas\030, \001(\001H\013\210\001\001" +
      "\022#\n\026percent_cpc_bid_micros\030- \001(\003H\014\210\001\001\022\035\n" +
      "\020fixed_cpm_micros\030@ \001(\003H\r\210\001\001\022\036\n\021target_c" +
      "pv_micros\030A \001(\003H\016\210\001\001\022#\n\033optimized_target" +
      "ing_enabled\030; \001(\010\022%\n\035exclude_demographic" +
      "_expansion\030C \001(\010\022o\n\034display_custom_bid_d" +
      "imension\030\027 \001(\0162I.google.ads.googleads.v1" +
      "8.enums.TargetingDimensionEnum.Targeting" +
      "Dimension\022\035\n\020final_url_suffix\030. \001(\tH\017\210\001\001" +
      "\022L\n\021targeting_setting\030\031 \001(\01321.google.ads" +
      ".googleads.v18.common.TargetingSetting\022Z" +
      "\n\020audience_setting\0308 \001(\0132;.google.ads.go" +
      "ogleads.v18.resources.AdGroup.AudienceSe" +
      "ttingB\003\340A\005\022-\n\033effective_target_cpa_micro" +
      "s\030/ \001(\003B\003\340A\003H\020\210\001\001\022i\n\033effective_target_cp" +
      "a_source\030\035 \001(\0162?.google.ads.googleads.v1" +
      "8.enums.BiddingSourceEnum.BiddingSourceB" +
      "\003\340A\003\022\'\n\025effective_target_roas\0300 \001(\001B\003\340A\003" +
      "H\021\210\001\001\022j\n\034effective_target_roas_source\030  " +
      "\001(\0162?.google.ads.googleads.v18.enums.Bid" +
      "dingSourceEnum.BiddingSourceB\003\340A\003\022=\n\006lab" +
      "els\0301 \003(\tB-\340A\003\372A\'\n%googleads.googleapis." +
      "com/AdGroupLabel\022l\n!excluded_parent_asse" +
      "t_field_types\0306 \003(\0162A.google.ads.googlea" +
      "ds.v18.enums.AssetFieldTypeEnum.AssetFie" +
      "ldType\022f\n\037excluded_parent_asset_set_type" +
      "s\030: \003(\0162=.google.ads.googleads.v18.enums" +
      ".AssetSetTypeEnum.AssetSetType\022j\n\016primar" +
      "y_status\030> \001(\0162M.google.ads.googleads.v1" +
      "8.enums.AdGroupPrimaryStatusEnum.AdGroup" +
      "PrimaryStatusB\003\340A\003\022~\n\026primary_status_rea" +
      "sons\030? \003(\0162Y.google.ads.googleads.v18.en" +
      "ums.AdGroupPrimaryStatusReasonEnum.AdGro" +
      "upPrimaryStatusReasonB\003\340A\003\0324\n\017AudienceSe" +
      "tting\022!\n\024use_audience_grouped\030\001 \001(\010B\003\340A\005" +
      ":U\352AR\n googleads.googleapis.com/AdGroup\022" +
      ".customers/{customer_id}/adGroups/{ad_gr" +
      "oup_id}B\005\n\003_idB\007\n\005_nameB\020\n\016_base_ad_grou" +
      "pB\030\n\026_tracking_url_templateB\013\n\t_campaign" +
      "B\021\n\017_cpc_bid_microsB\033\n\031_effective_cpc_bi" +
      "d_microsB\021\n\017_cpm_bid_microsB\024\n\022_target_c" +
      "pa_microsB\021\n\017_cpv_bid_microsB\024\n\022_target_" +
      "cpm_microsB\016\n\014_target_roasB\031\n\027_percent_c" +
      "pc_bid_microsB\023\n\021_fixed_cpm_microsB\024\n\022_t" +
      "arget_cpv_microsB\023\n\021_final_url_suffixB\036\n" +
      "\034_effective_target_cpa_microsB\030\n\026_effect" +
      "ive_target_roasB\376\001\n&com.google.ads.googl" +
      "eads.v18.resourcesB\014AdGroupProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v18/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V18.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V18\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v18.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.AssetSetTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.TargetingDimensionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "BaseAdGroup", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "EffectiveCpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "FixedCpmMicros", "TargetCpvMicros", "OptimizedTargetingEnabled", "ExcludeDemographicExpansion", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "AudienceSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", "Labels", "ExcludedParentAssetFieldTypes", "ExcludedParentAssetSetTypes", "PrimaryStatus", "PrimaryStatusReasons", });
    internal_static_google_ads_googleads_v18_resources_AdGroup_AudienceSetting_descriptor =
      internal_static_google_ads_googleads_v18_resources_AdGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroup_AudienceSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroup_AudienceSetting_descriptor,
        new java.lang.String[] { "UseAudienceGrouped", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v18.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.AssetSetTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v18.enums.TargetingDimensionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
