// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/multiplier_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

public final class MultiplierErrorProto {
  private MultiplierErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_errors_MultiplierErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_errors_MultiplierErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v18/errors/multip" +
      "lier_error.proto\022\037google.ads.googleads.v" +
      "18.errors\"\317\004\n\023MultiplierErrorEnum\"\267\004\n\017Mu" +
      "ltiplierError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOW" +
      "N\020\001\022\027\n\023MULTIPLIER_TOO_HIGH\020\002\022\026\n\022MULTIPLI" +
      "ER_TOO_LOW\020\003\022\036\n\032TOO_MANY_FRACTIONAL_DIGI" +
      "TS\020\004\022/\n+MULTIPLIER_NOT_ALLOWED_FOR_BIDDI" +
      "NG_STRATEGY\020\005\0223\n/MULTIPLIER_NOT_ALLOWED_" +
      "WHEN_BASE_BID_IS_MISSING\020\006\022\033\n\027NO_MULTIPL" +
      "IER_SPECIFIED\020\007\0220\n,MULTIPLIER_CAUSES_BID" +
      "_TO_EXCEED_DAILY_BUDGET\020\010\0222\n.MULTIPLIER_" +
      "CAUSES_BID_TO_EXCEED_MONTHLY_BUDGET\020\t\0221\n" +
      "-MULTIPLIER_CAUSES_BID_TO_EXCEED_CUSTOM_" +
      "BUDGET\020\n\0223\n/MULTIPLIER_CAUSES_BID_TO_EXC" +
      "EED_MAX_ALLOWED_BID\020\013\0221\n-BID_LESS_THAN_M" +
      "IN_ALLOWED_BID_WITH_MULTIPLIER\020\014\0221\n-MULT" +
      "IPLIER_AND_BIDDING_STRATEGY_TYPE_MISMATC" +
      "H\020\rB\364\001\n#com.google.ads.googleads.v18.err" +
      "orsB\024MultiplierErrorProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v18/errors;errors\242\002\003GAA\252\002\037Google.Ads.Go" +
      "ogleAds.V18.Errors\312\002\037Google\\Ads\\GoogleAd" +
      "s\\V18\\Errors\352\002#Google::Ads::GoogleAds::V" +
      "18::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v18_errors_MultiplierErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_errors_MultiplierErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_errors_MultiplierErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
