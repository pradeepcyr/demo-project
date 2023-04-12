package com.cyr.Multithreading;

public class ThreadJoinExample {
public static void main(String[] args) {
ThreadJion th1 = new ThreadJion ();
ThreadJion th2 = new ThreadJion();
ThreadJion th3 = new ThreadJion();
th1.start();
try{
System.out.println("The current thread name is :"+Thread.currentThread().getName());
th1.join();
}
catch(Exception e){
System.out.println("The exception has been caugth"+e);
}
th2.start();
try{
System.out.println("The current thread name is :"+Thread.currentThread().getName());
th2.join();
}
catch(Exception e){
System.out.println("The exception has been caught"+e);
}
th3.start();
}
}
