package com.acrabsoft.design.bridge;


public abstract class Shape {
	
	Color color;
	
	public void SetColor(Color c) {
		color = c;
	}
	public abstract void draw();
}
