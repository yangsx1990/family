package com.family.pattern.factory.abstractFactory;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/25 上午11:15
 * @modified By:
 */
public class BeijingIngredientFactory implements IngredientFactory {
    @Override
    public void createCheese() {
        System.out.println("这里是BeijingIngredientFactory 创建的cheese");
    }

    @Override
    public void createVeggies() {
        System.out.println("这里是BeijingIngredientFactory 创建的veggies");

    }
}
