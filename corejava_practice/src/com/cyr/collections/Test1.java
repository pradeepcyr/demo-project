package com.cyr.collections;

import java.io.FileWriter;
import java.util.Properties;
import java.util.*;  
import java.io.*;  

public class Test1 {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("name", "Pradeep");
		p.setProperty("email", "pradeepcyr@gmail.com");
		p.store(new FileWriter("infoExample1"), "Javatpoint Example");
		System.out.println("hiii");
	}
}