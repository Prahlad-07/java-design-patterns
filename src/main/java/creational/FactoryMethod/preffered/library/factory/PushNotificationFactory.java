package creational.FactoryMethod.preffered.library.factory;

import creational.FactoryMethod.preffered.library.notification.Notification;
import creational.FactoryMethod.preffered.library.notification.PushNotification;

public class PushNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
