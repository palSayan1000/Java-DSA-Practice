package in.coderarmy.notification;

public final class EmailService implements NotificationService {
    @Override
    public void sendNotification() {
        // actual notification sent
        System.out.println("Email Notification Sent");
    }
}

// A class should ask what it needs and not built everything itself