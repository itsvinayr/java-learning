package com.java.learning.completeJava.problemStatements.linkedList;

public class MiddleOfList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addSequentially(30);
		list.addSequentially(3);
		list.addSequentially(11);
		list.addSequentially(17);
		list.addSequentially(23);
		list.addSequentially(19);
		list.addSequentially(72);

		list.print();

		// printing middle of linked list by using even and odd mechanisms
		System.out.println(list.getMiddleOfLinkedList(list.head));

		// printing middle of the linked list using pointers
		list.addSequentially(87);
		System.out.println(list.getMiddleOfLinkedListUsingPointers(list.head));

	}

}
