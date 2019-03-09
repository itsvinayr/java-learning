package com.java.learning.completeJava.threads.deadLock;

public class DeadLock {

	public static String resource1 = "Vinay";
	public static String resource2 = "Likhitha";

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource 1");
					try {
						Thread.sleep(5000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (resource2) {
						System.out.println("Thread 1 : locked resource 2");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 : locked resource 2");
					try {
						Thread.sleep(5000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (resource1) {
						System.out.println("Thread 2 : locked resource 1");
					}
				}
			}
		});

		t1.start();
		t2.start();

	}

}
