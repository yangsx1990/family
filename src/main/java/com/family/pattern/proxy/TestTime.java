package com.family.pattern.proxy;

import com.family.service.AgencyService;
import com.family.service.impl.AgencyServiceImpl;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/2/4 上午10:51
 * @modified By:
 */
public class TestTime {
    public static void main(String[] args) {
        JDKProxy jdkProxy=new JDKProxy();
        Long startTime=System.currentTimeMillis();
        for(int i=0;i<10000;i++){

            //获取代理对象
            AgencyService agencyService=(AgencyService)jdkProxy.getJDKProxy(new AgencyServiceImpl());

        }
        Long endTime=System.currentTimeMillis();
        System.out.println("JDK："+(endTime-startTime));
        CGLIBProxy cglibProxy=new CGLIBProxy();
        Long startCTime=System.currentTimeMillis();
        for(int i=0;i<10000;i++){

            //获取代理对象
            AgencyService agencyService=(AgencyService)cglibProxy.getCglibProxy(new AgencyServiceImpl());

        }
        Long endCTime=System.currentTimeMillis();
        System.out.println("CGLIB："+(endCTime-startCTime));
    }
}
