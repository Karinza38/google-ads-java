// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/accessible_bidding_strategy.proto

package com.google.ads.googleads.v15.resources;

public final class AccessibleBiddingStrategyProto {
  private AccessibleBiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetCpa_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetCpa_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetImpressionShare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetImpressionShare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetRoas_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetRoas_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetSpend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetSpend_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v15/resources/acc" +
      "essible_bidding_strategy.proto\022\"google.a" +
      "ds.googleads.v15.resources\032:google/ads/g" +
      "oogleads/v15/enums/bidding_strategy_type" +
      ".proto\032Egoogle/ads/googleads/v15/enums/t" +
      "arget_impression_share_location.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\245\016\n\031AccessibleBiddingS" +
      "trategy\022R\n\rresource_name\030\001 \001(\tB;\342A\001\003\372A4\n" +
      "2googleads.googleapis.com/AccessibleBidd" +
      "ingStrategy\022\020\n\002id\030\002 \001(\003B\004\342A\001\003\022\022\n\004name\030\003 " +
      "\001(\tB\004\342A\001\003\022_\n\004type\030\004 \001(\0162K.google.ads.goo" +
      "gleads.v15.enums.BiddingStrategyTypeEnum" +
      ".BiddingStrategyTypeB\004\342A\001\003\022\037\n\021owner_cust" +
      "omer_id\030\005 \001(\003B\004\342A\001\003\022$\n\026owner_descriptive" +
      "_name\030\006 \001(\tB\004\342A\001\003\022\200\001\n\031maximize_conversio" +
      "n_value\030\007 \001(\0132U.google.ads.googleads.v15" +
      ".resources.AccessibleBiddingStrategy.Max" +
      "imizeConversionValueB\004\342A\001\003H\000\022w\n\024maximize" +
      "_conversions\030\010 \001(\0132Q.google.ads.googlead" +
      "s.v15.resources.AccessibleBiddingStrateg" +
      "y.MaximizeConversionsB\004\342A\001\003H\000\022c\n\ntarget_" +
      "cpa\030\t \001(\0132G.google.ads.googleads.v15.res" +
      "ources.AccessibleBiddingStrategy.TargetC" +
      "paB\004\342A\001\003H\000\022|\n\027target_impression_share\030\n " +
      "\001(\0132S.google.ads.googleads.v15.resources" +
      ".AccessibleBiddingStrategy.TargetImpress" +
      "ionShareB\004\342A\001\003H\000\022e\n\013target_roas\030\013 \001(\0132H." +
      "google.ads.googleads.v15.resources.Acces" +
      "sibleBiddingStrategy.TargetRoasB\004\342A\001\003H\000\022" +
      "g\n\014target_spend\030\014 \001(\0132I.google.ads.googl" +
      "eads.v15.resources.AccessibleBiddingStra" +
      "tegy.TargetSpendB\004\342A\001\003H\000\0324\n\027MaximizeConv" +
      "ersionValue\022\031\n\013target_roas\030\001 \001(\001B\004\342A\001\003\0326" +
      "\n\023MaximizeConversions\022\037\n\021target_cpa_micr" +
      "os\030\002 \001(\003B\004\342A\001\003\032G\n\tTargetCpa\022$\n\021target_cp" +
      "a_micros\030\001 \001(\003B\004\342A\001\003H\000\210\001\001B\024\n\022_target_cpa" +
      "_micros\032\232\002\n\025TargetImpressionShare\022w\n\010loc" +
      "ation\030\001 \001(\0162_.google.ads.googleads.v15.e" +
      "nums.TargetImpressionShareLocationEnum.T" +
      "argetImpressionShareLocationB\004\342A\001\003\022%\n\030lo" +
      "cation_fraction_micros\030\002 \001(\003H\000\210\001\001\022)\n\026cpc" +
      "_bid_ceiling_micros\030\003 \001(\003B\004\342A\001\003H\001\210\001\001B\033\n\031" +
      "_location_fraction_microsB\031\n\027_cpc_bid_ce" +
      "iling_micros\032<\n\nTargetRoas\022\036\n\013target_roa" +
      "s\030\001 \001(\001B\004\342A\001\003H\000\210\001\001B\016\n\014_target_roas\032\225\001\n\013T" +
      "argetSpend\022(\n\023target_spend_micros\030\001 \001(\003B" +
      "\006\030\001\342A\001\003H\000\210\001\001\022)\n\026cpc_bid_ceiling_micros\030\002" +
      " \001(\003B\004\342A\001\003H\001\210\001\001B\026\n\024_target_spend_microsB" +
      "\031\n\027_cpc_bid_ceiling_micros:\202\001\352A\177\n2google" +
      "ads.googleapis.com/AccessibleBiddingStra" +
      "tegy\022Icustomers/{customer_id}/accessible" +
      "BiddingStrategies/{bidding_strategy_id}B" +
      "\010\n\006schemeB\220\002\n&com.google.ads.googleads.v" +
      "15.resourcesB\036AccessibleBiddingStrategyP" +
      "rotoP\001ZKgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v15/resources;resour" +
      "ces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V15.Res" +
      "ources\312\002\"Google\\Ads\\GoogleAds\\V15\\Resour" +
      "ces\352\002&Google::Ads::GoogleAds::V15::Resou" +
      "rcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.TargetImpressionShareLocationProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "OwnerCustomerId", "OwnerDescriptiveName", "MaximizeConversionValue", "MaximizeConversions", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversionValue_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversionValue_descriptor,
        new java.lang.String[] { "TargetRoas", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversions_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_MaximizeConversions_descriptor,
        new java.lang.String[] { "TargetCpaMicros", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetCpa_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetCpa_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetCpa_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "TargetCpaMicros", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetImpressionShare_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetImpressionShare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetImpressionShare_descriptor,
        new java.lang.String[] { "Location", "LocationFractionMicros", "CpcBidCeilingMicros", "LocationFractionMicros", "CpcBidCeilingMicros", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetRoas_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetRoas_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetRoas_descriptor,
        new java.lang.String[] { "TargetRoas", "TargetRoas", });
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetSpend_descriptor =
      internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_descriptor.getNestedTypes().get(5);
    internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetSpend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccessibleBiddingStrategy_TargetSpend_descriptor,
        new java.lang.String[] { "TargetSpendMicros", "CpcBidCeilingMicros", "TargetSpendMicros", "CpcBidCeilingMicros", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.TargetImpressionShareLocationProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
