package com.cyr.Features;

interface Doable {
	default void dolt() {
		System.out.println("Do it now");
	}
}

interface Sayable7 extends Doable {
	void say(String msg);
}

public class FunctionalInterfaceExample3 implements Sayable7 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
		fie.say("Hello java");
		fie.dolt();
	}

}
