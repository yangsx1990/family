package com.family.pattern.decorate;

/**
 * @author yangsaixing
 * @description 具体装饰者
 * @date Created in 下午2:43 2019/7/23
 */
public class Mocha extends Decorator {

    //在具体装饰者内部，引用被装饰者的基类，然后在此基础上，进行装饰。
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
