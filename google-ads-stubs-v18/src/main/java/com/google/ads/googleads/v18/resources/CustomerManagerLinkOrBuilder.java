// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer_manager_link.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface CustomerManagerLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.CustomerManagerLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerManagerLink resource names have the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the managerCustomer field is set.
   */
  boolean hasManagerCustomer();
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The managerCustomer.
   */
  java.lang.String getManagerCustomer();
  /**
   * <pre>
   * Output only. The manager customer linked to the customer.
   * </pre>
   *
   * <code>optional string manager_customer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for managerCustomer.
   */
  com.google.protobuf.ByteString
      getManagerCustomerBytes();

  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the managerLinkId field is set.
   */
  boolean hasManagerLinkId();
  /**
   * <pre>
   * Output only. ID of the customer-manager link. This field is read only.
   * </pre>
   *
   * <code>optional int64 manager_link_id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The managerLinkId.
   */
  long getManagerLinkId();

  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the link between the customer and the manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v18.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus();
}
