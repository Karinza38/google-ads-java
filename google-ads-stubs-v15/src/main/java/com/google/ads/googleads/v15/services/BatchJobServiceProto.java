// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/batch_job_service.proto

package com.google.ads.googleads.v15.services;

public final class BatchJobServiceProto {
  private BatchJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_BatchJobOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_BatchJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateBatchJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateBatchJobResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_RunBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_RunBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_ListBatchJobResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_ListBatchJobResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_BatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_BatchJobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v15/services/batc" +
      "h_job_service.proto\022!google.ads.googlead" +
      "s.v15.services\032:google/ads/googleads/v15" +
      "/enums/response_content_type.proto\0322goog" +
      "le/ads/googleads/v15/resources/batch_job" +
      ".proto\032:google/ads/googleads/v15/service" +
      "s/google_ads_service.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032#google/longrunnin" +
      "g/operations.proto\032\033google/protobuf/empt" +
      "y.proto\032\027google/rpc/status.proto\"\201\001\n\025Mut" +
      "ateBatchJobRequest\022\031\n\013customer_id\030\001 \001(\tB" +
      "\004\342A\001\002\022M\n\toperation\030\002 \001(\01324.google.ads.go" +
      "ogleads.v15.services.BatchJobOperationB\004" +
      "\342A\001\002\"\232\001\n\021BatchJobOperation\022>\n\006create\030\001 \001" +
      "(\0132,.google.ads.googleads.v15.resources." +
      "BatchJobH\000\0228\n\006remove\030\004 \001(\tB&\372A#\n!googlea" +
      "ds.googleapis.com/BatchJobH\000B\013\n\toperatio" +
      "n\"a\n\026MutateBatchJobResponse\022G\n\006result\030\001 " +
      "\001(\01327.google.ads.googleads.v15.services." +
      "MutateBatchJobResult\"U\n\024MutateBatchJobRe" +
      "sult\022=\n\rresource_name\030\001 \001(\tB&\372A#\n!google" +
      "ads.googleapis.com/BatchJob\"W\n\022RunBatchJ" +
      "obRequest\022A\n\rresource_name\030\001 \001(\tB*\342A\001\002\372A" +
      "#\n!googleads.googleapis.com/BatchJob\"\316\001\n" +
      "\034AddBatchJobOperationsRequest\022A\n\rresourc" +
      "e_name\030\001 \001(\tB*\342A\001\002\372A#\n!googleads.googlea" +
      "pis.com/BatchJob\022\026\n\016sequence_token\030\002 \001(\t" +
      "\022S\n\021mutate_operations\030\003 \003(\01322.google.ads" +
      ".googleads.v15.services.MutateOperationB" +
      "\004\342A\001\002\"V\n\035AddBatchJobOperationsResponse\022\030" +
      "\n\020total_operations\030\001 \001(\003\022\033\n\023next_sequenc" +
      "e_token\030\002 \001(\t\"\362\001\n\032ListBatchJobResultsReq" +
      "uest\022A\n\rresource_name\030\001 \001(\tB*\342A\001\002\372A#\n!go" +
      "ogleads.googleapis.com/BatchJob\022\022\n\npage_" +
      "token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022j\n\025respon" +
      "se_content_type\030\004 \001(\0162K.google.ads.googl" +
      "eads.v15.enums.ResponseContentTypeEnum.R" +
      "esponseContentType\"z\n\033ListBatchJobResult" +
      "sResponse\022B\n\007results\030\001 \003(\01321.google.ads." +
      "googleads.v15.services.BatchJobResult\022\027\n" +
      "\017next_page_token\030\002 \001(\t\"\254\001\n\016BatchJobResul" +
      "t\022\027\n\017operation_index\030\001 \001(\003\022]\n\031mutate_ope" +
      "ration_response\030\002 \001(\0132:.google.ads.googl" +
      "eads.v15.services.MutateOperationRespons" +
      "e\022\"\n\006status\030\003 \001(\0132\022.google.rpc.Status2\341\010" +
      "\n\017BatchJobService\022\331\001\n\016MutateBatchJob\0228.g" +
      "oogle.ads.googleads.v15.services.MutateB" +
      "atchJobRequest\0329.google.ads.googleads.v1" +
      "5.services.MutateBatchJobResponse\"R\332A\025cu" +
      "stomer_id,operation\202\323\344\223\0024\"//v15/customer" +
      "s/{customer_id=*}/batchJobs:mutate:\001*\022\346\001" +
      "\n\023ListBatchJobResults\022=.google.ads.googl" +
      "eads.v15.services.ListBatchJobResultsReq" +
      "uest\032>.google.ads.googleads.v15.services" +
      ".ListBatchJobResultsResponse\"P\332A\rresourc" +
      "e_name\202\323\344\223\002:\0228/v15/{resource_name=custom" +
      "ers/*/batchJobs/*}:listResults\022\211\002\n\013RunBa" +
      "tchJob\0225.google.ads.googleads.v15.servic" +
      "es.RunBatchJobRequest\032\035.google.longrunni" +
      "ng.Operation\"\243\001\312AU\n\025google.protobuf.Empt" +
      "y\022<google.ads.googleads.v15.resources.Ba" +
      "tchJob.BatchJobMetadata\332A\rresource_name\202" +
      "\323\344\223\0025\"0/v15/{resource_name=customers/*/b" +
      "atchJobs/*}:run:\001*\022\265\002\n\025AddBatchJobOperat" +
      "ions\022?.google.ads.googleads.v15.services" +
      ".AddBatchJobOperationsRequest\032@.google.a" +
      "ds.googleads.v15.services.AddBatchJobOpe" +
      "rationsResponse\"\230\001\332A.resource_name,seque" +
      "nce_token,mutate_operations\332A\037resource_n" +
      "ame,mutate_operations\202\323\344\223\002?\":/v15/{resou" +
      "rce_name=customers/*/batchJobs/*}:addOpe" +
      "rations:\001*\032E\312A\030googleads.googleapis.com\322" +
      "A\'https://www.googleapis.com/auth/adword" +
      "sB\200\002\n%com.google.ads.googleads.v15.servi" +
      "cesB\024BatchJobServiceProtoP\001ZIgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v15/services;services\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V15.Services\312\002!Google\\Ads\\Go" +
      "ogleAds\\V15\\Services\352\002%Google::Ads::Goog" +
      "leAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.BatchJobProto.getDescriptor(),
          com.google.ads.googleads.v15.services.GoogleAdsServiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateBatchJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v15_services_BatchJobOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_BatchJobOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_BatchJobOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateBatchJobResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateBatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateBatchJobResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v15_services_RunBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v15_services_RunBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_RunBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "SequenceToken", "MutateOperations", });
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_AddBatchJobOperationsResponse_descriptor,
        new java.lang.String[] { "TotalOperations", "NextSequenceToken", });
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_ListBatchJobResultsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v15_services_ListBatchJobResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_ListBatchJobResultsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", });
    internal_static_google_ads_googleads_v15_services_BatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v15_services_BatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_BatchJobResult_descriptor,
        new java.lang.String[] { "OperationIndex", "MutateOperationResponse", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.BatchJobProto.getDescriptor();
    com.google.ads.googleads.v15.services.GoogleAdsServiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
