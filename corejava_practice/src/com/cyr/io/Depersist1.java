package com.cyr.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Depersist1 {
public static void main(String[] args)throws Exception {
ObjectInputStream in = new ObjectInputStream( new FileInputStream("D:\f.txt"));
Student2 s =(Student2)in.readObject();
System.out.println(s.id+""+s.name+" "+s.age);
in.close();		
}
}
