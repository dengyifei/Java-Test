package com.acrabsoft.design.prototype;

/**
 * 原型模式
 * 
 * <p>
 * 优点 
 * 1、如果创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。 ​ 2、可以使用深克隆保持对象的状态。
 * <p>
 * 缺点 
 * ​ 1、原型模式提供了简化的创建结构。 缺点: 1、在实现深克隆的时候可能需要比较复杂的代码。
 * 2、需要为每一个类配备一个克隆方法，而且这个克隆方法需要对类的功能进行通盘考虑，这对全新的类来说不是很难，但对已有的类进行改造时，不一定是件容易的事，必须修改其源代码，违背了“开闭原则”。
 * 
 * <p>
 * 场景:
 *  1、如果创建新对象成本较大，我们可以利用已有的对象进行复制来获得。 1、如果创建新对象成本较大，我们可以利用已有的对象进行复制来获得。​
 * 2、如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占内存不大的时候，也可以使用原型模式配合备忘录模式来应用。相反，如果对象的状态变化很大，或者对象占用的内存很大，那么采用状态模式会比原型模式更好。
 * 3、需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的几个组合状态，通过复制原型对象得到新实例可能比使用构造函数创建一个新实例更加方便。
 * 
 * @author efei
 *
 */
public class PrototypeDemo implements Cloneable {

	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.err.println("Not support cloneable");
		}
		return object;
	}

}
