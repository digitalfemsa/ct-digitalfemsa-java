/*
 * Femsa API
 * Femsa sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@femsa.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.digitalfemsa.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;


/**
 * Address of the fiscal entity
 */
@JsonPropertyOrder({
  FiscalEntityAddress.JSON_PROPERTY_STREET1,
  FiscalEntityAddress.JSON_PROPERTY_STREET2,
  FiscalEntityAddress.JSON_PROPERTY_POSTAL_CODE,
  FiscalEntityAddress.JSON_PROPERTY_CITY,
  FiscalEntityAddress.JSON_PROPERTY_STATE,
  FiscalEntityAddress.JSON_PROPERTY_COUNTRY,
  FiscalEntityAddress.JSON_PROPERTY_EXTERNAL_NUMBER
})
@JsonTypeName("fiscal_entity_address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class FiscalEntityAddress {
  public static final String JSON_PROPERTY_STREET1 = "street1";
  private String street1;

  public static final String JSON_PROPERTY_STREET2 = "street2";
  private String street2;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_EXTERNAL_NUMBER = "external_number";
  private String externalNumber;

  public FiscalEntityAddress() { 
  }

  public FiscalEntityAddress street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Street name and number
   * @return street1
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreet1() {
    return street1;
  }


  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreet1(String street1) {
    this.street1 = street1;
  }


  public FiscalEntityAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Street name and number
   * @return street2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet2() {
    return street2;
  }


  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public FiscalEntityAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public FiscalEntityAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCity(String city) {
    this.city = city;
  }


  public FiscalEntityAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public FiscalEntityAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
   * @return country
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(String country) {
    this.country = country;
  }


  public FiscalEntityAddress externalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
    return this;
  }

   /**
   * External number
   * @return externalNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalNumber() {
    return externalNumber;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }


  /**
   * Return true if this fiscal_entity_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalEntityAddress fiscalEntityAddress = (FiscalEntityAddress) o;
    return Objects.equals(this.street1, fiscalEntityAddress.street1) &&
        Objects.equals(this.street2, fiscalEntityAddress.street2) &&
        Objects.equals(this.postalCode, fiscalEntityAddress.postalCode) &&
        Objects.equals(this.city, fiscalEntityAddress.city) &&
        Objects.equals(this.state, fiscalEntityAddress.state) &&
        Objects.equals(this.country, fiscalEntityAddress.country) &&
        Objects.equals(this.externalNumber, fiscalEntityAddress.externalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, street2, postalCode, city, state, country, externalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalEntityAddress {\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

