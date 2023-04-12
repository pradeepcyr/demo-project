package com.cyr.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Ramu");
		list.add("Chaitu");
		list.add("vivek");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}