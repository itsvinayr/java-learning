package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class LinkedListProbStatements {
	
	@Test
	public void findMiddleElementOnePass() {
		
		MyLinkedList list = new MyLinkedList();
		list.add(12);
		list.add(27);
		list.add(36);
		list.add(32);
		list.add(109);
		list.add(68);
		
		list.findMiddleElementInOnePass();
		list.reverseList();
		
		list.printList();
		
	}
	
	@Test
	public void reverseList() {
		
		MyLinkedList list = new MyLinkedList();
		list.add(12);
		list.add(27);
		list.add(36);
		list.add(32);
		list.add(109);
		list.add(68);
		
		list.reverseList();
		
		list.printList();
		
	}

}

class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class MyLinkedList{
	Node head;
	public void add(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next=node;
		}
	}
	
	public void findMiddleElementInOnePass() {
		int length = length();
		int middle = length/2;
		Node node = head;
		for(int i=0; i<middle; i++) {
			node=node.next;
		}
		System.out.println("element at middle of the list is "+node.data);
	}
	
	public void reverseList() {
		Node pointer = head;
		Node current, previous = null;
		
		while(pointer!=null) {
			current = pointer;
			pointer = current.next;
			current.next = previous;
			previous = current;
			head = current;
		}
	}
	
	public int length() {
		int length=0;
		Node node = head;
		while(node.next!=null) {
			length++;
			node=node.next;
		}
		return length;
	}
	
	public void printList() {
		Node node = head;
		while(node.next!=null) {
			System.out.print(node.data+"\t");
			node = node.next;
		}
		System.out.print(node.data);
	}
}
