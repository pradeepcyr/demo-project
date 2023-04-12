package com.cyr.collections;

import java.util.Hashtable;

public class HashTable4 {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Rahul");
		map.put(102, "vijay");
		System.out.println("Initial list of elements: " + map);
		map.putIfAbsent(103, "Ravi");
		System.out.println("Update list of elements: " + map);
		map.putIfAbsent(101, "Rahul");
		System.out.println("Update list of elements: " + map);
	}
}
