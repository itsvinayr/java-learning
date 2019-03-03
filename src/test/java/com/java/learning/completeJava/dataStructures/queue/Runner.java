package com.java.learning.completeJava.dataStructures.queue;

public class Runner {

	public static void main(String[] args) {

		Queue q = new Queue(5);
		q.enqueue(12);
		q.enqueue(26);
		q.enqueue(17);
		q.enqueue(11);
		q.enqueue(15);
		q.enqueue(22); // queue is full
		q.show();
		
		System.out.println("Element dequeued "+q.dequeue());
		q.show();
		System.out.println("Element dequeued "+q.dequeue());		
		q.show();
		
		q.enqueue(100);
		q.show();
		q.enqueue(200);
		q.show();
		
	}

}
