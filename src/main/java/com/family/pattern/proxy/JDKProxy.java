package com.family.pattern.proxy;

import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import com.family.service.impl.AgencyServiceImpl;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
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

    /**
     * 获取代理对象
     * @param targetObject 目标对象
     * @return
     */
    public Object getJDKProxy(Object targetObject){
        this.target=targetObject;
        //JDK动态代理，只能针对实现了接口的类进行代理。
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        saveProxyFile();
        JDKProxy jdkProxy=new JDKProxy();
        //获取代理对象
        AgencyService agencyService=(AgencyService)jdkProxy.getJDKProxy(new AgencyServiceImpl());
        //执行代理对象的方法
        AgencyInfo agencyInfo=new AgencyInfo();
        agencyInfo.setId(11);
        agencyService.queryAgency(agencyInfo);

    }

    private static void saveProxyFile(String... filePath) {
        filePath=new String[]{"/Users/yangsaixing/Documents/project/family/target/classes/com/family/pattern/proxy/"};
        if (filePath.length == 0) {
            System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        } else {
            FileOutputStream out = null;
            try {
                byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", AgencyServiceImpl.class.getInterfaces());
                out = new FileOutputStream(filePath[0] + "$Proxy0.class");
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
