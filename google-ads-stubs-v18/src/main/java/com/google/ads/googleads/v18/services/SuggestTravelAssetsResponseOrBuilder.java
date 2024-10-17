// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface SuggestTravelAssetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.SuggestTravelAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.HotelAssetSuggestion> 
      getHotelAssetSuggestionsList();
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  com.google.ads.googleads.v18.services.HotelAssetSuggestion getHotelAssetSuggestions(int index);
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  int getHotelAssetSuggestionsCount();
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.HotelAssetSuggestionOrBuilder> 
      getHotelAssetSuggestionsOrBuilderList();
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  com.google.ads.googleads.v18.services.HotelAssetSuggestionOrBuilder getHotelAssetSuggestionsOrBuilder(
      int index);
}
