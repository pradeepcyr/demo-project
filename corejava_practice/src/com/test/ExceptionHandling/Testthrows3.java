package com.test.ExceptionHandling;
import java.io.IOException;
class M1{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
public class Testthrows3 {
	public static void main(String args[]){  
	    try{  
	     M m1=new M();  
	     m1.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
	}  

		  

