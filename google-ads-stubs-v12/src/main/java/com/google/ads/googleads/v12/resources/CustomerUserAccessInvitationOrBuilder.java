// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/customer_user_access_invitation.proto

package com.google.ads.googleads.v12.resources;

public interface CustomerUserAccessInvitationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CustomerUserAccessInvitation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * Resource names have the form:
   * `customers/{customer_id}/customerUserAccessInvitations/{invitation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Resource names have the form:
   * `customers/{customer_id}/customerUserAccessInvitations/{invitation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the invitation.
   * This field is read-only.
   * </pre>
   *
   * <code>int64 invitation_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The invitationId.
   */
  long getInvitationId();

  /**
   * <pre>
   * Immutable. Access role of the user.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AccessRoleEnum.AccessRole access_role = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for accessRole.
   */
  int getAccessRoleValue();
  /**
   * <pre>
   * Immutable. Access role of the user.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AccessRoleEnum.AccessRole access_role = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The accessRole.
   */
  com.google.ads.googleads.v12.enums.AccessRoleEnum.AccessRole getAccessRole();

  /**
   * <pre>
   * Immutable. Email address the invitation was sent to.
   * This can differ from the email address of the account
   * that accepts the invite.
   * </pre>
   *
   * <code>string email_address = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The emailAddress.
   */
  java.lang.String getEmailAddress();
  /**
   * <pre>
   * Immutable. Email address the invitation was sent to.
   * This can differ from the email address of the account
   * that accepts the invite.
   * </pre>
   *
   * <code>string email_address = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for emailAddress.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();

  /**
   * <pre>
   * Output only. Time invitation was created.
   * This field is read-only.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationDateTime.
   */
  java.lang.String getCreationDateTime();
  /**
   * <pre>
   * Output only. Time invitation was created.
   * This field is read-only.
   * The format is "YYYY-MM-DD HH:MM:SS".
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for creationDateTime.
   */
  com.google.protobuf.ByteString
      getCreationDateTimeBytes();

  /**
   * <pre>
   * Output only. Invitation status of the user.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AccessInvitationStatusEnum.AccessInvitationStatus invitation_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for invitationStatus.
   */
  int getInvitationStatusValue();
  /**
   * <pre>
   * Output only. Invitation status of the user.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.AccessInvitationStatusEnum.AccessInvitationStatus invitation_status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The invitationStatus.
   */
  com.google.ads.googleads.v12.enums.AccessInvitationStatusEnum.AccessInvitationStatus getInvitationStatus();
}
