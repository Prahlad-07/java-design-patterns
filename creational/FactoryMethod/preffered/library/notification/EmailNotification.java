package com.codencode.preffered.library.notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}
