package com.cyr.Features;

interface Sayable6 {
	void say(String msg);

	int Hashcode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterfaceExample2 implements Sayable6 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Welcome to eclipse");
	}

	@Override
	public int Hashcode() {
		
		return 0;
	}

}
