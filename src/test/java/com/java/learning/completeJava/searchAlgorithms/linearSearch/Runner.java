package com.java.learning.completeJava.searchAlgorithms.linearSearch;

public class Runner {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,8,9};
		int x = 1;
		findElement(arr, x);
		
		
	}
	
	public static boolean findElement(int[] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(element==arr[i]) {
				System.out.println(element+ " found at index "+i);
				return true;
			}
		}
		System.out.println("Element not found in the array");
		return false;
	}

}
