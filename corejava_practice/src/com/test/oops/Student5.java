package com.test.oops;
class Student5 {
int id;
String name;
Student5(int i,String n){
id = i;
name = n;
}
Student5(Student5 s){
id =s.id;
name =s.name;
}
void display(){
	System.out.println(id+" "+name);
	}
public static void main (String []args){
Student5 s1 = new Student5 (777,"pradeep");
Student5 s2= new Student5(s1);
s1.display();
s2.display();
}
}
