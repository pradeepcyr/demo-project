package com.cyr.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Raju");
		List<String> al2 = new LinkedList<String>();
		al2.add("James");
		al2.add("Cameron");
		al2.add("Swati");
		al2.add("juniod");
		System.out.println("ArrayList:" + al);
		System.out.println("LinkedList:" + al2);
	}
}
