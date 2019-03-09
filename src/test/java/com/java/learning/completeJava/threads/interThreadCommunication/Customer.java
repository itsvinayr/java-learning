package com.java.learning.completeJava.threads.interThreadCommunication;

public class Customer {
	
	int amount;
	
	Customer(int amount){
		this.amount=amount;
	}
	
	synchronized void withdraw(int withDrawAmount) {
		System.out.println("Going to withdraw.. ");
		
		if(amount<withDrawAmount) {
			System.out.println("less balance, waiting for deposit..");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		amount = amount-withDrawAmount;
		System.out.println("Withdraw completed");
	}
	
	synchronized void deposit(int depositAmount) {
		System.out.println("Going to deposit");
		amount = amount+depositAmount;
		System.out.println("Deposit completed");
		notify();
	}

}
