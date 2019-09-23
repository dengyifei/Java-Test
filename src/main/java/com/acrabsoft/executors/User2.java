package com.acrabsoft.executors;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class User2 implements Delayed {
	private String name;
	private int age;
	private long excuteTime;
	public User2() {

	}
	public User2(String name, int age,long time) {
		super();
		this.name = name;
		this.age = age;
		this.excuteTime = time;
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
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("name=").append(name);
		sb.append("&age=").append(age);
		return sb.toString();
	}
	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		User2 o1 = (User2)o;
		if(o1.age>=age) {
			return -1;
		} else {
			return 1;
		}
	}
	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		return unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
	}

}
