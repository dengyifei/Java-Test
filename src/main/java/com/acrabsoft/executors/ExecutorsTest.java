package com.acrabsoft.executors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * <p>
 * 使用线程池主要 队列OOM ，默认队列是最大值
 * @author efei
 *
 */
public class ExecutorsTest {
	
	
	/**
	 *   这些创建的线程都是无界队列，小心OOM
	 */
	public void newFixedThreadPool() {
		
		Executors.newCachedThreadPool();
		Executors.newFixedThreadPool(3);
		Executors.newSingleThreadExecutor();
	}
	
	//最好用这种方式创建
	public void newFixedThreadPool_2() {
		ExecutorService executorService = new ThreadPoolExecutor(2, 2, 
                0, TimeUnit.SECONDS, 
                new ArrayBlockingQueue<>(512), // 使用有界队列，避免OOM
                new ThreadPoolExecutor.DiscardPolicy());
	}
	
	//获取结果和异常 -- 单个
	public void newFixedThreadPool_3() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Future<Object> f = executorService.submit(new Callable<Object>() {

			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				Thread.sleep(3000);
				throw new RuntimeException("exception in call~"); // 作为结果
			}
			
		});
		
		try {
			Object result = f.get();
			
			System.out.println("222");
			System.out.println(result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}
	//获取多个任务结果
	public void newFixedThreadPool_4() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		CompletionService<Object> ecs = new ExecutorCompletionService<Object>(executorService);
		
		Collection<Callable<Object>> solvers = new ArrayList<>();
		solvers.add(()->{
			Thread.sleep(3000);
			return "sddd";
		});
		solvers.add(()->{
			return "sddd1";
		});
		solvers.add(()->{
			return "sddd2";
		});
		for (Callable<Object> s : solvers)// 提交所有任务
		       ecs.submit(s);
		int n = solvers.size();
		for (int i = 0; i < n; ++i) {// 获取每一个完成的任务
			Object r = ecs.take().get();
		    System.out.println(r);
		}
	}
	
	
	public static void  main(String arsg[]) throws InterruptedException, ExecutionException {
		new ExecutorsTest().newFixedThreadPool_3();
		//new ExecutorsTest().newFixedThreadPool_4();
	}
	
	


}
