package com.cyr.Multithreading;

public class MultiTasking2 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Task one");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Task two");
			}
		};
		t1.start();
		t2.start();
	}
}