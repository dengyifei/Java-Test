package com.acrabsoft.executors;

public class User implements Comparable<User> {
	private String name;
	private int age;
	public User() {

	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		if(o.age>=age) {
			return -1;
		} else {
			return 1;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("name=").append(name);
		sb.append("&age=").append(age);
		return sb.toString();
	}

}
