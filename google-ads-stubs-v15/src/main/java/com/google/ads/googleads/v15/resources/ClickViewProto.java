// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/click_view.proto

package com.google.ads.googleads.v15.resources;

public final class ClickViewProto {
  private ClickViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_ClickView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_ClickView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v15/resources/cli" +
      "ck_view.proto\022\"google.ads.googleads.v15." +
      "resources\0324google/ads/googleads/v15/comm" +
      "on/click_location.proto\032.google/ads/goog" +
      "leads/v15/common/criteria.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\"\324\006\n\tClickView\022B\n\rresource_na" +
      "me\030\001 \001(\tB+\342A\001\003\372A$\n\"googleads.googleapis." +
      "com/ClickView\022\030\n\005gclid\030\010 \001(\tB\004\342A\001\003H\000\210\001\001\022" +
      "N\n\020area_of_interest\030\003 \001(\0132..google.ads.g" +
      "oogleads.v15.common.ClickLocationB\004\342A\001\003\022" +
      "R\n\024location_of_presence\030\004 \001(\0132..google.a" +
      "ds.googleads.v15.common.ClickLocationB\004\342" +
      "A\001\003\022\036\n\013page_number\030\t \001(\003B\004\342A\001\003H\001\210\001\001\022E\n\013a" +
      "d_group_ad\030\n \001(\tB+\342A\001\003\372A$\n\"googleads.goo" +
      "gleapis.com/AdGroupAdH\002\210\001\001\022Z\n\030campaign_l" +
      "ocation_target\030\013 \001(\tB3\342A\001\003\372A,\n*googleads" +
      ".googleapis.com/GeoTargetConstantH\003\210\001\001\022B" +
      "\n\tuser_list\030\014 \001(\tB*\342A\001\003\372A#\n!googleads.go" +
      "ogleapis.com/UserListH\004\210\001\001\022C\n\007keyword\030\r " +
      "\001(\tB2\342A\001\003\372A+\n)googleads.googleapis.com/A" +
      "dGroupCriterion\022H\n\014keyword_info\030\016 \001(\0132,." +
      "google.ads.googleads.v15.common.KeywordI" +
      "nfoB\004\342A\001\003:Z\352AW\n\"googleads.googleapis.com" +
      "/ClickView\0221customers/{customer_id}/clic" +
      "kViews/{date}~{gclid}B\010\n\006_gclidB\016\n\014_page" +
      "_numberB\016\n\014_ad_group_adB\033\n\031_campaign_loc" +
      "ation_targetB\014\n\n_user_listB\200\002\n&com.googl" +
      "e.ads.googleads.v15.resourcesB\016ClickView" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v15/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V15.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V15\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V15::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.ClickLocationProto.getDescriptor(),
          com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_ClickView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_ClickView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_ClickView_descriptor,
        new java.lang.String[] { "ResourceName", "Gclid", "AreaOfInterest", "LocationOfPresence", "PageNumber", "AdGroupAd", "CampaignLocationTarget", "UserList", "Keyword", "KeywordInfo", "Gclid", "PageNumber", "AdGroupAd", "CampaignLocationTarget", "UserList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.ClickLocationProto.getDescriptor();
    com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
