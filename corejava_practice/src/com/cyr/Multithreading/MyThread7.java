package com.cyr.Multithreading;

public class MyThread7 extends Thread {
	Table3 t;

	MyThread7(Table3 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}
}
