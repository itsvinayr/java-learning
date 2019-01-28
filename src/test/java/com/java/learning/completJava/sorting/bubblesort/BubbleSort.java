package com.java.learning.completJava.sorting.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] list = {5,8,1,6,9,2};
		int [] sortedList = bubbleSort(list);
		printList(sortedList);
	}
	
	public static int[] bubbleSort(int[] list) {
		if(list.length==0) {
			return null;
		}else {
			for (int i=0; i<list.length; i++) {
				for (int j=0; j<list.length-1-i; j++) { // removing sorted items
					if(list[j]>list[j+1]) {
						int temp;
						temp = list[j];
						list[j]=list[j+1];
						list[j+1]=temp;
					}
				}
			}
			return list;
		}
	}
	
	public static void printList(int[] list) {
		for(int i: list)
			System.out.print(i+"\t");
	}

}
