package com.codencode.preffered.library.factory;

import com.codencode.preffered.library.notification.EmailNotification;
import com.codencode.preffered.library.notification.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
