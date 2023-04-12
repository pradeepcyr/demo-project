package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Simple1 {
	public static void main(String[] args) {
		ArrayList<Student3> al = new ArrayList<Student3>();
		al.add(new Student3(101, "Vijay", 23));
		al.add(new Student3(106, "Ajay", 27));
		al.add(new Student3(105, "Jai", 21));
		System.out.println("Sorting by Name");
		Collections.sort(al, new NameComparator1());
		for (Student3 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator1());
		for (Student3 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
