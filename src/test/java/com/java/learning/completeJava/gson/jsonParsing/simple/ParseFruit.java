package com.java.learning.completeJava.gson.jsonParsing.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import io.restassured.path.json.JsonPath;

public class ParseFruit {

	public static void main(String[] args) throws IOException {
		
		String fruitAsString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\test\\java\\com\\java\\learning\\completeJava\\gson\\jsonParsing\\simple\\fruit.json")));
		System.out.println(fruitAsString);
		JsonPath json = new JsonPath(fruitAsString);
		
		// parse json using buffered reader
		Gson gson = new Gson();
		BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")+"\\\\src\\\\test\\\\java\\\\com\\\\java\\\\learning\\\\completeJava\\\\gson\\\\jsonParsing\\\\simple\\\\fruit.json")));
		Fruit fruit = gson.fromJson(reader, Fruit.class);
		System.out.println(fruit);
		
		// parse json using jsonString
		Fruit fruit2 = gson.fromJson(fruitAsString, Fruit.class);
		System.out.println(fruit2);
		
	}

}
