package com.cyr.Multithreading;

public class MultiTasking1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
public static void main(String[] args) {
MultiTasking1 t1 = new MultiTasking1();
MultiTasking1 t2 = new MultiTasking1();
MultiTasking1 t3 = new MultiTasking1();
t1.start();
t2.start();
t3.start();
	}
}
