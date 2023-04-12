package com.cyr.collections;

import java.util.EnumSet;
import java.util.Set;

enum days1 {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample2 {
	public static void main(String[] args) {
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week days:" + set1);
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week days:" + set2);
	}
}
