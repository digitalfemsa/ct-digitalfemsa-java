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


package com.digitalfemsa;

import com.digitalfemsa.*;
import com.digitalfemsa.auth.*;
import com.digitalfemsa.model.CreateCustomerFiscalEntitiesResponse;
import com.digitalfemsa.model.Customer;
import com.digitalfemsa.model.CustomerFiscalEntitiesRequest;
import com.digitalfemsa.model.CustomerResponse;
import com.digitalfemsa.model.CustomerUpdateFiscalEntitiesRequest;
import com.digitalfemsa.model.CustomersResponse;
import com.digitalfemsa.model.Error;
import com.digitalfemsa.model.UpdateCustomer;
import com.digitalfemsa.model.UpdateCustomerFiscalEntitiesResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    /**
     * Create customer
     *
     * The purpose of business is to create and keep a customer, you will learn what elements you need to create a customer. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        //Customer customer = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CustomerResponse response = api.createCustomer(customer, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Create Fiscal Entity
     *
     * Create Fiscal entity resource that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomerFiscalEntitiesTest() throws ApiException {
        //String id = null;
        //CustomerFiscalEntitiesRequest customerFiscalEntitiesRequest = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CreateCustomerFiscalEntitiesResponse response = api.createCustomerFiscalEntities(id, customerFiscalEntitiesRequest, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Delete Customer
     *
     * Deleted a customer resource that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomerByIdTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CustomerResponse response = api.deleteCustomerById(id, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Get Customer
     *
     * Gets a customer resource that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomerByIdTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CustomerResponse response = api.getCustomerById(id, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Get a list of customers
     *
     * The purpose of business is to create and maintain a client, you will learn what elements you need to obtain a list of clients, which can be paged.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomersTest() throws ApiException {
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //Integer limit = null;
        //String search = null;
        //String next = null;
        //String previous = null;
        //CustomersResponse response = api.getCustomers(acceptLanguage, xChildCompanyId, limit, search, next, previous);
        // TODO: test validations
    }

    /**
     * Update customer
     *
     * You can update customer-related data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        //String id = null;
        //UpdateCustomer updateCustomer = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //CustomerResponse response = api.updateCustomer(id, updateCustomer, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Update  Fiscal Entity
     *
     * Update Fiscal Entity resource that corresponds to a customer ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomerFiscalEntitiesTest() throws ApiException {
        //String id = null;
        //String fiscalEntitiesId = null;
        //CustomerUpdateFiscalEntitiesRequest customerUpdateFiscalEntitiesRequest = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //UpdateCustomerFiscalEntitiesResponse response = api.updateCustomerFiscalEntities(id, fiscalEntitiesId, customerUpdateFiscalEntitiesRequest, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

}
