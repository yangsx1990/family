package com.family.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午11:12 2019/8/22
 */
public class ThreadPoolTest implements Runnable {
    @Override
    public void run() {
        synchronized(this) {
            try{
                System.out.println("线程名称："+Thread.currentThread().getName());
                Thread.sleep(3000); //休眠是为了让该线程不至于执行完毕后从线程池里释放
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        BlockingQueue<Runnable> queues=new LinkedBlockingDeque<>(4);
        ThreadPoolExecutor executor=new ThreadPoolExecutor(1,5,1, TimeUnit.DAYS,queues);

        for(int i=0;i<10;i++){
            executor.execute(new Thread(new ThreadPoolTest()));
            int size=queues.size();
            System.out.println("thread size:"+size);

        }
    }
}
