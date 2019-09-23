package com.acrabsoft.design.Iterator;

/**
 * 优点 1、它支持以不同的方式遍历一个聚合对象。
 * 
 * 2、迭代器简化了聚合类。
 * 
 * 3、在同一个聚合上可以有多个遍历。
 * 
 * 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 
 * 缺点 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
 * 
 * 五、模式使用场景 1、访问一个聚合对象的内容而无须暴露它的内部表示。
 * 
 * 2、需要为聚合对象提供多种遍历方式。
 * 
 * 3、为遍历不同的聚合结构提供一个统一的接口。
 * 
 * @author Administrator
 *
 */
public class MainMenu {
	TelevisionMenu tvMenu;
	FilmMenu filmMenu;

	public MainMenu(TelevisionMenu tvMenu, FilmMenu filmMenu) {
		super();
		this.tvMenu = tvMenu;
		this.filmMenu = filmMenu;
	}

	public void printMenu() {
		Iterator tvIterator = tvMenu.createIrerator();
		Iterator filmIterator = filmMenu.createIrerator();

		System.out.println("电视节目有:");
		printMenu(tvIterator);
		System.out.println("----------------------------------------------------------------");
		System.out.println("电影节目有:");
		printMenu(filmIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print("channe:" + menuItem.getChanne() + ",  ");
			System.out.print("name:" + menuItem.getName() + ",  ");
			System.out.println("description :" + menuItem.getDescription());
		}
	}

}
