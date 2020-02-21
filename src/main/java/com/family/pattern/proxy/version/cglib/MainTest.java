package com.family.pattern.proxy.version.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/19 上午9:49
 * @modified By:
 */
public class MainTest {
    public static void main(String[] args) {
        //输出cglib动态代理产生的代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/yangsaixing/Documents/log/cglibProxyClass");
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(User.class);
        enhancer.setCallback(new UserMethodInterceptor());
        User user=(User)enhancer.create();
        user.getName("a");
    }
}
