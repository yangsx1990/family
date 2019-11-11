package com.family.pattern.responsibility;

/**
 * 职责链-第一级别处理类
 */
public class FirstLevel extends Handler {


    public FirstLevel(String name) {
        super(name);
    }

    @Override
    public void handle(Integer level) {
        if(level==1){
            System.out.println("level级别"+level+"，FirstLevel已处理。");
        }else{
            System.out.println("level级别"+level+"，FirstLevel无法处理，交给下游。");
            super.handler.handle(level);
        }
    }
}
