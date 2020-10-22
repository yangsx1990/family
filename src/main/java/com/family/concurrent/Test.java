package com.family.concurrent;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午2:46 2019/7/28
 */
public class Test {
    public static void main(String[] args) {
       /* int a=10;
        int b = 2 + a--;
        int c = 8 + --a;


        System.out.println(b+";"+c);*/

       //System.gc();

       ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
       threadLocal.set(1);
       System.gc();
    }
}
