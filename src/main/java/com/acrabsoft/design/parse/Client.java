package com.acrabsoft.design.parse;

/**
 * 优点 ​ 1、 可扩展性比较好，灵活。
 * 
 * ​ 2、 增加了新的解释表达式的方式。
 * 
 * ​ 3、 易于实现文法。
 * 
 * 缺点 ​ 1、 执行效率比较低，可利用场景比较少。
 * 
 * ​ 2、 对于复杂的文法比较难维护。
 * 
 * 五、 模式适用场景 ​ 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 * 
 * ​ 2、一些重复出现的问题可以用一种简单的语言来进行表达。
 * 
 * ​ 3、文法较为简单。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		String statement = "3 * 2 * 4 / 6 % 5";
		c.build(statement);
		int result = c.compute();
		System.out.println(statement + " = " + result);
	}
}
