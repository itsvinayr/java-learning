package com.java.learning.completeJava.threads.interThreadCommunication;

public class Runner {

	public static void main(String[] args) {

		final Customer c = new Customer(50000);
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				c.withdraw(60000);
			}
		});
		t.start();
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				c.deposit(20000);
			}
		});		
		t2.start();
		
	}

}
