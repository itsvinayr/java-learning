package com.java.learning.completeJava.problemStatements.general;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseArray {
	
	@Test
	public void inplace() {
		int[] intArray = {2, 1, 6, 3, 8, 4, 9, 5, 10, 8, 27};
		System.out.println(Arrays.toString(intArray));
		if(intArray==null || intArray.length<2) {
			System.out.println("array is already reversed");
		}else {
			for(int i=0; i<intArray.length/2; i++) {
				int temp = intArray[i];
				intArray[i]=intArray[intArray.length-1-i];
				intArray[intArray.length-1-i]=temp;
			}
		}
		System.out.println(Arrays.toString(intArray));
	}

}
