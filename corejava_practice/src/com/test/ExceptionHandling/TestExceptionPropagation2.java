package com.test.ExceptionHandling;

import java.io.IOException;

class TestExceptionPropagation2 {
	void m() throws IOException {  
    throw new java.io.IOException("device error");  
		  }  
		  void n() {  
		    m1();  
		  }  
		  private void m1() {
			// TODO Auto-generated method stub
			
		}
		void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public static void main(String args[]){  
			   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
			   obj.p();  
			   System.out.println("normal flow");  
			  }  
			}  

