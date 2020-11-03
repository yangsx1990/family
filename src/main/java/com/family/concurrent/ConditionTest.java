package com.family.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/28 上午10:26
 * @modified By:
 */
public class ConditionTest {
    private static ReentrantLock lock=new ReentrantLock();

    private  static int size=0;

    public static void main(String[] args) {
        Condition c1=lock.newCondition();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    lock.lock();
                    while(size<10) {
                        size++;
                        System.out.println("size++:"+size);
                        //Thread.sleep(500);
                        c1.await();
                    }
                    System.out.println("t1 await");
                    c1.signal();
                    System.out.println("t1 continue");

                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }


        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    lock.lock();
                    while(size>0){
                        size--;
                        System.out.println("size--:"+size);
                        //Thread.sleep(500);
                        c1.signal();
                    }
                    c1.await();
                    System.out.println("c1 to be signaled");

                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        });

        t1.start();
        t2.start();

    }
}
