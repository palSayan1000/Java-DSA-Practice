package in.coderarmy.notification;

public final class SmsService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sms Notification Sent");
    }
}
