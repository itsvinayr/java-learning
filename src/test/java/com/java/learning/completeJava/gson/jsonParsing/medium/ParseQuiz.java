package com.java.learning.completeJava.gson.jsonParsing.medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ParseQuiz {

	public static void main(String[] args) throws FileNotFoundException {
		Gson gson = new Gson();
		BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\java\\learning\\completeJava\\gson\\jsonParsing\\medium\\quiz.json")));
		Quiz quiz = gson.fromJson(reader, Quiz.class);
		System.out.println(quiz);
	}

}
