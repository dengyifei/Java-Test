package com.acrabsoft.design.builder;

/**
 * 制造者模式
 * 制造器抽象类
 * @author efei
 *
 */
public abstract class MealBuilder {
	Meal meal = new Meal();
	
	public abstract void builderFood();
	
	public abstract void builderDrink(); 

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	
}
