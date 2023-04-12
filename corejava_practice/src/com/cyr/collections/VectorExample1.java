package com.cyr.collections;

import java.util.Vector;

public class VectorExample1 {
public static void main(String[] args) {
Vector<String> vec = new Vector<String>();
vec.add("Tiger");
vec.add("lion");
vec.add("Dog");
vec.add("Elephant");
vec.addElement("Rat");
vec.addElement("Cat");
vec.addElement("Jack");
System.out.println("Elements of vector:"+vec);
}
}
