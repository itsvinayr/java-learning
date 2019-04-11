package com.java.learning.completeJava.dataStructures.stackUsingLinkedList;

public class Runner {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(23);
		s.push(2);
		s.push(3);
		s.push(7);
		s.push(9);
		s.push(0);
		s.push(1);
		
		s.print();
		
		s.pop();
		System.out.println(s.peek());
		
		s.print();
		
	}

}
