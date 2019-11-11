package com.family.pattern.observer;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:17 2019/8/15
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.addObserver(new ObserverA());
        concreteSubject.addObserver(new ObserverB());
        concreteSubject.publish();
    }
}
