package com.acrabsoft.design.factory.store;

import com.acrabsoft.design.factory.product.Pizza;
import com.acrabsoft.design.factory.simple.SimplePizzaFactory;

public class SimplePizzaStore {
	SimplePizzaFactory simplePizzaFactory;

	public SimplePizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza() {
		Pizza p = simplePizzaFactory.createPizza("china");
		p.box();
		return p;
	}

}
