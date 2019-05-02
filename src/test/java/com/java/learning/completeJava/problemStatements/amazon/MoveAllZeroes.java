package com.java.learning.completeJava.problemStatements.amazon;
import java.util.Arrays;

public class MoveAllZeroes {

	public static void main(String[] args) {
		
		int[] num = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		System.out.println(Arrays.toString(num));
		int count = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i]!=0) {
				num[count++]=num[i];
			}
		}
		
		while(count<num.length) {
			num[count++]=0;
		}
		
		System.out.println(Arrays.toString(num));		
	}

}
