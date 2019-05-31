package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class Anagram {
	@Test
	public void checkForAnagram() {
		
		isAnagram("dormitory", "dirtyroom");
		
	}
	
	public void isAnagram(String s1, String s2) {
		boolean status = true;
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagrams");
		}else {
			char[] s1Dup = s1.toCharArray();
			for(char c: s1Dup) {
				int index = s2.indexOf(c);
				if(index!=-1) {
					s2 = s2.substring(0, index)+s2.substring(index+1, s2.length());
				}else {
					System.out.println("not anagrams");
					status = false;
					break;
				}
			}
			if(status) {
				System.out.println("They are anagrams");
			}
		}
	}
}
