package com.test.Strings;
public class StringTOCharArrayExample {
public static void main(String[] args) {
String s1 = "welcome to javatpoint";
char[] ch = s1.toCharArray() ;
int len = ch.length ;
System.out.println("Char Array Length :" + len);
System.out.println("Char Array Element :");
for(int i=0;i<=len;i++){
System.out.println(ch[i]);
}
}
}
