package com.family.pattern.responsibility;

/**
 * 职责链第二级别处理类
 */
public class SecondLevel extends Handler {

    public SecondLevel(String name) {
        super(name);
    }

    @Override
    public void handle(Integer level) {
        if(level==2){
            System.out.println("level级别"+level+"，SecondLevel已处理。");
        }else{
            System.out.println("level级别"+level+"，SecondLevel无法处理，交给下游。");
            super.handler.handle(level);
        }
    }
}
