package com.java.learning.completeJava.treeTraversals.inOrder;

import java.util.Stack;

public class BinaryTree {
	
	Node root;
	
	void inorder() {
		if(root==null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		
		// traverse tree
		while(curr!=null || s.size()>0) {
			// Reach left most node of the current Node
			while(curr!=null) {
				// place a pointer to tree node on the stack before traversing the node's left subtree
				s.push(curr);
				curr = curr.left;
			}
			
			// current must be null at this point
			curr=s.pop();
			System.out.println(curr.data+" ");
			
			// we have visited the node and its left subtree. Now its right subtree turn
			curr = curr.right;
		}
	}

}
