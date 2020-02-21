package com.family.pattern.proxy.version.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 业务类的拦截器
 * @author: yangsaixing
 * @date: Created in 2020/2/19 上午9:47
 * @modified By:
 */
public class UserMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("拦截器拦截前："+method.getName());
        Object object=proxy.invokeSuper(obj,args);  //invokeSuper而非invoke
        System.out.println("拦截器拦截后:"+method.getName());
        return object;
    }
}
