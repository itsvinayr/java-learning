package com.java.learning.completeJava.threads.anonymousCreation;

public class MyThread {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("HI");
			}
		});
		t.start();
	}
}
