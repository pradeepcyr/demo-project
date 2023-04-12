package com.test.oops;
abstract class Loan {
abstract int getRateOfInterest();
}
class CNB extends Loan {
int getRateOfInterest(){return 7;}
}
class PNB extends CNB {
int getRateOfInterest(){return 8;}
}
 class TestBank {
public static void main(String[] args) {
Loan l ;
l = new CNB ();
System.out.println("Rate of Interest is :"+l.getRateOfInterest()+"%");
l = new PNB ();
System.out.println("Rate of Interest is :" +l.getRateOfInterest()+"%");
}
	}


