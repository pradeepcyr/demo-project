package com.cyr.Multithreading;

public class MyThread8 extends Thread {
	Table3 t;

	MyThread8(Table3 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(3);
	}
}
