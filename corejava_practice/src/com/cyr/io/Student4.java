package com.cyr.io;

@SuppressWarnings("serial")
public class Student4 extends Person{
	 String course;    
	 int fee;
	public Student4(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}  
	 
	 
}
