package com.acrabsoft.pattern;

/**
 * 泛型
 * @author efei
 *
 */
public class Pattern {
	public  static void main(String args[]) {
		Pair<Person> p = new Pair<Person>();
		p.setT(new User());
		
		Integer i = new Integer(8);
		
		Pair<Integer> p2 = new Pair<Integer>();
		p2.setT(i);
		add(p2);
		
	}
	
	public static void add(Pair<? extends Number> p) {
		
	}
}

class User extends Person{
	private String name;
	private int age;
	private String sfzh;
}

class Person {
	private String name;
	private int age;	
}

class Pair<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


