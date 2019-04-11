package com.java.learning.completeJava.dataStructures.queue.v2;

public class Queue {	
	int front,rear;
	final static int MAX = 1000;
	int[] arr = new int[MAX];
	
	Queue(){
		front = 0;
		rear = 0;
	}
	
	public void enqueue(int item) {
		if(rear==0) {
			arr[rear++]=item;
		}else {
			arr[rear++]=item;
		}
		
	}
	
	public void dequeue() {
		int item = arr[front++];
		System.out.println(item + " dequeued ");
	}
	
	public void print() {
		for(int i=front; i<=rear; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
