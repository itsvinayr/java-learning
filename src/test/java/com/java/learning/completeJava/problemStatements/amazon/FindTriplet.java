package com.java.learning.completeJava.problemStatements.amazon;

public class FindTriplet {

	public static void main(String[] args) {
		
		int[] arr = {3,1,4,6,5};
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr.length; k++) {
					int x = arr[i]*arr[i];
					int y = arr[j]*arr[j];
					int z = arr[k]*arr[k];
					if(x==(y+z)||y==(x+z)||z==(x+y)) {
						flag = true;
						System.out.println(arr[i]+"--"+arr[j]+"--"+arr[k]);
					}
				}
			}
		}
		if(!flag) {
			System.out.println("No triplet found");
		}
		
	}

}
