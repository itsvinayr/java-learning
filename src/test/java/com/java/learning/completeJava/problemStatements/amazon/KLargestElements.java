package com.java.learning.completeJava.problemStatements.amazon;
import java.util.Arrays;

public class KLargestElements {

	public static void main(String[] args) {
		
		int[] array = {1, 23, 12, 9, 30, 2, 50};
		// sort the array
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));		
		// printing k elements
		for(int i=array.length-1; i>=array.length-3; i--) {
			System.out.print(array[i]+"\t");
		}
	}

}
