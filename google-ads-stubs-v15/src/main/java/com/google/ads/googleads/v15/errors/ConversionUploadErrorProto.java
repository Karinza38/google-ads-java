// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/conversion_upload_error.proto

package com.google.ads.googleads.v15.errors;

public final class ConversionUploadErrorProto {
  private ConversionUploadErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_ConversionUploadErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_ConversionUploadErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v15/errors/conver" +
      "sion_upload_error.proto\022\037google.ads.goog" +
      "leads.v15.errors\"\312\r\n\031ConversionUploadErr" +
      "orEnum\"\254\r\n\025ConversionUploadError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022#\n\037TOO_MANY_CONVE" +
      "RSIONS_IN_REQUEST\020\002\022\025\n\021UNPARSEABLE_GCLID" +
      "\020\003\022\035\n\031CONVERSION_PRECEDES_EVENT\020*\022\021\n\rEXP" +
      "IRED_EVENT\020+\022\024\n\020TOO_RECENT_EVENT\020,\022\023\n\017EV" +
      "ENT_NOT_FOUND\020-\022\031\n\025UNAUTHORIZED_CUSTOMER" +
      "\020\010\022 \n\034TOO_RECENT_CONVERSION_ACTION\020\n\0226\n2" +
      "CONVERSION_TRACKING_NOT_ENABLED_AT_IMPRE" +
      "SSION_TIME\020\013\022Q\nMEXTERNAL_ATTRIBUTION_DAT" +
      "A_SET_FOR_NON_EXTERNALLY_ATTRIBUTED_CONV" +
      "ERSION_ACTION\020\014\022Q\nMEXTERNAL_ATTRIBUTION_" +
      "DATA_NOT_SET_FOR_EXTERNALLY_ATTRIBUTED_C" +
      "ONVERSION_ACTION\020\r\022F\nBORDER_ID_NOT_PERMI" +
      "TTED_FOR_EXTERNALLY_ATTRIBUTED_CONVERSIO" +
      "N_ACTION\020\016\022\033\n\027ORDER_ID_ALREADY_IN_USE\020\017\022" +
      "\026\n\022DUPLICATE_ORDER_ID\020\020\022\023\n\017TOO_RECENT_CA" +
      "LL\020\021\022\020\n\014EXPIRED_CALL\020\022\022\022\n\016CALL_NOT_FOUND" +
      "\020\023\022\034\n\030CONVERSION_PRECEDES_CALL\020\024\0220\n,CONV" +
      "ERSION_TRACKING_NOT_ENABLED_AT_CALL_TIME" +
      "\020\025\022$\n UNPARSEABLE_CALLERS_PHONE_NUMBER\020\026" +
      "\022#\n\037CLICK_CONVERSION_ALREADY_EXISTS\020\027\022\"\n" +
      "\036CALL_CONVERSION_ALREADY_EXISTS\020\030\022)\n%DUP" +
      "LICATE_CLICK_CONVERSION_IN_REQUEST\020\031\022(\n$" +
      "DUPLICATE_CALL_CONVERSION_IN_REQUEST\020\032\022\037" +
      "\n\033CUSTOM_VARIABLE_NOT_ENABLED\020\034\022&\n\"CUSTO" +
      "M_VARIABLE_VALUE_CONTAINS_PII\020\035\022\036\n\032INVAL" +
      "ID_CUSTOMER_FOR_CLICK\020\036\022\035\n\031INVALID_CUSTO" +
      "MER_FOR_CALL\020\037\022,\n(CONVERSION_NOT_COMPLIA" +
      "NT_WITH_ATT_POLICY\020 \022\023\n\017CLICK_NOT_FOUND\020" +
      "!\022\033\n\027INVALID_USER_IDENTIFIER\020\"\022N\nJEXTERN" +
      "ALLY_ATTRIBUTED_CONVERSION_ACTION_NOT_PE" +
      "RMITTED_WITH_USER_IDENTIFIER\020#\022\037\n\033UNSUPP" +
      "ORTED_USER_IDENTIFIER\020$\022\032\n\026GBRAID_WBRAID" +
      "_BOTH_SET\020&\022\026\n\022UNPARSEABLE_WBRAID\020\'\022\026\n\022U" +
      "NPARSEABLE_GBRAID\020(\022<\n8ONE_PER_CLICK_CON" +
      "VERSION_ACTION_NOT_PERMITTED_WITH_BRAID\020" +
      ".\0227\n3CUSTOMER_DATA_POLICY_PROHIBITS_ENHA" +
      "NCED_CONVERSIONS\020/\022-\n)CUSTOMER_NOT_ACCEP" +
      "TED_CUSTOMER_DATA_TERMS\0200\022\031\n\025ORDER_ID_CO" +
      "NTAINS_PII\0201\0227\n3CUSTOMER_NOT_ENABLED_ENH" +
      "ANCED_CONVERSIONS_FOR_LEADS\0202\022\022\n\016INVALID" +
      "_JOB_ID\0204\022\036\n\032NO_CONVERSION_ACTION_FOUND\020" +
      "5\022\"\n\036INVALID_CONVERSION_ACTION_TYPE\0206B\372\001" +
      "\n#com.google.ads.googleads.v15.errorsB\032C" +
      "onversionUploadErrorProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v15/errors;errors\242\002\003GAA\252\002\037Google.Ads.Go" +
      "ogleAds.V15.Errors\312\002\037Google\\Ads\\GoogleAd" +
      "s\\V15\\Errors\352\002#Google::Ads::GoogleAds::V" +
      "15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_ConversionUploadErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_ConversionUploadErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_ConversionUploadErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
