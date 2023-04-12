package com.cyr.collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.TUESDAY, days.FRIDAY);
		Iterator<days> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
