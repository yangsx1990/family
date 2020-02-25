package com.family.pattern.factory.abstractFactory;

import com.family.pattern.factory.simple.AbstractPizza;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/25 上午11:17
 * @modified By:
 */
public class CheesePizza extends AbstractPizza {

    IngredientFactory ingredientFactory;

    CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    void prepare(){
        ingredientFactory.createCheese();
        System.out.println("cheesePizza 开始准备制作……");
    }
}
