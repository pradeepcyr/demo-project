package com.cyr.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements" + hm);
		hm.put(100, "Amit");
		hm.put(101, "Rahul");
		hm.put(102, "Vijay");
		System.out.println("After invoking put() method");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hm.putIfAbsent(103, "Ravi");
		System.out.println("After invoking put if absent() method");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Rajesh");
		map.putAll(hm);
		System.out.println("After invoking PutAll() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
