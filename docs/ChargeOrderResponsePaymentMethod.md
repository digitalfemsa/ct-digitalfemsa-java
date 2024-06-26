

# ChargeOrderResponsePaymentMethod

## oneOf schemas
* [PaymentMethodCash](PaymentMethodCash.md)

## Example
```java
// Import classes:
import io.digitalfemsa.model.ChargeOrderResponsePaymentMethod;
import io.digitalfemsa.model.PaymentMethodCash;

public class Example {
    public static void main(String[] args) {
        ChargeOrderResponsePaymentMethod exampleChargeOrderResponsePaymentMethod = new ChargeOrderResponsePaymentMethod();

        // create a new PaymentMethodCash
        PaymentMethodCash examplePaymentMethodCash = new PaymentMethodCash();
        // set ChargeOrderResponsePaymentMethod to PaymentMethodCash
        exampleChargeOrderResponsePaymentMethod.setActualInstance(examplePaymentMethodCash);
        // to get back the PaymentMethodCash set earlier
        PaymentMethodCash testPaymentMethodCash = (PaymentMethodCash) exampleChargeOrderResponsePaymentMethod.getActualInstance();
    }
}
```


