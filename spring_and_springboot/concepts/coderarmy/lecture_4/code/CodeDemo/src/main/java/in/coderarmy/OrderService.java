package in.coderarmy;

import in.coderarmy.notification.NotificationService;

public class OrderService {

    private NotificationService notification;

    public OrderService() {
    }

    OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        // actual business logic
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
