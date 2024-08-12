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
import io.digitalfemsa.model.ChargeRequest;
import io.digitalfemsa.model.CheckoutRequest;
import io.digitalfemsa.model.CustomerShippingContacts;
import io.digitalfemsa.model.OrderDiscountLinesRequest;
import io.digitalfemsa.model.OrderTaxRequest;
import io.digitalfemsa.model.OrderUpdateFiscalEntityRequest;
import io.digitalfemsa.model.OrderUpdateRequestCustomerInfo;
import io.digitalfemsa.model.Product;
import io.digitalfemsa.model.ShippingRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.digitalfemsa.JSON;


/**
 * a order
 */
@JsonPropertyOrder({
  OrderUpdateRequest.JSON_PROPERTY_CHARGES,
  OrderUpdateRequest.JSON_PROPERTY_CHECKOUT,
  OrderUpdateRequest.JSON_PROPERTY_CURRENCY,
  OrderUpdateRequest.JSON_PROPERTY_CUSTOMER_INFO,
  OrderUpdateRequest.JSON_PROPERTY_DISCOUNT_LINES,
  OrderUpdateRequest.JSON_PROPERTY_FISCAL_ENTITY,
  OrderUpdateRequest.JSON_PROPERTY_LINE_ITEMS,
  OrderUpdateRequest.JSON_PROPERTY_METADATA,
  OrderUpdateRequest.JSON_PROPERTY_PRE_AUTHORIZE,
  OrderUpdateRequest.JSON_PROPERTY_SHIPPING_CONTACT,
  OrderUpdateRequest.JSON_PROPERTY_SHIPPING_LINES,
  OrderUpdateRequest.JSON_PROPERTY_TAX_LINES
})
@JsonTypeName("order_update_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrderUpdateRequest {
  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<ChargeRequest> charges = new ArrayList<>();

  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  private CheckoutRequest checkout;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_INFO = "customer_info";
  private OrderUpdateRequestCustomerInfo customerInfo;

  public static final String JSON_PROPERTY_DISCOUNT_LINES = "discount_lines";
  private List<OrderDiscountLinesRequest> discountLines = new ArrayList<>();

  public static final String JSON_PROPERTY_FISCAL_ENTITY = "fiscal_entity";
  private OrderUpdateFiscalEntityRequest fiscalEntity;

  public static final String JSON_PROPERTY_LINE_ITEMS = "line_items";
  private List<Product> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_PRE_AUTHORIZE = "pre_authorize";
  private Boolean preAuthorize = false;

  public static final String JSON_PROPERTY_SHIPPING_CONTACT = "shipping_contact";
  private CustomerShippingContacts shippingContact;

  public static final String JSON_PROPERTY_SHIPPING_LINES = "shipping_lines";
  private List<ShippingRequest> shippingLines = new ArrayList<>();

  public static final String JSON_PROPERTY_TAX_LINES = "tax_lines";
  private List<OrderTaxRequest> taxLines = new ArrayList<>();

  public OrderUpdateRequest() { 
  }

  public OrderUpdateRequest charges(List<ChargeRequest> charges) {
    this.charges = charges;
    return this;
  }

  public OrderUpdateRequest addChargesItem(ChargeRequest chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChargeRequest> getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(List<ChargeRequest> charges) {
    this.charges = charges;
  }


  public OrderUpdateRequest checkout(CheckoutRequest checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckoutRequest getCheckout() {
    return checkout;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(CheckoutRequest checkout) {
    this.checkout = checkout;
  }


  public OrderUpdateRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public OrderUpdateRequest customerInfo(OrderUpdateRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

   /**
   * Get customerInfo
   * @return customerInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderUpdateRequestCustomerInfo getCustomerInfo() {
    return customerInfo;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerInfo(OrderUpdateRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }


  public OrderUpdateRequest discountLines(List<OrderDiscountLinesRequest> discountLines) {
    this.discountLines = discountLines;
    return this;
  }

  public OrderUpdateRequest addDiscountLinesItem(OrderDiscountLinesRequest discountLinesItem) {
    if (this.discountLines == null) {
      this.discountLines = new ArrayList<>();
    }
    this.discountLines.add(discountLinesItem);
    return this;
  }

   /**
   * List of [discounts](https://developers.femsa.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount.
   * @return discountLines
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderDiscountLinesRequest> getDiscountLines() {
    return discountLines;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscountLines(List<OrderDiscountLinesRequest> discountLines) {
    this.discountLines = discountLines;
  }


  public OrderUpdateRequest fiscalEntity(OrderUpdateFiscalEntityRequest fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
    return this;
  }

   /**
   * Get fiscalEntity
   * @return fiscalEntity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderUpdateFiscalEntityRequest getFiscalEntity() {
    return fiscalEntity;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEntity(OrderUpdateFiscalEntityRequest fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
  }


  public OrderUpdateRequest lineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public OrderUpdateRequest addLineItemsItem(Product lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * List of [products](https://developers.femsa.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Product> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
  }


  public OrderUpdateRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderUpdateRequest putMetadataItem(String key, String metadataItem) {
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
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public OrderUpdateRequest preAuthorize(Boolean preAuthorize) {
    this.preAuthorize = preAuthorize;
    return this;
  }

   /**
   * Indicates whether the order charges must be preauthorized
   * @return preAuthorize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreAuthorize() {
    return preAuthorize;
  }


  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreAuthorize(Boolean preAuthorize) {
    this.preAuthorize = preAuthorize;
  }


  public OrderUpdateRequest shippingContact(CustomerShippingContacts shippingContact) {
    this.shippingContact = shippingContact;
    return this;
  }

   /**
   * Get shippingContact
   * @return shippingContact
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerShippingContacts getShippingContact() {
    return shippingContact;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingContact(CustomerShippingContacts shippingContact) {
    this.shippingContact = shippingContact;
  }


  public OrderUpdateRequest shippingLines(List<ShippingRequest> shippingLines) {
    this.shippingLines = shippingLines;
    return this;
  }

  public OrderUpdateRequest addShippingLinesItem(ShippingRequest shippingLinesItem) {
    if (this.shippingLines == null) {
      this.shippingLines = new ArrayList<>();
    }
    this.shippingLines.add(shippingLinesItem);
    return this;
  }

   /**
   * List of [shipping costs](https://developers.femsa.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products.
   * @return shippingLines
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ShippingRequest> getShippingLines() {
    return shippingLines;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingLines(List<ShippingRequest> shippingLines) {
    this.shippingLines = shippingLines;
  }


  public OrderUpdateRequest taxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
    return this;
  }

  public OrderUpdateRequest addTaxLinesItem(OrderTaxRequest taxLinesItem) {
    if (this.taxLines == null) {
      this.taxLines = new ArrayList<>();
    }
    this.taxLines.add(taxLinesItem);
    return this;
  }

   /**
   * Get taxLines
   * @return taxLines
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderTaxRequest> getTaxLines() {
    return taxLines;
  }


  @JsonProperty(JSON_PROPERTY_TAX_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
  }


  /**
   * Return true if this order_update_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderUpdateRequest orderUpdateRequest = (OrderUpdateRequest) o;
    return Objects.equals(this.charges, orderUpdateRequest.charges) &&
        Objects.equals(this.checkout, orderUpdateRequest.checkout) &&
        Objects.equals(this.currency, orderUpdateRequest.currency) &&
        Objects.equals(this.customerInfo, orderUpdateRequest.customerInfo) &&
        Objects.equals(this.discountLines, orderUpdateRequest.discountLines) &&
        Objects.equals(this.fiscalEntity, orderUpdateRequest.fiscalEntity) &&
        Objects.equals(this.lineItems, orderUpdateRequest.lineItems) &&
        Objects.equals(this.metadata, orderUpdateRequest.metadata) &&
        Objects.equals(this.preAuthorize, orderUpdateRequest.preAuthorize) &&
        Objects.equals(this.shippingContact, orderUpdateRequest.shippingContact) &&
        Objects.equals(this.shippingLines, orderUpdateRequest.shippingLines) &&
        Objects.equals(this.taxLines, orderUpdateRequest.taxLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, checkout, currency, customerInfo, discountLines, fiscalEntity, lineItems, metadata, preAuthorize, shippingContact, shippingLines, taxLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderUpdateRequest {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    discountLines: ").append(toIndentedString(discountLines)).append("\n");
    sb.append("    fiscalEntity: ").append(toIndentedString(fiscalEntity)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    preAuthorize: ").append(toIndentedString(preAuthorize)).append("\n");
    sb.append("    shippingContact: ").append(toIndentedString(shippingContact)).append("\n");
    sb.append("    shippingLines: ").append(toIndentedString(shippingLines)).append("\n");
    sb.append("    taxLines: ").append(toIndentedString(taxLines)).append("\n");
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

