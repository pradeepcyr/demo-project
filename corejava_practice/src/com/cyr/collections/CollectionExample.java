package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("CoreJava");
		list.add("Advance");
		System.out.println("Initial list of elements:" + list);
		Collections.addAll(list, "Severlets", "JSP");
		System.out.println("After adding elements collection value:" + list);
		String[] StrArr = { "C+", ".Net" };
		Collections.addAll(list, StrArr);
		System.out.println("After adding array coolection value:" + list);
	}
}
