

# CreateCustomerPaymentMethodsResponse

## oneOf schemas
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)

## Example
```java
// Import classes:
import com.digitalfemsa.model.CreateCustomerPaymentMethodsResponse;
import com.digitalfemsa.model.PaymentMethodCashResponse;

public class Example {
    public static void main(String[] args) {
        CreateCustomerPaymentMethodsResponse exampleCreateCustomerPaymentMethodsResponse = new CreateCustomerPaymentMethodsResponse();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set CreateCustomerPaymentMethodsResponse to PaymentMethodCashResponse
        exampleCreateCustomerPaymentMethodsResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleCreateCustomerPaymentMethodsResponse.getActualInstance();
    }
}
```


