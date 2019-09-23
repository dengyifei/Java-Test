package com.acrabsoft.design.flyweight;



public class Circle extends Shape {
	String color;
	
	
	public Circle(String color) {
		super();
		this.color = color;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("画了一个" + color +"的圆形");
	}

}
