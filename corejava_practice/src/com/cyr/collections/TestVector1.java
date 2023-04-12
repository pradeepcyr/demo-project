package com.cyr.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector1 {
public static void main(String[] args) {
Vector<String> v = new Vector<String>();
v.add("Umesh");
v.addElement("irfan");
v.addElement("Kumar");
Enumeration e =v.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
}
}
