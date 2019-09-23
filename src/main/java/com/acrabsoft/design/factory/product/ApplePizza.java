package com.acrabsoft.design.factory.product;

import com.acrabsoft.design.factory.simple.AbstractPizzaFactory;

/**
 ** 抽象工厂模式
 * @author efei
 *
 */
public class ApplePizza extends Pizza {
	
	//原料工厂, 
	AbstractPizzaFactory factory;

	public ApplePizza(AbstractPizzaFactory factory) {
		super();
		this.factory = factory;
		prepare();
	}

	@Override
	public String prepare() {
		// TODO Auto-generated method stub
		
		return factory.createSource();
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
