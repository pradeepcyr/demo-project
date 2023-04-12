package com.cyr.Multithreading;

public class TestSynchronization5 {
	public static void main(String[] args) {
		MyThread9 t1 = new MyThread9();
		MyThread10 t2 = new MyThread10();
		MyThread11 t3 = new MyThread11();
		MyThread12 t4 = new MyThread12();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
