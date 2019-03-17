package com.java.learning.completeJava.searchAlgorithms.binarySearch;

public class Runner {

	public static void main(String[] args) {
		
		BinarySearch b = new BinarySearch();
		
		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int x = 72;
		int n = arr.length;
		
		int result = b.binarySearch(arr, 0, n, x);
		System.out.println(result);
		
	}

}
