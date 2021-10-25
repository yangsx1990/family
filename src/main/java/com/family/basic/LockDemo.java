package com.family.basic;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:26 2019/10/17
 */
public class LockDemo extends LockSuper{

    public static void main(String[] args) {
        LockDemo subClass=new LockDemo();
        subClass.test();
    }

    public synchronized void test(){
        System.out.println("subClass test--"+Thread.currentThread().getName());
        test1();
    }

    private synchronized void test1() {
        //super.test();
        System.out.println("subClass test1---"+Thread.currentThread().getName());
    }
}
