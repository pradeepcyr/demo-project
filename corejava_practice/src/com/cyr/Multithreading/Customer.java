package com.cyr.Multithreading;

public class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going to withdrawl....");
		if (this.amount < amount) {
			System.out.println("Less balance:waiting for deposite..");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withrawl completed....");
	}

	synchronized void deposite(int amount) {
		System.out.println("Going to deposite....");
		this.amount += amount;
		System.out.println("deposite completed....");
		notify();
	}
}
