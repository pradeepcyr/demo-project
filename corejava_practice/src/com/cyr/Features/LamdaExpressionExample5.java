package com.cyr.Features;

interface Sayable2 {
	String say(String messeage);
}

public class LamdaExpressionExample5 {
	public static void main(String[] args) {
		Sayable2 person = (message) -> {
			String str1 = "I wouid like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious"));
	}
}
