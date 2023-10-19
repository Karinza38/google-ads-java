// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset_group.proto

package com.google.ads.googleads.v15.resources;

public final class AssetGroupProto {
  private AssetGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v15/resources/ass" +
      "et_group.proto\022\"google.ads.googleads.v15" +
      ".resources\0320google/ads/googleads/v15/enu" +
      "ms/ad_strength.proto\032?google/ads/googlea" +
      "ds/v15/enums/asset_group_primary_status." +
      "proto\032Fgoogle/ads/googleads/v15/enums/as" +
      "set_group_primary_status_reason.proto\0327g" +
      "oogle/ads/googleads/v15/enums/asset_grou" +
      "p_status.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\212\006\n\nA" +
      "ssetGroup\022C\n\rresource_name\030\001 \001(\tB,\342A\001\005\372A" +
      "%\n#googleads.googleapis.com/AssetGroup\022\020" +
      "\n\002id\030\t \001(\003B\004\342A\001\003\022<\n\010campaign\030\002 \001(\tB*\342A\001\005" +
      "\372A#\n!googleads.googleapis.com/Campaign\022\022" +
      "\n\004name\030\003 \001(\tB\004\342A\001\002\022\022\n\nfinal_urls\030\004 \003(\t\022\031" +
      "\n\021final_mobile_urls\030\005 \003(\t\022U\n\006status\030\006 \001(" +
      "\0162E.google.ads.googleads.v15.enums.Asset" +
      "GroupStatusEnum.AssetGroupStatus\022q\n\016prim" +
      "ary_status\030\013 \001(\0162S.google.ads.googleads." +
      "v15.enums.AssetGroupPrimaryStatusEnum.As" +
      "setGroupPrimaryStatusB\004\342A\001\003\022\205\001\n\026primary_" +
      "status_reasons\030\014 \003(\0162_.google.ads.google" +
      "ads.v15.enums.AssetGroupPrimaryStatusRea" +
      "sonEnum.AssetGroupPrimaryStatusReasonB\004\342" +
      "A\001\003\022\r\n\005path1\030\007 \001(\t\022\r\n\005path2\030\010 \001(\t\022T\n\013ad_" +
      "strength\030\n \001(\01629.google.ads.googleads.v1" +
      "5.enums.AdStrengthEnum.AdStrengthB\004\342A\001\003:" +
      "^\352A[\n#googleads.googleapis.com/AssetGrou" +
      "p\0224customers/{customer_id}/assetGroups/{" +
      "asset_group_id}B\201\002\n&com.google.ads.googl" +
      "eads.v15.resourcesB\017AssetGroupProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v15/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V15.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V15\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V15::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.AdStrengthProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetGroupPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetGroupPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetGroupStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AssetGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AssetGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Campaign", "Name", "FinalUrls", "FinalMobileUrls", "Status", "PrimaryStatus", "PrimaryStatusReasons", "Path1", "Path2", "AdStrength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.AdStrengthProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetGroupPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetGroupPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetGroupStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
