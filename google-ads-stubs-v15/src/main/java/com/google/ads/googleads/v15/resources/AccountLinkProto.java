// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/account_link.proto

package com.google.ads.googleads.v15.resources;

public final class AccountLinkProto {
  private AccountLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AccountLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AccountLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_DataPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_DataPartnerLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_GoogleAdsLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_GoogleAdsLinkIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AdvertisingPartnerLinkIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AdvertisingPartnerLinkIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v15/resources/acc" +
      "ount_link.proto\022\"google.ads.googleads.v1" +
      "5.resources\0328google/ads/googleads/v15/en" +
      "ums/account_link_status.proto\0328google/ad" +
      "s/googleads/v15/enums/linked_account_typ" +
      "e.proto\0326google/ads/googleads/v15/enums/" +
      "mobile_app_vendor.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\314\006\n\013AccountLink\022D\n\rresource_name\030\001 \001" +
      "(\tB-\342A\001\005\372A&\n$googleads.googleapis.com/Ac" +
      "countLink\022\"\n\017account_link_id\030\010 \001(\003B\004\342A\001\003" +
      "H\001\210\001\001\022W\n\006status\030\003 \001(\0162G.google.ads.googl" +
      "eads.v15.enums.AccountLinkStatusEnum.Acc" +
      "ountLinkStatus\022[\n\004type\030\004 \001(\0162G.google.ad" +
      "s.googleads.v15.enums.LinkedAccountTypeE" +
      "num.LinkedAccountTypeB\004\342A\001\003\022s\n\031third_par" +
      "ty_app_analytics\030\005 \001(\0132H.google.ads.goog" +
      "leads.v15.resources.ThirdPartyAppAnalyti" +
      "csLinkIdentifierB\004\342A\001\005H\000\022[\n\014data_partner" +
      "\030\006 \001(\0132=.google.ads.googleads.v15.resour" +
      "ces.DataPartnerLinkIdentifierB\004\342A\001\003H\000\022W\n" +
      "\ngoogle_ads\030\007 \001(\0132;.google.ads.googleads" +
      ".v15.resources.GoogleAdsLinkIdentifierB\004" +
      "\342A\001\003H\000\022i\n\023advertising_partner\030\n \001(\0132D.go" +
      "ogle.ads.googleads.v15.resources.Adverti" +
      "singPartnerLinkIdentifierB\004\342A\001\003H\000:a\352A^\n$" +
      "googleads.googleapis.com/AccountLink\0226cu" +
      "stomers/{customer_id}/accountLinks/{acco" +
      "unt_link_id}B\020\n\016linked_accountB\022\n\020_accou" +
      "nt_link_id\"\367\001\n$ThirdPartyAppAnalyticsLin" +
      "kIdentifier\022,\n\031app_analytics_provider_id" +
      "\030\004 \001(\003B\004\342A\001\005H\000\210\001\001\022\031\n\006app_id\030\005 \001(\tB\004\342A\001\005H" +
      "\001\210\001\001\022]\n\napp_vendor\030\003 \001(\0162C.google.ads.go" +
      "ogleads.v15.enums.MobileAppVendorEnum.Mo" +
      "bileAppVendorB\004\342A\001\005B\034\n\032_app_analytics_pr" +
      "ovider_idB\t\n\007_app_id\"S\n\031DataPartnerLinkI" +
      "dentifier\022\"\n\017data_partner_id\030\001 \001(\003B\004\342A\001\005" +
      "H\000\210\001\001B\022\n\020_data_partner_id\"i\n\027GoogleAdsLi" +
      "nkIdentifier\022A\n\010customer\030\003 \001(\tB*\342A\001\005\372A#\n" +
      "!googleads.googleapis.com/CustomerH\000\210\001\001B" +
      "\013\n\t_customer\"r\n AdvertisingPartnerLinkId" +
      "entifier\022A\n\010customer\030\001 \001(\tB*\342A\001\005\372A#\n!goo" +
      "gleads.googleapis.com/CustomerH\000\210\001\001B\013\n\t_" +
      "customerB\202\002\n&com.google.ads.googleads.v1" +
      "5.resourcesB\020AccountLinkProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v15/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V15.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V15\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.AccountLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.LinkedAccountTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AccountLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AccountLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AccountLink_descriptor,
        new java.lang.String[] { "ResourceName", "AccountLinkId", "Status", "Type", "ThirdPartyAppAnalytics", "DataPartner", "GoogleAds", "AdvertisingPartner", "LinkedAccount", "AccountLinkId", });
    internal_static_google_ads_googleads_v15_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor,
        new java.lang.String[] { "AppAnalyticsProviderId", "AppId", "AppVendor", "AppAnalyticsProviderId", "AppId", });
    internal_static_google_ads_googleads_v15_resources_DataPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_DataPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_DataPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "DataPartnerId", "DataPartnerId", });
    internal_static_google_ads_googleads_v15_resources_GoogleAdsLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_resources_GoogleAdsLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_GoogleAdsLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    internal_static_google_ads_googleads_v15_resources_AdvertisingPartnerLinkIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v15_resources_AdvertisingPartnerLinkIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AdvertisingPartnerLinkIdentifier_descriptor,
        new java.lang.String[] { "Customer", "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.AccountLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.LinkedAccountTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
