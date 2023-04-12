package com.cyr.Multithreading;

public class TestDaemonThreadExample extends Thread {
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread work");
		}

		else {
			System.out.println("User thread work ");
		}
	}

	public static void main(String[] args) {
		TestDaemonThreadExample t1 = new TestDaemonThreadExample();
		TestDaemonThreadExample t2 = new TestDaemonThreadExample();
		TestDaemonThreadExample t3 = new TestDaemonThreadExample();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}
}
