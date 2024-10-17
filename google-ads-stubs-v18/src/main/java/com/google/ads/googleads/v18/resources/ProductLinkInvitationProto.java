// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/product_link_invitation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class ProductLinkInvitationProto {
  private ProductLinkInvitationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_ProductLinkInvitation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_ProductLinkInvitation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_HotelCenterLinkInvitationIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_HotelCenterLinkInvitationIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_MerchantCenterLinkInvitationIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_MerchantCenterLinkInvitationIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdvertisingPartnerLinkInvitationIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdvertisingPartnerLinkInvitationIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v18/resources/pro" +
      "duct_link_invitation.proto\022\"google.ads.g" +
      "oogleads.v18.resources\0328google/ads/googl" +
      "eads/v18/enums/linked_product_type.proto" +
      "\032Cgoogle/ads/googleads/v18/enums/product" +
      "_link_invitation_status.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\264\006\n\025ProductLinkInvitation\022M\n\rr" +
      "esource_name\030\001 \001(\tB6\340A\005\372A0\n.googleads.go" +
      "ogleapis.com/ProductLinkInvitation\022\'\n\032pr" +
      "oduct_link_invitation_id\030\002 \001(\003B\003\340A\003\022p\n\006s" +
      "tatus\030\003 \001(\0162[.google.ads.googleads.v18.e" +
      "nums.ProductLinkInvitationStatusEnum.Pro" +
      "ductLinkInvitationStatusB\003\340A\003\022Z\n\004type\030\006 " +
      "\001(\0162G.google.ads.googleads.v18.enums.Lin" +
      "kedProductTypeEnum.LinkedProductTypeB\003\340A" +
      "\003\022d\n\014hotel_center\030\004 \001(\0132G.google.ads.goo" +
      "gleads.v18.resources.HotelCenterLinkInvi" +
      "tationIdentifierB\003\340A\003H\000\022j\n\017merchant_cent" +
      "er\030\005 \001(\0132J.google.ads.googleads.v18.reso" +
      "urces.MerchantCenterLinkInvitationIdenti" +
      "fierB\003\340A\003H\000\022r\n\023advertising_partner\030\007 \001(\013" +
      "2N.google.ads.googleads.v18.resources.Ad" +
      "vertisingPartnerLinkInvitationIdentifier" +
      "B\003\340A\003H\000:|\352Ay\n.googleads.googleapis.com/P" +
      "roductLinkInvitation\022Gcustomers/{custome" +
      "r_id}/productLinkInvitations/{customer_i" +
      "nvitation_id}B\021\n\017invited_account\"C\n#Hote" +
      "lCenterLinkInvitationIdentifier\022\034\n\017hotel" +
      "_center_id\030\001 \001(\003B\003\340A\003\"I\n&MerchantCenterL" +
      "inkInvitationIdentifier\022\037\n\022merchant_cent" +
      "er_id\030\001 \001(\003B\003\340A\003\"{\n*AdvertisingPartnerLi" +
      "nkInvitationIdentifier\022@\n\010customer\030\001 \001(\t" +
      "B)\340A\005\372A#\n!googleads.googleapis.com/Custo" +
      "merH\000\210\001\001B\013\n\t_customerB\214\002\n&com.google.ads" +
      ".googleads.v18.resourcesB\032ProductLinkInv" +
      "itationProtoP\001ZKgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v18/resource" +
      "s;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds" +
      ".V18.Resources\312\002\"Google\\Ads\\GoogleAds\\V1" +
      "8\\Resources\352\002&Google::Ads::GoogleAds::V1" +
      "8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.LinkedProductTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.ProductLinkInvitationStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_ProductLinkInvitation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_ProductLinkInvitation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_ProductLinkInvitation_descriptor,
        new java.lang.String[] { "ResourceName", "ProductLinkInvitationId", "Status", "Type", "HotelCenter", "MerchantCenter", "AdvertisingPartner", "InvitedAccount", });
    internal_static_google_ads_googleads_v18_resources_HotelCenterLinkInvitationIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_resources_HotelCenterLinkInvitationIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_HotelCenterLinkInvitationIdentifier_descriptor,
        new java.lang.String[] { "HotelCenterId", });
    internal_static_google_ads_googleads_v18_resources_MerchantCenterLinkInvitationIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_resources_MerchantCenterLinkInvitationIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_MerchantCenterLinkInvitationIdentifier_descriptor,
        new java.lang.String[] { "MerchantCenterId", });
    internal_static_google_ads_googleads_v18_resources_AdvertisingPartnerLinkInvitationIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_resources_AdvertisingPartnerLinkInvitationIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdvertisingPartnerLinkInvitationIdentifier_descriptor,
        new java.lang.String[] { "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.LinkedProductTypeProto.getDescriptor();
    com.google.ads.googleads.v18.enums.ProductLinkInvitationStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
