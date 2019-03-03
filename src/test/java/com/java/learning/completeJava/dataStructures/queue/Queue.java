package com.java.learning.completeJava.dataStructures.queue;

public class Queue {
	
	public int queue[];
	public int front, rear, size, queueSize;
	
	public Queue(int queueSize) {
		this.queueSize = queueSize;
		queue = new int[queueSize];
		front = 0;
		rear = 0;
		size = 0;		
	}
	
	public void enqueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % queueSize;
			size++;
		} else {
			System.out.println("Queue is full");
		}
	}
	
	public int dequeue() {
		System.out.println();
		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % queueSize;
			size--;
		}else {
			System.out.println("Queueu is empty");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==queueSize;
	}
	
	public void show() {
		System.out.println();
		for(int i=0; i<size; i++) {
			System.out.print(queue[(front+i)%queueSize]+" ");
		}
		System.out.println();
		System.out.println("Printing Queue");
		for(int n: queue) {
			System.out.print(n+" ");
		}
	}

}
