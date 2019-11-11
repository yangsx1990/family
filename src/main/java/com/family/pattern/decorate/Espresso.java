package com.family.pattern.decorate;

/**
 * @author yangsaixing
 * @description 被装饰者
 * @date Created in 下午2:40 2019/7/23
 */
public class Espresso extends Beverage {
    Espresso(){
        desc="Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
