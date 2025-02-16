package com.codencode.preffered.library.factory;

import com.codencode.preffered.library.notification.Notification;
import com.codencode.preffered.library.notification.PushNotification;

public class PushNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
