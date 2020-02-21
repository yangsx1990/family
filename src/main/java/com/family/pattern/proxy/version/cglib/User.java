package com.family.pattern.proxy.version.cglib;

/**
 * @description: 被代理业务类
 * @author: yangsaixing
 * @date: Created in 2020/2/19 上午9:45
 * @modified By:
 */
public class User {

    public final void getId(){
        System.out.println("这是final方法");
    }
    public void getName(String id){
        System.out.println("User方法-获取名称返回:"+id);
    }
}
