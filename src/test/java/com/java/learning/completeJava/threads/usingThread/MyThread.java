package com.java.learning.completeJava.threads.usingThread;

public class MyThread extends Thread{
	
	private String threadName;
	
	MyThread(String threadName){
		this.threadName=threadName;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(threadName+" -- "+i);
			try {
				Thread.sleep(500L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
