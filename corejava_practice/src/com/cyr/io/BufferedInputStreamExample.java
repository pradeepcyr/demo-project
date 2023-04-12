package com.cyr.io;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamExample {
public static void main(String[] args) {
try{
FileInputStream fin = new FileInputStream("D://testout.text");
BufferedInputStream bin = new BufferedInputStream(fin);
int i = 1 ;
while((i=bin.read())!=-1){
System.out.print((char)i);
}
bin.close();
fin.close();
}catch(Exception e){
System.out.println(e);
}
}
}

