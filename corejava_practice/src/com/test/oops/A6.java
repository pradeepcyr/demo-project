package com.test.oops;

interface Talktable {
	void print();
}

class A6 implements Talktable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
	}

}
