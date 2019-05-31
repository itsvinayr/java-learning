package com.java.learning.completeJava.problemStatements.stacks;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuesPopOperationCostly {

	public static void main(String[] args) {
		StackQueue2 stack = new StackQueue2();
		stack.push(23);
		stack.push(12);
		stack.push(3);
		stack.push(7);
		stack.push(1);
		stack.push(56);
		
		stack.printStack();
		stack.pop();
		stack.printStack();
	}

}

class StackQueue2{
	Queue<Integer> q1,q2;
	public StackQueue2() {
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
	}
	public void push(int x) {
		q1.add(x);
	}
	public void pop() { 
		while(q1.size()!=1) {
			q2.add(q1.peek());
			q1.remove();
		}
		int poppedElement = q1.remove();
		System.out.println("popped element is : "+poppedElement);
		Queue<Integer> temp = q1;
		q1=q2;
		q2=temp;
	}
	public void printStack() {
		Iterator<Integer> it = q1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
