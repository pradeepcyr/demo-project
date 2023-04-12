package com.cyr.Multithreading;

class MyThread6 extends Thread {
	Table1 t;

	MyThread6(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}