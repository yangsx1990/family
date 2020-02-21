package com.family.pattern.factory.simple;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/21 下午5:12
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        PizzaStore store=new PizzaStore(simpleFactory);

        AbstractPizza pizza=store.orderPizza(1);

        pizza=store.orderPizza(2);
    }
}
