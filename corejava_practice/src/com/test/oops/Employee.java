package com.test.oops;

public class Employee {
	float salary = 40000;
}

class Programm extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		Programm p = new Programm();
		System.out.println("Program salary is;" + p.salary);
		System.out.println("bonus of programm is;" + p.bonus);
	}

}
