

# UpdateCustomer

update customer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antifraudInfo** | [**UpdateCustomerAntifraudInfo**](UpdateCustomerAntifraudInfo.md) |  |  [optional] |
|**defaultPaymentSourceId** | **String** | It is a parameter that allows to identify in the response, the Femsa ID of a payment method (payment_id) |  [optional] |
|**email** | **String** | An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc). |  [optional] |
|**name** | **String** | Client&#39;s name |  [optional] |
|**phone** | **String** | Is the customer&#39;s phone number |  [optional] |
|**defaultShippingContactId** | **String** | It is a parameter that allows to identify in the response, the Femsa ID of the shipping address (shipping_contact) |  [optional] |
|**corporate** | **Boolean** | It is a value that allows identifying if the email is corporate or not. |  [optional] |
|**customReference** | **String** | It is an undefined value. |  [optional] |
|**fiscalEntities** | [**List&lt;CustomerFiscalEntitiesRequest&gt;**](CustomerFiscalEntitiesRequest.md) |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**paymentSources** | [**List&lt;CustomerPaymentMethodsRequest&gt;**](CustomerPaymentMethodsRequest.md) | Contains details of the payment methods that the customer has active or has used in Femsa |  [optional] |
|**shippingContacts** | [**List&lt;CustomerShippingContacts&gt;**](CustomerShippingContacts.md) | Contains the detail of the shipping addresses that the client has active or has used in Femsa |  [optional] |



