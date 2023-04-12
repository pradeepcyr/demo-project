package com.test.ExceptionHandling;
class Parent2 {
void msg() throws Exception{
System.out.println("Parent method");
}
}
public class TestExceptionChild2 extends Parent2 {
void msg() throws Exception {
System.out.println("Child method");
}
public static void main(String[] args) {
Parent2 p = new  TestExceptionChild2 ();
try{
p.msg();
}
catch(Exception e){}
}
}