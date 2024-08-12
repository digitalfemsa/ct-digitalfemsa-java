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


package io.digitalfemsa;

import io.digitalfemsa.*;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.CreateCustomerPaymentMethodsRequest;
import io.digitalfemsa.model.CreateCustomerPaymentMethodsResponse;
import io.digitalfemsa.model.Error;
import io.digitalfemsa.model.GetPaymentMethodResponse;
import io.digitalfemsa.model.UpdateCustomerPaymentMethodsResponse;
import io.digitalfemsa.model.UpdatePaymentMethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodsApi
 */
public class PaymentMethodsApiTest {

    private final PaymentMethodsApi api = new PaymentMethodsApi();

    /**
     * Create Payment Method
     *
     * Create a payment method for a customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerPaymentMethodsTest() throws ApiException {
        //String id = null;
        //CreateCustomerPaymentMethodsRequest createCustomerPaymentMethodsRequest = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CreateCustomerPaymentMethodsResponse response = api.createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Delete Payment Method
     *
     * Delete an existing payment method
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomerPaymentMethodsTest() throws ApiException {
        //String id = null;
        //String paymentMethodId = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //UpdateCustomerPaymentMethodsResponse response = api.deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Get Payment Methods
     *
     * Get a list of Payment Methods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerPaymentMethodsTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //Integer limit = null;
        //String next = null;
        //String previous = null;
        //String search = null;
        //GetPaymentMethodResponse response = api.getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search);
        // TODO: test validations
    }

    /**
     * Update Payment Method
     *
     * Gets a payment Method that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerPaymentMethodsTest() throws ApiException {
        //String id = null;
        //String paymentMethodId = null;
        //UpdatePaymentMethods updatePaymentMethods = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //UpdateCustomerPaymentMethodsResponse response = api.updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

}
