package com.test.oops;
abstract class Content {
abstract void draw ();
}
class Book extends Content {
void draw () {
System.out.println("drawing book");
}
}
class Circle1 extends Book {
void draw (){
System.out.println("drawing circle");
}
}
 class TestAbstraction1 {
public static void main(String[] args) {
Content s = new Circle1 ();
s.draw();
}

}
