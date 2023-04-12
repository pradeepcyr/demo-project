package com.cyr.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJavaCollection4 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Pradeep");
		set.add("Raju");
		set.add("Ramu");
		set.add("Pradeep");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
