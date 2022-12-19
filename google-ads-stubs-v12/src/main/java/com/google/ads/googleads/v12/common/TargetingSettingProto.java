// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/targeting_setting.proto

package com.google.ads.googleads.v12.common;

public final class TargetingSettingProto {
  private TargetingSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_TargetingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_TargetingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_TargetRestriction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_TargetRestriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_TargetRestrictionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_TargetRestrictionOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/common/target" +
      "ing_setting.proto\022\037google.ads.googleads." +
      "v12.common\0328google/ads/googleads/v12/enu" +
      "ms/targeting_dimension.proto\"\307\001\n\020Targeti" +
      "ngSetting\022O\n\023target_restrictions\030\001 \003(\01322" +
      ".google.ads.googleads.v12.common.TargetR" +
      "estriction\022b\n\035target_restriction_operati" +
      "ons\030\002 \003(\0132;.google.ads.googleads.v12.com" +
      "mon.TargetRestrictionOperation\"\237\001\n\021Targe" +
      "tRestriction\022f\n\023targeting_dimension\030\001 \001(" +
      "\0162I.google.ads.googleads.v12.enums.Targe" +
      "tingDimensionEnum.TargetingDimension\022\025\n\010" +
      "bid_only\030\003 \001(\010H\000\210\001\001B\013\n\t_bid_only\"\366\001\n\032Tar" +
      "getRestrictionOperation\022V\n\010operator\030\001 \001(" +
      "\0162D.google.ads.googleads.v12.common.Targ" +
      "etRestrictionOperation.Operator\022A\n\005value" +
      "\030\002 \001(\01322.google.ads.googleads.v12.common" +
      ".TargetRestriction\"=\n\010Operator\022\017\n\013UNSPEC" +
      "IFIED\020\000\022\013\n\007UNKNOWN\020\001\022\007\n\003ADD\020\002\022\n\n\006REMOVE\020" +
      "\003B\365\001\n#com.google.ads.googleads.v12.commo" +
      "nB\025TargetingSettingProtoP\001ZEgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v12/common;common\242\002\003GAA\252\002\037Google.Ads.Goo" +
      "gleAds.V12.Common\312\002\037Google\\Ads\\GoogleAds" +
      "\\V12\\Common\352\002#Google::Ads::GoogleAds::V1" +
      "2::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.TargetingDimensionProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_common_TargetingSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_common_TargetingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_TargetingSetting_descriptor,
        new java.lang.String[] { "TargetRestrictions", "TargetRestrictionOperations", });
    internal_static_google_ads_googleads_v12_common_TargetRestriction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_common_TargetRestriction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_TargetRestriction_descriptor,
        new java.lang.String[] { "TargetingDimension", "BidOnly", "BidOnly", });
    internal_static_google_ads_googleads_v12_common_TargetRestrictionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_common_TargetRestrictionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_TargetRestrictionOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.ads.googleads.v12.enums.TargetingDimensionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}