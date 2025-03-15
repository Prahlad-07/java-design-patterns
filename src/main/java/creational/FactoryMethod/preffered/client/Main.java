package creational.FactoryMethod.preffered.client;

import creational.FactoryMethod.preffered.library.factory.SMSNotificationFactory;
import creational.FactoryMethod.preffered.library.notification.Notification;

public class Main {
    public static void main(String[] args) {
        Notification notification = new SMSNotificationFactory().createNotification();

        notification.notifyUser();
    }
}