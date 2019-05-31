package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class TreeTraversals {
	
	@Test
	public void treeTraversals() {
		
		MyBinarySearchTree tree = new MyBinarySearchTree();
		tree.add(12);
		tree.add(2);
		tree.add(1);
		tree.add(34);
		tree.add(98);
		tree.add(42);
		tree.add(46);
		tree.add(90);
		tree.add(43);
		tree.add(87);
		tree.add(7);
		
		System.out.println("***** Preorder *****");
		tree.preOrderTreeTraversal(tree.root);
		System.out.println("***** Inorder *****");
		tree.inOrderTreeTraversal(tree.root);
		System.out.println("***** PostOrder *****");
		tree.postOrderTreeTraversal(tree.root);
	}

}

class BSTNode{
	int key;
	BSTNode leftChild;
	BSTNode rightChild;
	
	BSTNode(int key){
		this.key=key;
	}
	
	public String toString() {
		return key+" node element ";
	}
}

class MyBinarySearchTree{
	
	BSTNode root;
	
	public void add(int key) {
		BSTNode node = new BSTNode(key);
		if(root==null) {
			root=node;
		}else {
			BSTNode focusNode = root;
			BSTNode parent;
			while(true) {
				parent = focusNode;
				if(key<focusNode.key) {
					focusNode=focusNode.leftChild;
					if(focusNode==null) {
						parent.leftChild=node;
						return;
					}
				}else {
					focusNode = focusNode.rightChild;
					if(focusNode==null) {
						parent.rightChild=node;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTreeTraversal(BSTNode focusNode) {
		if(focusNode!=null) {
			inOrderTreeTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTreeTraversal(focusNode.rightChild);
		}
	}
	
	public void preOrderTreeTraversal(BSTNode focusNode) {
		if(focusNode!=null) {
			System.out.println(focusNode);
			preOrderTreeTraversal(focusNode.leftChild);
			preOrderTreeTraversal(focusNode.rightChild);
		}
	}
	
	public void postOrderTreeTraversal(BSTNode focusNode) {
		if(focusNode!=null) {
			postOrderTreeTraversal(focusNode.leftChild);
			postOrderTreeTraversal(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
}
