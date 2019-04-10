package com.java.learning.completeJava.problemStatements;

import org.testng.annotations.Test;

public class RemoveWhiteSpaces {
	@Test
	public void replaceWhiteSpacesUsingReplaceAll() {
		String str1 = "Saket Saurav        is a QualityAna    list";
		String str2 = str1.replaceAll("\\s", "");
		System.out.println(str2);
	}

	@Test
	public void replaceWhiteSpaces() {
		String str1 = "Saket Saurav        is a QualityAna    list";
		char[] charArray = str1.toCharArray();
		String str2 = "";
		for(int i=0; i<charArray.length; i++) {
			if((charArray[i]!=' ') && (charArray[i]!='\t')) {
				str2=str2+charArray[i];
			}
		}
		System.out.println(str2);
	}
}
