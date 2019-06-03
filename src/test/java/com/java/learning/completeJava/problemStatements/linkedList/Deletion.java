package com.java.learning.completeJava.problemStatements.linkedList;

public class Deletion {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addSequentially(30);
		list.addSequentially(3);		
		list.addSequentially(11);
		list.addSequentially(17);
		list.addSequentially(23);
		list.addSequentially(19);
		
		list.print();
		//delete head of the list
		list.delete(30);
		list.print();
		//deleting any element inside list
		list.delete(17);
		list.print();
		//deleting entire linked list
		list.deleteLinkedList();
		list.print();
		
	}

}
