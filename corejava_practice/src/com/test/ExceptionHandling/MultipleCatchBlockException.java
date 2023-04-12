package com.test.ExceptionHandling;
public class MultipleCatchBlockException {
public static void main(String[] args) {
try {
int a[] = new int[5] ;
a[5] = 30/0 ;
}
catch(ArithmeticException e) {
System.out.println("Arithmatic exception occurs");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBound Exception occurs");
}
catch(Exception e){
System.out.println("Parent Exception occurs");
}
System.out.println("Rest of the code");
}
}
