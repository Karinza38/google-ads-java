// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/local_services_lead_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface ConversationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.Conversation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the local services lead that the
   * conversation should be applied to.
   * </pre>
   *
   * <code>string local_services_lead = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The localServicesLead.
   */
  java.lang.String getLocalServicesLead();
  /**
   * <pre>
   * Required. The resource name of the local services lead that the
   * conversation should be applied to.
   * </pre>
   *
   * <code>string local_services_lead = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for localServicesLead.
   */
  com.google.protobuf.ByteString
      getLocalServicesLeadBytes();

  /**
   * <pre>
   * Required. Text message that user wanted to append to lead.
   * </pre>
   *
   * <code>string text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Required. Text message that user wanted to append to lead.
   * </pre>
   *
   * <code>string text = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
