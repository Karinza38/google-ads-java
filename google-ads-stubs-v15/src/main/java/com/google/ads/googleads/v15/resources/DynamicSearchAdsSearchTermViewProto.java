// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/dynamic_search_ads_search_term_view.proto

package com.google.ads.googleads.v15.resources;

public final class DynamicSearchAdsSearchTermViewProto {
  private DynamicSearchAdsSearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_DynamicSearchAdsSearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_DynamicSearchAdsSearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v15/resources/dyn" +
      "amic_search_ads_search_term_view.proto\022\"" +
      "google.ads.googleads.v15.resources\032\037goog" +
      "le/api/field_behavior.proto\032\031google/api/" +
      "resource.proto\"\330\005\n\036DynamicSearchAdsSearc" +
      "hTermView\022W\n\rresource_name\030\001 \001(\tB@\342A\001\003\372A" +
      "9\n7googleads.googleapis.com/DynamicSearc" +
      "hAdsSearchTermView\022\036\n\013search_term\030\t \001(\tB" +
      "\004\342A\001\003H\000\210\001\001\022\033\n\010headline\030\n \001(\tB\004\342A\001\003H\001\210\001\001\022" +
      "\037\n\014landing_page\030\013 \001(\tB\004\342A\001\003H\002\210\001\001\022\033\n\010page" +
      "_url\030\014 \001(\tB\004\342A\001\003H\003\210\001\001\022\'\n\024has_negative_ke" +
      "yword\030\r \001(\010B\004\342A\001\003H\004\210\001\001\022\'\n\024has_matching_k" +
      "eyword\030\016 \001(\010B\004\342A\001\003H\005\210\001\001\022#\n\020has_negative_" +
      "url\030\017 \001(\010B\004\342A\001\003H\006\210\001\001:\350\001\352A\344\001\n7googleads.g" +
      "oogleapis.com/DynamicSearchAdsSearchTerm" +
      "View\022\250\001customers/{customer_id}/dynamicSe" +
      "archAdsSearchTermViews/{ad_group_id}~{se" +
      "arch_term_fingerprint}~{headline_fingerp" +
      "rint}~{landing_page_fingerprint}~{page_u" +
      "rl_fingerprint}B\016\n\014_search_termB\013\n\t_head" +
      "lineB\017\n\r_landing_pageB\013\n\t_page_urlB\027\n\025_h" +
      "as_negative_keywordB\027\n\025_has_matching_key" +
      "wordB\023\n\021_has_negative_urlB\225\002\n&com.google" +
      ".ads.googleads.v15.resourcesB#DynamicSea" +
      "rchAdsSearchTermViewProtoP\001ZKgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v15/resources;resources\242\002\003GAA\252\002\"Google." +
      "Ads.GoogleAds.V15.Resources\312\002\"Google\\Ads" +
      "\\GoogleAds\\V15\\Resources\352\002&Google::Ads::" +
      "GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_DynamicSearchAdsSearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_DynamicSearchAdsSearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_DynamicSearchAdsSearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "Headline", "LandingPage", "PageUrl", "HasNegativeKeyword", "HasMatchingKeyword", "HasNegativeUrl", "SearchTerm", "Headline", "LandingPage", "PageUrl", "HasNegativeKeyword", "HasMatchingKeyword", "HasNegativeUrl", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
