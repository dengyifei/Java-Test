package com.acrabsoft.design.appearance;

public class WatchTvSwtichFacade {
	Light light;
	Television television;
	
	
	
	public WatchTvSwtichFacade(Light light, Television television) {
		this.light = light;
		this.television = television;
	}

	public void on() {
		light.on();
		television.on();
	}
	
	public void off() {
		light.off();
		television.off();
	}

}
