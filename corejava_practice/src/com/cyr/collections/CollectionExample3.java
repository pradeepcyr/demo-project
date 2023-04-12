package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(9);
		System.out.println("value of minimum elements form the collection value:" + Collections.min(list));
	}
}
