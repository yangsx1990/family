package com.family.pattern.adapter;

public class Test {

    public static void main(String[] args) {
        Target target=new ThreePlug();
        target.insertAndCharging();

        Target target1=new TwoPlug();
        target1.insertAndCharging();
    }
}
