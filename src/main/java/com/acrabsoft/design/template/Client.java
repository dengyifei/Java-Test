package com.acrabsoft.design.template;

/**
 * 优点 1、模板方法模式在定义了一组算法，将具体的实现交由子类负责。
 * 
 * 2、模板方法模式是一种代码复用的基本技术。
 * 
 * 3、模板方法模式导致一种反向的控制结构，通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，符合“开闭原则”。 缺点
 * 每一个不同的实现都需要一个子类来实现，导致类的个数增加，是的系统更加庞大。
 * 
 * 五、使用场景 1、 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
 * 
 * 2、 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
 * 
 * 3、控制子类的扩展。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
}
