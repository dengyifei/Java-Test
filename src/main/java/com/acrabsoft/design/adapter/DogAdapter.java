package com.acrabsoft.design.adapter;

/**
 * 学狗机器人
 * @author efei
 *
 */
public class DogAdapter implements Roboot{

	private Dog dog ;
	
	public DogAdapter(Dog dog) {
		super();
		this.dog = dog;
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		dog.wang();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		dog.run();
	}

}
