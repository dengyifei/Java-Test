package com.acrabsoft.design.factory.product;

import com.acrabsoft.design.factory.simple.AbstractPizzaFactory;

/**
 ** 抽象工厂模式
 * @author efei
 *
 */
public class BnanaPizza extends Pizza {
	//原料工厂, 
	AbstractPizzaFactory factory;
	
	
	public BnanaPizza(AbstractPizzaFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ccut() {
		// TODO Auto-generated method stub

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub

	}

}
