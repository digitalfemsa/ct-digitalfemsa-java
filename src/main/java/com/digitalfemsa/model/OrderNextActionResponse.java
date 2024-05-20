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
import com.digitalfemsa.model.OrderNextActionResponseRedirectToUrl;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;


/**
 * contains the following attributes that will guide to continue the flow
 */
@JsonPropertyOrder({
  OrderNextActionResponse.JSON_PROPERTY_REDIRECT_TO_URL,
  OrderNextActionResponse.JSON_PROPERTY_TYPE
})
@JsonTypeName("order_next_action_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrderNextActionResponse {
  public static final String JSON_PROPERTY_REDIRECT_TO_URL = "redirect_to_url";
  private OrderNextActionResponseRedirectToUrl redirectToUrl;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public OrderNextActionResponse() { 
  }

  public OrderNextActionResponse redirectToUrl(OrderNextActionResponseRedirectToUrl redirectToUrl) {
    this.redirectToUrl = redirectToUrl;
    return this;
  }

   /**
   * Get redirectToUrl
   * @return redirectToUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderNextActionResponseRedirectToUrl getRedirectToUrl() {
    return redirectToUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_TO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectToUrl(OrderNextActionResponseRedirectToUrl redirectToUrl) {
    this.redirectToUrl = redirectToUrl;
  }


  public OrderNextActionResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of action to be taken
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this order_next_action_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderNextActionResponse orderNextActionResponse = (OrderNextActionResponse) o;
    return Objects.equals(this.redirectToUrl, orderNextActionResponse.redirectToUrl) &&
        Objects.equals(this.type, orderNextActionResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectToUrl, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderNextActionResponse {\n");
    sb.append("    redirectToUrl: ").append(toIndentedString(redirectToUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

