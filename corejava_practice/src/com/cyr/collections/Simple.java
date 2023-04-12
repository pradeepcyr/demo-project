package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple {
	public static void main(String[] args) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101, "Vijay", 23));
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));
		System.out.println("Sorting by name");
		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student2 st = (Student2) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("Sorting by age");
		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student2 st = (Student2) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
