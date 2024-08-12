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


package io.digitalfemsa.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.digitalfemsa.model.CustomerShippingContactsResponseAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.digitalfemsa.JSON;


/**
 * OrderResponseShippingContact
 */
@JsonPropertyOrder({
  OrderResponseShippingContact.JSON_PROPERTY_PHONE,
  OrderResponseShippingContact.JSON_PROPERTY_RECEIVER,
  OrderResponseShippingContact.JSON_PROPERTY_BETWEEN_STREETS,
  OrderResponseShippingContact.JSON_PROPERTY_ADDRESS,
  OrderResponseShippingContact.JSON_PROPERTY_PARENT_ID,
  OrderResponseShippingContact.JSON_PROPERTY_DEFAULT,
  OrderResponseShippingContact.JSON_PROPERTY_ID,
  OrderResponseShippingContact.JSON_PROPERTY_CREATED_AT,
  OrderResponseShippingContact.JSON_PROPERTY_METADATA,
  OrderResponseShippingContact.JSON_PROPERTY_OBJECT,
  OrderResponseShippingContact.JSON_PROPERTY_DELETED
})
@JsonTypeName("order_response_shipping_contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrderResponseShippingContact {
  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_RECEIVER = "receiver";
  private String receiver;

  public static final String JSON_PROPERTY_BETWEEN_STREETS = "between_streets";
  private String betweenStreets;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private CustomerShippingContactsResponseAddress address;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public OrderResponseShippingContact() { 
  }

  public OrderResponseShippingContact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
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


  public OrderResponseShippingContact receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
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


  public OrderResponseShippingContact betweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
    return this;
  }

   /**
   * Get betweenStreets
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


  public OrderResponseShippingContact address(CustomerShippingContactsResponseAddress address) {
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

  public CustomerShippingContactsResponseAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(CustomerShippingContactsResponseAddress address) {
    this.address = address;
  }


  public OrderResponseShippingContact parentId(String parentId) {
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


  public OrderResponseShippingContact _default(Boolean _default) {
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


  public OrderResponseShippingContact id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public OrderResponseShippingContact createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public OrderResponseShippingContact metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderResponseShippingContact putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata associated with the shipping contact
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public OrderResponseShippingContact _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public OrderResponseShippingContact deleted(Boolean deleted) {
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
   * Return true if this order_response_shipping_contact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseShippingContact orderResponseShippingContact = (OrderResponseShippingContact) o;
    return Objects.equals(this.phone, orderResponseShippingContact.phone) &&
        Objects.equals(this.receiver, orderResponseShippingContact.receiver) &&
        Objects.equals(this.betweenStreets, orderResponseShippingContact.betweenStreets) &&
        Objects.equals(this.address, orderResponseShippingContact.address) &&
        Objects.equals(this.parentId, orderResponseShippingContact.parentId) &&
        Objects.equals(this._default, orderResponseShippingContact._default) &&
        Objects.equals(this.id, orderResponseShippingContact.id) &&
        Objects.equals(this.createdAt, orderResponseShippingContact.createdAt) &&
        Objects.equals(this.metadata, orderResponseShippingContact.metadata) &&
        Objects.equals(this._object, orderResponseShippingContact._object) &&
        Objects.equals(this.deleted, orderResponseShippingContact.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, receiver, betweenStreets, address, parentId, _default, id, createdAt, metadata, _object, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseShippingContact {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    betweenStreets: ").append(toIndentedString(betweenStreets)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

