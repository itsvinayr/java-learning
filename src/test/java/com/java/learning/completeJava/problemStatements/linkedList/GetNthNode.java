package com.java.learning.completeJava.problemStatements.linkedList;

public class GetNthNode {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addSequentially(30);
		list.addSequentially(3);
		list.addSequentially(11);
		list.addSequentially(17);
		list.addSequentially(23);
		list.addSequentially(19);

		list.print();
		// getting nth node sequentially
		System.out.println(list.getNthNode(2));
		System.out.println(list.getNthNode(6));

		// getting nth node recursively
		System.out.println(list.getNthNodeRecursively(list.head, 2));
		System.out.println(list.getNthNodeRecursively(list.head, 6));

		// get nth node from end of the linked list
		System.out.println(list.getNthNodeFromEnd(3));
		System.out.println(list.getNthNodeFromEnd(10));

		// get nth node from end using pointers
		System.out.println(list.getNthNodeFromEndUsingPointers(2));
		System.out.println(list.getNthNodeFromEndUsingPointers(10));

		// get nth node from end recursively
		System.out.println(list.getNthNodeFromEndRecurWrapper(list.head, 2));
		System.out.println(list.getNthNodeFromEndRecurWrapper(list.head, 10));
	}

}
