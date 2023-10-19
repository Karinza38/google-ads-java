// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/consent.proto

package com.google.ads.googleads.v15.common;

public interface ConsentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.Consent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This represents consent for ad user data.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus ad_user_data = 1;</code>
   * @return The enum numeric value on the wire for adUserData.
   */
  int getAdUserDataValue();
  /**
   * <pre>
   * This represents consent for ad user data.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus ad_user_data = 1;</code>
   * @return The adUserData.
   */
  com.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus getAdUserData();

  /**
   * <pre>
   * This represents consent for ad personalization.
   * This can only be set for OfflineUserDataJobService and UserDataService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus ad_personalization = 2;</code>
   * @return The enum numeric value on the wire for adPersonalization.
   */
  int getAdPersonalizationValue();
  /**
   * <pre>
   * This represents consent for ad personalization.
   * This can only be set for OfflineUserDataJobService and UserDataService.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus ad_personalization = 2;</code>
   * @return The adPersonalization.
   */
  com.google.ads.googleads.v15.enums.ConsentStatusEnum.ConsentStatus getAdPersonalization();
}
