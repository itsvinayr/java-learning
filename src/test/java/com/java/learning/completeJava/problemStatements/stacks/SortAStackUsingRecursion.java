package com.java.learning.completeJava.problemStatements.stacks;

import java.util.Stack;

public class SortAStackUsingRecursion {
	
	public static void sortStack(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int tmp = s.pop();
			sortStack(s);
			insertAtBottom(s,tmp);
		}
	}
	
	public static void insertAtBottom(Stack<Integer> s, int tmp) {
		if(s.isEmpty() || tmp>s.peek()) {
			s.push(tmp);
			return;
		}
		int a = s.pop();
		insertAtBottom(s, tmp);
		s.push(a);
	}

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(100);
		s.push(2);
		s.push(-1);
		s.push(120);
		s.push(8);	
		
		sortStack(s);
		
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}

}
