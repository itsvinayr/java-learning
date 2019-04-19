package com.java.learning.completeJava.gson.jsonParsing.bigFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class ParsePerson {

	public static final String FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\java\\learning\\completeJava\\gson\\jsonParsing\\bigFiles\\person.json";
	
	public static void main(String[] args) throws IOException {
		
		InputStream stream = new FileInputStream(new File(FILE_PATH));
		InputStreamReader inputStreamReader = new InputStreamReader(stream, "UTF-8");
		JsonReader reader = new JsonReader(inputStreamReader);
		Gson gson = new GsonBuilder().create();
		
		// Read the file in stream mode
		reader.beginArray();
		while(reader.hasNext()) {
			Person person = gson.fromJson(reader, Person.class);
			System.out.println("Id of the person is "+person.id);
		}
		
		reader.close();
		stream.close();
		
	}

}
