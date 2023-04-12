package com.test.Strings;
public class ReplaceAllExample2 {
public static void main(String[] args) {
String s1 = "my name is pradeep. My name is raju . my name is ramu" ;
String replaceString = s1.replaceAll("\\s", "") ;
System.out.println(replaceString);
}
}
