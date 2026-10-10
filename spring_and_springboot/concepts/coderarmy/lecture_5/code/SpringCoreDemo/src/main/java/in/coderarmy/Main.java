package in.coderarmy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        OrderService orderService = new OrderService(new  PaymentService());
        orderService.placeOrder();
    }
}
