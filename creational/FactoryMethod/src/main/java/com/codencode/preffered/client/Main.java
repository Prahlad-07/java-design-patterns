package com.codencode.preffered.client;

import com.codencode.preffered.library.factory.SMSNotificationFactory;
import com.codencode.preffered.library.notification.Notification;

public class Main {
    public static void main(String[] args) {
        Notification notification = new SMSNotificationFactory().createNotification();

        notification.notifyUser();
    }
}