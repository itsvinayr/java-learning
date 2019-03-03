package com.java.learning.completeJava.dataStructures.doubleLinkedList;

public class MyDoubleLinkedList {
	
	Node head;
	Node tail;
	
	public MyDoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.previous = null;
		
		if(head!=null) {
			head.previous = newNode;
		}
		head = newNode;		
	}
	
	public void insertAtIndex(int index, int data) {
		if(isEmpty()) {
			return;
		}else {
			Node newNode = new Node(data);
			Node n = head;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			newNode.previous = n;
			newNode.next = n.next;
			n.next.previous = newNode;
			n.next = newNode;
		}
	}
	
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		Node n = head;
		while(n!=null) {
			tail = n;
			n = n.next;
		}
		newNode.next = null;
		newNode.previous = tail;
		tail.next = newNode;		
	}
	
	public void deleteAtIndex(int index) {
		Node node = head;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		Node prev = node.previous;
		Node next = node.next;
		
		prev.next = next;
		next.previous = prev;
	}
	
	public void show() {
		Node node = head;
		Node last = null;
		System.out.println("Traversal in forward direction");
		while(node!=null) {
			System.out.print(node.data+" ");
			last = node;
			node = node.next;
		}
		System.out.println();
		
		System.out.println("Traversal in reverse direction");
		while(last!=null) {
			System.out.print(last.data+" ");
			last = last.previous;
		}
	}

}
