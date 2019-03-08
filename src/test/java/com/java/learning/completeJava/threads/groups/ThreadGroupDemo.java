package com.java.learning.completeJava.threads.groups;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		MyThread t= new MyThread();
		ThreadGroup tg = new ThreadGroup("amq");
		Thread t1 = new Thread(tg, t, "one");
		Thread t2 = new Thread(tg, t, "two");
		Thread t3 = new Thread(tg, t, "three");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Thread Group Name : "+tg.getName());
		tg.list();
	}

}
