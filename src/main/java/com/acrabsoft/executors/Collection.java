package com.acrabsoft.executors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 * https://www.jianshu.com/p/63b01b6379fb
 * 
 * arraylist linkedlist  list集合元素存放有序，且可重复
 * hashset linkedHashSet treeSet 集合元素无序，且不可重复
 * 
 * arraylist 适合尾部加入
 * linkedlist 首页加入时间差不多
 *    都不适合 中间加入
 * arraylist 读取速度非常快, 遍历差不多
 * linkedlist 读取数据慢, 遍历差不多
 * 
 * @author efei
 *
 */
public class Collection {
	public static int ITERATION_NUM = 1000000;
	
	/**
	 * arraylist 是有序 先进先出的，允许插入多个null. 线程不安全
	 */
	public void arrayList() {
		List<String> l = new ArrayList<String>();
		l.add("xxx1");
		l.add("xxx1");
		l.add("xxx2");
		l.add(null);
		l.add(null);
		
		l.forEach((X)->{
			System.out.println(X);
		});
		//System.out.println(l);
	}
	
	public void compareFooterPut() {
		
		//填充ArrayList集合：
		long start = System.currentTimeMillis();
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arrayList.add(x);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList尾部插入测试:"+(end - start));
		
		//填充LinkedList集合：
		start = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int x = 0; x < ITERATION_NUM; x++) {
            linkedList.add(x);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList尾部插入测试:"+(end - start));

        
	}
	/**
	 * 测试头部插入
	 */
	public void compareHeaderPut() {
		
		//填充ArrayList集合：
		long start = System.currentTimeMillis();
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arrayList.add(0,x);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList头部插入测试:"+(end - start));
		
		//填充LinkedList集合：
		start = System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int x = 0; x < ITERATION_NUM; x++) {
            linkedList.add(0,x);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList头部插入测试:"+(end - start));

	}	
	public void comparemiddlePut() {
		int INIT_SIZE = 20000;
		int ADD_SIZE=ITERATION_NUM;
		int INDEX = INIT_SIZE/2;
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		int i=0;
		while(i<INIT_SIZE) {
			arrayList.add(i);
			linkedList.add(i);
			i++;
		}
		long start = System.currentTimeMillis();
		for(int x=0;x<ADD_SIZE;x++) {
			arrayList.add(INDEX,x);
		}
		long end = System.currentTimeMillis();
		System.out.println("arrayList中部部插入测试:"+(end - start));
		
		start = System.currentTimeMillis();
		for(int x=0;x<ADD_SIZE;x++) {
			linkedList.add(INDEX,x);
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList中部部插入测试:"+(end - start));
	}
	
	public void randomRead() {
		
		//填充ArrayList集合：
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arrayList.add(x);
		}

		//填充LinkedList集合：
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int x = 0; x < ITERATION_NUM; x++) {
            linkedList.add(x);
        }
        //创建随机数对象：
        Random random = new Random();
        
      //----------------------------------------
        long start = System.currentTimeMillis();
        for(int x = 0; x < ITERATION_NUM; x++) {
        	int i = random.nextInt(x+1);
        	int k = arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("arraylist获取:"+(end - start));
        
      //-------------------太慢---------------------
//        start = System.currentTimeMillis();
//        for(int x = 0; x < ITERATION_NUM; x++) {
//        	int i = random.nextInt(x+1);
//        	int k = linkedList.get(i);
//        }
//        end = System.currentTimeMillis();
//        System.out.println("linkedList获取:"+(end - start));
        
      //----------------------------------------
        start = System.currentTimeMillis();
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()) {
        	it.next();
        }
        for(Integer i: arrayList) {
        	
        }
        end = System.currentTimeMillis();
        System.out.println("arraylist遍历:"+(end - start));
        
        //----------------------------------------
        start = System.currentTimeMillis();
        it = linkedList.iterator();
        while(it.hasNext()) {
        	it.next();
        }
        for(Integer i: linkedList) {
        	
        }
        end = System.currentTimeMillis();
        System.out.println("linkedList遍历:"+(end - start));
	}
	
	
	public void compareset() {
		long start = System.currentTimeMillis();
		ArrayList<Integer> arraylist = new ArrayList<>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			arraylist.add(x);
		}
		long end = System.currentTimeMillis();
		System.out.println("arrayList插入:"+(end - start));
		
		start = System.currentTimeMillis();
		HashSet<Integer> hashset = new HashSet<>();
		for (int x = 0; x < ITERATION_NUM; x++) {
			hashset.add(x);
		}
		end = System.currentTimeMillis();
		System.out.println("hashset插入:"+(end - start));
		
        start = System.currentTimeMillis();
        Iterator<Integer> it = arraylist.iterator();
        while(it.hasNext()) {
        	it.next();
        }

        end = System.currentTimeMillis();
        System.out.println("arraylist遍历:"+(end - start));
        
        
        start = System.currentTimeMillis();
        it = hashset.iterator();
        while(it.hasNext()) {
        	it.next();
        }

        end = System.currentTimeMillis();
        System.out.println("hashset遍历:"+(end - start));		
        System.out.println(hashset.size());
		
	}
	
	public void treeSet() {
		TreeSet<User> treeset = new TreeSet<>();
		treeset.add(new User("efi", 1));
		treeset.add(new User("efi2", 2));
		treeset.add(new User("efi3", 12));
		Iterator<User> it = treeset.iterator();
		while(it.hasNext()) {
			User u = it.next();
			System.out.println(u.getName());
		}
	}
	
	public void linkedHashSet() {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(3);
		set.add(5);
		set.add(2);
		
		for(int x:set) {
			System.out.println(x);
		}
	}
	
	public static void main(String args[]) {
//		new Collection().arrayList();
//		new Collection().compareHeaderPut();
//		new Collection().compareFooterPut();
//		new Collection().comparemiddlePut();
		//new Collection().randomRead();
		//new Collection().compareset();
		//new Collection().treeSet();
		new Collection().linkedHashSet();
		
	}

}
