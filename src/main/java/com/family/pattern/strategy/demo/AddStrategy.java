package com.family.pattern.strategy.demo;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:33 2019/8/16
 */
public class AddStrategy implements IStrategy {
    @Override
    public int calc(int num1, int num2) {
        return num1+num2;
    }
}
