package com.acrabsoft.design.builder;

/**
 * 具体制造器
 * @author Administrator
 *
 */
public class MealA extends MealBuilder {

	@Override
	public void builderFood() {
		// TODO Auto-generated method stub
		meal.setFood("yyy");

	}

	@Override
	public void builderDrink() {
		// TODO Auto-generated method stub
		meal.setFood("yyyy");
	}

}
