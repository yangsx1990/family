package com.family.pattern.factory.method;

import com.family.pattern.factory.simple.AbstractPizza;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/24 上午10:12
 * @modified By:
 */
public class BeijingPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(Integer type) {
        if(type==1){
            return new BeijingCheesePizza();
        }else if(type==2){
            return new BeijingVeggiePizza();
        }
        return null;
    }
}
