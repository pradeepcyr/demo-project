package com.test.oops;
interface Square {
void draw () ;
}
class Cube implements Square {
public void draw (){
System.out.println("drawing cube");
}
}
class Pyramid implements Square {
public void draw (){
System.out.println("drawing pyramid");
}
}
class TestInterface1 {
public static void main(String[] args) {
Square s = new Pyramid ();
s.draw ();
}
}
