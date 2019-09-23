package com.acrabsoft.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体目标接口
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	private List<Observer> observers = new ArrayList<>();
	
	private float tempterature;
	private float pressure;
	private float humidity;
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(tempterature, humidity, pressure);
		}
	}
	
	public void measurementChanged(){
		notifyObserver();
	}
	
	 public void setMeasurements(float temperature,float humidity,float pressure) {
		 this.tempterature = temperature;
		 this.humidity = humidity;
		 this.pressure = pressure;
		 measurementChanged();
	 }

}
