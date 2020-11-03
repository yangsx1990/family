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

    public static void main(String[] args) {
       /* AtomicInteger atomicInteger=new AtomicInteger();
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.incrementAndGet());*/


        AtomicIntegerArray array=new AtomicIntegerArray(10);

        System.out.println(array.incrementAndGet(2));
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
    }
}
