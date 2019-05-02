package com.java.learning.completeJava.problemStatements.amazon;

public class BinaryTreeRunner {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		System.out.println("Height of tree "+height(root));
		System.out.println("Complete Level Tree");
		printLevelOrder(root);	
		
		System.out.println();
		System.out.println("Only Left level view");
		printLeftLevelOrder(root);
		
		System.out.println();
		System.out.println("Only Right Level view");
		printRightLevelOrder(root);
		
		System.out.println();
		System.out.println("Printing diameter of Binary Tree "+diameter(root));	
		
	}
	
	public static int diameter(Node root) {
		if(root==null) {
			return 0;
		}else {
			int lh = height(root.left);
			int rh = height(root.right);
			
			int ld = diameter(root.left);
			int rd = diameter(root.right);
			
			return Math.max(lh+rh+1, Math.max(ld, rd));
			
		}
	}
	
	public static void printLevelOrder(Node root) {
		int h = height(root);
		int i;
		for(i=1; i<=h; i++) {
			printLevel(root, i);
		}
	}
	
	public static void printLeftLevelOrder(Node root) {
		int h = height(root);
		int i;
		for(i=1; i<=h; i++) {
			printLeftView(root, i);
		}
	}
	
	public static void printRightLevelOrder(Node root) {
		int h = height(root);
		int i;
		for(i=1; i<=h; i++) {
			printRightView(root, i);
		}
	}
	
	public static void printRightView(Node node, int level) {
		if(node==null) {
			return;
		}else if(level==1) {
			System.out.print(node.item+" ");
		}else if(level>1) {
			printRightView(node.right, level-1);
		}
	}
	
	public static void printLeftView(Node node, int level) {
		if(node==null) {
			return;
		}else if(level==1) {
			System.out.print(node.item+" ");
		}else if(level>1) {
			printLeftView(node.left, level-1);
		}
	}
	
	public static void printLevel(Node node, int level) {
		if(node==null) {
			return;
		}else if(level==1) {
			System.out.print(node.item+" ");
		}else if(level>1) {
			printLevel(node.left, level-1);
			printLevel(node.right, level-1);
		}
	}
	
	public static int height(Node node) {
		if(node==null) {
			return 0;
		}else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			if(lheight>rheight) {
				return lheight+1;
			}else {
				return rheight+1;
			}
		}
	}

}

class Node{
	int item;
	Node left, right;
	Node(int item){
		this.item=item;
	}
}
