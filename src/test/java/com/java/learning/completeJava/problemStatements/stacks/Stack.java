package com.java.learning.completeJava.problemStatements.stacks;

public class Stack {
	
	private int size;
	private char[] stack;
	private int top;
	
	Stack(int size){
		this.size=size;
		stack = new char[size];
		this.top = -1;
	}
	
	public void push(char item) {
		if(top==-1) {
			stack[++top]=item;
		}else if(top>size) {
			return;
		}
		else {
			stack[++top]=item;
		}
	}
	
	public char pop() {
		return stack[top--];
	}

}
