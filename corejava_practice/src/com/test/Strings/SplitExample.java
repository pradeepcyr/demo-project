package com.test.Strings;
public class SplitExample {
public static void main(String[] args) {
String s1 = "java String split method by javatpoint" ;
String[] Words = s1.split("\\s") ;
for (String W:Words){
System.out.println(W);
}
}
}
