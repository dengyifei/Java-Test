package com.acrabsoft.design.adapter;

/**
 * <p>优点 1. 将目标类和适配者类解耦，通过使用适配器让不兼容的接口变成了兼容，让客户从实现的接口解耦。
 * 
 * 2. 增加了类的透明性和复用性，将具体的实现封装在适配者类中，对于客户端类来说是透明的，而且提高了适配者的复用性。
 * 
 * 3. 灵活性和扩展性都非常好在不修改原有代码的基础上增加新的适配器类，符合“开闭原则”。
 * 
 *  <P>使用场景
 * 系统需要使用现有的类，而这些类的接口不符合系统的需要。
 * 
 * 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类
 * 
 * @author efei
 *
 */
public class Client {
	public static void main(String args[]) {

		Roboot r = new DogAdapter(new Dog());
		r.cry();
		r.move();

		r = new CatAdapter(new Cat());
		r.cry();
		r.move();
	}
}
