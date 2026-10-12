package in.strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class OrderService {

    public OrderService() {
        System.out.println("Order service created");
    }
}
