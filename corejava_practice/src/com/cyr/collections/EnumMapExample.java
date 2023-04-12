package com.cyr.collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
	public enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public static void main(String[] args) {
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
		map.put(Days.MONDAY, "1");
		map.put(Days.TUESDAY, "2");
		map.put(Days.WEDNESDAY, "3");
		map.put(Days.THURSDAY, "4");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
