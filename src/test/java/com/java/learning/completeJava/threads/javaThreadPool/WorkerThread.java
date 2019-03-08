package com.java.learning.completeJava.threads.javaThreadPool;

public class WorkerThread implements Runnable{
	
	private String message;
	
	WorkerThread(String message){
		this.message=message;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+" start message= "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()
				+" end ");
	}
	
	private void processMessage() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
