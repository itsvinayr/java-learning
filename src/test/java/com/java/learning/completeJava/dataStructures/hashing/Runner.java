package com.java.learning.completeJava.dataStructures.hashing;

public class Runner {

	public static void main(String[] args) {

		HashFunction hf = new HashFunction(30);
		String[] elementsToAdd = {"1", "5", "17", "21", "26"};
		hf.hashFunction1(elementsToAdd, hf.theArray);
		hf.displayTheStack();
	}

}
