package com.family.pattern.factory.simple;

/**
 * @description: 抽象pizza
 * @author: yangsaixing
 * @date: Created in 2020/2/21 下午4:59
 * @modified By:
 */
public abstract class AbstractPizza {

    String name;


    public void cut(){
        System.out.println("pizza 切片");
    }

    public void box(){
        System.out.println("pizza 装盒");
    }

    public void bake(){
        System.out.println("pizza 烘烤");
    }
}
