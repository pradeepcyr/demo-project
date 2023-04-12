package com.cyr.Features;

interface Sayable3 {
	void say();
}

public class MethodReferenceExample {
	public static void saySomething() {
		System.out.println("Hello,this is static method.");
	}

	public static void main(String args[]) {
		Sayable3 sayable = MethodReferenceExample::saySomething;
		sayable.say();
	}
}
