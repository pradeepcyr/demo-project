package com.cyr.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Ramu");
		list.add("Raju");
		HashSet<String> set = new HashSet(list);
		set.add("Vivek");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
