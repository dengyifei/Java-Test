package com.acrabsoft.executors;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *    <p>并发包下的 Map测试,
 *    在大数据情况下，100000万以上的 ConcurrentHashMap 明显有优势，synchronizedMap、HashTable差不多。
 *    但是ConcurrentHashMap ，早期使用的 sengment 控制并发， sengment数量是 初始化数量，jdk1.8之后使用 Volitate 与 CAS 判断是否最新 来控制安全
 * @author efei
 *
 */
public class ConcurrentMap {
	private static int NUMTH = 30;
	private static int num=10000000;
	private static ConcurrentHashMap<Integer,User> map = new ConcurrentHashMap<>();
	//private static Map<Integer,String> map2 = new HashMap<>();

	private static Map<Integer,User> map2 = Collections.synchronizedMap(new LinkedHashMap<>());
	private static Hashtable<Integer, User> map3= new Hashtable<>();

	//private static ExecutorService es = Executors.newFixedThreadPool(NUMTH);
	private static ExecutorService es = Executors.newCachedThreadPool();
	
	/**
	 *  测试写入
	 * @throws InterruptedException 
	 */
	public void concurrentPutThread() throws InterruptedException {
		CountDownLatch cdl1 = new CountDownLatch(NUMTH);
		long start = System.currentTimeMillis();
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map.put(i, new User(String.valueOf(i),i));
				}
				cdl1.countDown();
			});			
		}
		cdl1.await();
		long end = System.currentTimeMillis();
		
		System.out.println("ConcurrentHashMap写入操作时间："+(end-start)+ ",size="+map.size());
	}
	
	/**
	 *  测试写入
	 * @throws InterruptedException 
	 */
	public void synchronizedMapPutThread() throws InterruptedException {
		CountDownLatch cdl2 = new CountDownLatch(NUMTH);
		long start = System.currentTimeMillis();
		//System.out.println("synchronizedMapPutThread开始时间"+start);
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map2.put(i, new User(String.valueOf(i),i));
				}
				cdl2.countDown();
			});
		}
		cdl2.await();
		long end = System.currentTimeMillis();
		//System.out.println("synchronizedMapPutThread结束时间"+end);
		System.out.println("synchronizedMapPutThread写入操作时间："+(end-start)+ ",size="+map2.size());
	}
	
	public void hastableMapPutThread() throws InterruptedException {
		CountDownLatch cdl3 = new CountDownLatch(NUMTH);
		long start = System.currentTimeMillis();
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map3.put(i, new User(String.valueOf(i),i));
				}
				cdl3.countDown();
			});
		}
		cdl3.await();
		long end = System.currentTimeMillis();
		System.out.println("hastableMapPutThread写入操作时间："+(end-start) + ",size="+map3.size());
	}	
	

	/**
	 *  测试写入
	 * @throws InterruptedException 
	 */
	public void concurrentReadThread() throws InterruptedException {
		CountDownLatch cdl1 = new CountDownLatch(NUMTH);
		Random r = new Random();
		long start = System.currentTimeMillis();
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map.get(r.nextInt(i+1));
				}
				cdl1.countDown();
			});			
		}
		cdl1.await();
		long end = System.currentTimeMillis();
		
		System.out.println("concurrentReadThread读取操作时间："+(end-start)+ ",size="+map.size());
	}
	
	/**
	 *  测试写入
	 * @throws InterruptedException 
	 */
	public void synchronizedMapReadThread() throws InterruptedException {
		CountDownLatch cdl2 = new CountDownLatch(NUMTH);
		Random r = new Random();
		long start = System.currentTimeMillis();
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map2.get(r.nextInt(i+1));
				}
				cdl2.countDown();
			});
		}
		cdl2.await();
		long end = System.currentTimeMillis();
		System.out.println("synchronizedMapReadThread读取操作时间："+(end-start)+ ",size="+map2.size());
	}
	
	public void hastableMapReadThread() throws InterruptedException {
		CountDownLatch cdl3 = new CountDownLatch(NUMTH);
		Random r = new Random();
		long start = System.currentTimeMillis();
		for(int j=0;j<NUMTH;j++) {
			es.submit(()->{
				for(int i=0;i<num;i++) {
					map3.get(r.nextInt(i+1));
				}
				cdl3.countDown();
			});
		}
		cdl3.await();
		long end = System.currentTimeMillis();
		System.out.println("hastableMapReadThread读取操作时间："+(end-start) + ",size="+map3.size());
	}


	
	public static void main(String args[]) throws InterruptedException {
		//MapTest t = new MapTest();
		
		//for(int i=0;i<3;i++) {
			//new ConcurrentMap().hastableMapPutThread();
			new ConcurrentMap().concurrentPutThread();
			//new ConcurrentMap().synchronizedMapPutThread();
			System.out.println("-----");
		//}
		
//		new ConcurrentMap().hastableMapReadThread();
//		new ConcurrentMap().concurrentReadThread();
//		new ConcurrentMap().synchronizedMapReadThread();
		
	
	}

}
