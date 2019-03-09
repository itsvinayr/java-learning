package com.java.learning.completeJava.threads.synchronization;

public class Table implements Runnable{
	
	private int number;
	
	Table(int number){
		this.number=number;
	}
	
	public synchronized void printTable() {
		for(int i=1; i<=10; i++) {
			System.out.print(number+"*"+i+"="+number*i+"\n");
		}
	}
	
	public void run() {
		printTable();
	}

}
