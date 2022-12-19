// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_asset.proto

package com.google.ads.googleads.v12.resources;

public final class CampaignAssetProto {
  private CampaignAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CampaignAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CampaignAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/resources/cam" +
      "paign_asset.proto\022\"google.ads.googleads." +
      "v12.resources\0325google/ads/googleads/v12/" +
      "enums/asset_field_type.proto\0326google/ads" +
      "/googleads/v12/enums/asset_link_status.p" +
      "roto\0321google/ads/googleads/v12/enums/ass" +
      "et_source.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\351\004\n\r" +
      "CampaignAsset\022E\n\rresource_name\030\001 \001(\tB.\340A" +
      "\005\372A(\n&googleads.googleapis.com/CampaignA" +
      "sset\022@\n\010campaign\030\006 \001(\tB)\340A\005\372A#\n!googlead" +
      "s.googleapis.com/CampaignH\000\210\001\001\022:\n\005asset\030" +
      "\007 \001(\tB&\340A\005\372A \n\036googleads.googleapis.com/" +
      "AssetH\001\210\001\001\022Z\n\nfield_type\030\004 \001(\0162A.google." +
      "ads.googleads.v12.enums.AssetFieldTypeEn" +
      "um.AssetFieldTypeB\003\340A\005\022P\n\006source\030\010 \001(\0162;" +
      ".google.ads.googleads.v12.enums.AssetSou" +
      "rceEnum.AssetSourceB\003\340A\003\022S\n\006status\030\005 \001(\016" +
      "2C.google.ads.googleads.v12.enums.AssetL" +
      "inkStatusEnum.AssetLinkStatus:y\352Av\n&goog" +
      "leads.googleapis.com/CampaignAsset\022Lcust" +
      "omers/{customer_id}/campaignAssets/{camp" +
      "aign_id}~{asset_id}~{field_type}B\013\n\t_cam" +
      "paignB\010\n\006_assetB\204\002\n&com.google.ads.googl" +
      "eads.v12.resourcesB\022CampaignAssetProtoP\001" +
      "ZKgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v12/resources;resources\242\002\003" +
      "GAA\252\002\"Google.Ads.GoogleAds.V12.Resources" +
      "\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&" +
      "Google::Ads::GoogleAds::V12::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.AssetLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.AssetSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CampaignAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CampaignAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CampaignAsset_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "Asset", "FieldType", "Source", "Status", "Campaign", "Asset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.AssetLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.AssetSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}