package com.test.Strings;
public class StringBuilder6 {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder () ;
System.out.println(sb.capacity());
sb.append("java") ;
System.out.println(sb.capacity());
sb.append("java is my favourite language") ;
System.out.println(sb.capacity());
} 
}
