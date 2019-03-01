package com.java.learning.completeJava.dataStructures.linkedList;

public class Runner {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.insert(12);
		list.insert(21);
		list.insert(36);
		list.insertAtStart(29);
		list.insertAt(2, 45);
		list.deleteAt(2);
		
		list.show();
		
	}

}
