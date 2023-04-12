package com.test.oops;
abstract class Car1 {
abstract void run ();
}
 class Vehicle1 extends Car1 {
void run (){
System.out.println("Running safely");
}
public static void main(String[] args) {
	Car1 obj = new Vehicle1 ();
	obj.run ();
}
}
