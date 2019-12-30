package com.family.concurrent.basic;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/13 上午10:12
 * @modified By:
 */
public class JoinTest  {

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest=new ThreadTest();
        threadTest.start();
        System.out.println("开始join");
        threadTest.join();
        System.out.println("结束join");
    }

    public static class ThreadTest extends Thread{

        @Override
        public void run() {
            System.out.println("ThreadTest执行");
        }
    }
}
