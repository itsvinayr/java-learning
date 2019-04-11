package com.java.learning.completeJava.dataStructures.stackUsingLinkedList;

public class Stack {
	
	Node head;
	
	boolean push(int item) {
		Node node = new Node(item);
		if(head==null) {
			head = node;
			return true;
		}else {
			node.next = head;
			head = node;
			return true;
		}
	}
	
	boolean pop() {
		if(head==null) {
			System.out.println("Stack is empty");
			return false;
		}else {
			int popped = head.data;
			head = head.next;
			System.out.println("element popped from stack "+popped);
			return true;
		}
	}
	
	/**
	 * returns top element of the stack
	 * @return
	 */
	int peek() {
		if(head==null) {
			return 0;
		}else {
			return head.data;
		}
	}
	
	void print(){
		Node node = head;
		while(node.next!=null) {
			System.out.print(node.data+"\t");
			node=node.next;
		}
		System.out.println(node.data+"\n");
	}

}
