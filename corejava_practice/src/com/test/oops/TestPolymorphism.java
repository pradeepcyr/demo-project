package com.test.oops;
class Imb{  
float getRateOfInterest(){return 0;}  
}  
class RBI extends Imb{  
float getRateOfInterest(){return 8.4f;}  
}  
class Ssc extends RBI{  
float getRateOfInterest(){return 7.3f;}  
}  
class ICCI extends RBI{  
float getRateOfInterest(){return 9.7f;}  
}  
public class TestPolymorphism {
	public static void main(String args[]){  
		Imb b;  
		b=new RBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new Ssc();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICCI();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		}  
		}  

