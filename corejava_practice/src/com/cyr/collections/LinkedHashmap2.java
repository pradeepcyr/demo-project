package com.cyr.collections;

import java.util.LinkedHashMap;

public class LinkedHashmap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Key-Value Pairs:" + map.entrySet());
	}
}
