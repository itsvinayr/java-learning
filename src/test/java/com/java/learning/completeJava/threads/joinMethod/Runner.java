package com.java.learning.completeJava.threads.joinMethod;

public class Runner {

	public static void main(String[] args) {
		
		// printing current thread name
		System.out.println("Printing current thread name : "+Thread.currentThread().getName());

		MyThread t1 = new MyThread("phase1");
		MyThread t2 = new MyThread("phase2");
		MyThread t3 = new MyThread("phase3");
		
		Thread s1 = new Thread(t1);
		Thread s2 = new Thread(t2);
		Thread s3 = new Thread(t3);
		
		System.out.println("Use of getName method "+s1.getName());
		s1.setName("Vinay");
		System.out.println("get Updated thread Name "+s1.getName());
		
		s1.start();
		try {
			s1.join();// waits till s1 dies or terminates
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s2.start();
		s3.start();
		
	}

}
