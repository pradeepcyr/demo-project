package com.test.controlstatements;

public class WrapperincaseSwitch {

	public static void main(String[] args) 
		{ 
  Integer age = 18;
  switch (age)
  {
	  case(16):
	  System.out.println("you are under 18");
	  break;
	  case (18):
	 System.out.println("you are eligible to vote");
	  break;
	  case (65):
		  System.out.println("you are senior citizen");
	  break;
	  default:
		System.out.println("please give the valid age");
		break;
		
	  
  
	
		}

	}

}
