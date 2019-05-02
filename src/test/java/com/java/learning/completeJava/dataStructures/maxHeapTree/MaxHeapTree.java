package com.java.learning.completeJava.dataStructures.maxHeapTree;

import java.util.Arrays;

public class MaxHeapTree {

	private int[] heap;
	private int pos;
	private int capacity;

	public MaxHeapTree() {
		pos = 1;
		capacity = 8;
		this.heap = new int[capacity];
	}

	public void insert(int item) {
		if (pos == capacity) {
			System.out.println("Heap is full");
		} else {
			heap[pos++] = item;
			int child = pos - 1;
			int parent = child / 2;
			while (heap[parent] < heap[child] && parent > 0) {
				int temp = heap[parent];
				heap[parent] = heap[child];
				heap[child] = temp;

				child = parent;
				parent = child / 2;
			}
		}
	}

	public int extractMax() {
		return heap[1];
	}

	public void deleteRoot() {
		int current = pos;
		int leaf = --current;
		int rootPos = 1;
		boolean isHeapify = true;
		boolean flag = false;
		
		heap[1] = heap[leaf];
		heap[leaf] = 0;
		
		int root = heap[1];
		
		while (isHeapify) {
			flag = false;
			if (heap[2 * rootPos] > heap[2 * rootPos + 1]) {
				flag = true;
				if (heap[2 * rootPos] > root) {
					
					root = heap[2 * rootPos];
					
					int temp = heap[(2*rootPos)/2];
					heap[(2*rootPos)/2] = heap[2 * rootPos];
					heap[2 * rootPos] = temp;
					
					rootPos = (2 * rootPos);
				}
			} else {
				if (heap[2 * rootPos + 1] > root) {
					
					flag = true;
					root = heap[(2 * rootPos+1)];
					
					int temp = heap[(2*rootPos)/2];
					heap[(2*rootPos)/2] = heap[(2 * rootPos+1)];
					heap[(2 * rootPos+1)] = temp;
					
					rootPos = (2 * rootPos + 1);
				}
			}
			
			if(!flag) {
				isHeapify=false;
				--pos;
			}
		}
	}

	public void print() {
		System.out.println(Arrays.toString(heap));
	}
}
