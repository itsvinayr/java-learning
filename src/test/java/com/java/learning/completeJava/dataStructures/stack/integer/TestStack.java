package com.java.learning.completeJava.dataStructures.stack.integer;

public class TestStack {

	public static void main(String[] args) {

		IntStack stack = new IntStack();
		stack.push(10);
		stack.push(18);
		stack.push(22);
		stack.push(19);
		stack.push(9);
		stack.push(11);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
