package com.family.concurrent;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * 信号量
 */
public class SemaphoreTest<T> {
    private final Set<T> set;

    private final Semaphore semaphore;

    public SemaphoreTest(int bound) {
        this.set = Collections.synchronizedSet(new HashSet<T>());
        this.semaphore = new Semaphore(bound);
    }

    public boolean add(T o) throws InterruptedException {
        semaphore.acquire();
        boolean status=false;
        try{
            System.out.println("添加："+o);
            status=set.add(o);
            return status;
        }finally {
            //添加失败，释放信号量
            if(!status){
                semaphore.release();
            }
        }
    }

    public boolean remove(Object o){
        boolean status=false;
        try{
            System.out.println("删除："+o);
            status=set.remove(o);
            return status;
        }finally {
            if(status){
                semaphore.release();
            }
        }

    }

    public Set<T> getSet() {
        return set;
    }

    public static void main(String[] args) {
        SemaphoreTest<String> sets = new SemaphoreTest<String>(2);
        try {
            sets.add("a");
            sets.add("b");
            //sets.add("c");
            System.out.println(sets.getSet());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    sets.add("a");
                    sets.add("b");
                    sets.add("c");
                    System.out.println(sets.getSet());
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(9000);
                    sets.remove("a");
                    System.out.println(sets.getSet());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        thread1.start();
        thread2.start();*/
    }
}
