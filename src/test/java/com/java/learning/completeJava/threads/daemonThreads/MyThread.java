package com.java.learning.completeJava.threads.daemonThreads;

public class MyThread implements Runnable {

	private String threadName;

	MyThread(String threadName) {
		this.threadName = threadName;
	}

	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Its a daemon thread..");
		} else {

			for (int i = 0; i < 10; i++) {
				System.out.println(threadName + " -- " + i);
				try {
					Thread.sleep(500L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
