package com.test.oops;
interface P {
void a();
void b ();
void c ();
void d ();
}
abstract class S implements P {
public void c (){
System.out.println("I am c");
}
}
class K extends S {
public void a (){
System.out.println("I am a ");
}
public void b (){
System.out.println("I am b");
}
public void d (){
System.out.println("I am d ");
}
}
 class Abstract {
public static void main(String[] args) {
P a = new K ();
a.a();
a.b();
a.c();
a.d();
}
}
