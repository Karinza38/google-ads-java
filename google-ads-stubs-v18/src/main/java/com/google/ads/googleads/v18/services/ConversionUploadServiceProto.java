// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/conversion_upload_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CallConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CustomVariable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CartData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CartData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CartData_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CartData_Item_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v18/services/conv" +
      "ersion_upload_service.proto\022!google.ads." +
      "googleads.v18.services\032-google/ads/googl" +
      "eads/v18/common/consent.proto\0327google/ad" +
      "s/googleads/v18/common/offline_user_data" +
      ".proto\032@google/ads/googleads/v18/enums/c" +
      "onversion_environment_enum.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032\027google/rpc/" +
      "status.proto\"\370\001\n\035UploadClickConversionsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\013conv" +
      "ersions\030\002 \003(\01322.google.ads.googleads.v18" +
      ".services.ClickConversionB\003\340A\002\022\034\n\017partia" +
      "l_failure\030\003 \001(\010B\003\340A\002\022\025\n\rvalidate_only\030\004 " +
      "\001(\010\022\025\n\rdebug_enabled\030\005 \001(\010\022\030\n\006job_id\030\006 \001" +
      "(\005B\003\340A\001H\000\210\001\001B\t\n\007_job_id\"\256\001\n\036UploadClickC" +
      "onversionsResponse\0221\n\025partial_failure_er" +
      "ror\030\001 \001(\0132\022.google.rpc.Status\022I\n\007results" +
      "\030\002 \003(\01328.google.ads.googleads.v18.servic" +
      "es.ClickConversionResult\022\016\n\006job_id\030\003 \001(\003" +
      "\"\272\001\n\034UploadCallConversionsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022K\n\013conversions\030\002 \003(\013" +
      "21.google.ads.googleads.v18.services.Cal" +
      "lConversionB\003\340A\002\022\034\n\017partial_failure\030\003 \001(" +
      "\010B\003\340A\002\022\025\n\rvalidate_only\030\004 \001(\010\"\234\001\n\035Upload" +
      "CallConversionsResponse\0221\n\025partial_failu" +
      "re_error\030\001 \001(\0132\022.google.rpc.Status\022H\n\007re" +
      "sults\030\002 \003(\01327.google.ads.googleads.v18.s" +
      "ervices.CallConversionResult\"\252\006\n\017ClickCo" +
      "nversion\022\022\n\005gclid\030\t \001(\tH\000\210\001\001\022\016\n\006gbraid\030\022" +
      " \001(\t\022\016\n\006wbraid\030\023 \001(\t\022\036\n\021conversion_actio" +
      "n\030\n \001(\tH\001\210\001\001\022!\n\024conversion_date_time\030\013 \001" +
      "(\tH\002\210\001\001\022\035\n\020conversion_value\030\014 \001(\001H\003\210\001\001\022\032" +
      "\n\rcurrency_code\030\r \001(\tH\004\210\001\001\022\025\n\010order_id\030\016" +
      " \001(\tH\005\210\001\001\022]\n\031external_attribution_data\030\007" +
      " \001(\0132:.google.ads.googleads.v18.services" +
      ".ExternalAttributionData\022K\n\020custom_varia" +
      "bles\030\017 \003(\01321.google.ads.googleads.v18.se" +
      "rvices.CustomVariable\022>\n\tcart_data\030\020 \001(\013" +
      "2+.google.ads.googleads.v18.services.Car" +
      "tData\022I\n\020user_identifiers\030\021 \003(\0132/.google" +
      ".ads.googleads.v18.common.UserIdentifier" +
      "\022o\n\026conversion_environment\030\024 \001(\0162O.googl" +
      "e.ads.googleads.v18.enums.ConversionEnvi" +
      "ronmentEnum.ConversionEnvironment\0229\n\007con" +
      "sent\030\027 \001(\0132(.google.ads.googleads.v18.co" +
      "mmon.ConsentB\010\n\006_gclidB\024\n\022_conversion_ac" +
      "tionB\027\n\025_conversion_date_timeB\023\n\021_conver" +
      "sion_valueB\020\n\016_currency_codeB\013\n\t_order_i" +
      "d\"\316\003\n\016CallConversion\022\026\n\tcaller_id\030\007 \001(\tH" +
      "\000\210\001\001\022!\n\024call_start_date_time\030\010 \001(\tH\001\210\001\001\022" +
      "\036\n\021conversion_action\030\t \001(\tH\002\210\001\001\022!\n\024conve" +
      "rsion_date_time\030\n \001(\tH\003\210\001\001\022\035\n\020conversion" +
      "_value\030\013 \001(\001H\004\210\001\001\022\032\n\rcurrency_code\030\014 \001(\t" +
      "H\005\210\001\001\022K\n\020custom_variables\030\r \003(\01321.google" +
      ".ads.googleads.v18.services.CustomVariab" +
      "le\0229\n\007consent\030\016 \001(\0132(.google.ads.googlea" +
      "ds.v18.common.ConsentB\014\n\n_caller_idB\027\n\025_" +
      "call_start_date_timeB\024\n\022_conversion_acti" +
      "onB\027\n\025_conversion_date_timeB\023\n\021_conversi" +
      "on_valueB\020\n\016_currency_code\"\253\001\n\027ExternalA" +
      "ttributionData\022(\n\033external_attribution_c" +
      "redit\030\003 \001(\001H\000\210\001\001\022\'\n\032external_attribution" +
      "_model\030\004 \001(\tH\001\210\001\001B\036\n\034_external_attributi" +
      "on_creditB\035\n\033_external_attribution_model" +
      "\"\222\002\n\025ClickConversionResult\022\022\n\005gclid\030\004 \001(" +
      "\tH\000\210\001\001\022\016\n\006gbraid\030\010 \001(\t\022\016\n\006wbraid\030\t \001(\t\022\036" +
      "\n\021conversion_action\030\005 \001(\tH\001\210\001\001\022!\n\024conver" +
      "sion_date_time\030\006 \001(\tH\002\210\001\001\022I\n\020user_identi" +
      "fiers\030\007 \003(\0132/.google.ads.googleads.v18.c" +
      "ommon.UserIdentifierB\010\n\006_gclidB\024\n\022_conve" +
      "rsion_actionB\027\n\025_conversion_date_time\"\352\001" +
      "\n\024CallConversionResult\022\026\n\tcaller_id\030\005 \001(" +
      "\tH\000\210\001\001\022!\n\024call_start_date_time\030\006 \001(\tH\001\210\001" +
      "\001\022\036\n\021conversion_action\030\007 \001(\tH\002\210\001\001\022!\n\024con" +
      "version_date_time\030\010 \001(\tH\003\210\001\001B\014\n\n_caller_" +
      "idB\027\n\025_call_start_date_timeB\024\n\022_conversi" +
      "on_actionB\027\n\025_conversion_date_time\"{\n\016Cu" +
      "stomVariable\022Z\n\032conversion_custom_variab" +
      "le\030\001 \001(\tB6\372A3\n1googleads.googleapis.com/" +
      "ConversionCustomVariable\022\r\n\005value\030\002 \001(\t\"" +
      "\371\001\n\010CartData\022\023\n\013merchant_id\030\006 \001(\003\022\031\n\021fee" +
      "d_country_code\030\002 \001(\t\022\032\n\022feed_language_co" +
      "de\030\003 \001(\t\022\036\n\026local_transaction_cost\030\004 \001(\001" +
      "\022?\n\005items\030\005 \003(\01320.google.ads.googleads.v" +
      "18.services.CartData.Item\032@\n\004Item\022\022\n\npro" +
      "duct_id\030\001 \001(\t\022\020\n\010quantity\030\002 \001(\005\022\022\n\nunit_" +
      "price\030\003 \001(\0012\364\004\n\027ConversionUploadService\022" +
      "\211\002\n\026UploadClickConversions\022@.google.ads." +
      "googleads.v18.services.UploadClickConver" +
      "sionsRequest\032A.google.ads.googleads.v18." +
      "services.UploadClickConversionsResponse\"" +
      "j\332A\'customer_id,conversions,partial_fail" +
      "ure\202\323\344\223\002:\"5/v18/customers/{customer_id=*" +
      "}:uploadClickConversions:\001*\022\205\002\n\025UploadCa" +
      "llConversions\022?.google.ads.googleads.v18" +
      ".services.UploadCallConversionsRequest\032@" +
      ".google.ads.googleads.v18.services.Uploa" +
      "dCallConversionsResponse\"i\332A\'customer_id" +
      ",conversions,partial_failure\202\323\344\223\0029\"4/v18" +
      "/customers/{customer_id=*}:uploadCallCon" +
      "versions:\001*\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\210\002\n%com.google.ads.googleads.v18.serv" +
      "icesB\034ConversionUploadServiceProtoP\001ZIgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v18/services;services\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V18.Services\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V18\\Services\352\002%Google::" +
      "Ads::GoogleAds::V18::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.ConsentProto.getDescriptor(),
          com.google.ads.googleads.v18.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.ConversionEnvironmentEnumProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", "DebugEnabled", "JobId", });
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", "JobId", });
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v18_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", "CustomVariables", "CartData", "UserIdentifiers", "ConversionEnvironment", "Consent", });
    internal_static_google_ads_googleads_v18_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v18_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "CustomVariables", "Consent", });
    internal_static_google_ads_googleads_v18_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v18_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v18_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v18_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "Gbraid", "Wbraid", "ConversionAction", "ConversionDateTime", "UserIdentifiers", });
    internal_static_google_ads_googleads_v18_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v18_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v18_services_CustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v18_services_CustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CustomVariable_descriptor,
        new java.lang.String[] { "ConversionCustomVariable", "Value", });
    internal_static_google_ads_googleads_v18_services_CartData_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v18_services_CartData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CartData_descriptor,
        new java.lang.String[] { "MerchantId", "FeedCountryCode", "FeedLanguageCode", "LocalTransactionCost", "Items", });
    internal_static_google_ads_googleads_v18_services_CartData_Item_descriptor =
      internal_static_google_ads_googleads_v18_services_CartData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v18_services_CartData_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CartData_Item_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "UnitPrice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.ConsentProto.getDescriptor();
    com.google.ads.googleads.v18.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v18.enums.ConversionEnvironmentEnumProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
