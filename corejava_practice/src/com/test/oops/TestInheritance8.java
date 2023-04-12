package com.test.oops;
interface Check {
float rateOfInterest ();
}
class ANB implements Check {
public float rateOfInterest(){return 9.15f ;}
}
class BOI implements Check{
public float rateOfInterest(){return 9.7f ;}
}
 class TestInheritance8 {
public static void main(String[] args) {
Check c = new ANB ();
System.out.println("ROI: " + c.rateOfInterest());
}
}
