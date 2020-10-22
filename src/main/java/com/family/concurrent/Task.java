package com.family.concurrent;

import java.util.concurrent.Callable;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/10/14 下午2:55
 * @modified By:
 */
public class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("callable thread enter");
        Thread.sleep(3000);
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=i;
        }
        return sum;
    }
}
