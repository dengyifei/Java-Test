package com.acrabsoft.concurrent;

/**
 * 并发编程可见性测试
 */
public class VisibileTest {

    private boolean flag = true;

    private  int count;

    private void test1()  {
        System.out.println(Thread.currentThread().getName() + "开始执行.....");
        while (flag){
            count++;
            // UnsafeFactory.getUnsafe().storeFence(); //插入一个内存屏障，所以跳出循环
            // System.out.println(count++); // 会跳出循环，因为out有同步代码块
            // Thread.yield(); 会跳出循环，因为上下文切换

//            try {
//                Thread.sleep(1); // 会跳出循环，因为 插入内存屏障
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            // 以下两种方法不可控。
            //shortWait(1000*100); // 跳出循环，缓存失效。
            //shortWait(1); // 不跳出



        }
        System.out.println(Thread.currentThread().getName() + "结束执行....."+count);
    }

    private void test2(){
        flag = false;
        System.out.println(Thread.currentThread().getName() + "修改flag:"+flag);
    }

    public static void main(String[] args) throws InterruptedException {
        VisibileTest visibileTest = new VisibileTest();
        new Thread(()->{
                visibileTest.test1();
        }).start();
        Thread.sleep(1000);
        new Thread(()->{
            visibileTest.test2();
        }).start();
    }

    public static void shortWait(long interval) {
        long start = System.nanoTime();
        long end;
        do {
            end = System.nanoTime();
        } while (start + interval >= end);
    }
}
