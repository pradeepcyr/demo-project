package com.test.basics;

public class Plaindrome2 {

	public static void main(String[] args) {
		
		String s= "dinfrdhgrj";
		String rever = "";
		for(int a=s.length()-1;a>=0;a--){
			rever = rever + s.charAt(a);
			
		}//System.out.print(rever);
		/*if(s.equals(rever)){
			System.out.println("it is a palindrome");
		}else{
			System.out.println("it is not a palindrome");*/
		System.out.print(rever);
		}
	
}
