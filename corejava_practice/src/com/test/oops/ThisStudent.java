package com.test.oops;
public class ThisStudent {
int rollno;
String name ;
float fee;
ThisStudent(int rollno,String name,float fee){
this.rollno = rollno;
this.name = name;
this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+fee);
}
public static void main(String[] args) {
ThisStudent s1 = new ThisStudent(111,"Pradeep",500f);
ThisStudent s2 = new ThisStudent(222,"Chinna",600f);
s1.display();
s2.display();
}
}
