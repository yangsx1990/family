package com.family.pattern.decorate;

/**
 * @author yangsaixing
 * @description 装饰者抽象类
 * @date Created in 下午2:38 2019/7/23
 */
public abstract class Decorator extends Beverage{

    //所有装饰者必须重写该方法，方便打印做了哪些装饰
    public abstract String getDesc();

}
