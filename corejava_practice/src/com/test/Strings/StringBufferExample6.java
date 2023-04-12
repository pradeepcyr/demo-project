package com.test.Strings;

public class StringBufferExample6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer ("Hello") ;
		System.out.println(sb.capacity());
		sb.append("Hello ");
		System.out.println(sb.capacity());
		sb.append("java is my favourite languag");
		System.out.println(sb.capacity());
	}
}
