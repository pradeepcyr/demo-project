package com.cyr.collections;


import java.io.FileReader;
import java.util.Properties;
import java.util.*;  
import java.io.*;  


public class Test {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("dp");
		Properties p = new Properties();
		p.load(reader);
		System.out.println(p.getProperty("User"));
		System.out.println(p.getProperty("Password"));
	}
}
