package com.cyr.io;
import java.io.FileInputStream;
public class DataStramExample {
public static void main(String[] args) {
try{
FileInputStream fin = new FileInputStream("D://testout.text");
int i = fin.read();
System.out.print((char)i);
fin.close();
}catch(Exception e){
System.out.println(e);
}
}
}
