package com.java.learning.completeJava.threads.priorities;

public class MyThread implements Runnable{
	
	private String name;
	
	MyThread(String name){
		this.name=name;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread -- "+name+" iterating number "+i+
					" priority "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
