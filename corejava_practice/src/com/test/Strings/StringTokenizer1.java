package com.test.Strings;
import java.util.StringTokenizer;
public class StringTokenizer1 {
public static void main(String[] args) {
StringTokenizer st = new StringTokenizer("my name is pradeep"," ");  
while (st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}