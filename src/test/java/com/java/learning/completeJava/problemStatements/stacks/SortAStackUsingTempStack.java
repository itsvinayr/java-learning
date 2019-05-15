package com.java.learning.completeJava.problemStatements.stacks;

import java.util.Stack;

public class SortAStackUsingTempStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(6);
		stack.push(9);
		stack.push(3);
		stack.push(5);
		stack.push(8);
		
		Stack<Integer> tempStack = sortstack(stack);
		
		while(!tempStack.isEmpty()) {
			System.out.print(tempStack.pop()+" ");
		}

	}

	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {
			// pop out the first element 
			int tmp = input.pop();

			// while temporary stack is not empty and top of stack is greater than temp 
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				// pop from temporary stack and  
				// push it to the input stack 
				input.push(tmpStack.pop());
			}

			// push temp in tempory of stack 
			tmpStack.push(tmp);
		}
		return tmpStack;
	}

}
