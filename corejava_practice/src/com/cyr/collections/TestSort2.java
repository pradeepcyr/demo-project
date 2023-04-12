package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Rahul");
		al.add("Khan");
		Collections.sort(al, Collections.reverseOrder());
		Iterator iter = al.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
