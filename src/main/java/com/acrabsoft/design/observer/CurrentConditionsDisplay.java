package com.acrabsoft.design.observer;

public class CurrentConditionsDisplay implements Observer{

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("我看到你的变化");
	}

}
