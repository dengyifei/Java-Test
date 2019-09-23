package com.acrabsoft.design.compose;

public abstract class File {
	private String name;
	
	
	
	public File(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract  void display(); 
}
