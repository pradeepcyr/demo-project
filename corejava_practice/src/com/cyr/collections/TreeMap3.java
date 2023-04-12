package com.cyr.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		System.out.println("DecendingMap: " + map.descendingMap());
		System.out.println("HeadMap: " + map.headMap(102, true));
		System.out.println("TailMap: " + map.tailMap(102, true));
		System.out.println("SubMap: " + map.subMap(100, false, 102, true));
	}
}
