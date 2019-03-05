package com.java.learning.completeJava.dataStructures.binarySearchTree;

public class BinaryTree {
	
	Node root;
	public void addNode(int key, String name) {
		Node newNode = new Node(key,name);
		if(root==null) {
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key<focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode==null) {
						parent.leftChild=newNode;
						return;
					}
				}else {
					focusNode=focusNode.rightChild;
					if(focusNode==null) {
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversalTree(Node focusNode) {
		if(focusNode!=null) {
			inOrderTraversalTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversalTree(focusNode.rightChild);
		}
	}
	
	public void preOrderTraversalTree(Node focusNode) {
		if(focusNode!=null) {
			System.out.println(focusNode);
			preOrderTraversalTree(focusNode.leftChild);
			preOrderTraversalTree(focusNode.rightChild);
		}
	}
	
	public void postOrderTraversalTree(Node focusNode) {
		if(focusNode!=null) {
			postOrderTraversalTree(focusNode.leftChild);
			postOrderTraversalTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public Node findNode(int key) {
		Node focusNode = root;
		while(focusNode.key!=key) {
			if(key<focusNode.key) {
				focusNode = focusNode.leftChild;
			}else {
				focusNode = focusNode.rightChild;
			}
			if(focusNode==null) {
				return null;
			}
		}
		return focusNode;
	}

}
