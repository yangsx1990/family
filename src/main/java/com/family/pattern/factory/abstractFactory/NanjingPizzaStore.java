package com.family.pattern.factory.abstractFactory;

import com.family.pattern.factory.method.AbstractPizzaStore;
import com.family.pattern.factory.simple.AbstractPizza;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/25 上午11:21
 * @modified By:
 */
public class NanjingPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(Integer type) {
        System.out.println("nanjing pizza store");
        AbstractPizza pizza;

        IngredientFactory factory=new BeijingIngredientFactory();
        if(type==1){
            return new CheesePizza(factory);
        }
        return null;
    }
}
