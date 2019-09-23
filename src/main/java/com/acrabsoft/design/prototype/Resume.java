package com.acrabsoft.design.prototype;

public class Resume implements Cloneable{
	private String name;
	private int age;
	
	@Override
	protected Object clone()  {
		// TODO Auto-generated method stub
		Resume resume = null;
		try {
			resume = (Resume)super.clone();
		}catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.err.println("Not support cloneable");
		}
		 return resume;
	}
	
	public void display(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}
