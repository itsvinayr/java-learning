package com.java.learning.completeJava.treeTraversals.postOrder;

import java.util.Stack;

public class BinaryTree {
	
	public Stack<Node> s1, s2;
	
	public void postOrderIterative(Node root) {
		
		// Create two stacks 
        s1 = new Stack<Node>(); 
        s2 = new Stack<Node>(); 
  
        if (root == null) 
            return; 
  
        // push root to first stack 
        s1.push(root); 
  
        // Run while first stack is not empty 
        while (!s1.isEmpty()) { 
            // Pop an item from s1 and push it to s2 
            Node temp = s1.pop(); 
            s2.push(temp); 
  
            // Push left and right children of 
            // removed item to s1 
            if (temp.left != null) 
                s1.push(temp.left); 
            if (temp.right != null) 
                s1.push(temp.right); 
        } 
  
        // Print all elements of second stack 
        while (!s2.isEmpty()) { 
            Node temp = s2.pop(); 
            System.out.print(temp.data + " "); 
        }
		
	}

}
