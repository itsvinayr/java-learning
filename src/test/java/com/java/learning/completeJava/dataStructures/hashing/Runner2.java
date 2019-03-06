package com.java.learning.completeJava.dataStructures.hashing;

public class Runner2 {

	public static void main(String[] args) {

		HashFunction theFunc = new HashFunction(31);

		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };

		// Demonstrate how data normally follows patterns and how
		// a non-prime sized array can cause havoc

		String[] elementsToAdd3 = { "30", "60", "90", "120", "150", "180",
				"210", "240", "270", "300", "330", "360", "390", "420", "450",
				"480", "510", "540", "570", "600", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };

		theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

		// theFunc.modThirty();

		theFunc.increaseArraySize(60);

		theFunc.displayTheStack();

		theFunc.fillArrayWithNeg1();

		theFunc.doubleHashFunc(elementsToAdd2, theFunc.theArray);

		theFunc.displayTheStack();

		theFunc.findKeyDblHashed("990");
	}

}
