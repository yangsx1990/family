package com.family.concurrent;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/21 下午2:34
 * @modified By:
 */
public class ReentrantTest {

    private static Object object=new Object();
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (object){
                        System.out.println("enter the first layer lock,threadName:"+Thread.currentThread().getName());
                        /*try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }*/
                        synchronized (object){
                            System.out.println("enter the second layer lock,threadName:"+Thread.currentThread().getName());

                        }

                    }
                }
            });
            thread.start();
        }

    }
}
