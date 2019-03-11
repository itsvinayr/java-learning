package com.java.learning.completeJava.treeTraversals.preOrder;

public class Runner {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(2); 
        tree.iterativePreorder();
		
	}

}
