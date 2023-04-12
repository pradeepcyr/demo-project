package com.test.oops;
 class A {
  A (){
System.out.println("parent class constructor is invoked");
 }
}
class B4 extends A{
B4 (){
super () ;
System.out.println("chid class constructor is invoked");
}
{
System.out.println("instance intializer is invoked ");
}
public static void main(String[] args) {
	B4 b = new B4 ();
}
}