package com.java.learning.completeJava.sorting.mergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public void mergeSort (int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		} 
	}
	
	public void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		int[] L = new int[midIndex - lowIndex + 2];
		
		for (int i = lowIndex; i <= midIndex; i++) {
			L[i - lowIndex] = list[i];
		}
		L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
		int[] R = new int[highIndex - midIndex + 1];
		
		for (int i = midIndex + 1; i <= highIndex; i++) {
			R[i - midIndex - 1] = list[i];
		}
		R[highIndex - midIndex] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		
		for (int k = lowIndex; k <= highIndex; k++) {
			if (L[i] <= R[j]) {
				list[k] = L[i];
				i++;
			}
			else {
				list[k] = R[j];
				j++;
			}
		} 
	}

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int[] A = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
		System.out.println(Arrays.toString(A));
		ms.mergeSort(A, 0, A.length-1);
		System.out.println(Arrays.toString(A));

	}

}
