package com.java.learning.completeJava.jsonParsing.simple;

public class Fruit {
	
	private String fruit,size,color;

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", size=" + size + ", color=" + color + "]";
	}

}
