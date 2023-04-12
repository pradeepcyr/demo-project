package com.test.oops;
class Bike15 {
int Speedlimit = 90 ;
}
 class Honda3  extends Bike15{
int Speedlimit = 150;
public static void main(String[] args) {
	Bike15 obj = new Honda3 ();
	System.out.println(obj.Speedlimit);
}
 }
