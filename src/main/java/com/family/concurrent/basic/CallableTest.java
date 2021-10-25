package com.family.concurrent.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/5 下午5:43
 * @modified By:
 */
public class CallableTest implements Callable<String> {
    private  int count=20;
    @Override
    public String call() throws Exception {
        for (int i = count; i >0 ; i--) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return "sale out";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String>  callable=new CallableTest();
        FutureTask<String> futureTask=new FutureTask<>(callable);
        Thread mThread=new Thread(futureTask);
        Thread mThread2=new Thread(futureTask);
        Thread mThread3=new Thread(futureTask);
//		mThread.setName("hhh");
        mThread.start();
        mThread2.start();
        mThread3.start();
        System.out.println(futureTask.get());
    }
}
