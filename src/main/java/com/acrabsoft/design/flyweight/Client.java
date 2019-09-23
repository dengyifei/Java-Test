package com.acrabsoft.design.flyweight;

/**
 * 优点 ​ 1、享元模式的优点在于它能够极大的减少系统中对象的个数。
 * 
 * ​ 2、享元模式由于使用了外部状态，外部状态相对独立，不会影响到内部状态，所以享元模式使得享元对象能够在不同的环境被共享。
 * 
 * 缺点 ​ 1、由于享元模式需要区分外部状态和内部状态，使得应用程序在某种程度上来说更加复杂化了。
 * 
 * ​ 2、为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。
 * 
 * 五、 模式适用场景 ​
 * 1、如果一个系统中存在大量的相同或者相似的对象，由于这类对象的大量使用，会造成系统内存的耗费，可以使用享元模式来减少系统中对象的数量。
 * 
 * ​ 2、对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape2 = FlyWeightFactory.getShape("灰色");
		shape2.draw();
		Shape shape3 = FlyWeightFactory.getShape("灰色1");
		shape3.draw();
		System.out.println(shape2 == shape3);

	}

}
