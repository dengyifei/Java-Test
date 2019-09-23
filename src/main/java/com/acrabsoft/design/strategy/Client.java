package com.acrabsoft.design.strategy;

/**
 * 优点 ​ 1、策略模式提供了对“开闭原则”的完美支持，用户可以在不修改原有系统的基础上选择算法或行为，也可以灵活地增加新的算法或行为。
 * 2、策略模式提供了可以替换继承关系的办法。
 * 
 * ​ 3、使用策略模式可以避免使用多重条件转移语句。
 * 
 * 缺点 ​ 1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类。 2、策略模式将造成产生很多策略类，
 * 
 * 五、使用场景 ​ 1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 * 2、一个系统需要动态地在几种算法中选择一种。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String args[]) {
		int arr[] = { 1, 4, 6, 2, 5, 3, 7, 10, 9 };
		int result[];
		ArrayHandler ah = new ArrayHandler();

		Sort sort = new SelectionSort(); // 使用选择排序

		ah.setSortObj(sort); // 设置具体策略
		result = ah.sort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
	}
}
