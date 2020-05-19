package com.axel.model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter has been called.");
		throw (new RuntimeException());
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle's setter has been called.");
		//throw (new RuntimeException());
		return name;
	}

}
