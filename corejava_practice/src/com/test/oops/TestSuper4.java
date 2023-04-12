package com.test.oops;
class Flower {
Flower(){System.out.println("beautiful");}
}
class Ross extends Flower {
Ross (){
System.out.println("attractive");
}
}
public class TestSuper4 {
public static void main(String[] args) {
Ross r = new Ross ();
}
}
