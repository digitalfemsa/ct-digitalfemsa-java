

# UpdateCustomerPaymentMethodsResponse

## oneOf schemas
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.UpdateCustomerPaymentMethodsResponse;
import io.digitalfemsa.model.PaymentMethodCashResponse;

public class Example {
    public static void main(String[] args) {
        UpdateCustomerPaymentMethodsResponse exampleUpdateCustomerPaymentMethodsResponse = new UpdateCustomerPaymentMethodsResponse();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set UpdateCustomerPaymentMethodsResponse to PaymentMethodCashResponse
        exampleUpdateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleUpdateCustomerPaymentMethodsResponse.getActualInstance();
    }
}
```


