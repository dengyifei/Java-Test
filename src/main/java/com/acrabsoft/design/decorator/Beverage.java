package com.acrabsoft.design.decorator;

/**
 * 抽象组件
 * @author Administrator
 *
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
