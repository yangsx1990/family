package com.family.concurrent;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/19 上午10:30
 * @modified By:
 */
public class YieldTest {

    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("enter sleep");
                    Thread.sleep(5000);
                    System.out.println("main thread yield");
                    Thread.yield();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread1 finished");
            }
        });


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("enter  2 sleep");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 finished");
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("main thread finished");

    }
}
