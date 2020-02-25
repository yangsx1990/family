package com.family.pattern.factory.method;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/24 上午10:22
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        AbstractPizzaStore abstractPizzaStore=new BeijingPizzaStore();
        abstractPizzaStore.orderPizza(1);
    }
}
