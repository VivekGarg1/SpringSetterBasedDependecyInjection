package com.home.message;

public class ActiveMQMessage implements Messaging {
	
	@Override
	public void sendMessage() {
		System.out.println("Message send via Active MQ..");
	}

}
