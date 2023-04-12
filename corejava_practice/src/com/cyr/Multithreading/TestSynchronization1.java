package com.cyr.Multithreading;

public class TestSynchronization1 {
	public static void main(String[] args) {
		Table obj = new Table();
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		t1.start();
		t2.start();
	}
}
