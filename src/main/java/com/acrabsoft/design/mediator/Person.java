package com.acrabsoft.design.mediator;

public abstract class Person {
	 String name;
	 Mediator mediator;

	public Person(String name, Mediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}

}
