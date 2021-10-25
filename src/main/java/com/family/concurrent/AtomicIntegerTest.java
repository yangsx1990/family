package com.family.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/28 下午5:34
 * @modified By:
 */
public class AtomicIntegerTest {

    static int[] value=new int[]{1,2};

    static AtomicIntegerArray atomicIntegerArray=new AtomicIntegerArray(value);

    public static void main(String[] args) {
        System.out.println(atomicIntegerArray.getAndSet(0,3));
        //System.out.println(atomicIntegerArray.addAndGet(0,8));
        System.out.println(value[0]);
        System.out.println(value[1]);
        System.out.println(atomicIntegerArray.get(0));
        System.out.println(value[0]);
       /* AtomicInteger atomicInteger=new AtomicInteger();
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.incrementAndGet());*/


      /*  AtomicIntegerArray array=new AtomicIntegerArray(10);

        System.out.println(array.incrementAndGet(2));
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));*/


    }
}
