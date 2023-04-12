package com.cyr.Multithreading;
public class ThreadNameExample {
public static void main(String[] args) {
ThreadName th1 = new ThreadName("JavaTpoint1");
ThreadName th2 = new ThreadName("JavaTpoint2");
System.out.println("Thread-1:"+th1.getName());
System.out.println("Thread-2:"+th2.getName());
th1.start();
th2.start();
}
}
