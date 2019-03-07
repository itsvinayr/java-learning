package com.java.learning.completeJava.sorting.insertionSort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] list = {5,8,1,6,9,2};
		int [] sortedList = insertionSort(list);
		printList(sortedList);
	}
	
	public static int[] insertionSort(int[] list) {
		int i,j,key,temp;
		for(i=1; i<list.length; i++) {
			key=list[i];
			j=i-1;
			while(j>=0 && key<list[j]) {
				temp=list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
				j--;
			}
		}
		return list;
	}
	
	public static void printList(int[] list) {
		for(int i: list)
			System.out.print(i+"\t");
	}

}
