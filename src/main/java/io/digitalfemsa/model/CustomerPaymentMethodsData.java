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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.digitalfemsa.model.PaymentMethodCashResponse;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.digitalfemsa.JSON;

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
import io.digitalfemsa.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
@JsonDeserialize(using = CustomerPaymentMethodsData.CustomerPaymentMethodsDataDeserializer.class)
@JsonSerialize(using = CustomerPaymentMethodsData.CustomerPaymentMethodsDataSerializer.class)
public class CustomerPaymentMethodsData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CustomerPaymentMethodsData.class.getName());

    public static class CustomerPaymentMethodsDataSerializer extends StdSerializer<CustomerPaymentMethodsData> {
        public CustomerPaymentMethodsDataSerializer(Class<CustomerPaymentMethodsData> t) {
            super(t);
        }

        public CustomerPaymentMethodsDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CustomerPaymentMethodsData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CustomerPaymentMethodsDataDeserializer extends StdDeserializer<CustomerPaymentMethodsData> {
        public CustomerPaymentMethodsDataDeserializer() {
            this(CustomerPaymentMethodsData.class);
        }

        public CustomerPaymentMethodsDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CustomerPaymentMethodsData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            CustomerPaymentMethodsData newCustomerPaymentMethodsData = new CustomerPaymentMethodsData();
            Map<String, Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "cash":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCustomerPaymentMethodsData.setActualInstance(deserialized);
                    return newCustomerPaymentMethodsData;
                case "oxxo_recurrent":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCustomerPaymentMethodsData.setActualInstance(deserialized);
                    return newCustomerPaymentMethodsData;
                case "payment_method_cash_response":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    newCustomerPaymentMethodsData.setActualInstance(deserialized);
                    return newCustomerPaymentMethodsData;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for CustomerPaymentMethodsData. Possible values: cash oxxo_recurrent payment_method_cash_response", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PaymentMethodCashResponse
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PaymentMethodCashResponse.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PaymentMethodCashResponse'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCashResponse'", e);
            }

            if (match == 1) {
                CustomerPaymentMethodsData ret = new CustomerPaymentMethodsData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CustomerPaymentMethodsData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CustomerPaymentMethodsData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CustomerPaymentMethodsData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public CustomerPaymentMethodsData() {
        super("oneOf", Boolean.FALSE);
    }

    public CustomerPaymentMethodsData(PaymentMethodCashResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodCashResponse", new GenericType<PaymentMethodCashResponse>() {
        });
        JSON.registerDescendants(CustomerPaymentMethodsData.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<>();
        mappings.put("cash", PaymentMethodCashResponse.class);
        mappings.put("oxxo_recurrent", PaymentMethodCashResponse.class);
        mappings.put("payment_method_cash_response", PaymentMethodCashResponse.class);
        mappings.put("customer_payment_methods_data", CustomerPaymentMethodsData.class);
        JSON.registerDiscriminator(CustomerPaymentMethodsData.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CustomerPaymentMethodsData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentMethodCashResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PaymentMethodCashResponse.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodCashResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodCashResponse
     *
     * @return The actual instance (PaymentMethodCashResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCashResponse`. If the actual instance is not `PaymentMethodCashResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCashResponse`
     * @throws ClassCastException if the instance is not `PaymentMethodCashResponse`
     */
    public PaymentMethodCashResponse getPaymentMethodCashResponse() throws ClassCastException {
        return (PaymentMethodCashResponse)super.getActualInstance();
    }

}

