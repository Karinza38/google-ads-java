// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/campaign_customizer.proto

package com.google.ads.googleads.v15.resources;

public final class CampaignCustomizerProto {
  private CampaignCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CampaignCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CampaignCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v15/resources/cam" +
      "paign_customizer.proto\022\"google.ads.googl" +
      "eads.v15.resources\0326google/ads/googleads" +
      "/v15/common/customizer_value.proto\032<goog" +
      "le/ads/googleads/v15/enums/customizer_va" +
      "lue_status.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\254\004\n" +
      "\022CampaignCustomizer\022K\n\rresource_name\030\001 \001" +
      "(\tB4\342A\001\005\372A-\n+googleads.googleapis.com/Ca" +
      "mpaignCustomizer\022<\n\010campaign\030\002 \001(\tB*\342A\001\005" +
      "\372A#\n!googleads.googleapis.com/Campaign\022T" +
      "\n\024customizer_attribute\030\003 \001(\tB6\342A\002\002\005\372A.\n," +
      "googleads.googleapis.com/CustomizerAttri" +
      "bute\022e\n\006status\030\004 \001(\0162O.google.ads.google" +
      "ads.v15.enums.CustomizerValueStatusEnum." +
      "CustomizerValueStatusB\004\342A\001\003\022E\n\005value\030\005 \001" +
      "(\01320.google.ads.googleads.v15.common.Cus" +
      "tomizerValueB\004\342A\001\002:\206\001\352A\202\001\n+googleads.goo" +
      "gleapis.com/CampaignCustomizer\022Scustomer" +
      "s/{customer_id}/campaignCustomizers/{cam" +
      "paign_id}~{customizer_attribute_id}B\211\002\n&" +
      "com.google.ads.googleads.v15.resourcesB\027" +
      "CampaignCustomizerProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "15/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V15.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V15\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_CampaignCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_CampaignCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CampaignCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CustomizerAttribute", "Status", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v15.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
