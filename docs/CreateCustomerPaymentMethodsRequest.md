

# CreateCustomerPaymentMethodsRequest

Contains details of the payment methods that the customer has active or has used in Femsa

## oneOf schemas
* [PaymentMethodCashRequest](PaymentMethodCashRequest.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.CreateCustomerPaymentMethodsRequest;
import io.digitalfemsa.model.PaymentMethodCashRequest;

public class Example {
    public static void main(String[] args) {
        CreateCustomerPaymentMethodsRequest exampleCreateCustomerPaymentMethodsRequest = new CreateCustomerPaymentMethodsRequest();

        // create a new PaymentMethodCashRequest
        PaymentMethodCashRequest examplePaymentMethodCashRequest = new PaymentMethodCashRequest();
        // set CreateCustomerPaymentMethodsRequest to PaymentMethodCashRequest
        exampleCreateCustomerPaymentMethodsRequest.setActualInstance(examplePaymentMethodCashRequest);
        // to get back the PaymentMethodCashRequest set earlier
        PaymentMethodCashRequest testPaymentMethodCashRequest = (PaymentMethodCashRequest) exampleCreateCustomerPaymentMethodsRequest.getActualInstance();
    }
}
```


