// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/date_error.proto

package com.google.ads.googleads.v12.errors;

public final class DateErrorProto {
  private DateErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_errors_DateErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_errors_DateErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v12/errors/date_e" +
      "rror.proto\022\037google.ads.googleads.v12.err" +
      "ors\"\277\003\n\rDateErrorEnum\"\255\003\n\tDateError\022\017\n\013U" +
      "NSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022 \n\034INVALID_FIE" +
      "LD_VALUES_IN_DATE\020\002\022%\n!INVALID_FIELD_VAL" +
      "UES_IN_DATE_TIME\020\003\022\027\n\023INVALID_STRING_DAT" +
      "E\020\004\022#\n\037INVALID_STRING_DATE_TIME_MICROS\020\006" +
      "\022$\n INVALID_STRING_DATE_TIME_SECONDS\020\013\0220" +
      "\n,INVALID_STRING_DATE_TIME_SECONDS_WITH_" +
      "OFFSET\020\014\022\035\n\031EARLIER_THAN_MINIMUM_DATE\020\007\022" +
      "\033\n\027LATER_THAN_MAXIMUM_DATE\020\010\0223\n/DATE_RAN" +
      "GE_MINIMUM_DATE_LATER_THAN_MAXIMUM_DATE\020" +
      "\t\0222\n.DATE_RANGE_MINIMUM_AND_MAXIMUM_DATE" +
      "S_BOTH_NULL\020\nB\356\001\n#com.google.ads.googlea" +
      "ds.v12.errorsB\016DateErrorProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v12/errors;errors\242\002\003GAA\252\002\037Google.Ad" +
      "s.GoogleAds.V12.Errors\312\002\037Google\\Ads\\Goog" +
      "leAds\\V12\\Errors\352\002#Google::Ads::GoogleAd" +
      "s::V12::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v12_errors_DateErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_errors_DateErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_errors_DateErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
