package com.family.pattern.observer;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:04 2019/8/15
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
