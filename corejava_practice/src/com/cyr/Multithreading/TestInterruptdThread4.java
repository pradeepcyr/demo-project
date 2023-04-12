package com.cyr.Multithreading;

public class TestInterruptdThread4 extends Thread {
	public void run() {
		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				System.out.println("code for interruptd thread");
			} else {
				System.out.println("code for normal thread");
			}
		}
	}

	public static void main(String[] args) {
		TestInterruptdThread4 t1 = new TestInterruptdThread4();
		TestInterruptdThread4 t2 = new TestInterruptdThread4();
		t1.start();
		t1.interrupt();
		t2.start();
	}
}
