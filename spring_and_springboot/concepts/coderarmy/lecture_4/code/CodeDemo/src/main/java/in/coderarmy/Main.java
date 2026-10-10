package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService notification = new EmailService();
        // OrderService order = new OrderService(notification);
        OrderService orderService = new OrderService();
        orderService.setNotification(notification);
        orderService.placeOrder();
    }
}

// A class should ask what it needs and not built everything itself

// IOC - Inversion of Control