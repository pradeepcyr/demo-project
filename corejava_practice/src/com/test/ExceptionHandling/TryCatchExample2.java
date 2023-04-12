package com.test.ExceptionHandling;
public class TryCatchExample2 {
public static void main(String[] args) {
try{
int data = 100/0 ;
}catch (ArithmeticException e){
System.out.println(e);
}
System.out.println("Rest of the code");
}
}
