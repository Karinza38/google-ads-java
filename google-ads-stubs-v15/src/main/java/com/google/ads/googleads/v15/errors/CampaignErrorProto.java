// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/campaign_error.proto

package com.google.ads.googleads.v15.errors;

public final class CampaignErrorProto {
  private CampaignErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_CampaignErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_CampaignErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v15/errors/campai" +
      "gn_error.proto\022\037google.ads.googleads.v15" +
      ".errors\"\327\030\n\021CampaignErrorEnum\"\301\030\n\rCampai" +
      "gnError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n" +
      "\035CANNOT_TARGET_CONTENT_NETWORK\020\003\022 \n\034CANN" +
      "OT_TARGET_SEARCH_NETWORK\020\004\0226\n2CANNOT_TAR" +
      "GET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH" +
      "\020\005\0220\n,CANNOT_TARGET_GOOGLE_SEARCH_FOR_CP" +
      "M_CAMPAIGN\020\006\022-\n)CAMPAIGN_MUST_TARGET_AT_" +
      "LEAST_ONE_NETWORK\020\007\022(\n$CANNOT_TARGET_PAR" +
      "TNER_SEARCH_NETWORK\020\010\022K\nGCANNOT_TARGET_C" +
      "ONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_" +
      "BIDDING_STRATEGY\020\t\0226\n2CAMPAIGN_DURATION_" +
      "MUST_CONTAIN_ALL_RUNNABLE_TRIALS\020\n\022$\n CA" +
      "NNOT_MODIFY_FOR_TRIAL_CAMPAIGN\020\013\022\033\n\027DUPL" +
      "ICATE_CAMPAIGN_NAME\020\014\022\037\n\033INCOMPATIBLE_CA" +
      "MPAIGN_FIELD\020\r\022\031\n\025INVALID_CAMPAIGN_NAME\020" +
      "\016\022*\n&INVALID_AD_SERVING_OPTIMIZATION_STA" +
      "TUS\020\017\022\030\n\024INVALID_TRACKING_URL\020\020\022>\n:CANNO" +
      "T_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRA" +
      "CKING_SETTING\020\021\022 \n\034MAX_IMPRESSIONS_NOT_I" +
      "N_RANGE\020\022\022\033\n\027TIME_UNIT_NOT_SUPPORTED\020\023\0221" +
      "\n-INVALID_OPERATION_IF_SERVING_STATUS_HA" +
      "S_ENDED\020\024\022\033\n\027BUDGET_CANNOT_BE_SHARED\020\025\022%" +
      "\n!CAMPAIGN_CANNOT_USE_SHARED_BUDGET\020\026\0220\n" +
      ",CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_T" +
      "RIALS\020\027\022!\n\035CAMPAIGN_LABEL_DOES_NOT_EXIST" +
      "\020\030\022!\n\035CAMPAIGN_LABEL_ALREADY_EXISTS\020\031\022\034\n" +
      "\030MISSING_SHOPPING_SETTING\020\032\022\"\n\036INVALID_S" +
      "HOPPING_SALES_COUNTRY\020\033\022;\n7ADVERTISING_C" +
      "HANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TY" +
      "PE\020\037\022(\n$INVALID_ADVERTISING_CHANNEL_SUB_" +
      "TYPE\020 \022,\n(AT_LEAST_ONE_CONVERSION_MUST_B" +
      "E_SELECTED\020!\022\037\n\033CANNOT_SET_AD_ROTATION_M" +
      "ODE\020\"\022/\n+CANNOT_MODIFY_START_DATE_IF_ALR" +
      "EADY_STARTED\020#\022\033\n\027CANNOT_SET_DATE_TO_PAS" +
      "T\020$\022\037\n\033MISSING_HOTEL_CUSTOMER_LINK\020%\022\037\n\033" +
      "INVALID_HOTEL_CUSTOMER_LINK\020&\022\031\n\025MISSING" +
      "_HOTEL_SETTING\020\'\022B\n>CANNOT_USE_SHARED_CA" +
      "MPAIGN_BUDGET_WHILE_PART_OF_CAMPAIGN_GRO" +
      "UP\020(\022\021\n\rAPP_NOT_FOUND\020)\0229\n5SHOPPING_ENAB" +
      "LE_LOCAL_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE" +
      "\020*\0223\n/MERCHANT_NOT_ALLOWED_FOR_COMPARISO" +
      "N_LISTING_ADS\020+\022#\n\037INSUFFICIENT_APP_INST" +
      "ALLS_COUNT\020,\022\032\n\026SENSITIVE_CATEGORY_APP\020-" +
      "\022\032\n\026HEC_AGREEMENT_REQUIRED\020.\022<\n8NOT_COMP" +
      "ATIBLE_WITH_VIEW_THROUGH_CONVERSION_OPTI" +
      "MIZATION\0201\022,\n(INVALID_EXCLUDED_PARENT_AS" +
      "SET_FIELD_TYPE\0200\022:\n6CANNOT_CREATE_APP_PR" +
      "E_REGISTRATION_FOR_NON_ANDROID_APP\0202\022=\n9" +
      "APP_NOT_AVAILABLE_TO_CREATE_APP_PRE_REGI" +
      "STRATION_CAMPAIGN\0203\022\034\n\030INCOMPATIBLE_BUDG" +
      "ET_TYPE\0204\022)\n%LOCAL_SERVICES_DUPLICATE_CA" +
      "TEGORY_BID\0205\022\'\n#LOCAL_SERVICES_INVALID_C" +
      "ATEGORY_BID\0206\022\'\n#LOCAL_SERVICES_MISSING_" +
      "CATEGORY_BID\0207\022\031\n\025INVALID_STATUS_CHANGE\020" +
      "9\022 \n\034MISSING_TRAVEL_CUSTOMER_LINK\020:\022 \n\034I" +
      "NVALID_TRAVEL_CUSTOMER_LINK\020;\022*\n&INVALID" +
      "_EXCLUDED_PARENT_ASSET_SET_TYPE\020>\022,\n(ASS" +
      "ET_SET_NOT_A_HOTEL_PROPERTY_ASSET_SET\020?\022" +
      "F\nBHOTEL_PROPERTY_ASSET_SET_ONLY_FOR_PER" +
      "FORMANCE_MAX_FOR_TRAVEL_GOALS\020@\022 \n\034AVERA" +
      "GE_DAILY_SPEND_TOO_HIGH\020A\022+\n\'CANNOT_ATTA" +
      "CH_TO_REMOVED_CAMPAIGN_GROUP\020B\022%\n!CANNOT" +
      "_ATTACH_TO_BIDDING_STRATEGY\020C\022\037\n\033CANNOT_" +
      "CHANGE_BUDGET_PERIOD\020D\022\032\n\026NOT_ENOUGH_CON" +
      "VERSIONS\020G\022.\n*CANNOT_SET_MORE_THAN_ONE_C" +
      "ONVERSION_ACTION\020H\022#\n\037NOT_COMPATIBLE_WIT" +
      "H_BUDGET_TYPE\020I\0220\n,NOT_COMPATIBLE_WITH_U" +
      "PLOAD_CLICKS_CONVERSION\020J\022.\n*APP_ID_MUST" +
      "_MATCH_CONVERSION_ACTION_APP_ID\020L\0228\n4CON" +
      "VERSION_ACTION_WITH_DOWNLOAD_CATEGORY_NO" +
      "T_ALLOWED\020M\0225\n1CONVERSION_ACTION_WITH_DO" +
      "WNLOAD_CATEGORY_REQUIRED\020N\022#\n\037CONVERSION" +
      "_TRACKING_NOT_ENABLED\020O\022-\n)NOT_COMPATIBL" +
      "E_WITH_BIDDING_STRATEGY_TYPE\020P\0226\n2NOT_CO" +
      "MPATIBLE_WITH_GOOGLE_ATTRIBUTION_CONVERS" +
      "IONS\020Q\022\033\n\027CONVERSION_LAG_TOO_HIGH\020R\022\"\n\036N" +
      "OT_LINKED_ADVERTISING_PARTNER\020S\022-\n)INVAL" +
      "ID_NUMBER_OF_ADVERTISING_PARTNER_IDS\020T\0221" +
      "\n-CANNOT_TARGET_DISPLAY_NETWORK_WITHOUT_" +
      "YOUTUBE\020UB\362\001\n#com.google.ads.googleads.v" +
      "15.errorsB\022CampaignErrorProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v15/errors;errors\242\002\003GAA\252\002\037Google.Ad" +
      "s.GoogleAds.V15.Errors\312\002\037Google\\Ads\\Goog" +
      "leAds\\V15\\Errors\352\002#Google::Ads::GoogleAd" +
      "s::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_CampaignErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_CampaignErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_CampaignErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
