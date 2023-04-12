package com.cyr.io;
import java.io.FileOutputStream;
public class FileOutPutStramExample {
 public static void main(String[] args) {
try{
FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
fout.write(65);
fout.close();
System.out.println("sucess");
}catch(Exception e){
}
  }
    }
