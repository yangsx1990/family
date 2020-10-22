package com.family.concurrent;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/19 上午10:24
 * @modified By:
 */
public  class Thread2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2 execute");
    }
}
