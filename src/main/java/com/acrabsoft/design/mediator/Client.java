package com.acrabsoft.design.mediator;

public class Client {
	/**
	 * 优点 1、 简化了对象之间的关系，将系统的各个对象之间的相互关系进行封装，将各个同事类解耦，使系统成为松耦合系统。
	 * 
	 * 2、 减少了子类的生成。
	 * 
	 * 3、 可以减少各同事类的设计与实现。
	 * 
	 * 缺点 由于中介者对象封装了系统中对象之间的相互关系，导致其变得非常复杂，使得系统维护比较困难。
	 * 
	 * 五、 模式适用场景 1、 系统中对象之间存在比较复杂的引用关系，导致他们之间的依赖关系结构混乱而且难以复用该对象。
	 * 
	 * 2、 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MediatorStructure mediator = new MediatorStructure();
		HouseOwner houseOwner = new HouseOwner("张三", mediator);
		mediator.setHouseOwner(houseOwner);
		Tenant tenant = new Tenant("李四", mediator);
		mediator.setTenant(tenant);

		// 中介结构要知道房主和租房者

		tenant.constact("听说你那里有三室的房主出租.....");
		houseOwner.constact("是的!请问你需要租吗?");
	}
}
