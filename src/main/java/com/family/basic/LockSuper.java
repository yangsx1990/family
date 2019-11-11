package com.family.basic;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:26 2019/10/17
 */
public class LockSuper {

    public synchronized void test(){
        System.out.println("super test---"+Thread.currentThread().getName());
    }
}
