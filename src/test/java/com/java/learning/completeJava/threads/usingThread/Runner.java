package com.java.learning.completeJava.threads.usingThread;

public class Runner {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("phase1");
		MyThread t2 = new MyThread("phase2");
		MyThread t3 = new MyThread("phase3");
		t1.start();
		t2.start();
		t3.start();	
		// t1.start(); throws illegalThreadStateException
		// t1.run(); fine, but does not start a separate call stack
	}

}
