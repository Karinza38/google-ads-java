// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/feed_item.proto

package com.google.ads.googleads.v0.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v0/resources/feed" +
      "_item.proto\022!google.ads.googleads.v0.res" +
      "ources\0325google/ads/googleads/v0/common/c" +
      "ustom_parameter.proto\0320google/ads/google" +
      "ads/v0/common/feed_common.proto\0324google/" +
      "ads/googleads/v0/enums/feed_item_status." +
      "proto\032=google/ads/googleads/v0/enums/geo" +
      "_targeting_restriction.proto\032\036google/pro" +
      "tobuf/wrappers.proto\"\320\004\n\010FeedItem\022\025\n\rres" +
      "ource_name\030\001 \001(\t\022*\n\004feed\030\002 \001(\0132\034.google." +
      "protobuf.StringValue\022\'\n\002id\030\003 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\0225\n\017start_date_time" +
      "\030\004 \001(\0132\034.google.protobuf.StringValue\0223\n\r" +
      "end_date_time\030\005 \001(\0132\034.google.protobuf.St" +
      "ringValue\022S\n\020attribute_values\030\006 \003(\01329.go" +
      "ogle.ads.googleads.v0.resources.FeedItem" +
      "AttributeValue\022u\n\031geo_targeting_restrict" +
      "ion\030\007 \001(\0162R.google.ads.googleads.v0.enum" +
      "s.GeoTargetingRestrictionEnum.GeoTargeti" +
      "ngRestriction\022N\n\025url_custom_parameters\030\010" +
      " \003(\0132/.google.ads.googleads.v0.common.Cu" +
      "stomParameter\022P\n\006status\030\t \001(\0162@.google.a" +
      "ds.googleads.v0.enums.FeedItemStatusEnum" +
      ".FeedItemStatus\"\256\004\n\026FeedItemAttributeVal" +
      "ue\0226\n\021feed_attribute_id\030\001 \001(\0132\033.google.p" +
      "rotobuf.Int64Value\0222\n\rinteger_value\030\002 \001(" +
      "\0132\033.google.protobuf.Int64Value\0221\n\rboolea" +
      "n_value\030\003 \001(\0132\032.google.protobuf.BoolValu" +
      "e\0222\n\014string_value\030\004 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\014double_value\030\005 \001(\0132\034.go" +
      "ogle.protobuf.DoubleValue\022:\n\013price_value" +
      "\030\006 \001(\0132%.google.ads.googleads.v0.common." +
      "Price\0223\n\016integer_values\030\007 \003(\0132\033.google.p" +
      "rotobuf.Int64Value\0222\n\016boolean_values\030\010 \003" +
      "(\0132\032.google.protobuf.BoolValue\0223\n\rstring" +
      "_values\030\t \003(\0132\034.google.protobuf.StringVa" +
      "lue\0223\n\rdouble_values\030\n \003(\0132\034.google.prot" +
      "obuf.DoubleValueB\322\001\n%com.google.ads.goog" +
      "leads.v0.resourcesB\rFeedItemProtoP\001ZJgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v0/resources;resources\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V0.Resources\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V0\\Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", });
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", });
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}