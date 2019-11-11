package com.family.concurrent;

import java.util.concurrent.Callable;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:06 2019/8/22
 */
public class TestCallable implements Callable<String> {

    private String name;

    TestCallable(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.name;
    }
}
