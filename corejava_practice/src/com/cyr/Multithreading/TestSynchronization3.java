package com.cyr.Multithreading;

public class TestSynchronization3 {
	public static void main(String[] args) {
		final Table2 obj = new Table2();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(10);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(20);
			}
		};
		t1.start();
		t2.start();
	}
}
