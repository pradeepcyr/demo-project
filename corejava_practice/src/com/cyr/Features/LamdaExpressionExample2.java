package com.cyr.Features;

interface Sayable {
	public String say();
}

public class LamdaExpressionExample2 {
	public static void main(String[] args) {
		Sayable s = () -> {
			return " Be patience for the success";
		};
		System.out.println(s.say());
	}
}
