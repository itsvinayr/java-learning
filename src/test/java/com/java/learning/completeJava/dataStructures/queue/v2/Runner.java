package com.java.learning.completeJava.dataStructures.queue.v2;

public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(200);
		q.enqueue(2);
		q.enqueue(23);
		q.enqueue(12);
		q.enqueue(89);
		
		q.print();
		
		q.dequeue();
		
		q.print();
		
		q.enqueue(8);
		q.enqueue(23);
		
		q.print();
	}

}
