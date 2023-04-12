package com.test.ExceptionHandling;

import java.io.IOException;

class M {
void method()throws IOException{
System.out.println("Device operation performed");
}
}
public class Testthrowss2 {
public static void main(String[] args) throws IOException{
	M m = new  M ();
	m.method();
	System.out.println("Normal flow ");
}
}
