

# ChargeResponsePaymentMethod

## oneOf schemas
* [PaymentMethodCash](PaymentMethodCash.md)

## Example
```java
// Import classes:
import com.digitalfemsa.model.ChargeResponsePaymentMethod;
import com.digitalfemsa.model.PaymentMethodCash;

public class Example {
    public static void main(String[] args) {
        ChargeResponsePaymentMethod exampleChargeResponsePaymentMethod = new ChargeResponsePaymentMethod();

        // create a new PaymentMethodCash
        PaymentMethodCash examplePaymentMethodCash = new PaymentMethodCash();
        // set ChargeResponsePaymentMethod to PaymentMethodCash
        exampleChargeResponsePaymentMethod.setActualInstance(examplePaymentMethodCash);
        // to get back the PaymentMethodCash set earlier
        PaymentMethodCash testPaymentMethodCash = (PaymentMethodCash) exampleChargeResponsePaymentMethod.getActualInstance();
    }
}
```


