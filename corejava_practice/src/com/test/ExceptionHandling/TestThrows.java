package com.test.ExceptionHandling;
public class TestThrows {
	public static int divideNum(int n,int m) throws ArithmeticException {
		int div = m/n ;
		return div;
	}
		public static void main(String args[]){  
			TestThrows obj = new TestThrows (); 
		    try{ 
		    System.out.println(obj.divideNum(45, 0));
		   
		    }catch(Exception e){
		    	System.out.println("\n Num cannot divided by zero");
		    	}     
		  
		    System.out.println("rest of the code.");  
		  }  
		}  

	
