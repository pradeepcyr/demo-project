package com.cyr.Multithreading;

public class TestSynchronization2 {
	public static void main(String[] args) {
		Table1 obj = new Table1();
		MyThread5 t1 = new MyThread5(obj);
		MyThread6 t2 = new MyThread6(obj);
		t1.start();
		t2.start();
	}
}
