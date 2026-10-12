package in.strikes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // best example for singleton
//@Scope("prototype") // lazy initialization
public class OrderService {

    public OrderService() {
        System.out.println("OrderService constructor");
    }

    public void placeOrder() {
        System.out.println("Order Placed");
    }
}
