package com.java.learning.completeJava.treeTraversals.postOrder;

public class Runner {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		// Let us construct the tree 
        // shown in above figure 
  
        Node root = null; 
        root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
  
        tree.postOrderIterative(root); 
		
	}

}
