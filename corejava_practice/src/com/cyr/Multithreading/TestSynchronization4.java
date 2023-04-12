package com.cyr.Multithreading;

public class TestSynchronization4 {
	public static void main(String[] args) {
		Table3 obj = new Table3();
		MyThread7 t1 = new MyThread7(obj);
		MyThread8 t2 = new MyThread8(obj);
		t1.start();
		t2.start();
	}
}
