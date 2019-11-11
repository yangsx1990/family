package com.family.pattern.adapter;

public class ThreePlug implements Target {

    private Charge charge=new Charge();
    @Override
    public void insertAndCharging() {
        System.out.println("三孔插头开始充电……");
        charge.charging();
    }
}
