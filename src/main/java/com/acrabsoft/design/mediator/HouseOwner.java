package com.acrabsoft.design.mediator;

public class HouseOwner extends Person{

	public HouseOwner(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void constact(String msg) {
		mediator.constact(msg, this);
	}
	public String getMsg() {
		return "xxx";
	}
}
