package com.acrabsoft.design.factory.store;

import com.acrabsoft.design.factory.product.Pizza;

/**
 * <p>
 * 优点 1、 在工厂方法中，用户只需要知道所要产品的具体工厂，无须关系具体的创建过程，甚至不需要具体产品类的类名。
 * 
 * 2、 在系统增加新的产品时，我们只需要添加一个具体产品类和对应的实现工厂，无需对原工厂进行任何修改，很好地符合了“开闭原则”。
 * 
 * <p>
 * 缺点 1、
 * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，是的系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 * 
 * <p>
 * 工厂方法适用场景 
 * 1、一个类不知道它所需要的对象的类。在工厂方法模式中，我们不需要具体产品的类名，我们只需要知道创建它的具体工厂即可。
 * 
 * 2、一个类通过其子类来指定创建那个对象。在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。
 * 
 * 3、将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心是哪一个工厂子类创建产品子类，需要时再动态指定。
 */
public abstract class AbstractPizzaStore {
	public Pizza orderPizza(String type) {
		Pizza p = createPizza(type);
		return p;
	}

	abstract Pizza createPizza(String type);
}
