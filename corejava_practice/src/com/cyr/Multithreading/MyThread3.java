package com.cyr.Multithreading;

public class MyThread3 extends Thread {
	Table t;

	MyThread3(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}
