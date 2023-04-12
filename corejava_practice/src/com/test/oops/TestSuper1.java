package com.test.oops;
class Wall {
String color = "White";
}
class Man extends Wall {
String color = "black";
  void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
public class TestSuper1 {
public static void main(String[] args) {
Man m = new Man ();
m.printColor();
}
}
