package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier // qualifier means both the class want to qualify  for the selection of the passing of the bean class
public final class CardPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Card Payment Done");
    }
}
