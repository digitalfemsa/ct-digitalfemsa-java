

# GetCustomerPaymentMethodDataResponse

## oneOf schemas
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.GetCustomerPaymentMethodDataResponse;
import io.digitalfemsa.model.PaymentMethodCashResponse;

public class Example {
    public static void main(String[] args) {
        GetCustomerPaymentMethodDataResponse exampleGetCustomerPaymentMethodDataResponse = new GetCustomerPaymentMethodDataResponse();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set GetCustomerPaymentMethodDataResponse to PaymentMethodCashResponse
        exampleGetCustomerPaymentMethodDataResponse.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleGetCustomerPaymentMethodDataResponse.getActualInstance();
    }
}
```


