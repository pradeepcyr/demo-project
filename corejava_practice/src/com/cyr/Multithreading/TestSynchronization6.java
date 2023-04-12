package com.cyr.Multithreading;

public class TestSynchronization6 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Table5.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Table5.printTable(10);
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				Table5.printTable(15);
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				Table5.printTable(20);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
