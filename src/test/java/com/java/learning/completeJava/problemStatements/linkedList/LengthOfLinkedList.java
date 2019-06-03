package com.java.learning.completeJava.problemStatements.linkedList;

public class LengthOfLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addSequentially(30);
		list.addSequentially(3);		
		list.addSequentially(11);
		list.addSequentially(17);
		list.addSequentially(23);
		list.addSequentially(19);
		
		System.out.println(list.length());
		System.out.println(list.lengthByRecursion());

	}

}
