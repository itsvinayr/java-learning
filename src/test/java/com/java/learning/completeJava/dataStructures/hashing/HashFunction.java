package com.java.learning.completeJava.dataStructures.hashing;

import java.util.Arrays;

public class HashFunction {

	String[] theArray;
	int arraySize;
	int itemsInArray = 0;

	HashFunction(int size) {
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}

	public void hashFunction1(String[] stringsForArray, String[] theArray) {
		for (int i = 0; i < stringsForArray.length; i++) {
			String newElementVal = stringsForArray[i];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}

	// Now let's say we have to hold values between 0 & 999
	// but we never plan to have more than 15 values in all.
	// It wouldn't make sense to make a 1000 item array, so
	// what can we do?

	// One way to fit these numbers into a 30 item array is
	// to use the mod function. All you do is take the modulus
	// of the value versus the array size

	// The goal is to make the array big enough to avoid
	// collisions, but not so big that we waste memory

	public void hashFunction2(String[] stringsForArray, String[] theArray) {

		for (int n = 0; n < stringsForArray.length; n++) {

			String newElementVal = stringsForArray[n];

			// Create an index to store the value in by taking
			// the modulus

			int arrayIndex = Integer.parseInt(newElementVal) % 29;

			System.out.println("Modulus Index= " + arrayIndex + " for value " + newElementVal);

			// Cycle through the array until we find an empty space

			while (theArray[arrayIndex] != "-1") {

				++arrayIndex;

				System.out.println("Collision Try " + arrayIndex + " Instead");

				// If we get to the end of the array go back to index 0

				arrayIndex %= arraySize;

			}

			theArray[arrayIndex] = newElementVal;

		}

	}

	// Returns the value stored in the Hash Table

	public String findKey(String key) {

		// Find the keys original hash key
		int arrayIndexHash = Integer.parseInt(key) % 29;

		while (theArray[arrayIndexHash] != "-1") {

			if (theArray[arrayIndexHash] == key) {

				// Found the key so return it
				System.out.println(key + " was found in index " + arrayIndexHash);

				return theArray[arrayIndexHash];

			}

			// Look in the next index

			++arrayIndexHash;

			// If we get to the end of the array go back to index 0

			arrayIndexHash %= arraySize;

		}

		// Couldn't locate the key

		return null;

	}

	public void displayTheStack() {

		int increment = 0;

		for (int m = 0; m < 3; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (theArray[n].equals("-1"))
					System.out.print("|      ");

				else
					System.out.print(String.format("| %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

		}

	}

}
