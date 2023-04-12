package com.test.ExceptionHandling;
public class TestThrowAndThrows {
static void method() throws ArithmeticException {
System.out.println("Inside the method ()");
throw new ArithmeticException("Throwing arithmetic exception");
}
public static void main(String[] args) {
try{
method();
}catch(ArithmeticException e){
System.out.println("caught in the main() method");
}
}
}
