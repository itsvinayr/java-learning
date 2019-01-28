package com.java.learning.completeJava.dataStructures.stack.integer;

public class IntStack {
	
	private int[] stack;
	private int top;
	private int size;
	
	public IntStack() {
		top = -1;
		size = 50;
		stack = new int[size];
	}
	
	public  IntStack(int size) {
		top = -1;
		size = this.size;
		stack = new int[size];
	}
	
	public boolean isFull() {
		return (top == stack.length);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
			return true;
		}else {
			return false;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			return stack[top--];
		}else {
			return 0;
		}
	}

}
