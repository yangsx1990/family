package com.family.pattern.proxy;

import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import com.family.service.impl.AgencyServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:22 2019/7/25
 */
public class JDKProxy implements InvocationHandler{

    //需要代理的目标对象
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        Object invoke = method.invoke(target, args);
        System.out.println("动态代理结束");
        return invoke;
    }

    private Object getJDKProxy(Object targetObject){
        this.target=targetObject;
        //JDK动态代理，只能针对实现了接口的类进行代理。
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        JDKProxy jdkProxy=new JDKProxy();
        //获取代理对象
        AgencyService agencyService=(AgencyService)jdkProxy.getJDKProxy(new AgencyServiceImpl());
        agencyService.queryAgency(new AgencyInfo());

    }
}
