package com.cyr.Multithreading;
public class TestSleepMethod2 {
public static void main(String[] args) {
try{
for(int j=0;j<5;j++){
Thread.sleep(1000);
System.out.println(j);
}
}
catch(Exception expn){
System.out.println(expn);
}
}
}
