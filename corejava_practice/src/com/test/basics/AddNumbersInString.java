package com.test.basics;

public class AddNumbersInString {

	public static void main(String[] args) {
		int add=0;
		String s = "die30ig04jdi034kjod48";
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				add= add+s.charAt(i);
				
			}
			
		}System.out.println(add);
	}

}
