package com.java.learning.completeJava.dataStructures.binarySearchTree;

public class Runner {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.addNode(50, "Boss");
		tree.addNode(25, "Vice President");
		tree.addNode(15, "Office Manager");
		tree.addNode(30, "Secretary");
		tree.addNode(75, "Sales Manager");
		tree.addNode(85, "Salesman 1");
		
		System.out.println("In Order Traversal ... \n");
		tree.inOrderTraversalTree(tree.root);
		
		System.out.println("Pre Order Traversal ... \n");
		tree.preOrderTraversalTree(tree.root);
		
		System.out.println("Post Order Traversal ... \n");
		tree.postOrderTraversalTree(tree.root);	
		
		System.out.println("Search for 30");
		System.out.println(tree.findNode(30));
		
		System.out.println("Remove Node 25");
		tree.remove(25);
		System.out.println("Pre Order Traversal ... \n");
		tree.preOrderTraversalTree(tree.root);
		
		
	}

}
