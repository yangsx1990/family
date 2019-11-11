package com.family.concurrent;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:11 2019/8/23
 */
public class SequenceTest {

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        thread1.run();
        thread2.run();

    }

    static  class Thread1 implements Runnable{
            @Override
            public void run () {
                for(int i=0;i<10;i++){
                    System.out.println("【first】第"+i+"个");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

    }

    static class Thread2 implements Runnable{
        @Override
        public void run () {
            for(int i=0;i<10;i++){
                System.out.println("【second】第"+i+"个");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
