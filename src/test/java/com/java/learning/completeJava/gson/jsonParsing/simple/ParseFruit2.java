package com.java.learning.completeJava.gson.jsonParsing.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ParseFruit2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Gson gson = new Gson();
		BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+"\\\\src\\\\test\\\\java\\\\com\\\\java\\\\learning\\\\completeJava\\\\gson\\\\jsonParsing\\\\simple\\\\fruit2.json")));
		Fruit[] fruit = gson.fromJson(reader, Fruit[].class);
		System.out.println(fruit.toString());
	}

}
