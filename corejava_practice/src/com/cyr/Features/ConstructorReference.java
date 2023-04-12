package com.cyr.Features;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
	System.out.println(msg);
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable s = Message::new;
		s.getMessage("Hello");
	}
}
