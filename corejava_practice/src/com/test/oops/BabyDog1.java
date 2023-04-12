package com.test.oops;
class Red {
void eat (){
System.out.println("Red is eating");
}
}
 class BabyDog1 extends  Red {
void eat  (){
System.out.println("BabyDog is eating");
}
public static void main (String args []){
	Red a = new BabyDog1 ();
	a.eat();
}
}