package com.cyr.collections;

import java.util.HashMap;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Rahul");
		map.put(102, "Vijay");
		map.put(103, "Ajith");
		System.out.println("Initial list of elements: " + map);
		map.remove(100);
		System.out.println("Update list of elements: " + map);
		map.remove(101);
		System.out.println("Update list of elements: " + map);
		map.remove(102, "Vijay");
		System.out.println("Update list of elements: "+map);
	}
}
