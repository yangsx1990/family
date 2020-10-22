package com.family.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/21 上午10:10
 * @modified By:
 */
public class NotifyOrderTest {

    private static Object lock=new Object();

    private static List<String> waitingList=new ArrayList<>();
    private static List<String> notifyList=new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        /*try {
            new Test().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for(int i=0;i<50;i++){
            String name=Integer.toString(i);
            new Thread(()->{
                synchronized (lock){
                    String threadName=Thread.currentThread().getName();
                    System.out.println("thread "+threadName+"wait for");
                    waitingList.add(threadName);
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread"+threadName+"awake");
                    notifyList.add(threadName);

                }
            },name).start();

            //Thread.sleep(50);
            TimeUnit.MILLISECONDS.sleep(50);
        }

        TimeUnit.SECONDS.sleep(1);
        for (int i = 0; i <50 ; i++) {
            synchronized (lock){
                lock.notify();
            }
            //TimeUnit.MILLISECONDS.sleep(10);
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("wait order:"+waitingList.toString());
        System.out.println("notify order"+notifyList.toString());
    }
}
