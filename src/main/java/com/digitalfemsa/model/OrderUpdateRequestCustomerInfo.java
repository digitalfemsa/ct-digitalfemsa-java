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
import com.digitalfemsa.model.CustomerInfo;
import com.digitalfemsa.model.CustomerInfoJustCustomerId;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.digitalfemsa.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.digitalfemsa.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
@JsonDeserialize(using = OrderUpdateRequestCustomerInfo.OrderUpdateRequestCustomerInfoDeserializer.class)
@JsonSerialize(using = OrderUpdateRequestCustomerInfo.OrderUpdateRequestCustomerInfoSerializer.class)
public class OrderUpdateRequestCustomerInfo extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OrderUpdateRequestCustomerInfo.class.getName());

    public static class OrderUpdateRequestCustomerInfoSerializer extends StdSerializer<OrderUpdateRequestCustomerInfo> {
        public OrderUpdateRequestCustomerInfoSerializer(Class<OrderUpdateRequestCustomerInfo> t) {
            super(t);
        }

        public OrderUpdateRequestCustomerInfoSerializer() {
            this(null);
        }

        @Override
        public void serialize(OrderUpdateRequestCustomerInfo value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class OrderUpdateRequestCustomerInfoDeserializer extends StdDeserializer<OrderUpdateRequestCustomerInfo> {
        public OrderUpdateRequestCustomerInfoDeserializer() {
            this(OrderUpdateRequestCustomerInfo.class);
        }

        public OrderUpdateRequestCustomerInfoDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public OrderUpdateRequestCustomerInfo deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomerInfo
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CustomerInfo.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomerInfo'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomerInfo'", e);
            }

            // deserialize CustomerInfoJustCustomerId
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CustomerInfoJustCustomerId.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomerInfoJustCustomerId'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomerInfoJustCustomerId'", e);
            }

            if (match == 1) {
                OrderUpdateRequestCustomerInfo ret = new OrderUpdateRequestCustomerInfo();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for OrderUpdateRequestCustomerInfo: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public OrderUpdateRequestCustomerInfo getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "OrderUpdateRequestCustomerInfo cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public OrderUpdateRequestCustomerInfo() {
        super("oneOf", Boolean.FALSE);
    }

    public OrderUpdateRequestCustomerInfo(CustomerInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public OrderUpdateRequestCustomerInfo(CustomerInfoJustCustomerId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomerInfo", new GenericType<CustomerInfo>() {
        });
        schemas.put("CustomerInfoJustCustomerId", new GenericType<CustomerInfoJustCustomerId>() {
        });
        JSON.registerDescendants(OrderUpdateRequestCustomerInfo.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return OrderUpdateRequestCustomerInfo.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomerInfo, CustomerInfoJustCustomerId
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomerInfo.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CustomerInfoJustCustomerId.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomerInfo, CustomerInfoJustCustomerId");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomerInfo, CustomerInfoJustCustomerId
     *
     * @return The actual instance (CustomerInfo, CustomerInfoJustCustomerId)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomerInfo`. If the actual instance is not `CustomerInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomerInfo`
     * @throws ClassCastException if the instance is not `CustomerInfo`
     */
    public CustomerInfo getCustomerInfo() throws ClassCastException {
        return (CustomerInfo)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomerInfoJustCustomerId`. If the actual instance is not `CustomerInfoJustCustomerId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomerInfoJustCustomerId`
     * @throws ClassCastException if the instance is not `CustomerInfoJustCustomerId`
     */
    public CustomerInfoJustCustomerId getCustomerInfoJustCustomerId() throws ClassCastException {
        return (CustomerInfoJustCustomerId)super.getActualInstance();
    }

}

