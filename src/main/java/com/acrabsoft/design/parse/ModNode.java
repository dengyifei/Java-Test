package com.acrabsoft.design.parse;

public class ModNode extends SymbolNode{

	public ModNode(Node left, Node right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return super.left.interpret() % super.right.interpret();
	}

}
