// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/feed_item_set_filter_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public final class FeedItemSetFilterTypeInfosProto {
  private FeedItemSetFilterTypeInfosProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_common_DynamicLocationSetFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_common_DynamicLocationSetFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_common_BusinessNameFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_common_BusinessNameFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v18/common/feed_i" +
      "tem_set_filter_type_infos.proto\022\037google." +
      "ads.googleads.v18.common\032Egoogle/ads/goo" +
      "gleads/v18/enums/feed_item_set_string_fi" +
      "lter_type.proto\"}\n\030DynamicLocationSetFil" +
      "ter\022\016\n\006labels\030\001 \003(\t\022Q\n\024business_name_fil" +
      "ter\030\002 \001(\01323.google.ads.googleads.v18.com" +
      "mon.BusinessNameFilter\"\235\001\n\022BusinessNameF" +
      "ilter\022\025\n\rbusiness_name\030\001 \001(\t\022p\n\013filter_t" +
      "ype\030\002 \001(\0162[.google.ads.googleads.v18.enu" +
      "ms.FeedItemSetStringFilterTypeEnum.FeedI" +
      "temSetStringFilterType\"6\n!DynamicAffilia" +
      "teLocationSetFilter\022\021\n\tchain_ids\030\001 \003(\003B\377" +
      "\001\n#com.google.ads.googleads.v18.commonB\037" +
      "FeedItemSetFilterTypeInfosProtoP\001ZEgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v18/common;common\242\002\003GAA\252\002\037Google." +
      "Ads.GoogleAds.V18.Common\312\002\037Google\\Ads\\Go" +
      "ogleAds\\V18\\Common\352\002#Google::Ads::Google" +
      "Ads::V18::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.FeedItemSetStringFilterTypeProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_common_DynamicLocationSetFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_common_DynamicLocationSetFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_common_DynamicLocationSetFilter_descriptor,
        new java.lang.String[] { "Labels", "BusinessNameFilter", });
    internal_static_google_ads_googleads_v18_common_BusinessNameFilter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_common_BusinessNameFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_common_BusinessNameFilter_descriptor,
        new java.lang.String[] { "BusinessName", "FilterType", });
    internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_common_DynamicAffiliateLocationSetFilter_descriptor,
        new java.lang.String[] { "ChainIds", });
    com.google.ads.googleads.v18.enums.FeedItemSetStringFilterTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
