package com.family.pattern.factory.abstractFactory;

import com.family.pattern.factory.method.AbstractPizzaStore;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/25 上午11:27
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore=new NanjingPizzaStore();
        pizzaStore.orderPizza(1);
    }
}
