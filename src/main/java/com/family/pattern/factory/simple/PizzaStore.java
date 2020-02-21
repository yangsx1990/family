package com.family.pattern.factory.simple;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/21 下午5:06
 * @modified By:
 */
public class PizzaStore {

    private SimpleFactory simpleFactory;

    PizzaStore(SimpleFactory factory){
        this.simpleFactory=factory;
    }

    public  AbstractPizza orderPizza(Integer type){
        AbstractPizza pizza=simpleFactory.create(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
