package com.family.pattern.decorate;

/**
 * @author yangsaixing
 * @description  装饰模式的超类
 * @date Created in 下午2:36 2019/7/23
 */
public abstract class Beverage {
    String desc="default coffee";
    public String getDesc(){
        return desc;
    }
    public abstract double cost();
}
