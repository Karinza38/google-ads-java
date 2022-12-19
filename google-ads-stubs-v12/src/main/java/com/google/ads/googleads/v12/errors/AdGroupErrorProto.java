// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/ad_group_error.proto

package com.google.ads.googleads.v12.errors;

public final class AdGroupErrorProto {
  private AdGroupErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_errors_AdGroupErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_errors_AdGroupErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v12/errors/ad_gro" +
      "up_error.proto\022\037google.ads.googleads.v12" +
      ".errors\"\207\005\n\020AdGroupErrorEnum\"\362\004\n\014AdGroup" +
      "Error\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032\n\026D" +
      "UPLICATE_ADGROUP_NAME\020\002\022\030\n\024INVALID_ADGRO" +
      "UP_NAME\020\003\022%\n!ADVERTISER_NOT_ON_CONTENT_N" +
      "ETWORK\020\005\022\017\n\013BID_TOO_BIG\020\006\022*\n&BID_TYPE_AN" +
      "D_BIDDING_STRATEGY_MISMATCH\020\007\022\030\n\024MISSING" +
      "_ADGROUP_NAME\020\010\022 \n\034ADGROUP_LABEL_DOES_NO" +
      "T_EXIST\020\t\022 \n\034ADGROUP_LABEL_ALREADY_EXIST" +
      "S\020\n\022,\n(INVALID_CONTENT_BID_CRITERION_TYP" +
      "E_GROUP\020\013\0228\n4AD_GROUP_TYPE_NOT_VALID_FOR" +
      "_ADVERTISING_CHANNEL_TYPE\020\014\0229\n5ADGROUP_T" +
      "YPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COU" +
      "NTRY\020\r\022B\n>CANNOT_ADD_ADGROUP_OF_TYPE_DSA" +
      "_TO_CAMPAIGN_WITHOUT_DSA_SETTING\020\016\0227\n3PR" +
      "OMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR" +
      "_CUSTOMER\020\017\022,\n(INVALID_EXCLUDED_PARENT_A" +
      "SSET_FIELD_TYPE\020\020B\361\001\n#com.google.ads.goo" +
      "gleads.v12.errorsB\021AdGroupErrorProtoP\001ZE" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v12/errors;errors\242\002\003GAA\252\002\037Go" +
      "ogle.Ads.GoogleAds.V12.Errors\312\002\037Google\\A" +
      "ds\\GoogleAds\\V12\\Errors\352\002#Google::Ads::G" +
      "oogleAds::V12::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v12_errors_AdGroupErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_errors_AdGroupErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_errors_AdGroupErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}