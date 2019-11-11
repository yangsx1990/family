package com.family.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:15 2019/8/15
 */
public class ConcreteSubject implements Subject {
    List<Observer> list=new ArrayList<>();
    private int version;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:list){
            observer.update(version);
        }
    }

    public void publish(){
        version++;
        notifyObserver();
    }
}
