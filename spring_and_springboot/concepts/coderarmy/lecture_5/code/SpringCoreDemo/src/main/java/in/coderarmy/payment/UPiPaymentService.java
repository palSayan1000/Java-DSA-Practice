package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("UPI") // changing my qualifier name
public final class UPiPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Payment via UPI done");
    }
}
