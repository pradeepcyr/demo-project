package com.test.oops;
public class C {
C getC(){
return this;
}
void msg(){
System.out.println("Hello java");
}
public static void main(String[] args) {
new C().getC().msg();
}
}
