package com.cyr.io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferdOutputStreamExample {
public static void main(String[] args)throws Exception{
FileOutputStream fout = new FileOutputStream("D://testout.text");
BufferedOutputStream bout = new BufferedOutputStream(fout); 
String s = "Welcome to java"; 
byte b [] = s.getBytes();
fout.write(b);
fout.flush();
fout.close();
bout.close();
System.out.println("Sucess");	
}
}
