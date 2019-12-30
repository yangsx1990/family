package com.family.basic.extend;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/26 下午5:33
 * @modified By:
 */
public class SecondClass extends AbstractFirstClass {

    @Override
    public void add() {
        super.add();
    }

    @Override
    public void offer() {
        System.out.println("这是SecondClass的offer实现");
    }

    public static void main(String[] args) {
        new SecondClass().add();
    }
}
