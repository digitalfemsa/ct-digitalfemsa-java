

# CustomerPaymentMethodsData

## oneOf schemas
* [PaymentMethodCashResponse](PaymentMethodCashResponse.md)

## Example
```java
// Import classes:
import com.digitalfemsa.model.CustomerPaymentMethodsData;
import com.digitalfemsa.model.PaymentMethodCashResponse;

public class Example {
    public static void main(String[] args) {
        CustomerPaymentMethodsData exampleCustomerPaymentMethodsData = new CustomerPaymentMethodsData();

        // create a new PaymentMethodCashResponse
        PaymentMethodCashResponse examplePaymentMethodCashResponse = new PaymentMethodCashResponse();
        // set CustomerPaymentMethodsData to PaymentMethodCashResponse
        exampleCustomerPaymentMethodsData.setActualInstance(examplePaymentMethodCashResponse);
        // to get back the PaymentMethodCashResponse set earlier
        PaymentMethodCashResponse testPaymentMethodCashResponse = (PaymentMethodCashResponse) exampleCustomerPaymentMethodsData.getActualInstance();
    }
}
```


