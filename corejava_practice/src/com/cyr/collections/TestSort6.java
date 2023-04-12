package com.cyr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSort6 {
	public static void main(String[] args) {
		ArrayList<Student4> al = new ArrayList<Student4>();
		al.add(new Student4(101, "Vijay", 23));
		al.add(new Student4(106, "Ajay", 27));
		al.add(new Student4(105, "Jai", 21));

		Comparator<Student4> cm1 = Comparator.comparing(Student4::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by Name");
		for (Student4 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		Comparator<Student4> cm2 = Comparator.comparing(Student4::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by Age");
		for (Student4 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
