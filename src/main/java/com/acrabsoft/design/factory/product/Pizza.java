package com.acrabsoft.design.factory.product;

public abstract class Pizza {
	
	//获取原料，从原料工厂获取
	abstract public String prepare();
	
	abstract public void ccut();
	abstract public void box();

	
}
