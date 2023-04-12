package com.test.oops;
class TestInheritance3 {
void eat(){
System.out.println("eating...");
}
}
class Dog extends TestInheritance3 {
void bark(){
System.out.println("barking...");
}
}
class BabyDog extends Dog{
void weep(){
System.out.println("Weeping...");
}
}
class TestInheritance4 {
public  void main(String[] args) {
BabyDog d = new BabyDog();
d.weep();
d.bark();
d.eat();
}
}
	

