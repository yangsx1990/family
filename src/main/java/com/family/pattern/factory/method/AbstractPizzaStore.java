package com.family.pattern.factory.method;

import com.family.pattern.factory.simple.AbstractPizza;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/24 上午10:09
 * @modified By:
 */
public abstract class AbstractPizzaStore {

    public AbstractPizza orderPizza(Integer type){
        AbstractPizza abstractPizza;
        abstractPizza=createPizza(type);
        abstractPizza.bake();
        abstractPizza.cut();
        abstractPizza.box();
        return abstractPizza;
    }

    public abstract AbstractPizza createPizza(Integer type);
}
