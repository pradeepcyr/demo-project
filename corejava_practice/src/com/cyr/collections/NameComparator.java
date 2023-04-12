package com.cyr.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Student2> {
	public int compare(Student2 o1,Student2 o2){  
		Student2 s1=(Student2)o1;  
		Student2 s2=(Student2)o2;  
		return s1.name.compareTo(s2.name);  
		}  
		}  	


