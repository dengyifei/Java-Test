package com.acrabsoft.design.visitor;

public class MedicineA extends Medicine{

	public MedicineA(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

}
