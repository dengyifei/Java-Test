package com.acrabsoft.design.memento;

/**
 * 优点 ​ 1、 给用户提供了一种可以恢复状态的机制。可以是用户能够比较方便地回到某个历史的状态。
 * 
 * ​ 2、 实现了信息的封装。使得用户不需要关心状态的保存细节。
 * 
 * 缺点 ​ 消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 * 
 * 五、 模式适用场景 ​ 1、 需要保存一个对象在某一个时刻的状态或部分状态。
 * 
 * ​ 2、
 * 如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问其内部状态，通过负责人可以间接访问其内部状态。
 * 
 * @author efei
 *
 */
public class Client {
	public static void main(String[] args) {
		// 打BOSS之前：血、蓝全部满值
		Role role = new Role(100, 100);
		System.out.println("----------大战BOSS之前----------");
		role.display();

		// 保持进度
		Caretaker caretaker = new Caretaker();
		caretaker.memento = role.saveMemento();

		// 大战BOSS，快come Over了
		role.setBloodFlow(20);
		role.setMagicPoint(20);
		System.out.println("----------大战BOSS----------");
		role.display();

		// 恢复存档
		role.restoreMemento(caretaker.getMemento());
		System.out.println("----------恢复----------");
		role.display();

	}
}
