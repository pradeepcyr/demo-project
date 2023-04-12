package com.test.ExceptionHandling;
public class MultipleCatchBlockExample2 {
public static void main(String[] args) {
try{
int a[] = new int [5] ;
System.out.println(a[10]);
}
catch(ArithmeticException e){
System.out.println("Aritmatic Exception occurs ");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayInddexOutOfBoundary Exception occurs");
}
catch(Exception e){
System.out.println("Parent Exception occurs");
}
System.out.println("Rest of the code");
}
}
