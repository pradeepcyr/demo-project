package com.test.oops;
class Animal {
void eat (){
System.out.println("eating...");
}
}
class Dog3 extends Animal {
void bark(){
System.out.println("barking..");
}
}
class Cat extends Animal {
void meow (){
System.out.println("meowing...");
}
}
 class TestInheritance5 {
public static void main (String args[]){
 Cat c = new Cat ();
 c.meow();
 c.eat();
}
}
