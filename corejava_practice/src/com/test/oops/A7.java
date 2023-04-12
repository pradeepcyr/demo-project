package com.test.oops;

interface Walkable {
	void Walk();
}

interface Showable {
	void Show();
}

class A7 implements Walkable, Showable {
	public void Walk() {
		System.out.println("Hello");
	}

	public void Show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		A7 obj = new A7();
		obj.Show();
		obj.Walk();
	}
}
