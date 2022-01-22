package com.innova.databaseHomework.stereotype;

@MultipleAnnotation

public class DatabaseBean {
	private String name = "MySQL";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
