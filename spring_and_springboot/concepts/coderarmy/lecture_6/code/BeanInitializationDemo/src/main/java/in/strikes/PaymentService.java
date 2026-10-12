package in.strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy(false)
@Lazy // then there is @Component all the objects by default load ata once with this lazy these class objects will only be loaded by spring when they are called
public class PaymentService {

    // Also keep in mind the proxy lazy initialization

    public PaymentService() {
        System.out.println("Payment service created");
    }
}
