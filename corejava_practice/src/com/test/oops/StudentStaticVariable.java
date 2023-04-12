package com.test.oops;
public class StudentStaticVariable {
int rollno ;
String name ;
static String college = "ITS" ;
StudentStaticVariable ( int r, String n ){
rollno = r;
name = n ;
}
void display() {
System.out.println(rollno +" "+name  +" "+college);
}

public static void main(String[] args) {
StudentStaticVariable s1 = new StudentStaticVariable(111,"Pradeep");
StudentStaticVariable s2 = new StudentStaticVariable(222,"Raju");
s1.display();
s2.display();
} 
}

