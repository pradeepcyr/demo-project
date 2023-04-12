package com.test.oops;
class Chalk {
void eat (){
System.out.println("Chalk is writting");
}
}
 class Board extends Chalk {
void eat (){
System.out.println("Board is Seeing");
}
public static void main (String args []){
	Chalk a = new Board ();
	a.eat ();
}
}