package com.family.pattern.strategy.demo;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:34 2019/8/16
 */
public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }

    public int calulate(int a,int b){
        return iStrategy.calc(a,b);
    }
}
