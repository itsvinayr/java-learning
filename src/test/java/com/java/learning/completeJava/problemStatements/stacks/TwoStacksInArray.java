package com.java.learning.completeJava.problemStatements.stacks;

public class TwoStacksInArray {

	public static void main(String[] args) {

		/**
		 * Method 1: One way of doing it is by dividing array into half and assigning
		 * first to one stack and other half to second stack. Pain Point: if one stack
		 * is full, other stack is empty, other stack throws an exception. space
		 * utilization is not efficient.
		 * 
		 * Method 2: stack1 starts at 0 index, stack2 starts at n-1 index. will check
		 * the space between top elements to make sure array space is available or not.
		 */

		TwoStacks stack = new TwoStacks(10);
		stack.push1(1);
		stack.push1(2);
		stack.push1(3);
		stack.push1(4);
		stack.push1(5);
		stack.push2(6);
		stack.push2(7);
		stack.push2(8);
		stack.push2(9);
		stack.push2(10);

		stack.print();

		System.out.println("Popping element from stack 1: " + stack.pop1());

		stack.print();
		stack.push1(11);
		stack.print();

		System.out.println("Popping element from stack 2: " + stack.pop2());

		stack.print();
		stack.push2(12);
		stack.print();
	}

}
