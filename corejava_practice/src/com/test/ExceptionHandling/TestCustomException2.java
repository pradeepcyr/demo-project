package com.test.ExceptionHandling;
class MyCustomException extends Exception{
}
public class TestCustomException2 {
public static void main(String[] args) {
try{
throw new MyCustomException();
}
catch(MyCustomException ex){
System.out.println("Caught the expression");
System.out.println(ex.getMessage());
}
System.out.println("Rest of the code");
}
}
