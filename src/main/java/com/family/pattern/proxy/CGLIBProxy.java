package com.family.pattern.proxy;


import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import com.family.service.impl.AgencyServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:42 2019/7/25
 */
public class CGLIBProxy implements MethodInterceptor {

    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB动态代理，开始");
        Object invoke=method.invoke(target,objects);
        System.out.println("CGLIB动态代理，结束");
        return invoke;
    }

    /**
     * 定义获取代理对象的方法
     * @param targetObject
     * @return
     */
    public Object getCglibProxy(Object targetObject){
        this.target=targetObject;
        //设置父类
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建并返回代理对象
        Object result=enhancer.create();
        return result;
    }

    public static void main(String[] args) {
        saveProxyFile();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        CGLIBProxy cglibProxy=new CGLIBProxy();
        AgencyService agencyService=(AgencyService)cglibProxy.getCglibProxy(new AgencyServiceImpl());
        agencyService.queryAgency(new AgencyInfo());
    }

    private static void saveProxyFile(String... filePath) {
        filePath=new String[]{"/Users/yangsaixing/Documents/project/family/target/classes/com/family/pattern/proxy/"};
        if (filePath.length == 0) {
            System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        } else {
            FileOutputStream out = null;
            try {
                byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0" , AgencyServiceImpl.class.getInterfaces());
                out = new FileOutputStream(filePath[0] + "$Proxy0CGLIB.class");
                out.write(classFile);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (out != null) {
                        out.flush();
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
