package com.family.pattern.proxy.version.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/1/30 下午4:33
 * @modified By:
 */
public class MyInvocationHandler implements InvocationHandler {

    //需要代理的目标对象
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        Object invoke = method.invoke(target, args);
        System.out.println("动态代理结束");
        return invoke;
    }

    public Object getJDKProxy(Object targetObject){
        this.target=targetObject;
        //JDK动态代理，只能针对实现了接口的类进行代理。
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }
}
