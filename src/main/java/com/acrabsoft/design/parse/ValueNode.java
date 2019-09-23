package com.acrabsoft.design.parse;

public class ValueNode extends Node{

	private int value;
	
	public ValueNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return value;
	}

}
