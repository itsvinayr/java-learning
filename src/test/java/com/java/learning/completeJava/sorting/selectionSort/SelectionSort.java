package com.java.learning.completeJava.sorting.selectionSort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] list = {5,8,1,6,9,2};
		int [] sortedList = selectionSort(list);
		printList(sortedList);
	}
	
	public static int[] selectionSort(int[] list) {
		int i,j,minValue,minIndex,temp=0;
		for(i=0;i<list.length;i++) {
			minValue=list[i];
			minIndex=i;
			for(j=i;j<list.length;j++) {
				if(list[j]<minValue) {
					minValue=list[j];
					minIndex=j;
				}
			}
			if(minValue<list[i]) {
				temp=list[i];
				list[i]=list[minIndex];
				list[minIndex]=temp;
			}
		}
		return list;
	}
	
	public static void printList(int[] list) {
		for(int i: list)
			System.out.print(i+"\t");
	}

}
