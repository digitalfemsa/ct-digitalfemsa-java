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
import io.digitalfemsa.model.DiscountLinesDataResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.digitalfemsa.JSON;


/**
 * OrderResponseDiscountLines
 */
@JsonPropertyOrder({
  OrderResponseDiscountLines.JSON_PROPERTY_HAS_MORE,
  OrderResponseDiscountLines.JSON_PROPERTY_OBJECT,
  OrderResponseDiscountLines.JSON_PROPERTY_DATA
})
@JsonTypeName("order_response_discount_lines")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrderResponseDiscountLines {
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<DiscountLinesDataResponse> data = new ArrayList<>();

  public OrderResponseDiscountLines() { 
  }

  public OrderResponseDiscountLines hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Indicates if there are more pages to be requested
   * @return hasMore
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public OrderResponseDiscountLines _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Object type, in this case is list
   * @return _object
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public OrderResponseDiscountLines data(List<DiscountLinesDataResponse> data) {
    this.data = data;
    return this;
  }

  public OrderResponseDiscountLines addDataItem(DiscountLinesDataResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DiscountLinesDataResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<DiscountLinesDataResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this order_response_discount_lines object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseDiscountLines orderResponseDiscountLines = (OrderResponseDiscountLines) o;
    return Objects.equals(this.hasMore, orderResponseDiscountLines.hasMore) &&
        Objects.equals(this._object, orderResponseDiscountLines._object) &&
        Objects.equals(this.data, orderResponseDiscountLines.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, _object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseDiscountLines {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

