package com.java.learning.completeJava.dataStructures.stackUsingArray;

public class Runner {
	/*
	Pros: Easy to implement. Memory is saved as pointers are not involved.
	Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.
	*/

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(2);
		s.push(3);
		s.push(9);
		s.push(0);
		s.push(23);
		s.push(4);
		
		System.out.println(s.pop()+"\n"+s.pop());
		
	}

}
