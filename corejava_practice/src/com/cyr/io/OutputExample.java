package com.cyr.io;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class OutputExample {
public static void main(String[] args)throws Exception {
FileOutputStream file = new FileOutputStream("D:\\testout.txt");
DataOutputStream data = new	DataOutputStream(file);
data.writeInt(65);
data.flush();
data.close();
System.out.println("SUCESS.....");
}
}
