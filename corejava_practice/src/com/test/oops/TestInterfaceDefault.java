package com.test.oops;

interface Drawable {
	void draw();

	default void msg() {
		System.out.println("Default Method ");
	}
}

class Star implements Drawable {
	public void draw() {
		System.out.println("Drawing stars");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable d = new Star();
		d.draw();
		d.msg();
	}
}
