package com.family.concurrent.basic;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/5 下午3:48
 * @modified By:
 */
public class ThreadTest {

    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            System.out.println("线程1执行");
        }
    }

    public static class Thread2 implements Runnable {

        @Override
        public void run() {
            Thread thread1=new Thread(new Thread1(),"test");
            thread1.run();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程2执行");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Thread1(),"thread1");

        Thread thread2=new Thread(new Thread2(),"thread2");


        thread2.start();
        //thread1.start();
    }
}
