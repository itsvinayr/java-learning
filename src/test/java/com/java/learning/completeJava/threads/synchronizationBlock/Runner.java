package com.java.learning.completeJava.threads.synchronizationBlock;

public class Runner {

	public static void main(String[] args) {
		
		Table table = new Table(5);
		
		Thread t = new Thread(table);
		t.start();
		Thread t2 = new Thread(table);
		t2.start();
		
	}

}
