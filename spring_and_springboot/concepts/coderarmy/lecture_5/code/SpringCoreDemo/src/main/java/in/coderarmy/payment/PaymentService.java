package in.coderarmy.payment;

import org.springframework.stereotype.Component;

public sealed interface PaymentService permits CardPaymentService, UPiPaymentService{
    public void pay();
}
