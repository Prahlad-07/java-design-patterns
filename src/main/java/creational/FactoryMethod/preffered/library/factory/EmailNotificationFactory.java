package creational.FactoryMethod.preffered.library.factory;

import creational.FactoryMethod.preffered.library.notification.EmailNotification;
import creational.FactoryMethod.preffered.library.notification.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
