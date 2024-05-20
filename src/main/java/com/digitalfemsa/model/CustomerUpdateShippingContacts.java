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
import com.digitalfemsa.model.CustomerShippingContactsAddress;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;


/**
 * [Shipping](https://developers.femsa.com/v2.1.0/reference/createcustomershippingcontacts) details, required in case of sending a shipping. If we do not receive a shipping_contact on the order, the default shipping_contact of the customer will be used.
 */
@JsonPropertyOrder({
  CustomerUpdateShippingContacts.JSON_PROPERTY_PHONE,
  CustomerUpdateShippingContacts.JSON_PROPERTY_RECEIVER,
  CustomerUpdateShippingContacts.JSON_PROPERTY_BETWEEN_STREETS,
  CustomerUpdateShippingContacts.JSON_PROPERTY_ADDRESS,
  CustomerUpdateShippingContacts.JSON_PROPERTY_PARENT_ID,
  CustomerUpdateShippingContacts.JSON_PROPERTY_DEFAULT,
  CustomerUpdateShippingContacts.JSON_PROPERTY_DELETED
})
@JsonTypeName("customer_update_shipping_contacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CustomerUpdateShippingContacts {
  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_RECEIVER = "receiver";
  private String receiver;

  public static final String JSON_PROPERTY_BETWEEN_STREETS = "between_streets";
  private String betweenStreets;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private CustomerShippingContactsAddress address;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public CustomerUpdateShippingContacts() { 
  }

  public CustomerUpdateShippingContacts phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone contact
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerUpdateShippingContacts receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Name of the person who will receive the order
   * @return receiver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiver() {
    return receiver;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public CustomerUpdateShippingContacts betweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
    return this;
  }

   /**
   * The street names between which the order will be delivered.
   * @return betweenStreets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETWEEN_STREETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBetweenStreets() {
    return betweenStreets;
  }


  @JsonProperty(JSON_PROPERTY_BETWEEN_STREETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
  }


  public CustomerUpdateShippingContacts address(CustomerShippingContactsAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerShippingContactsAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(CustomerShippingContactsAddress address) {
    this.address = address;
  }


  public CustomerUpdateShippingContacts parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public CustomerUpdateShippingContacts _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public CustomerUpdateShippingContacts deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  /**
   * Return true if this customer_update_shipping_contacts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateShippingContacts customerUpdateShippingContacts = (CustomerUpdateShippingContacts) o;
    return Objects.equals(this.phone, customerUpdateShippingContacts.phone) &&
        Objects.equals(this.receiver, customerUpdateShippingContacts.receiver) &&
        Objects.equals(this.betweenStreets, customerUpdateShippingContacts.betweenStreets) &&
        Objects.equals(this.address, customerUpdateShippingContacts.address) &&
        Objects.equals(this.parentId, customerUpdateShippingContacts.parentId) &&
        Objects.equals(this._default, customerUpdateShippingContacts._default) &&
        Objects.equals(this.deleted, customerUpdateShippingContacts.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, receiver, betweenStreets, address, parentId, _default, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateShippingContacts {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    betweenStreets: ").append(toIndentedString(betweenStreets)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

