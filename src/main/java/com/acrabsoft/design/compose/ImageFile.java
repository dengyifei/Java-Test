package com.acrabsoft.design.compose;

public class ImageFile extends File{

	public ImageFile(String name) {
		super(name);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是文本文件，文件名："+this.getName());
	}

}
