package com.java.learning.completeJava.dataStructures.doubleLinkedList;

public class Runner {

	public static void main(String[] args) {

		MyDoubleLinkedList list = new MyDoubleLinkedList();
		list.insertAtStart(12);
		list.insertAtStart(5);
		list.insertAtStart(90);
		list.insertAtStart(75);
		list.insertAtStart(15);
		list.insertAtStart(99);
		
		System.out.println("original list ");
		list.show();
		
		list.insertAtIndex(3, 112);
		System.out.println("\nlist after insertion at index 3");
		list.show();
		
		list.insertAtLast(82);
		System.out.println("\nlist after insertion at last");
		list.show();
		
		list.deleteAtIndex(2);
		System.out.println("\nlist after deletion at index 2");		
		list.show();
		
	}

}
