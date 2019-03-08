package com.java.learning.completeJava.threads.jvmShutdownHook;

public class TestShutdown {	

	public static void main(String[] args) {

		Runtime r =Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("Now main sleeping.. press ctrl+c to exit");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class MyThread extends Thread{
	public void run() {
		System.out.println("shut down hook task completed");
	}
}
