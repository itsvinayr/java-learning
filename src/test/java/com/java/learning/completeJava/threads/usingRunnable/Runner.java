package com.java.learning.completeJava.threads.usingRunnable;

public class Runner {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("phase1");
		MyThread t2 = new MyThread("phase2");
		MyThread t3 = new MyThread("phase3");
		
		Thread s1 = new Thread(t1);
		Thread s2 = new Thread(t2);
		Thread s3 = new Thread(t3);
		
		s1.start();
		s2.start();
		s3.start();
		
	}

}
