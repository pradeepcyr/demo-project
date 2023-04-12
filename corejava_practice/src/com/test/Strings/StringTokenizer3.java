package com.test.Strings;
import java.util.StringTokenizer;
public class StringTokenizer3 {
public static void main(String[] args) {
StringTokenizer st = new StringTokenizer("my language is telugu"," ") ;
while(st.hasMoreElements()){
System.out.println(st.nextToken());
}
}
}
