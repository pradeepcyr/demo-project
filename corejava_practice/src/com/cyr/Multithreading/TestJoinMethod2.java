package com.cyr.Multithreading;

public class TestJoinMethod2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) throws InterruptedException {
		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		TestJoinMethod2 t4 = new TestJoinMethod2();
	
		//t1.start();
		t1.join();
		/*try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}*/

		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t3.start();
		t4.start();
	}
}