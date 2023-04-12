package com.test.oops;
interface Drinkable {
void print ();
}
interface Eatable {
void print ();
}
class TestInterface3 implements Drinkable,Eatable {
public void print (){
System.out.println("Pradeep");
}
public static void main (String args []){
TestInterface3 obj = new TestInterface3 ();	
obj.print ();
}
}
