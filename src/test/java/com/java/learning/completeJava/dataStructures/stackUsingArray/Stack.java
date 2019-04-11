package com.java.learning.completeJava.dataStructures.stackUsingArray;

public class Stack {
	
	final static int MAX = 1000;
	int top;
	int[] arr = new int[MAX];
	
	Stack() {
		top = -1;
	}
	
	boolean push(int element) {
		if(top>=(MAX-1)) {
			System.out.println("Stack is full");
			return false;
		}else {
			arr[++top]=element;
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack is underflowing");
			return 0;
		}else {
			int x = arr[top--];
			return x;
		}
	}

}
