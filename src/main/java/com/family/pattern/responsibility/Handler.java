package com.family.pattern.responsibility;

/**
 * 职责链-抽象处理者
 */
public abstract class Handler {

    public Handler handler;
    private String name;
    public Handler(String name){
        this.name=name;
    }

    /**
     * 设置下游
     * @param handler
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handle(Integer level);
}
