package com.test.ExceptionHandling;
class Parent1 {
void msg (){
System.out.println("Parent method");
}
}
public class TestExceptionChild1 extends Parent1 {
void msg() throws ArithmeticException {
System.out.println("Child method");
}
public static void main(String[]args){
	Parent1 p = new TestExceptionChild1();
	p.msg();
}
}


