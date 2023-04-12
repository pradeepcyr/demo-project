package com.cyr.collections;

import java.util.HashMap;

public class LinkedHashmap3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		System.out.println("Before invoking the remove() method: " + map);
		map.remove(102, "Rahul");
		System.out.println("After invoking the remove() method: " + map);
	}
}
