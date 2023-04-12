package com.cyr.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Pradeep");
		al.add("Ramu");
		al.add("Keethan");
		al.add("Ramu");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
