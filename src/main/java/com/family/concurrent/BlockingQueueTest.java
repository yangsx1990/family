package com.family.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:22 2019/8/22
 */
public class BlockingQueueTest {

    public static void main(String[] args) {
        AtomicInteger count=new AtomicInteger();
        int corePoolSize=1;
        int maximumPoolSize=3;
        long keepAliveTime=10;
        TimeUnit timeUnit= TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQ=new LinkedBlockingDeque<>();
        ThreadFactory threadFactory= Executors.defaultThreadFactory();
        RejectedExecutionHandler handler=new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        };

        ThreadPoolExecutor pool=new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,timeUnit,workQ,threadFactory,handler);

        for(int i=0;i<6;i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    count.addAndGet(1);
                    System.out.println("count:"+count);

                }
            });
            System.out.println("i="+i+",activeCount="+pool.getActiveCount());
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.toString());
    }
}
