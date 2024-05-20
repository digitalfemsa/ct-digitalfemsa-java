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
import com.digitalfemsa.model.CustomerFiscalEntitiesRequest;
import com.digitalfemsa.model.CustomerPaymentMethodsRequest;
import com.digitalfemsa.model.CustomerShippingContacts;
import com.digitalfemsa.model.UpdateCustomerAntifraudInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;


/**
 * update customer
 */
@JsonPropertyOrder({
  UpdateCustomer.JSON_PROPERTY_ANTIFRAUD_INFO,
  UpdateCustomer.JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID,
  UpdateCustomer.JSON_PROPERTY_EMAIL,
  UpdateCustomer.JSON_PROPERTY_NAME,
  UpdateCustomer.JSON_PROPERTY_PHONE,
  UpdateCustomer.JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID,
  UpdateCustomer.JSON_PROPERTY_CORPORATE,
  UpdateCustomer.JSON_PROPERTY_CUSTOM_REFERENCE,
  UpdateCustomer.JSON_PROPERTY_FISCAL_ENTITIES,
  UpdateCustomer.JSON_PROPERTY_METADATA,
  UpdateCustomer.JSON_PROPERTY_PAYMENT_SOURCES,
  UpdateCustomer.JSON_PROPERTY_SHIPPING_CONTACTS
})
@JsonTypeName("update_customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UpdateCustomer {
  public static final String JSON_PROPERTY_ANTIFRAUD_INFO = "antifraud_info";
  private UpdateCustomerAntifraudInfo antifraudInfo;

  public static final String JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID = "default_payment_source_id";
  private String defaultPaymentSourceId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID = "default_shipping_contact_id";
  private String defaultShippingContactId;

  public static final String JSON_PROPERTY_CORPORATE = "corporate";
  private Boolean corporate = false;

  public static final String JSON_PROPERTY_CUSTOM_REFERENCE = "custom_reference";
  private String customReference;

  public static final String JSON_PROPERTY_FISCAL_ENTITIES = "fiscal_entities";
  private List<CustomerFiscalEntitiesRequest> fiscalEntities = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_SOURCES = "payment_sources";
  private List<CustomerPaymentMethodsRequest> paymentSources = new ArrayList<>();

  public static final String JSON_PROPERTY_SHIPPING_CONTACTS = "shipping_contacts";
  private List<CustomerShippingContacts> shippingContacts = new ArrayList<>();

  public UpdateCustomer() { 
  }

  public UpdateCustomer antifraudInfo(UpdateCustomerAntifraudInfo antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
    return this;
  }

   /**
   * Get antifraudInfo
   * @return antifraudInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateCustomerAntifraudInfo getAntifraudInfo() {
    return antifraudInfo;
  }


  @JsonProperty(JSON_PROPERTY_ANTIFRAUD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntifraudInfo(UpdateCustomerAntifraudInfo antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }


  public UpdateCustomer defaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
    return this;
  }

   /**
   * It is a parameter that allows to identify in the response, the Femsa ID of a payment method (payment_id)
   * @return defaultPaymentSourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultPaymentSourceId() {
    return defaultPaymentSourceId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
  }


  public UpdateCustomer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc).
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateCustomer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Client&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateCustomer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Is the customer&#39;s phone number
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


  public UpdateCustomer defaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
    return this;
  }

   /**
   * It is a parameter that allows to identify in the response, the Femsa ID of the shipping address (shipping_contact)
   * @return defaultShippingContactId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultShippingContactId() {
    return defaultShippingContactId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_SHIPPING_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
  }


  public UpdateCustomer corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * It is a value that allows identifying if the email is corporate or not.
   * @return corporate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCorporate() {
    return corporate;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }


  public UpdateCustomer customReference(String customReference) {
    this.customReference = customReference;
    return this;
  }

   /**
   * It is an undefined value.
   * @return customReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomReference() {
    return customReference;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomReference(String customReference) {
    this.customReference = customReference;
  }


  public UpdateCustomer fiscalEntities(List<CustomerFiscalEntitiesRequest> fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
    return this;
  }

  public UpdateCustomer addFiscalEntitiesItem(CustomerFiscalEntitiesRequest fiscalEntitiesItem) {
    if (this.fiscalEntities == null) {
      this.fiscalEntities = new ArrayList<>();
    }
    this.fiscalEntities.add(fiscalEntitiesItem);
    return this;
  }

   /**
   * Get fiscalEntities
   * @return fiscalEntities
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerFiscalEntitiesRequest> getFiscalEntities() {
    return fiscalEntities;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEntities(List<CustomerFiscalEntitiesRequest> fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
  }


  public UpdateCustomer metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateCustomer putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
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


  public UpdateCustomer paymentSources(List<CustomerPaymentMethodsRequest> paymentSources) {
    this.paymentSources = paymentSources;
    return this;
  }

  public UpdateCustomer addPaymentSourcesItem(CustomerPaymentMethodsRequest paymentSourcesItem) {
    if (this.paymentSources == null) {
      this.paymentSources = new ArrayList<>();
    }
    this.paymentSources.add(paymentSourcesItem);
    return this;
  }

   /**
   * Contains details of the payment methods that the customer has active or has used in Femsa
   * @return paymentSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerPaymentMethodsRequest> getPaymentSources() {
    return paymentSources;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSources(List<CustomerPaymentMethodsRequest> paymentSources) {
    this.paymentSources = paymentSources;
  }


  public UpdateCustomer shippingContacts(List<CustomerShippingContacts> shippingContacts) {
    this.shippingContacts = shippingContacts;
    return this;
  }

  public UpdateCustomer addShippingContactsItem(CustomerShippingContacts shippingContactsItem) {
    if (this.shippingContacts == null) {
      this.shippingContacts = new ArrayList<>();
    }
    this.shippingContacts.add(shippingContactsItem);
    return this;
  }

   /**
   * Contains the detail of the shipping addresses that the client has active or has used in Femsa
   * @return shippingContacts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomerShippingContacts> getShippingContacts() {
    return shippingContacts;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContacts(List<CustomerShippingContacts> shippingContacts) {
    this.shippingContacts = shippingContacts;
  }


  /**
   * Return true if this update_customer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomer updateCustomer = (UpdateCustomer) o;
    return Objects.equals(this.antifraudInfo, updateCustomer.antifraudInfo) &&
        Objects.equals(this.defaultPaymentSourceId, updateCustomer.defaultPaymentSourceId) &&
        Objects.equals(this.email, updateCustomer.email) &&
        Objects.equals(this.name, updateCustomer.name) &&
        Objects.equals(this.phone, updateCustomer.phone) &&
        Objects.equals(this.defaultShippingContactId, updateCustomer.defaultShippingContactId) &&
        Objects.equals(this.corporate, updateCustomer.corporate) &&
        Objects.equals(this.customReference, updateCustomer.customReference) &&
        Objects.equals(this.fiscalEntities, updateCustomer.fiscalEntities) &&
        Objects.equals(this.metadata, updateCustomer.metadata) &&
        Objects.equals(this.paymentSources, updateCustomer.paymentSources) &&
        Objects.equals(this.shippingContacts, updateCustomer.shippingContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudInfo, defaultPaymentSourceId, email, name, phone, defaultShippingContactId, corporate, customReference, fiscalEntities, metadata, paymentSources, shippingContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomer {\n");
    sb.append("    antifraudInfo: ").append(toIndentedString(antifraudInfo)).append("\n");
    sb.append("    defaultPaymentSourceId: ").append(toIndentedString(defaultPaymentSourceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    defaultShippingContactId: ").append(toIndentedString(defaultShippingContactId)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    customReference: ").append(toIndentedString(customReference)).append("\n");
    sb.append("    fiscalEntities: ").append(toIndentedString(fiscalEntities)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    paymentSources: ").append(toIndentedString(paymentSources)).append("\n");
    sb.append("    shippingContacts: ").append(toIndentedString(shippingContacts)).append("\n");
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

