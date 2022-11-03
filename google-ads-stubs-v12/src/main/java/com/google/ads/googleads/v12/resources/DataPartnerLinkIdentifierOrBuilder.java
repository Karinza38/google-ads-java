// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/account_link.proto

package com.google.ads.googleads.v12.resources;

public interface DataPartnerLinkIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.DataPartnerLinkIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The customer ID of the Data partner account.
   * This field is required and should not be empty when creating a new
   * data partner link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 data_partner_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the dataPartnerId field is set.
   */
  boolean hasDataPartnerId();
  /**
   * <pre>
   * Immutable. The customer ID of the Data partner account.
   * This field is required and should not be empty when creating a new
   * data partner link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 data_partner_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The dataPartnerId.
   */
  long getDataPartnerId();
}
