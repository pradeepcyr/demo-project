package com.cyr.Features;

interface Sayable5 {
	void say(String msg);
}

public class FunctionalInterfaceExample implements Sayable5 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fin = new FunctionalInterfaceExample();
		fin.say("Hello,java");
	}
}
