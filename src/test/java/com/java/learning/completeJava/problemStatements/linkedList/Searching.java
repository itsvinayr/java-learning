package com.java.learning.completeJava.problemStatements.linkedList;

public class Searching {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addSequentially(30);
		list.addSequentially(3);		
		list.addSequentially(11);
		list.addSequentially(17);
		list.addSequentially(23);
		list.addSequentially(19);
		
		list.print();
		
		// searching element linearly
		System.out.println(list.search(19));
		System.out.println(list.search(30));
		System.out.println(list.search(100));
		
		// searching element recursively
		System.out.println(list.searchRecursively(list.head, 11));
		System.out.println(list.searchRecursively(list.head, 19));
		System.out.println(list.searchRecursively(list.head, 100));
		
	}

}
