// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

package com.google.ads.googleads.v15.services;

public interface PlannableTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.PlannableTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   * @return A list containing the ageRanges.
   */
  java.util.List<com.google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange> getAgeRangesList();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   * @return The count of ageRanges.
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   * @param index The index of the element to return.
   * @return The ageRanges at the given index.
   */
  com.google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange getAgeRanges(int index);
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   * @return A list containing the enum numeric values on the wire for ageRanges.
   */
  java.util.List<java.lang.Integer>
  getAgeRangesValueList();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ageRanges at the given index.
   */
  int getAgeRangesValue(int index);

  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.GenderInfo genders = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.GenderInfo> 
      getGendersList();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.GenderInfo genders = 2;</code>
   */
  com.google.ads.googleads.v15.common.GenderInfo getGenders(int index);
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.GenderInfo genders = 2;</code>
   */
  int getGendersCount();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.GenderInfo genders = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.GenderInfoOrBuilder> 
      getGendersOrBuilderList();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.GenderInfo genders = 2;</code>
   */
  com.google.ads.googleads.v15.common.GenderInfoOrBuilder getGendersOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable devices for the ad product.
   * TABLET device targeting is automatically applied to reported metrics
   * when MOBILE targeting is selected for CPM_MASTHEAD,
   * GOOGLE_PREFERRED_BUMPER, and GOOGLE_PREFERRED_SHORT products.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.DeviceInfo devices = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.DeviceInfo> 
      getDevicesList();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * TABLET device targeting is automatically applied to reported metrics
   * when MOBILE targeting is selected for CPM_MASTHEAD,
   * GOOGLE_PREFERRED_BUMPER, and GOOGLE_PREFERRED_SHORT products.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.DeviceInfo devices = 3;</code>
   */
  com.google.ads.googleads.v15.common.DeviceInfo getDevices(int index);
  /**
   * <pre>
   * Targetable devices for the ad product.
   * TABLET device targeting is automatically applied to reported metrics
   * when MOBILE targeting is selected for CPM_MASTHEAD,
   * GOOGLE_PREFERRED_BUMPER, and GOOGLE_PREFERRED_SHORT products.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.DeviceInfo devices = 3;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * TABLET device targeting is automatically applied to reported metrics
   * when MOBILE targeting is selected for CPM_MASTHEAD,
   * GOOGLE_PREFERRED_BUMPER, and GOOGLE_PREFERRED_SHORT products.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.DeviceInfo devices = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.DeviceInfoOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * TABLET device targeting is automatically applied to reported metrics
   * when MOBILE targeting is selected for CPM_MASTHEAD,
   * GOOGLE_PREFERRED_BUMPER, and GOOGLE_PREFERRED_SHORT products.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.DeviceInfo devices = 3;</code>
   */
  com.google.ads.googleads.v15.common.DeviceInfoOrBuilder getDevicesOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable networks for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork networks = 4;</code>
   * @return A list containing the networks.
   */
  java.util.List<com.google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork> getNetworksList();
  /**
   * <pre>
   * Targetable networks for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork networks = 4;</code>
   * @return The count of networks.
   */
  int getNetworksCount();
  /**
   * <pre>
   * Targetable networks for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork networks = 4;</code>
   * @param index The index of the element to return.
   * @return The networks at the given index.
   */
  com.google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork getNetworks(int index);
  /**
   * <pre>
   * Targetable networks for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork networks = 4;</code>
   * @return A list containing the enum numeric values on the wire for networks.
   */
  java.util.List<java.lang.Integer>
  getNetworksValueList();
  /**
   * <pre>
   * Targetable networks for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.ReachPlanNetworkEnum.ReachPlanNetwork networks = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of networks at the given index.
   */
  int getNetworksValue(int index);

  /**
   * <pre>
   * Targetable YouTube Select Lineups for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.YouTubeSelectLineUp youtube_select_lineups = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.YouTubeSelectLineUp> 
      getYoutubeSelectLineupsList();
  /**
   * <pre>
   * Targetable YouTube Select Lineups for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.YouTubeSelectLineUp youtube_select_lineups = 5;</code>
   */
  com.google.ads.googleads.v15.services.YouTubeSelectLineUp getYoutubeSelectLineups(int index);
  /**
   * <pre>
   * Targetable YouTube Select Lineups for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.YouTubeSelectLineUp youtube_select_lineups = 5;</code>
   */
  int getYoutubeSelectLineupsCount();
  /**
   * <pre>
   * Targetable YouTube Select Lineups for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.YouTubeSelectLineUp youtube_select_lineups = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.YouTubeSelectLineUpOrBuilder> 
      getYoutubeSelectLineupsOrBuilderList();
  /**
   * <pre>
   * Targetable YouTube Select Lineups for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.YouTubeSelectLineUp youtube_select_lineups = 5;</code>
   */
  com.google.ads.googleads.v15.services.YouTubeSelectLineUpOrBuilder getYoutubeSelectLineupsOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable surface combinations for the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargetingCombinations surface_targeting = 6;</code>
   * @return Whether the surfaceTargeting field is set.
   */
  boolean hasSurfaceTargeting();
  /**
   * <pre>
   * Targetable surface combinations for the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargetingCombinations surface_targeting = 6;</code>
   * @return The surfaceTargeting.
   */
  com.google.ads.googleads.v15.services.SurfaceTargetingCombinations getSurfaceTargeting();
  /**
   * <pre>
   * Targetable surface combinations for the ad product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SurfaceTargetingCombinations surface_targeting = 6;</code>
   */
  com.google.ads.googleads.v15.services.SurfaceTargetingCombinationsOrBuilder getSurfaceTargetingOrBuilder();
}
