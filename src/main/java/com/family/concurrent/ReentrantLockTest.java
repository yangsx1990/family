package com.family.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/21 上午11:18
 * @modified By:
 */
public class ReentrantLockTest {
    private static int count=0;
    static Lock lock=new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"ing");
                    try{
                        lock.lock();
                        count++;
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }

                    System.out.println("");
                }
            });
            thread.start();
        }


        Thread.sleep(5000);

        System.out.println(count);


    }
}
