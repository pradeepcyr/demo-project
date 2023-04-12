package com.cyr.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Pradeep");
		set.add("Ramu");
		set.add("Keethan");
		System.out.println("Transfering the element through iterator in decending order");
		Iterator i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
