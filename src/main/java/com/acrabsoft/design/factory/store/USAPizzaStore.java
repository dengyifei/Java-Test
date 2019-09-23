package com.acrabsoft.design.factory.store;

import com.acrabsoft.design.factory.product.ApplePizza;
import com.acrabsoft.design.factory.product.BnanaPizza;
import com.acrabsoft.design.factory.product.ChinaPizza;
import com.acrabsoft.design.factory.product.Pizza;
import com.acrabsoft.design.factory.simple.ChinaPizzaFactory;
import com.acrabsoft.design.factory.simple.USAPizzaFactory;

public class USAPizzaStore extends AbstractPizzaStore{
	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("apple")) {
			return new ApplePizza(new ChinaPizzaFactory());
		} if(type.equals("banna")) {
			return new BnanaPizza(new USAPizzaFactory());
		} else {
			return new ChinaPizza();
		}
	}

}
