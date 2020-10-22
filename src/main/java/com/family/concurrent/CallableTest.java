package com.family.concurrent;

import java.util.concurrent.*;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/14 下午2:51
 * @modified By:
 */
public class CallableTest {

    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        Task task=new Task();
        Future<Integer> result=executor.submit(task);
        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread ing ");

        try {
            System.out.println("result:"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("completed");
    }



}
