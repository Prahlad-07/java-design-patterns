package com.codencode.preffered.library.notification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification...");
    }
}
