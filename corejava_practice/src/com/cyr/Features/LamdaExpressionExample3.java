package com.cyr.Features;

interface Sayable1 {
	public String say(String name);
}

public class LamdaExpressionExample3 {
	public static void main(String[] args) {
		Sayable1 s1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s1.say("Pradeep"));
		Sayable1 s2 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s2.say("Pradeep"));
	}
}
