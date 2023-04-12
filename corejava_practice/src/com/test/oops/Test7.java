package com.test.oops;
interface I{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class R implements I{  
public void c(){System.out.println("I am c");}  
}  
  
class  X extends  R{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  class Test7 {
	  public static void main(String args[]){  
		  I a=new X();  
		  a.a();  
		  a.b();  
		  a.c();  
		  a.d();  
}
}