// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/criteria.proto

package com.google.ads.googleads.v15.common;

public interface ProximityInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.ProximityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GeoPointInfo geo_point = 1;</code>
   * @return Whether the geoPoint field is set.
   */
  boolean hasGeoPoint();
  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GeoPointInfo geo_point = 1;</code>
   * @return The geoPoint.
   */
  com.google.ads.googleads.v15.common.GeoPointInfo getGeoPoint();
  /**
   * <pre>
   * Latitude and longitude.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GeoPointInfo geo_point = 1;</code>
   */
  com.google.ads.googleads.v15.common.GeoPointInfoOrBuilder getGeoPointOrBuilder();

  /**
   * <pre>
   * The radius of the proximity.
   * </pre>
   *
   * <code>optional double radius = 5;</code>
   * @return Whether the radius field is set.
   */
  boolean hasRadius();
  /**
   * <pre>
   * The radius of the proximity.
   * </pre>
   *
   * <code>optional double radius = 5;</code>
   * @return The radius.
   */
  double getRadius();

  /**
   * <pre>
   * The unit of measurement of the radius. Default is KILOMETERS.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
   * @return The enum numeric value on the wire for radiusUnits.
   */
  int getRadiusUnitsValue();
  /**
   * <pre>
   * The unit of measurement of the radius. Default is KILOMETERS.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits radius_units = 3;</code>
   * @return The radiusUnits.
   */
  com.google.ads.googleads.v15.enums.ProximityRadiusUnitsEnum.ProximityRadiusUnits getRadiusUnits();

  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AddressInfo address = 4;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AddressInfo address = 4;</code>
   * @return The address.
   */
  com.google.ads.googleads.v15.common.AddressInfo getAddress();
  /**
   * <pre>
   * Full address.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AddressInfo address = 4;</code>
   */
  com.google.ads.googleads.v15.common.AddressInfoOrBuilder getAddressOrBuilder();
}
