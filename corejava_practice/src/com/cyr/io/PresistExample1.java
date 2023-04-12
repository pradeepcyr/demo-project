package com.cyr.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student1 implements Serializable{
int id;
String name ;
transient int age ;
public Student1(int id,String name,int age){
this.id= id;
this.name=name;
this.age=age;
}
}
public class PresistExample1 {
public static void main(String[] args)throws Exception {

Student1 s1  = new Student1(211,"ravi",22);
FileOutputStream f= new FileOutputStream("f.txt");
ObjectOutputStream out = new ObjectOutputStream(f);
out.writeObject(s1);
out.flush();
out.close();
f.close();
System.out.println("Sucess");
}
}	



