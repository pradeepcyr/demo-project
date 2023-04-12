package com.cyr.Features;

interface Sayable12 {
	default void say() {
		System.out.println("Hello, this is static method");
	}

	void sayMore(String msg);

	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethods implements Sayable12 {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.sayMore("Work is worship");
		dm.sayMore("Hello");
	}
}
