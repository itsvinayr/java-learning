package com.java.learning.completeJava.threads.groups;

public class MyThread implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
