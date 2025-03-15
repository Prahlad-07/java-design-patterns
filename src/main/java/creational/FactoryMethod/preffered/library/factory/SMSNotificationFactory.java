package creational.FactoryMethod.preffered.library.factory;

import creational.FactoryMethod.preffered.library.notification.Notification;
import creational.FactoryMethod.preffered.library.notification.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
