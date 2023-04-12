package com.cyr.collections;

import java.util.Comparator;

public class AgeComparator1 implements Comparator<Student3>{   
	public int compare(Student3 s1,Student3 s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  
}
