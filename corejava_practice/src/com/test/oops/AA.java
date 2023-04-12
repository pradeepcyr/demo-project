package com.test.oops;

public class AA {
	AA() {
		System.out.println("hello a ");
	}

	AA(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String args[]) {
		AA a = new AA(10);
	}
}