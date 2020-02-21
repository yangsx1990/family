package com.family.pattern.factory.simple;

/**
 * @description: 简单工厂（处理产品逻辑）
 * @author: yangsaixing
 * @date: Created in 2020/2/21 下午5:01
 * @modified By:
 */
public class SimpleFactory {


    public AbstractPizza create(Integer type){
        AbstractPizza pizza=null;
        switch (type){
            case 1:
                pizza=new CheesePizza();
                break;
            case 2:
                pizza=new VeggiePizza();
                break;
            default:
                break;

        }
        return pizza;
    }
}
