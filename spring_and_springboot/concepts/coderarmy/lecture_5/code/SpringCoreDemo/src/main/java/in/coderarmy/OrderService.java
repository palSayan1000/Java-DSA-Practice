package in.coderarmy;

import in.coderarmy.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // Field Injection
//    @Autowired
    // qualifier can be passed here as well if i do not use setter or constructor
    private final PaymentService paymentService;

    // Constructor Injection
//    @Autowired // for only one constructor writing Auto wired is not required
    // i had done it using setter then i would have passed qualifier at the setter
    public OrderService(@Qualifier("cardPaymentService") PaymentService paymentService) { // here i will specify which class will qualify
        this.paymentService = paymentService;
    }

    // Setter Injection
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }
}
