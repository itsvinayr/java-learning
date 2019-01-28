package com.java.learning.completJava.sorting.bubblesort;

public class OptimizedBubbleSort {

	public static void main(String[] args) {

		int[] list = {1,2,3,4,5,6};
		int [] sortedList = optimizedBubbleSort(list);
		printList(sortedList);	
		
		int[] list2 = {5,8,1,6,9,2};
		int [] sortedList2 = optimizedBubbleSort(list2);
		printList(sortedList2);
	}
	
	public static int[] optimizedBubbleSort(int[] list) {
		if(list.length==0) {
			return null;
		}else {
			int flag = 1;
			for (int i=0; i<list.length && flag==1; i++) {
				flag = -1;
				System.out.println("Entered outerloop ..");
				for(int j=0; j<list.length-1-i; j++) {
					System.out.println("Entered inner loop ..");
					if(list[j]>list[j+1]) {
						int temp;
						temp = list[j];
						list[j]=list[j+1];
						list[j+1]=temp;
						flag = 1;
					}
				}
			}
			return list;
		}
	}
	
	public static void printList(int[] list) {
		for(int i: list) {
			System.out.print(i+"\t");
		}
	}

}
