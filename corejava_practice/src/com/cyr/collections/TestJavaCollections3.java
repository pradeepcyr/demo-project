package com.cyr.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestJavaCollections3 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Pradeep");
		set.add("Ramu");
		set.add("Pradeep");
		set.add("Raju");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
