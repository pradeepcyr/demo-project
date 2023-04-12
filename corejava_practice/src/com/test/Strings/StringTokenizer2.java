package com.test.Strings;
import java.util.StringTokenizer;
public class StringTokenizer2 {
public static void main(String[] args) {
StringTokenizer st = new StringTokenizer ("my,name,is,pradeep"," ") ;
System.out.println("Next token is :" + st.nextToken(","));
}
}
