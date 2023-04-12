package com.test.oops;

class TestStudent {
	int roll;
	String name;

	void insertRecord(int r, String n) {
		roll = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(roll + " " + name);

	}
}

class TestStudent4 {
	public static void main(String[] args) {
		TestStudent s1 = new TestStudent();
		TestStudent s2 = new TestStudent();
		s1.insertRecord(100, "vivek");
		s2.insertRecord(222, "Arya");
		s1.displayInformation();
		s2.displayInformation();
	}
}

 