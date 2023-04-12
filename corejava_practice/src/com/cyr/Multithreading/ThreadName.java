package com.cyr.Multithreading;
public class ThreadName extends Thread{
ThreadName(String threadName){
super(threadName);
}
public void run(){
System.out.println("The thread is executing...");
}
}


