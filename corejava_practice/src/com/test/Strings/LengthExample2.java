package com.test.Strings;
public class LengthExample2 {
public static void main(String[] args) {
String str = "javatpoint";
if(str.length()>0){
System.out.println("String is not empty and lenght is :" +str.length());
str = "";
if(str.length()==0) {
System.out.println("String is empty now :" +str.length());
}
}
}
}
