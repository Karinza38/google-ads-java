// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/feed_common.proto

package com.google.ads.googleads.v12.common;

public final class FeedCommonProto {
  private FeedCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v12/common/feed_c" +
      "ommon.proto\022\037google.ads.googleads.v12.co" +
      "mmon\"c\n\005Money\022\032\n\rcurrency_code\030\003 \001(\tH\000\210\001" +
      "\001\022\032\n\ramount_micros\030\004 \001(\003H\001\210\001\001B\020\n\016_curren" +
      "cy_codeB\020\n\016_amount_microsB\357\001\n#com.google" +
      ".ads.googleads.v12.commonB\017FeedCommonPro" +
      "toP\001ZEgoogle.golang.org/genproto/googlea" +
      "pis/ads/googleads/v12/common;common\242\002\003GA" +
      "A\252\002\037Google.Ads.GoogleAds.V12.Common\312\002\037Go" +
      "ogle\\Ads\\GoogleAds\\V12\\Common\352\002#Google::" +
      "Ads::GoogleAds::V12::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v12_common_Money_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_common_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_Money_descriptor,
        new java.lang.String[] { "CurrencyCode", "AmountMicros", "CurrencyCode", "AmountMicros", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
