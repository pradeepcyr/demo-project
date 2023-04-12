package com.cyr.collections;

import java.util.Comparator;

public class NameComparator1 implements Comparator<Student3> {
	public int compare(Student3 s1, Student3 s2) {
		return s1.name.compareTo(s2.name);
	}
}
