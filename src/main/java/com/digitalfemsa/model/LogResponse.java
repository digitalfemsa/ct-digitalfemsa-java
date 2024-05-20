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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;


/**
 * log model
 */
@JsonPropertyOrder({
  LogResponse.JSON_PROPERTY_CREATED_AT,
  LogResponse.JSON_PROPERTY_ID,
  LogResponse.JSON_PROPERTY_IP_ADDRESS,
  LogResponse.JSON_PROPERTY_LIVEMODE,
  LogResponse.JSON_PROPERTY_LOGGABLE_ID,
  LogResponse.JSON_PROPERTY_LOGGABLE_TYPE,
  LogResponse.JSON_PROPERTY_METHOD,
  LogResponse.JSON_PROPERTY_OAUTH_TOKEN_ID,
  LogResponse.JSON_PROPERTY_QUERY_STRING,
  LogResponse.JSON_PROPERTY_RELATED,
  LogResponse.JSON_PROPERTY_REQUEST_BODY,
  LogResponse.JSON_PROPERTY_REQUEST_HEADERS,
  LogResponse.JSON_PROPERTY_RESPONSE_BODY,
  LogResponse.JSON_PROPERTY_RESPONSE_HEADERS,
  LogResponse.JSON_PROPERTY_SEARCHABLE_TAGS,
  LogResponse.JSON_PROPERTY_STATUS,
  LogResponse.JSON_PROPERTY_UPDATED_AT,
  LogResponse.JSON_PROPERTY_URL,
  LogResponse.JSON_PROPERTY_USER_ACCOUNT_ID,
  LogResponse.JSON_PROPERTY_VERSION
})
@JsonTypeName("log_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class LogResponse {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_LIVEMODE = "livemode";
  private Boolean livemode;

  public static final String JSON_PROPERTY_LOGGABLE_ID = "loggable_id";
  private String loggableId;

  public static final String JSON_PROPERTY_LOGGABLE_TYPE = "loggable_type";
  private String loggableType;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_OAUTH_TOKEN_ID = "oauth_token_id";
  private String oauthTokenId;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private Map<String, Object> queryString = new HashMap<>();

  public static final String JSON_PROPERTY_RELATED = "related";
  private String related;

  public static final String JSON_PROPERTY_REQUEST_BODY = "request_body";
  private Object requestBody;

  public static final String JSON_PROPERTY_REQUEST_HEADERS = "request_headers";
  private Map<String, String> requestHeaders = new HashMap<>();

  public static final String JSON_PROPERTY_RESPONSE_BODY = "response_body";
  private Object responseBody;

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "response_headers";
  private Map<String, String> responseHeaders = new HashMap<>();

  public static final String JSON_PROPERTY_SEARCHABLE_TAGS = "searchable_tags";
  private List<String> searchableTags = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USER_ACCOUNT_ID = "user_account_id";
  private String userAccountId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public LogResponse() { 
  }

  public LogResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public LogResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public LogResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public LogResponse livemode(Boolean livemode) {
    this.livemode = livemode;
    return this;
  }

   /**
   * Get livemode
   * @return livemode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLivemode() {
    return livemode;
  }


  @JsonProperty(JSON_PROPERTY_LIVEMODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }


  public LogResponse loggableId(String loggableId) {
    this.loggableId = loggableId;
    return this;
  }

   /**
   * Get loggableId
   * @return loggableId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGGABLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoggableId() {
    return loggableId;
  }


  @JsonProperty(JSON_PROPERTY_LOGGABLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoggableId(String loggableId) {
    this.loggableId = loggableId;
  }


  public LogResponse loggableType(String loggableType) {
    this.loggableType = loggableType;
    return this;
  }

   /**
   * Get loggableType
   * @return loggableType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGGABLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoggableType() {
    return loggableType;
  }


  @JsonProperty(JSON_PROPERTY_LOGGABLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoggableType(String loggableType) {
    this.loggableType = loggableType;
  }


  public LogResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public LogResponse oauthTokenId(String oauthTokenId) {
    this.oauthTokenId = oauthTokenId;
    return this;
  }

   /**
   * Get oauthTokenId
   * @return oauthTokenId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOauthTokenId() {
    return oauthTokenId;
  }


  @JsonProperty(JSON_PROPERTY_OAUTH_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOauthTokenId(String oauthTokenId) {
    this.oauthTokenId = oauthTokenId;
  }


  public LogResponse queryString(Map<String, Object> queryString) {
    this.queryString = queryString;
    return this;
  }

  public LogResponse putQueryStringItem(String key, Object queryStringItem) {
    if (this.queryString == null) {
      this.queryString = new HashMap<>();
    }
    this.queryString.put(key, queryStringItem);
    return this;
  }

   /**
   * Get queryString
   * @return queryString
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getQueryString() {
    return queryString;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryString(Map<String, Object> queryString) {
    this.queryString = queryString;
  }


  public LogResponse related(String related) {
    this.related = related;
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelated() {
    return related;
  }


  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelated(String related) {
    this.related = related;
  }


  public LogResponse requestBody(Object requestBody) {
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getRequestBody() {
    return requestBody;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestBody(Object requestBody) {
    this.requestBody = requestBody;
  }


  public LogResponse requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public LogResponse putRequestHeadersItem(String key, String requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<>();
    }
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

   /**
   * Get requestHeaders
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public LogResponse responseBody(Object responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getResponseBody() {
    return responseBody;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseBody(Object responseBody) {
    this.responseBody = responseBody;
  }


  public LogResponse responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public LogResponse putResponseHeadersItem(String key, String responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<>();
    }
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

   /**
   * Get responseHeaders
   * @return responseHeaders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }


  public LogResponse searchableTags(List<String> searchableTags) {
    this.searchableTags = searchableTags;
    return this;
  }

  public LogResponse addSearchableTagsItem(String searchableTagsItem) {
    if (this.searchableTags == null) {
      this.searchableTags = new ArrayList<>();
    }
    this.searchableTags.add(searchableTagsItem);
    return this;
  }

   /**
   * Get searchableTags
   * @return searchableTags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCHABLE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSearchableTags() {
    return searchableTags;
  }


  @JsonProperty(JSON_PROPERTY_SEARCHABLE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchableTags(List<String> searchableTags) {
    this.searchableTags = searchableTags;
  }


  public LogResponse status(String status) {
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


  public LogResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LogResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public LogResponse userAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
    return this;
  }

   /**
   * Get userAccountId
   * @return userAccountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAccountId() {
    return userAccountId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }


  public LogResponse version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this log_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogResponse logResponse = (LogResponse) o;
    return Objects.equals(this.createdAt, logResponse.createdAt) &&
        Objects.equals(this.id, logResponse.id) &&
        Objects.equals(this.ipAddress, logResponse.ipAddress) &&
        Objects.equals(this.livemode, logResponse.livemode) &&
        Objects.equals(this.loggableId, logResponse.loggableId) &&
        Objects.equals(this.loggableType, logResponse.loggableType) &&
        Objects.equals(this.method, logResponse.method) &&
        Objects.equals(this.oauthTokenId, logResponse.oauthTokenId) &&
        Objects.equals(this.queryString, logResponse.queryString) &&
        Objects.equals(this.related, logResponse.related) &&
        Objects.equals(this.requestBody, logResponse.requestBody) &&
        Objects.equals(this.requestHeaders, logResponse.requestHeaders) &&
        Objects.equals(this.responseBody, logResponse.responseBody) &&
        Objects.equals(this.responseHeaders, logResponse.responseHeaders) &&
        Objects.equals(this.searchableTags, logResponse.searchableTags) &&
        Objects.equals(this.status, logResponse.status) &&
        Objects.equals(this.updatedAt, logResponse.updatedAt) &&
        Objects.equals(this.url, logResponse.url) &&
        Objects.equals(this.userAccountId, logResponse.userAccountId) &&
        Objects.equals(this.version, logResponse.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, ipAddress, livemode, loggableId, loggableType, method, oauthTokenId, queryString, related, requestBody, requestHeaders, responseBody, responseHeaders, searchableTags, status, updatedAt, url, userAccountId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    livemode: ").append(toIndentedString(livemode)).append("\n");
    sb.append("    loggableId: ").append(toIndentedString(loggableId)).append("\n");
    sb.append("    loggableType: ").append(toIndentedString(loggableType)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    oauthTokenId: ").append(toIndentedString(oauthTokenId)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    searchableTags: ").append(toIndentedString(searchableTags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userAccountId: ").append(toIndentedString(userAccountId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

