package com.java.learning.completeJava.problemStatements.linkedList;

class LinkedList {

	Node head;
	static int count = 0, data = 0;

	/**
	 * Adding a node at the front
	 * 
	 * @param data
	 */
	public void addAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Adding a node sequentially one after the other
	 * 
	 * @param data
	 */
	public void addSequentially(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/**
	 * Adding a node after nodeData
	 * 
	 * @param nodeData
	 * @param data
	 */
	public void addNodeAfter(int nodeData, int data) {
		Node node = new Node(data);
		Node temp = head;
		Node prev, next;
		while (temp.data != nodeData) {
			temp = temp.next;
		}
		prev = temp;
		next = temp.next;
		prev.next = node;
		node.next = next;
	}

	/**
	 * Delete a node with data
	 * 
	 * @param data
	 */
	public void delete(int data) {
		if (head.data == data) {
			head = head.next;
		} else {
			Node temp = head;
			Node prev = null;
			while (temp.data != data) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
		}
	}

	/**
	 * Delete entire linked list
	 */
	public void deleteLinkedList() {
		head = null;
	}

	/**
	 * find length of linked list
	 * 
	 * @return
	 */
	public int length() {
		int count = 0;
		Node node = head;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	/**
	 * get length of linked list by recursions
	 * 
	 * @return
	 */
	public int lengthByRecursion() {
		return getLengthByRecursion(head);
	}

	private int getLengthByRecursion(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + getLengthByRecursion(node.next);
		}
	}

	/**
	 * searching an element in linked list
	 * 
	 * @param data
	 * @return
	 */
	public boolean search(int data) {
		if (head.data == data) {
			return true;
		} else {
			Node node = head;
			while (node != null) {
				if (node.data == data)
					return true;
				node = node.next;
			}
			return false;
		}
	}

	/**
	 * searching linked list recursively
	 * 
	 * @param head
	 * @param data
	 * @return
	 */
	public boolean searchRecursively(Node head, int data) {
		if (head == null) {
			return false;
		}
		if (head.data == data) {
			return true;
		}
		return searchRecursively(head.next, data);
	}

	/**
	 * Getting nth node for given index
	 * 
	 * @param index
	 * @return
	 */
	public int getNthNode(int index) {
		int nodeIndex = index + 1;
		int count = 0;
		Node node = head;
		while (node != null) {
			count++;
			if (count == nodeIndex) {
				return node.data;
			}
			node = node.next;
		}
		System.out.println("Node not found for specified index");
		return 0;
	}

	/**
	 * recursively getting nth node
	 * 
	 * @param head
	 * @param index
	 * @return
	 */
	public int getNthNodeRecursively(Node head, int index) {
		int count = 0;
		if (count == index) {
			if (head == null) {
				System.out.println("Element not found at index");
				return 0;
			}
			return head.data;
		}
		return getNthNodeRecursively(head.next, index - 1);
	}

	/**
	 * getting nth node from end of the list - using length-index
	 * 
	 * @param index
	 * @return
	 */
	public int getNthNodeFromEnd(int index) {
		int length = length();
		int nodeIndex = length - index;
		int count = 0;
		Node node = head;
		while (node != null) {
			count++;
			if (count == nodeIndex) {
				return node.data;
			}
			node = node.next;
		}
		System.out.println("Node not found at nth index");
		return 0;
	}

	/**
	 * get nth node from end using pointers
	 * 
	 * @param index
	 * @return
	 */
	public int getNthNodeFromEndUsingPointers(int index) {
		Node mainPointer = head;
		Node refPointer = head;
		int count = 0;

		if (head != null) {
			while (count <= index) {
				if (refPointer.next == null) {
					System.out.println("Node not found at specified index");
					return 0;
				}
				refPointer = refPointer.next;
				count++;
			}
			while (refPointer != null) {
				refPointer = refPointer.next;
				mainPointer = mainPointer.next;
			}
			return mainPointer.data;
		} else {
			return 0;
		}
	}

	/**
	 * getting nth node from end of the list recursively
	 * @param head
	 * @param index
	 * @return
	 */
	public void getNthNodeFromEndRecur(Node head, int index) {
		if (head == null) {
			return;
		}
		getNthNodeFromEndRecur(head.next, index);
		++count;
		if(count==index)
			data=head.data;
	}
	
	/**
	 * wrapper to call Nth node from last recursively
	 * @param head
	 * @param index
	 * @return
	 */
	public int getNthNodeFromEndRecurWrapper(Node head, int index) {
		count=0; data=0;
		getNthNodeFromEndRecur(head, index);
		if(data==0) {
			System.out.println("Node not found at nth index");
		}
		return data;
	}

	/**
	 * Print linked list
	 */
	public void print() {
		if (head == null) {
			System.out.println("Linked List deleted");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.print(temp.data + "\n");
		}
	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
