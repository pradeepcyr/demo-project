package com.cyr.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		map.put(101, "Ravi");
		System.out.println("HeadMap: " + map.headMap(102));
		System.out.println("TailMap: " + map.tailMap(102));
		System.out.println("SubMap: " + map.subMap(100, 102));
	}
}
