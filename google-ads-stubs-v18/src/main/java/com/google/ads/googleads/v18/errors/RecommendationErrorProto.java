// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/recommendation_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

public final class RecommendationErrorProto {
  private RecommendationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_errors_RecommendationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_errors_RecommendationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v18/errors/recomm" +
      "endation_error.proto\022\037google.ads.googlea" +
      "ds.v18.errors\"\361\017\n\027RecommendationErrorEnu" +
      "m\"\325\017\n\023RecommendationError\022\017\n\013UNSPECIFIED" +
      "\020\000\022\013\n\007UNKNOWN\020\001\022\033\n\027BUDGET_AMOUNT_TOO_SMA" +
      "LL\020\002\022\033\n\027BUDGET_AMOUNT_TOO_LARGE\020\003\022\031\n\025INV" +
      "ALID_BUDGET_AMOUNT\020\004\022\020\n\014POLICY_ERROR\020\005\022\026" +
      "\n\022INVALID_BID_AMOUNT\020\006\022\031\n\025ADGROUP_KEYWOR" +
      "D_LIMIT\020\007\022\"\n\036RECOMMENDATION_ALREADY_APPL" +
      "IED\020\010\022\036\n\032RECOMMENDATION_INVALIDATED\020\t\022\027\n" +
      "\023TOO_MANY_OPERATIONS\020\n\022\021\n\rNO_OPERATIONS\020" +
      "\013\022!\n\035DIFFERENT_TYPES_NOT_SUPPORTED\020\014\022\033\n\027" +
      "DUPLICATE_RESOURCE_NAME\020\r\022$\n RECOMMENDAT" +
      "ION_ALREADY_DISMISSED\020\016\022\031\n\025INVALID_APPLY" +
      "_REQUEST\020\017\022+\n\'RECOMMENDATION_TYPE_APPLY_" +
      "NOT_SUPPORTED\020\021\022\026\n\022INVALID_MULTIPLIER\020\022\022" +
      "3\n/ADVERTISING_CHANNEL_TYPE_GENERATE_NOT" +
      "_SUPPORTED\020\023\022.\n*RECOMMENDATION_TYPE_GENE" +
      "RATE_NOT_SUPPORTED\020\024\022(\n$RECOMMENDATION_T" +
      "YPES_CANNOT_BE_EMPTY\020\025\022=\n9CAMPAIGN_BUDGE" +
      "T_RECOMMENDATION_TYPE_REQUIRES_BIDDING_I" +
      "NFO\020\026\022F\nBCAMPAIGN_BUDGET_RECOMMENDATION_" +
      "TYPE_REQUIRES_BIDDING_STRATEGY_TYPE\020\027\022A\n" +
      "=CAMPAIGN_BUDGET_RECOMMENDATION_TYPE_REQ" +
      "UIRES_ASSET_GROUP_INFO\020\030\022P\nLCAMPAIGN_BUD" +
      "GET_RECOMMENDATION_TYPE_REQUIRES_ASSET_G" +
      "ROUP_INFO_WITH_FINAL_URL\020\031\022Q\nMCAMPAIGN_B" +
      "UDGET_RECOMMENDATION_TYPE_REQUIRES_COUNT" +
      "RY_CODES_FOR_SEARCH_CHANNEL\020\032\022O\nKCAMPAIG" +
      "N_BUDGET_RECOMMENDATION_TYPE_INVALID_COU" +
      "NTRY_CODE_FOR_SEARCH_CHANNEL\020\033\022R\nNCAMPAI" +
      "GN_BUDGET_RECOMMENDATION_TYPE_REQUIRES_L" +
      "ANGUAGE_CODES_FOR_SEARCH_CHANNEL\020\034\022l\nhCA" +
      "MPAIGN_BUDGET_RECOMMENDATION_TYPE_REQUIR" +
      "ES_EITHER_POSITIVE_OR_NEGATIVE_LOCATION_" +
      "IDS_FOR_SEARCH_CHANNEL\020\035\022Q\nMCAMPAIGN_BUD" +
      "GET_RECOMMENDATION_TYPE_REQUIRES_AD_GROU" +
      "P_INFO_FOR_SEARCH_CHANNEL\020\036\022L\nHCAMPAIGN_" +
      "BUDGET_RECOMMENDATION_TYPE_REQUIRES_KEYW" +
      "ORDS_FOR_SEARCH_CHANNEL\020\037\022\205\001\n\200\001CAMPAIGN_" +
      "BUDGET_RECOMMENDATION_TYPE_WITH_CHANNEL_" +
      "TYPE_SEARCH_AND_BIDDING_STRATEGY_TYPE_TA" +
      "RGET_IMPRESSION_SHARE_REQUIRES_LOCATION\020" +
      " \022\233\001\n\226\001CAMPAIGN_BUDGET_RECOMMENDATION_TY" +
      "PE_WITH_CHANNEL_TYPE_SEARCH_AND_BIDDING_" +
      "STRATEGY_TYPE_TARGET_IMPRESSION_SHARE_RE" +
      "QUIRES_TARGET_IMPRESSION_SHARE_MICROS\020!\022" +
      "\\\nXCAMPAIGN_BUDGET_RECOMMENDATION_TYPE_T" +
      "ARGET_IMPRESSION_SHARE_MICROS_BETWEEN_1_" +
      "AND_1000000\020\"\022\231\001\n\224\001CAMPAIGN_BUDGET_RECOM" +
      "MENDATION_TYPE_WITH_CHANNEL_TYPE_SEARCH_" +
      "AND_BIDDING_STRATEGY_TYPE_TARGET_IMPRESS" +
      "ION_SHARE_REQUIRES_TARGET_IMPRESSION_SHA" +
      "RE_INFO\020#B\370\001\n#com.google.ads.googleads.v" +
      "18.errorsB\030RecommendationErrorProtoP\001ZEg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v18/errors;errors\242\002\003GAA\252\002\037Goo" +
      "gle.Ads.GoogleAds.V18.Errors\312\002\037Google\\Ad" +
      "s\\GoogleAds\\V18\\Errors\352\002#Google::Ads::Go" +
      "ogleAds::V18::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v18_errors_RecommendationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_errors_RecommendationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_errors_RecommendationErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
