package com.family.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁
 * 1-await 阻塞当前线程，等待计数器递减至0后才放行
 * 2-countDown  计数器递减，到0为止
 */
public class CountDownLatchTest {

    public void timeTasks(int nTreads,final Runnable task) throws InterruptedException {
        final CountDownLatch startGate=new CountDownLatch(1);
        final CountDownLatch endGate=new CountDownLatch(nTreads);


        for(int i=0;i<nTreads;i++){
            Thread t=new Thread(){
                public  void run(){

                    try {
                        System.out.println("startGate外等着，"+Thread.currentThread().getName()+",count:"+startGate.getCount());
                        startGate.await();
                        try{
                            task.run();
                        }finally {
                            endGate.countDown();
                            System.out.println("[endGate]减一,"+Thread.currentThread().getName()+",count:"+endGate.getCount());
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            };
            t.start();
        }
        long start=System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end=System.nanoTime();
        System.out.println(end-start);
    }

    public static void main(String[] args) throws InterruptedException {
        new CountDownLatchTest().timeTasks(5, new Runnable() {
            @Override
            public void run() {
                //System.out.println("这是最终要做事情的task……");
            }
        });
    }
}
