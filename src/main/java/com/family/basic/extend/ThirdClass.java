package com.family.basic.extend;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/26 下午5:35
 * @modified By:
 */
public class ThirdClass extends FirstClass {

    @Override
    public void add() {
        super.add();
    }

    @Override
    public void offer() {
        System.out.println("这是ThirdClass的offer实现");
    }
}
