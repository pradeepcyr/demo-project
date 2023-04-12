package com.cyr.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Amit");
		map.put(3, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
