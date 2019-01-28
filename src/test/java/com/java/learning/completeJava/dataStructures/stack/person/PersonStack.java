package com.java.learning.completeJava.dataStructures.stack.person;

public class PersonStack {
	
	private Person[] stack;
	private int top;
	private int size;
	
	public PersonStack(int size) {
		top = -1;
		this.size = size;
		stack = new Person[this.size];
	}
	
	public boolean isFull() {
		return (top==stack.length);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean push(Person person) {
		if(!isFull()) {
			top ++;
			stack[top] = person;
			return true;
		}else {
			return false;
		}
	}
	
	public Person pop() {
		if(!isEmpty()) {
			return stack[top--];
		}else {
			return null;
		}
	}

}
