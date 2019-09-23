package com.acrabsoft.design.adapter;

public class CatAdapter implements Roboot {

	private Cat cat;
	
	public CatAdapter(Cat cat) {
		super();
		this.cat = cat;
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		cat.wang();

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		cat.run();
	}

}
