package com.java.learning.completeJava.problemStatements.linkedList;

public class Insertion {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addAtFront(1);
		list.addAtFront(2);
		list.addAtFront(3);
		list.addAtFront(4);
		list.addAtFront(5);
		list.addAtFront(6);

		list.addSequentially(23);
		list.addSequentially(12);
		list.addSequentially(13);
		list.addSequentially(78);

		list.print();
		list.addNodeAfter(12, 9);
		list.print();
		list.addNodeAfter(78, 33);
		list.print();
	}

}
