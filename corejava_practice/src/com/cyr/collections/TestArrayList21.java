package com.cyr.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList21 {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Amar");
al.add("John");
al.add("Abdul");
al.add("Jersey");
Iterator itr = al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
