

# OrderUpdateRequestCustomerInfo

## oneOf schemas
* [CustomerInfo](CustomerInfo.md)
* [CustomerInfoJustCustomerId](CustomerInfoJustCustomerId.md)

## Example
```java
// Import classes:
import com.digitalfemsa.model.OrderUpdateRequestCustomerInfo;
import com.digitalfemsa.model.CustomerInfo;
import com.digitalfemsa.model.CustomerInfoJustCustomerId;

public class Example {
    public static void main(String[] args) {
        OrderUpdateRequestCustomerInfo exampleOrderUpdateRequestCustomerInfo = new OrderUpdateRequestCustomerInfo();

        // create a new CustomerInfo
        CustomerInfo exampleCustomerInfo = new CustomerInfo();
        // set OrderUpdateRequestCustomerInfo to CustomerInfo
        exampleOrderUpdateRequestCustomerInfo.setActualInstance(exampleCustomerInfo);
        // to get back the CustomerInfo set earlier
        CustomerInfo testCustomerInfo = (CustomerInfo) exampleOrderUpdateRequestCustomerInfo.getActualInstance();

        // create a new CustomerInfoJustCustomerId
        CustomerInfoJustCustomerId exampleCustomerInfoJustCustomerId = new CustomerInfoJustCustomerId();
        // set OrderUpdateRequestCustomerInfo to CustomerInfoJustCustomerId
        exampleOrderUpdateRequestCustomerInfo.setActualInstance(exampleCustomerInfoJustCustomerId);
        // to get back the CustomerInfoJustCustomerId set earlier
        CustomerInfoJustCustomerId testCustomerInfoJustCustomerId = (CustomerInfoJustCustomerId) exampleOrderUpdateRequestCustomerInfo.getActualInstance();
    }
}
```


