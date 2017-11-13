package com.family.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.*;
import java.io.IOException;

/**
 * @author yangsaixing
 * @description @PostConstruct和@PreDestroy注解
 * @date Created in 上午9:53 2017/11/13
 */
public class Animal {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Animal(){
        System.out.println("构造方法");
        this.id=id;
        this.name=name;
    }
    @PostConstruct
    public void post(){
        System.out.println("这是Animal类中的初始化方法……");
    }

    @PreDestroy
    public void pro(){
        System.out.println("这是Animal类中的销毁前方法……");
    }


    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init方法");

    }

    public void destroy() {
        System.out.println("destroy方法");
    }
}
