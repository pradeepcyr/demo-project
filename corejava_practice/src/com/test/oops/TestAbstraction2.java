package com.test.oops;
abstract class Shoe {
Shoe (){System.out.println("Shoe is created");
}
abstract void run ();
void changeGear (){
System.out.println("Gear is changed");
}
}
class Slipper extends Shoe  {
void run (){
System.out.println("running fastly");
}
}
class TestAbstraction2 {
public static void main(String[] args) {
Shoe obj = new Slipper ();
obj.run ();
obj.changeGear ();
}
}
