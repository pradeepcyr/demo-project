package com.test.oops;

public class B2 {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n ");

		this.m();
	}

	public static void main(String[] args) {
		B2 a = new B2();
		a.n();
	}
}