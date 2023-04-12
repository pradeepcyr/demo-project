package com.cyr.Features;

interface Sayable4 {
	void say();
}

public class InstanceMethodReference {
	public void saySomething() {
		System.out.println("Hello,this is non-static method");
	}

	public static void main(String[] args) {
		InstanceMethodReference methodReference = new InstanceMethodReference();
		Sayable4 sayable = methodReference::saySomething;
		sayable.say();
		Sayable4 sayable2 = new InstanceMethodReference()::saySomething;
		sayable2.say();
	}
}
