package com.test.ExceptionHandling;
class Parent4{    
  void msg()throws Exception{  
  System.out.println("parent method");  
	  }    
	}    
class TestExceptionChild3 extends Parent4{    
	void msg() {  
 System.out.println("child method");  
	  }    
 public static void main(String[] args) {
	 Parent4 p = new TestExceptionChild3();    
      try {    
	   p.msg();    
	   }  
	   catch(Exception e) {}  
}
}