package in.coderarmy.notification;

public sealed interface NotificationService
        permits FakeEmailService, EmailService, PopUpNotificationService, SmsService {
    void sendNotification();
}
