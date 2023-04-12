package com.cyr.Multithreading;

public class TestShutdown {
	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(300);
		} catch (Exception e) {
		}
	}
}
