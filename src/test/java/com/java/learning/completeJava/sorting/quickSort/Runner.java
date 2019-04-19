package com.java.learning.completeJava.sorting.quickSort;

public class Runner {

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,8,23,18};
		QuickSort quickSort = new QuickSort(nums);
		quickSort.sort();
		quickSort.showArray();
	}

}
