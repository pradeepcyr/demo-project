package com.test.ExceptionHandling;

import java.io.IOException;

class Parent {
void msg() throws IOException{
System.out.println("Parent method");
}
}
public class TestExceptionChid extends Parent {
void msg() throws  IOException{
System.out.println("TestExceptionChild");
}
public static void main(String[] args) throws IOException {
Parent p = new TestExceptionChid();
p.msg();
}
}
