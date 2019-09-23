package com.acrabsoft.design.appearance;

/**
 * 优点 ​ 1、引入外观模式，是客户对子系统的使用变得简单了，减少了与子系统的关联对象，实现了子系统与客户之间的松耦合关系。
 * 
 * ​ 2、只是提供了一个访问子系统的统一入口，并不影响用户直接使用子系统类
 * 
 * ​ 3、降低了大型软件系统中的编译依赖性，并简化了系统在不同平台之间的移植过程
 * 
 * 缺点 ​ 1、不能很好地限制客户使用子系统类，如果对客户访问子系统类做太多的限制则减少了可变性和灵活性
 * 
 * ​ 2、在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”
 * 
 * 五、使用场景 ​ 1、当要为一个复杂子系统提供一个简单接口时可以使用外观模式。
 * 
 * ​ 2、客户程序与多个子系统之间存在很大的依赖性。引入外观类将子系统与客户以及其他子系统解耦，可以提高子系统的独立性和
 * 
 * 可移植性
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light();
		Television television = new Television();

		WatchTvSwtichFacade wt = new WatchTvSwtichFacade(light, television);

		wt.on();
		wt.off();
	}

}
