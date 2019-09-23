package com.acrabsoft.design.single;

/**
 * 优点 一、节约了系统资源。由于系统中只存在一个实例对象，对与一些需要频繁创建和销毁对象的系统而言，单 例模式无疑节约了系统资源和提高了系统的性能。
 * 
 * 二、因为单例类封装了它的唯一实例，所以它可以严格控制客户怎样以及何时访问它。
 * 
 * 缺点 一、由于单例模式中没有抽象层，因此单例类的扩展有很大的困难。
 * 
 * 二、单例类的职责过重，在一定程度上违背了“单一职责原则”。
 * 
 * 五、模式使用场景 下列几种情况可以使用单例模式。
 * 一、系统只需要一个实例对象，如系统要求提供一个唯一的序列号生成器，或者需要考虑资源消耗太大而只允许创建一个对象。
 * 
 * 二、客户调用类的单个实例只允许使用一个公共访问点，除了该公共访问点，不能通过其他途径访问该实例。
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton uniqueInstance;
	// private static Singleton uniqueInstance = new Singleton();

	// private volatile static Singleton uniqueInstance;

//	static {
//		uniqueInstance =  new Singleton();
//	}
	private Singleton() {
	}

	// 加上synchronized 效率不高.
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
// 配合 volatile
//			synchronized(Singleton.class){
//				if(uniqueInstance == null){ 
//					uniqueInstance  = new Singleton();
//				}
//			}
		}
		return uniqueInstance;
	}

}
