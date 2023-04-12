package com.cyr.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student2 implements Serializable{    
	 int id;    
	 String name;    
	 transient int age;//Now it will not be serialized    
	 public Student2(int id, String name,int age) {    
	  this.id = id;    
	  this.name = name;    
	  this.age=age;    
	 }    
	}     


