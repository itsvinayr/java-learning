package com.java.learning.completeJava.problemStatements;

import org.testng.annotations.Test;

public class Numbers {
  @Test
  public void secondHighestNumber() {
	  int arr[] = { 14, 46, 47, 45, 92, 52, 48, 36, 66, 85 };
	  printArray(arr);
	  int largest = arr[0];
	  int secondLargest = arr[0];
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i]>largest) {
			  secondLargest = largest;
			  largest = arr[i];
		  }else if(arr[i]>secondLargest){
			  secondLargest = arr[i];
		  }
	  }
	  System.out.println("Highest number is "+largest);
	  System.out.println("Second Largest number is "+secondLargest);
  }
  
  @Test
  public void testArmstrongNumber() {
	  int number = 153;
	  int temp = number;
	  int sum = 0, a;
	  while(number>0) {
		  a=number%10;
		  number=number/10;
		  sum = sum+(a*a*a);
	  }
	  if(temp==sum) {
		  System.out.println("Its an armstrong number");
	  }else {
		  System.out.println("Its just a number");
	  }
  }
  
  public void printArray(int[] array) {
	  for(int a: array)
		  System.out.print(a+"\t");
	  System.out.println();
  }
}
