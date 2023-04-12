package com.test.oops;

class TestOverloading2 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String args[]) {
		System.out.println(TestOverloading2.add(11, 11));
		System.out.println(TestOverloading2.add(12.3, 12.6));
	}
}