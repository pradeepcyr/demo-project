package com.test.ExceptionHandling;
public class FinalExampleTest {
final int age =  18 ;
void display(){
 final int age = 55 ;
}
public static void main(String[] args) {
FinalExampleTest obj = new FinalExampleTest ();
obj.display();
}
}
