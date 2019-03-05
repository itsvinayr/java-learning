package com.java.learning.completeJava.dataStructures.hashing;

public class Runner2 {

	public static void main(String[] args) {

		HashFunction hf = new HashFunction(30);
		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		hf.hashFunction2(elementsToAdd2, hf.theArray);
		hf.findKey("660");
		hf.displayTheStack();
	}

}
