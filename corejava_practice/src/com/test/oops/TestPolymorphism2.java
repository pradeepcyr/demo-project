package com.test.oops;
class Shape {
void draw (){
System.out.println("drawing...");
}
}
class Rectangle extends Shape {
void draw (){
System.out.println("drawing rectangle...");
}
}
class Circle extends Shape {
void draw (){
System.out.println("drawing circle....");
}
}
class Triangle extends Shape {
void draw (){
System.out.println("drawing triangle....");
}
}
public  class TestPolymorphism2 {
public static void main(String[] args) {
Shape s ;
s = new Rectangle ();
s.draw();
s = new Circle ();
s.draw();
s = new Rectangle ();
s.draw();
}
}
