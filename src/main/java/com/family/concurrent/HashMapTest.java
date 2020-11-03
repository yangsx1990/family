package com.family.concurrent;

import java.util.HashMap;
import java.util.UUID;

/**
 * @description: hashmap put 死循环测试
 * @author: yangsaixing
 * @date: Created in 2020/10/26 下午2:24
 * @modified By:
 */
public class HashMapTest {

    public static void main(String[] args) throws InterruptedException {
       /* HashMap<String,String> map=new HashMap<>(2);
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100000 ; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(),"");
                        }
                    },"ftf"+i).start();
                }
            }
        },"ftf");
        t.start();
        t.join();*/


       Thread t1=new Thread(new Runnable() {
           @Override
           public void run() {
               synchronized (Test.class){
                   System.out.println("first thread:"+Test.str);
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });

       t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Test.class){
                    System.out.println("second thread:"+Test.str);
                }
            }
        });
        t2.start();
        t2.join();
        System.out.println("completed!!!");
    }
}
