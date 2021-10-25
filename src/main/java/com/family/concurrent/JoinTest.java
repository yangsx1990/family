package com.family.concurrent;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/19 上午10:18
 * @modified By:
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread:"+Thread.currentThread().getName());


        Thread thread2=new Thread(new Thread2());
        thread2.start();

        try {
            thread2.join(1000);
            if(thread2.isAlive()){
                System.out.println("thread2 has not finished");
            }else{
                System.out.println("thread2 has  finished");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(50000);
        System.out.println("main thread finished");

    }


}
