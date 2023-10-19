// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/dates.proto

package com.google.ads.googleads.v15.common;

public final class DatesProto {
  private DatesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_common_DateRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_common_DateRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_common_YearMonthRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_common_YearMonthRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_common_YearMonth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_common_YearMonth_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/googleads/v15/common/dates." +
      "proto\022\037google.ads.googleads.v15.common\0322" +
      "google/ads/googleads/v15/enums/month_of_" +
      "year.proto\"W\n\tDateRange\022\027\n\nstart_date\030\003 " +
      "\001(\tH\000\210\001\001\022\025\n\010end_date\030\004 \001(\tH\001\210\001\001B\r\n\013_star" +
      "t_dateB\013\n\t_end_date\"\204\001\n\016YearMonthRange\0229" +
      "\n\005start\030\001 \001(\0132*.google.ads.googleads.v15" +
      ".common.YearMonth\0227\n\003end\030\002 \001(\0132*.google." +
      "ads.googleads.v15.common.YearMonth\"e\n\tYe" +
      "arMonth\022\014\n\004year\030\001 \001(\003\022J\n\005month\030\002 \001(\0162;.g" +
      "oogle.ads.googleads.v15.enums.MonthOfYea" +
      "rEnum.MonthOfYearB\352\001\n#com.google.ads.goo" +
      "gleads.v15.commonB\nDatesProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v15/common;common\242\002\003GAA\252\002\037Google.Ad" +
      "s.GoogleAds.V15.Common\312\002\037Google\\Ads\\Goog" +
      "leAds\\V15\\Common\352\002#Google::Ads::GoogleAd" +
      "s::V15::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.MonthOfYearProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_common_DateRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_common_DateRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_common_DateRange_descriptor,
        new java.lang.String[] { "StartDate", "EndDate", "StartDate", "EndDate", });
    internal_static_google_ads_googleads_v15_common_YearMonthRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_common_YearMonthRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_common_YearMonthRange_descriptor,
        new java.lang.String[] { "Start", "End", });
    internal_static_google_ads_googleads_v15_common_YearMonth_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_common_YearMonth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_common_YearMonth_descriptor,
        new java.lang.String[] { "Year", "Month", });
    com.google.ads.googleads.v15.enums.MonthOfYearProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
