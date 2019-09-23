package com.acrabsoft.design.visitor;

public class MedicineB extends Medicine{

	public MedicineB(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

}
