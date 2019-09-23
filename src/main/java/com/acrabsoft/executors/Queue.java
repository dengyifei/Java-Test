package com.acrabsoft.executors;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 *   插入方法	add(o)	offer(o)	put(o)	offer(o, timeout, timeunit)
 *   移除方法	remove(o)	poll()	take(o)	poll(o, timeout, timeunit)
 *   检查方法	element()	peek()	—	—
 *   
 *   
 * @author Administrator
 *
 */
public class Queue {
	private static ExecutorService es = Executors.newCachedThreadPool();
	/**
	 * arrayBlockingQueue 是基于数组的先进先出(FIFO)有界阻塞队列,读写只有一把锁
	 */
	public void arrayBlockingQueue() {
		ArrayBlockingQueue<User> a = new ArrayBlockingQueue<>(10);
		int num =20; 
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
				try {
					a.put(new User("sss", x));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				a.poll();
			}

			
		});
		
		
	}
	
	/**
	 * linkedBlockingQueue 是基于链表的先进先出(FIFO)有界/无界（当容量指定Integer.MAX_VALUE）阻塞队列,读和写的锁是分开的，理论上性能会更好,有更大的吞吐量
	 */
	public void linkedBlockingQueue() {
		LinkedBlockingQueue<User> a = new LinkedBlockingQueue<>(10);
		int num =20; 
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
				try {
					a.put(new User("sss", x));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				a.poll();
			}

			
		});
	} 
	
	/**
	 *   内部和ArrayBlockingQueue 实现结构基本一样，不同的是，不管有无指定长度都会自动扩容，而且是有序队列，插入的元素需要实现Comparable接口。
	 */
	public void priorityBlockingQueue () {
		PriorityBlockingQueue<User> a = new PriorityBlockingQueue<>(10);
		int num =20; 
		Random r = new Random();
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
				a.put(new User(String.valueOf(x), r.nextInt(100)));
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				User u = a.poll();
				System.out.println(u.toString());
			}
		});
	}
	/**
	 *   延时无界阻塞队列，元素需要实现 Delay 接口，可以无限放入，消费根据延时时间，时间到了 就会消费.
	 */
	public void delayQueue () {
		DelayQueue<User2> a = new DelayQueue<>();
		Random r = new Random();
		es.submit(()->{
			a.put(new User2("ss1", r.nextInt(100),5000));
			a.put(new User2("ss2", r.nextInt(100),2000));
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				try {
					User2 u = a.take();
					System.out.println(u.toString());
				}catch (InterruptedException ew) {
					// TODO: handle exception
					ew.printStackTrace();
				}
				
			}

			
		});
	}
	/**
	 * 长度为0的阻塞队列，放入一个元素后该元素没有没有被消费会一直阻塞，直到被消费
	 */
	public void synchronousQueue () {
		SynchronousQueue<User> a = new SynchronousQueue<>();
		int num =20; 
		Random r = new Random();
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
				try {
					a.put(new User(String.valueOf(x), r.nextInt(100)));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				User u = a.take();
				System.out.println(u.toString());
			}
		});
	}
	/**
	 * 类似synchronousQueue，不同的是，该队列是无界队列，阻塞与不阻塞方法可选择
	 */
	public void linkedTransferQueue () {
		LinkedTransferQueue<User> a = new LinkedTransferQueue<>();
		int num =20; 
		Random r = new Random();
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
					a.put(new User(String.valueOf(x), r.nextInt(100)));
//					try {
//						a.transfer(new User(String.valueOf(x), r.nextInt(100)));
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				User u = a.take();
				System.out.println(u.toString());
			}
		});
	}
	/**
	 * 与linkedBlockingQueque 类似，只不过是双向队列， 可以操作头部和尾部节点，可以是先进先出(FIFO) 也可以是先进后出(FILO)
	 */
	public void linkedBlockingDeque() {
		LinkedBlockingDeque<User> a = new LinkedBlockingDeque<>(10);
		int num =20; 
		es.submit(()->{
			for(int x=0;x<num;x++) {
				//boolean b = a.offer(new User("sss", x));
				try {
					a.put(new User("sss", x));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("加入队列:"+x );
			}
			System.out.println(a.size());
			System.out.println("已全部放入队列");
		});
		
		es.submit(()->{
			while(true) {
				Thread.sleep(3000);
				a.poll();
			}

			
		});
		
	}
	/**
	 * ArrayDeque并不是一个固定大小的队列，每次队列满了以后就将队列容量扩大一倍（doubleCapacity()），
	 *   因此加入一个元素总是能成功，而且也不会抛出一个异常。也就是说ArrayDeque是一个没有容量限制的队列。
	 */
	public void  arrayDeque() {
		ArrayDeque<User> d = new ArrayDeque<>();
	}
	
	public static void main(String s[]) {
		//new Queue().arrayBlockingQueue();
		//new Queue().linkedBlockingQueue();
		//new Queue().priorityBlockingQueue();
		//new Queue().delayQueue();
		//new Queue().synchronousQueue();
		new Queue().linkedTransferQueue();
		//new Queue().linkedBlockingDeque();

	}

}
