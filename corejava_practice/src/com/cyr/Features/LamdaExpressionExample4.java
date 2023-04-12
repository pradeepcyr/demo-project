package com.cyr.Features;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionExample4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Ramu");
		list.add("Chaitu");
		list.add("Vivek");
		list.forEach((n) -> System.out.println(n));

	}
}
