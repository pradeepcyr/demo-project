package com.test.oops;
class Bike11 {
void run (){
System.out.println("running");
}
static class Splendor extends Bike11 {
void run (){
System.out.println("running safely with 60 kmph");
}
public static void main(String[] args) {
Bike11 s = new Splendor ();
s.run ();
}
}

  

}
