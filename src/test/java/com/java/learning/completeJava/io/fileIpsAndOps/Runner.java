package com.java.learning.completeJava.io.fileIpsAndOps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\io\\io.txt";
		String stringContent = "The given paragraph discusses about women discrimination.";
		FileOutputStream fout = new FileOutputStream(path);
		byte[] b = stringContent.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("File Output Stream Successful");
		
		FileInputStream fin = new FileInputStream(path);
		int i=0;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
		System.out.println("\nFile Input Stream Successful");
	}

}
