package com.cyr.collections;

import java.util.HashMap;

public class ConcurentHashMapComputeIfAbsentEx1 {
	public static void main(String[] args) {
		HashMap<String, Integer> mapcon = new HashMap<String, Integer>();
		mapcon.put("K1", 100);
		mapcon.put("K2", 200);
		mapcon.put("K3", 300);
		mapcon.put("K4", 400);
		System.out.println("HashMap Values:\n" + mapcon.toString());
		mapcon.computeIfAbsent("k5", K -> 200 + 300);
		mapcon.computeIfAbsent("K6", K -> 20 * 30);
		System.out.println("HashMap after compute if absent:\n" + mapcon);
	}
}
