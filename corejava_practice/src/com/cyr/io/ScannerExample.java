package com.cyr.io;
import java.util.Scanner;
public class ScannerExample {
public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);  
      System.out.print("Enter your name:");  
      String name = in.nextLine();  
      System.out.println("Name is:" + name);             
      in.close();        
}
}
