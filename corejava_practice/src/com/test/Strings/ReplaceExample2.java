package com.test.Strings;
public class ReplaceExample2 {
public static void main(String[] args) {
String str = "OOOOOO-HHHHH-OOOOOO";
 String rs = str.replace("H","S");
 System.out.println(rs);
 rs = rs.replace("S", "H");
 System.out.println(rs);
}
}
