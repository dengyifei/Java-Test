package com.acrabsoft.design.memento;

public class Role {
	private int bloodFlow;
	private int magicPoint;

	public Role(int bloodFlow, int magicPoint) {
		super();
		this.bloodFlow = bloodFlow;
		this.magicPoint = magicPoint;
	}

	public int getBloodFlow() {
		return bloodFlow;
	}

	public void setBloodFlow(int bloodFlow) {
		this.bloodFlow = bloodFlow;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}
	
	public void display() {
		
	}
	
	public Memento saveMemento() {
		return new Memento(getBloodFlow(), getMagicPoint());
	}
	
	public void restoreMemento(Memento memento) {
		this.bloodFlow = memento.getBloodFlow();
        this.magicPoint = memento.getMagicPoint();
	}

}
