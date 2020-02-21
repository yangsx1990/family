package com.family.pattern.proxy.version.jdk;

import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import com.family.service.impl.AgencyServiceImpl;


/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/1/30 下午4:34
 * @modified By:
 */
public class JDKMain {

    public static void main(String[] args) {
        MyInvocationHandler handler=new MyInvocationHandler();
        //获取代理对象
        AgencyService agencyService=(AgencyService)handler.getJDKProxy(new AgencyServiceImpl());
        //执行代理对象的方法
        agencyService.queryAgency(new AgencyInfo());

    }
}
