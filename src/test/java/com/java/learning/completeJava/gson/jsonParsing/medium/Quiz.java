package com.java.learning.completeJava.gson.jsonParsing.medium;

import java.util.List;

public class Quiz {
	
	String question,answer;
	List<String> options;
	
	@Override
	public String toString() {
		return "Quiz [question=" + question + ", answer=" + answer + ", options=" + options.toString() + "]";
	}

}
