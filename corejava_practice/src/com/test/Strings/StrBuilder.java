package com.test.Strings;
public class StrBuilder {
public static void main(String[] args) {
StringBuilder s1 = new StringBuilder("HELLO");
StringBuilder s2 = new StringBuilder(" WORLD");
StringBuilder s = s1.append(s2);
System.out.println(s.toString());
}
}
