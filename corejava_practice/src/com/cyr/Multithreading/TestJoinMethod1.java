package com.cyr.Multithreading;
public class TestJoinMethod1 {
 public void run(){    
 for(int k=1;k<=5;k++){    
try{    
Thread.sleep(500);    
}catch(Exception e){
System.out.println(e);    
}
System.out.println(k);    
}  
}
public static void main(String args[]){    
TestJoinMethod1 t1=new TestJoinMethod1();    
TestJoinMethod1 t2=new TestJoinMethod1();    
TestJoinMethod1 t3=new TestJoinMethod1();    
t1.start();    
try{    
 t1.join();    
}catch(Exception e){
System.out.println(e);
}    
t2.start();    
t3.start();    
}
private void join() {
}
private void start() {
}
}