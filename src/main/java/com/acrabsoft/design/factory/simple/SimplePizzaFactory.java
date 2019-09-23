package com.acrabsoft.design.factory.simple;

import com.acrabsoft.design.factory.product.ChinaPizza;
import com.acrabsoft.design.factory.product.Pizza;
import com.acrabsoft.design.factory.product.USAPizza;

/**
 * <p>
 * 优点 1、简单工厂模式实现了对责任的分割，提供了专门的工厂类用于创建对象。
 * 
 * 2、客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可，对于一些复杂的类名，通过简单工厂模式可以减少使用者的记忆量。
 * 
 * 3、通过引入配置文件，可以在不修改任何客户端代码的情况下更换和增加新的具体产品类，在一定程度上提高了系统的灵活性。
 * 
 * <p>
 * 缺点 1、由于工厂类集中了所有产品创建逻辑，一旦不能正常工作，整个系统都要受到影响。
 * 
 * 2、使用简单工厂模式将会增加系统中类的个数，在一定程序上增加了系统的复杂度和理解难度。
 * 
 * 3、系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，在产品类型较多时，有可能造成工厂逻辑过于复杂，不利于系统的扩展和维护。
 * 
 * 4、简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * 
 * <p>
 * 简单工厂模式的使用场景 1、 工厂类负责创建的对象比较少。
 * 
 * 2、 客户端只知道传入工厂类的参数，对于如何创建对象不关心。
 *
 */
public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		if (type.equals("china")) {
			return new ChinaPizza();
		}
		if (type.equals("USA")) {
			return new USAPizza();
		} else {
			return null;
		}
	}

}
