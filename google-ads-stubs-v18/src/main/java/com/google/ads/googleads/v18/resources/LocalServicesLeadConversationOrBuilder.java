// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/local_services_lead_conversation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface LocalServicesLeadConversationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.LocalServicesLeadConversation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the local services lead conversation
   * data. Local Services Lead Conversation resource name have the form
   *
   * `customers/{customer_id}/localServicesLeadConversation/{local_services_lead_conversation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the local services lead conversation
   * data. Local Services Lead Conversation resource name have the form
   *
   * `customers/{customer_id}/localServicesLeadConversation/{local_services_lead_conversation_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of this Lead Conversation.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Type of GLS lead conversation, EMAIL, MESSAGE, PHONE_CALL,
   * SMS, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesLeadConversationTypeEnum.ConversationType conversation_channel = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for conversationChannel.
   */
  int getConversationChannelValue();
  /**
   * <pre>
   * Output only. Type of GLS lead conversation, EMAIL, MESSAGE, PHONE_CALL,
   * SMS, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesLeadConversationTypeEnum.ConversationType conversation_channel = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The conversationChannel.
   */
  com.google.ads.googleads.v18.enums.LocalServicesLeadConversationTypeEnum.ConversationType getConversationChannel();

  /**
   * <pre>
   * Output only. Type of participant in the lead conversation, ADVERTISER or
   * CONSUMER.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesParticipantTypeEnum.ParticipantType participant_type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for participantType.
   */
  int getParticipantTypeValue();
  /**
   * <pre>
   * Output only. Type of participant in the lead conversation, ADVERTISER or
   * CONSUMER.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesParticipantTypeEnum.ParticipantType participant_type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The participantType.
   */
  com.google.ads.googleads.v18.enums.LocalServicesParticipantTypeEnum.ParticipantType getParticipantType();

  /**
   * <pre>
   * Output only. Resource name of Lead associated to the Lead Conversation.
   * </pre>
   *
   * <code>string lead = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The lead.
   */
  java.lang.String getLead();
  /**
   * <pre>
   * Output only. Resource name of Lead associated to the Lead Conversation.
   * </pre>
   *
   * <code>string lead = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for lead.
   */
  com.google.protobuf.ByteString
      getLeadBytes();

  /**
   * <pre>
   * Output only. The date time at which lead conversation was created by Local
   * Services Ads. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads
   * account's timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01
   * 14:34:30"
   * </pre>
   *
   * <code>string event_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The eventDateTime.
   */
  java.lang.String getEventDateTime();
  /**
   * <pre>
   * Output only. The date time at which lead conversation was created by Local
   * Services Ads. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads
   * account's timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01
   * 14:34:30"
   * </pre>
   *
   * <code>string event_date_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for eventDateTime.
   */
  com.google.protobuf.ByteString
      getEventDateTimeBytes();

  /**
   * <pre>
   * Output only. Details of phone call conversation in case of PHONE_CALL.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.PhoneCallDetails phone_call_details = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the phoneCallDetails field is set.
   */
  boolean hasPhoneCallDetails();
  /**
   * <pre>
   * Output only. Details of phone call conversation in case of PHONE_CALL.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.PhoneCallDetails phone_call_details = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The phoneCallDetails.
   */
  com.google.ads.googleads.v18.resources.PhoneCallDetails getPhoneCallDetails();
  /**
   * <pre>
   * Output only. Details of phone call conversation in case of PHONE_CALL.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.PhoneCallDetails phone_call_details = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.resources.PhoneCallDetailsOrBuilder getPhoneCallDetailsOrBuilder();

  /**
   * <pre>
   * Output only. Details of message conversation in case of EMAIL, MESSAGE or
   * SMS.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.MessageDetails message_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the messageDetails field is set.
   */
  boolean hasMessageDetails();
  /**
   * <pre>
   * Output only. Details of message conversation in case of EMAIL, MESSAGE or
   * SMS.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.MessageDetails message_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The messageDetails.
   */
  com.google.ads.googleads.v18.resources.MessageDetails getMessageDetails();
  /**
   * <pre>
   * Output only. Details of message conversation in case of EMAIL, MESSAGE or
   * SMS.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.resources.MessageDetails message_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.resources.MessageDetailsOrBuilder getMessageDetailsOrBuilder();
}
