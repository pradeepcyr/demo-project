package com.test.oops;
class Fear {}
 class Dog4 extends Fear {
  static void method (Fear a ){
Dog4 d =  (Dog4)a ;
System.out.println("ok down casting is performed");
}
public static void main(String[] args) {
Fear a = new Dog4 ();
Dog4.method(a);
}
}
