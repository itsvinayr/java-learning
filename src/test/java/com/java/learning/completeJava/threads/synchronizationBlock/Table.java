package com.java.learning.completeJava.threads.synchronizationBlock;

public class Table implements Runnable {

	private int number;

	Table(int number) {
		this.number = number;
	}

	public void printTable() {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				System.out.print(number + "*" + i + "=" + number * i + "\n");
			}

		}
	}

	public void run() {
		printTable();
	}

}
