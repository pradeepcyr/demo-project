package com.test.oops;
class Elephant {
void eat() {
System.out.println("eating");
}
}
class Lion extends Elephant {
void eat(){
System.out.println("eating bread...");
}
void bark (){
System.out.println("roaring");}
void Bark (){
 super.eat();
}
}
public class TestSuper2 {
public static void main(String[] args) {
Elephant e = new Elephant ();
e.eat();
}
}
