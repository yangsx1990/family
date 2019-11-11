package com.family.pattern.observer;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:06 2019/8/15
 */
public class ObserverA implements Observer {
    @Override
    public void update(int version) {
        System.out.println("A update: "+version);
    }
}
