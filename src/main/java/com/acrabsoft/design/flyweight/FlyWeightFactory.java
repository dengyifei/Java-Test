package com.acrabsoft.design.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
	static  HashMap<String, Shape> shapes = new HashMap<>();
	
	public static Shape getShape(String key) {
		if(shapes.containsKey(key)) {
			return shapes.get(key);
		} else {
			Shape shape = new Circle("red");
			shapes.put(key, shape);
			return shape;
		}
	}

}
