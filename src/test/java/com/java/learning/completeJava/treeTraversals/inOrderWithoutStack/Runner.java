package com.java.learning.completeJava.treeTraversals.inOrderWithoutStack;

public class Runner {

	public static void main(String[] args) {

		// Creating binary tree and entering nodes
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.MorrisTraversal(tree.root);

	}

}
