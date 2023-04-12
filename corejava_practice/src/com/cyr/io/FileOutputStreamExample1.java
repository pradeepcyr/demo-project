package com.cyr.io;
import java.io.FileOutputStream;
public class FileOutputStreamExample1 {
public static void main(String[] args) {
try{
FileOutputStream fout = new FileOutputStream("D://testout.text");
String s = "Welcome to java";
byte b[] = s.getBytes();
fout.write(b);
fout.close();
System.out.println("Sucess....");
}
catch(Exception e){
System.out.println(e);
}
}
}