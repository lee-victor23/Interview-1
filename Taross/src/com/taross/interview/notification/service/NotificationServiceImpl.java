package com.taross.interview.notification.service;

public class NotificationServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// logic to send email
		System.out.print("Notification sent to [" + rec + "] with Message [" + msg +"]");
	}

}
