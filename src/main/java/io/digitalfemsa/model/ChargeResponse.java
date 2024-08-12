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
import io.digitalfemsa.model.ChargeResponseChannel;
import io.digitalfemsa.model.ChargeResponsePaymentMethod;
import io.digitalfemsa.model.ChargeResponseRefunds;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.digitalfemsa.JSON;


/**
 * ChargeResponse
 */
@JsonPropertyOrder({
  ChargeResponse.JSON_PROPERTY_AMOUNT,
  ChargeResponse.JSON_PROPERTY_CHANNEL,
  ChargeResponse.JSON_PROPERTY_CREATED_AT,
  ChargeResponse.JSON_PROPERTY_CURRENCY,
  ChargeResponse.JSON_PROPERTY_CUSTOMER_ID,
  ChargeResponse.JSON_PROPERTY_DESCRIPTION,
  ChargeResponse.JSON_PROPERTY_DEVICE_FINGERPRINT,
  ChargeResponse.JSON_PROPERTY_FAILURE_CODE,
  ChargeResponse.JSON_PROPERTY_FAILURE_MESSAGE,
  ChargeResponse.JSON_PROPERTY_ID,
  ChargeResponse.JSON_PROPERTY_LIVEMODE,
  ChargeResponse.JSON_PROPERTY_OBJECT,
  ChargeResponse.JSON_PROPERTY_ORDER_ID,
  ChargeResponse.JSON_PROPERTY_PAID_AT,
  ChargeResponse.JSON_PROPERTY_PAYMENT_METHOD,
  ChargeResponse.JSON_PROPERTY_REFERENCE_ID,
  ChargeResponse.JSON_PROPERTY_REFUNDS,
  ChargeResponse.JSON_PROPERTY_STATUS
})
@JsonTypeName("charge_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ChargeResponse {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private ChargeResponseChannel channel;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINT = "device_fingerprint";
  private String deviceFingerprint;

  public static final String JSON_PROPERTY_FAILURE_CODE = "failure_code";
  private String failureCode;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failure_message";
  private String failureMessage;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_ORDER_ID = "order_id";
  private String orderId;

  public static final String JSON_PROPERTY_PAID_AT = "paid_at";
  private Integer paidAt;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private ChargeResponsePaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  private String referenceId;

  public static final String JSON_PROPERTY_REFUNDS = "refunds";
  private ChargeResponseRefunds refunds;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ChargeResponse() { 
  }

  public ChargeResponse amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ChargeResponse channel(ChargeResponseChannel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseChannel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(ChargeResponseChannel channel) {
    this.channel = channel;
  }


  public ChargeResponse createdAt(Long createdAt) {
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


  public ChargeResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
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


  public ChargeResponse customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ChargeResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ChargeResponse deviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
    return this;
  }

   /**
   * Get deviceFingerprint
   * @return deviceFingerprint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }


  public ChargeResponse failureCode(String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureCode() {
    return failureCode;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public ChargeResponse failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public ChargeResponse id(String id) {
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


  public ChargeResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Get livemode
   * @return livemode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public ChargeResponse _object(String _object) {
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


  public ChargeResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public ChargeResponse paidAt(Integer paidAt) {
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Get paidAt
   * @return paidAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaidAt() {
    return paidAt;
  }


  @JsonProperty(JSON_PROPERTY_PAID_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidAt(Integer paidAt) {
    this.paidAt = paidAt;
  }


  public ChargeResponse paymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChargeResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference ID of the charge
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceId() {
    return referenceId;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public ChargeResponse refunds(ChargeResponseRefunds refunds) {
    this.refunds = refunds;
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeResponseRefunds getRefunds() {
    return refunds;
  }


  @JsonProperty(JSON_PROPERTY_REFUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefunds(ChargeResponseRefunds refunds) {
    this.refunds = refunds;
  }


  public ChargeResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this charge_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeResponse chargeResponse = (ChargeResponse) o;
    return Objects.equals(this.amount, chargeResponse.amount) &&
        Objects.equals(this.channel, chargeResponse.channel) &&
        Objects.equals(this.createdAt, chargeResponse.createdAt) &&
        Objects.equals(this.currency, chargeResponse.currency) &&
        Objects.equals(this.customerId, chargeResponse.customerId) &&
        Objects.equals(this.description, chargeResponse.description) &&
        Objects.equals(this.deviceFingerprint, chargeResponse.deviceFingerprint) &&
        Objects.equals(this.failureCode, chargeResponse.failureCode) &&
        Objects.equals(this.failureMessage, chargeResponse.failureMessage) &&
        Objects.equals(this.id, chargeResponse.id) &&
        Objects.equals(this.livemode, chargeResponse.livemode) &&
        Objects.equals(this._object, chargeResponse._object) &&
        Objects.equals(this.orderId, chargeResponse.orderId) &&
        Objects.equals(this.paidAt, chargeResponse.paidAt) &&
        Objects.equals(this.paymentMethod, chargeResponse.paymentMethod) &&
        Objects.equals(this.referenceId, chargeResponse.referenceId) &&
        Objects.equals(this.refunds, chargeResponse.refunds) &&
        Objects.equals(this.status, chargeResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, channel, createdAt, currency, customerId, description, deviceFingerprint, failureCode, failureMessage, id, livemode, _object, orderId, paidAt, paymentMethod, referenceId, refunds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceFingerprint: ").append(toIndentedString(deviceFingerprint)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

