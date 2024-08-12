

# CustomerPaymentMethodsRequest

## oneOf schemas
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.CustomerPaymentMethodsRequest;
import io.digitalfemsa.model.PaymentMethodCashRequest;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentMethodsRequest exampleCustomerPaymentMethodsRequest = new CustomerPaymentMethodsRequest();

        // create a new PaymentMethodCashRequest
        PaymentMethodCashRequest examplePaymentMethodCashRequest = new PaymentMethodCashRequest();
        // set CustomerPaymentMethodsRequest to PaymentMethodCashRequest
        exampleCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodCashRequest);
        // to get back the PaymentMethodCashRequest set earlier
        PaymentMethodCashRequest testPaymentMethodCashRequest = (PaymentMethodCashRequest) exampleCustomerPaymentMethodsRequest.getActualInstance();
    }
}
```


