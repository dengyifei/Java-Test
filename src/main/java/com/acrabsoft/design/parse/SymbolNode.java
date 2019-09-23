package com.acrabsoft.design.parse;

public abstract class SymbolNode extends Node {
	Node left;
	Node right;

	public SymbolNode(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}

}
