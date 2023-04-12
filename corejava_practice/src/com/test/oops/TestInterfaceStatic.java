package com.test.oops;
interface Standable {
void draw ();
static int cube (int x ){return x*x*x ;}
}
class Running implements Standable {
public void draw (){
System.out.println("practice running");
}
}
 class TestInterfaceStatic {
public static void main(String[] args) {
Standable s = new Running ();
s.draw ();
System.out.println(Standable . cube (3));
}
}
