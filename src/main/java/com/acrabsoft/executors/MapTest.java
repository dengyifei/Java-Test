package com.acrabsoft.executors;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Random;

/**
 * 测试hashMap linkedhasMap
 * 
 * Map的数据存储接口早期版本使用的是数组+链表 接口存储. 这种方式在大数据情况下，查询遍历效率不高。
 * jdk1.8 之后使用红黑树结构，也就是二叉树结构，有利于遍历查询。
 * 
 * 注意在大数据情况下，注意设置Map 的初始化大小，避免频繁resize
 * @author efei
 *
 */
public class MapTest {
	
	// HashMap是无序，key只允许一个null
	//private HashMap<String,Object> map = new HashMap<>(49);
	
	// LinkedHashMap 是 HashMap的子类，先进先出并有序，可以通过设置 accessOrder =true,来按访问顺讯排序。
	//private LinkedHashMap<String,Object> map = new LinkedHashMap<>();
	
	//TreeMap 是用来排序元素使用，不允许key为null，可以设置比较器进行排序，默认安装自然顺序排序。 添加速度少许会慢
	private Map<String,Object> map = new TreeMap<>();
	
	private static int NUMTH = 30;
	private static int num=100000000;
	
	
	public void hashMapPut() {
		long start = System.currentTimeMillis();
		HashMap<Integer,User> map = new HashMap<>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("hashMapPut插入测试:"+(end - start));
	}
	
	public void linkedHashMapPut() {
		long start = System.currentTimeMillis();
		LinkedHashMap<Integer,User> map = new LinkedHashMap<>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("LinkedHashMap插入测试:"+(end - start));		
	}
	
	public void treeMapPut() {
		long start = System.currentTimeMillis();
		TreeMap<Integer,User> map = new TreeMap<>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("TreeMap插入测试:"+(end - start));		
	}
	
	
	public void hashMapRead() {
		long start = System.currentTimeMillis();
		HashMap<Integer,User> map = new HashMap<Integer,User>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("hashMapPut插入测试:"+(end - start));
		
		Random r = new Random();
		start = System.currentTimeMillis();
		for(int x=0;x<num;x++) {
			User u = map.get(r.nextInt((x+1)));
		}
		end = System.currentTimeMillis();
		System.out.println("hashMap读取测试:"+(end - start));
	}
	
	public void linkedHashMapRead() {
		long start = System.currentTimeMillis();
		LinkedHashMap<Integer,User> map = new LinkedHashMap<Integer,User>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("LinkedHashMap插入测试:"+(end - start));
		
		Random r = new Random();
		start = System.currentTimeMillis();
		for(int x=0;x<num;x++) {
			User u = map.get(r.nextInt((x+1)));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedHashMap读取测试:"+(end - start));
	}
	public void treeMapRead() {
		long start = System.currentTimeMillis();
		TreeMap<Integer,User> map = new TreeMap<Integer,User>();
		for(int x=0;x<num;x++) {
			map.put(x, new User(String.valueOf(x),x));
		}
		long end = System.currentTimeMillis();
		System.out.println("TreeMap插入测试:"+(end - start));
		
		Random r = new Random();
		start = System.currentTimeMillis();
		for(int x=0;x<num;x++) {
			User u = map.get(r.nextInt((x+1)));
		}
		end = System.currentTimeMillis();
		System.out.println("TreeMap读取测试:"+(end - start));
	}
	
	public static void main(String args[]) {
		new MapTest().hashMapPut();
//		new MapTest().linkedHashMapPut();;
//		new MapTest().treeMapPut();;
		
		//new MapTest().hashMapRead();
		//new MapTest().linkedHashMapRead();;
		//new MapTest().treeMapRead();;
		
	}

	
	

}
