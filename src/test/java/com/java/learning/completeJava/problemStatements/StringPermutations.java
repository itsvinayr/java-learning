package com.java.learning.completeJava.problemStatements;

import org.testng.annotations.Test;

public class StringPermutations {
	
	@Test
	public void printPermutations() {
		String str = "ABC"; 
        int n = str.length();
        permute(str, 0, n-1); 		
	}
	
	private void permute(String str, int l, int r) 
    {
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
	
	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 

}
