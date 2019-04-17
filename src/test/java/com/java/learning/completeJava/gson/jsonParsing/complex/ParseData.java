package com.java.learning.completeJava.gson.jsonParsing.complex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class ParseData {

	public static void main(String[] args) throws IOException {
		
		String dataAsString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\test\\java\\com\\java\\learning\\completeJava\\gson\\jsonParsing\\complex\\data.json")));
		System.out.println(dataAsString);
		
		Gson gson = new Gson();
		Data data = gson.fromJson(dataAsString, Data.class);
		System.out.println("printing question ... "+data.q.question);

	}

}
