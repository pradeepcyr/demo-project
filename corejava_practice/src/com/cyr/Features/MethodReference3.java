package com.cyr.Features;

import java.util.function.BiFunction;

class Arithematic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class MethodReference3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithematic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}
