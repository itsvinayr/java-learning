package com.java.learning.completeJava.problemStatements.stacks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuesPushOperationCostly {

	public static void main(String[] args) {
		
		//push operation costly
		
		StackQueue stack = new StackQueue();
		stack.push(12);
		stack.push(7);
		stack.push(43);
		stack.push(1);
		stack.push(34);
		
		stack.printStack();
		
		stack.pop();
		
		stack.printStack();
		
	}

}

class StackQueue{
	Queue<Integer> q1, q2;
	int size;
	public StackQueue() {
		q1= new LinkedList<Integer>();
		q2= new LinkedList<Integer>();
		size=0;
	}
	public void push(int x) {
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		Queue<Integer> temp = q1;
		q1=q2;
		q2=temp;
	}
	public void pop() {
		if(q1.isEmpty()) {
			return;
		}
		q1.remove();
		
	}
	
	public void printStack() {
		Iterator<Integer> it = q1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
