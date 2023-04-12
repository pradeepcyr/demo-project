package com.cyr.Features;

interface Drawable {
	public void draw();
}

public class LamdaExpressionExample {
	public static void main(String[] args) {
		int Width = 10;
		Drawable d2 = () -> {
			System.out.println("Drawing " + Width);
		};
		d2.draw();
	}
}
