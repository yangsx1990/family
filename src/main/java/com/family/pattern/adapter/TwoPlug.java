package com.family.pattern.adapter;

public class TwoPlug implements Target{

    private Charge charge=new Charge();
    @Override
    public void insertAndCharging() {
        System.out.println("两孔插头开始充电……");
        charge.charging();
    }
}
