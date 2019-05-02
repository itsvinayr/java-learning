package com.java.learning.completeJava.dataStructures.maxHeapTree;

public class Runner {

	public static void main(String[] args) {
		MaxHeapTree tree = new MaxHeapTree();
		tree.insert(12);
		tree.insert(7);
		tree.insert(6);
		tree.insert(10);
		tree.insert(8);
		tree.insert(20);

		tree.print();

		tree.deleteRoot();

		tree.print();

		tree.deleteRoot();

		tree.print();

		tree.deleteRoot();

		tree.print();
	}

}
