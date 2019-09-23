package com.acrabsoft.design.parse;

public class MulNode extends SymbolNode{

	
	public MulNode(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return left.interpret() * right.interpret();
	}

}
