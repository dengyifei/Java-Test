package com.acrabsoft.design.builder;

public class KFCWaiter {
	private MealBuilder builder;

	public void setBuilder(MealBuilder builder) {
		this.builder = builder;
	}
	
	public Meal getMeal() {
		builder.builderDrink();
		builder.builderFood();
		return builder.getMeal();
	}
	

}
