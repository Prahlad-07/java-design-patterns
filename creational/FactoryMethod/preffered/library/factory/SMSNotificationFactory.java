package com.codencode.preffered.library.factory;

import com.codencode.preffered.library.notification.Notification;
import com.codencode.preffered.library.notification.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
