package com.cyr.Features;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",");
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Pradeep");
		joinNames.add("Peter");
		System.out.println(joinNames);
	}
}
