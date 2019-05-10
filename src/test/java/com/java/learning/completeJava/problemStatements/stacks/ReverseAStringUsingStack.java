package com.java.learning.completeJava.problemStatements.stacks;

public class ReverseAStringUsingStack {

	public static void main(String[] args) {
		
		/*
		 * ALGORITHM
		 * push each character of a string to stack
		 * pop each character of a string from stack
		 */
		
		String s = "VINAYMADAM";
		Stack stack = new Stack(10);
		char[] charArray = s.toCharArray();
		for(char c: charArray)
			stack.push(c);
		for(int i=0; i<charArray.length; i++)
			System.out.print(stack.pop());
		
	}

}
