package com.java.learning.completeJava.problemStatements.amazon;
import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] arr1= {1,3,4,5};
		int n1=arr1.length;
		int[] arr2= {2,4,6,8,10,12,14};
		int n2=arr2.length;
		
		int[] arr3= new int[n1+n2];
		
		merge(arr1,arr2,n1,n2,arr3);
		
		System.out.println(Arrays.toString(arr3));
		
	}

	private static void merge(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		
		int i=0, j=0, k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else {
				arr3[k++]=arr2[j++];
			}
		}
		
		while(i<n1) {
			arr3[k++]=arr1[i++];
		}
		
		while(j<n2) {
			arr3[k++]=arr2[j++];
		}
		
	}

}
