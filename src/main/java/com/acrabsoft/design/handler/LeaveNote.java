package com.acrabsoft.design.handler;

public class LeaveNote {
	private int number;
	private String person;

	public LeaveNote(int number, String person) {
		super();
		this.number = number;
		this.person = person;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}
