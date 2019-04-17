package com.java.learning.completeJava.sorting.mergeSort;

public class MergeSort {
	
	public static void printArray(int[] arr) {
		System.out.println();
		for(int a: arr)
			System.out.print(a+"\t");
		System.out.println();
	}
	
	public static int[] mergesort(int[] arr) {
		
		// control to come out of recursive call
		if(arr.length<=1) {
			return arr;
		}
		
		int midpoint = arr.length/2;
		int[] left = new int[midpoint];
		int[] right;
		
		// check if number of elements in array is even
		if(arr.length%2==0) {
			right = new int[midpoint];
		}else {
			right = new int[midpoint+1];
		}
		
		// fill left and right arrays
		for(int i=0; i<left.length; i++) {
			left[i]=arr[i];
		}
		
		for(int j=0; j<right.length; j++) {
			right[j]=arr[midpoint+j];
		}
		
		// define a result array
		int[] result = new int[arr.length];
		
		// Recursive calls for left and right arrays
		left = mergesort(left);
		right = mergesort(right);
		
		result = merge(left, right);
		
		return result;
		
	}

	// merges left and right array in ascending order
	private static int[] merge(int[] left, int[] right) {
		//merged result array
		int[] result = new int[left.length+right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		// while there are items in either of the array
		while(leftPointer<left.length || rightPointer<right.length) {
			// if there are items in both the arrays
			if(leftPointer<left.length && rightPointer<right.length) {
				// if left item is less than right item
				if(left[leftPointer]<right[rightPointer]) {
					result[resultPointer++]=left[leftPointer++];
				}else {
					result[resultPointer++]=right[rightPointer++];
				}
			// if there are items only in left array
			}else if(leftPointer<left.length) {
				result[resultPointer++]=left[leftPointer++];
			// if there are items only in right array
			}else if(rightPointer<right.length) {
				result[resultPointer++]=right[rightPointer++];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,9,12,1,3,98,43,6,8,100};
		System.out.println("Before sorting : ");
		printArray(arr);
		arr = mergesort(arr);
		System.out.println("After sorting : ");
		printArray(arr);
	}

}
