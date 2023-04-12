package com.test.controlstatements;

public class SwitchstringExample3 {

	public static void main(String[] args) {
	String levelString="Expert";
	int level=0;
	switch(levelString){
	case"Beginers":level=1;
	break;
	case "Intermediate":level=2;
	break;
	case" Expert":level=3;
	break;
	default:level=0;
	break;	

	}
     System.out.println("your level is:"+level);
	}

}
