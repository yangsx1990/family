package com.family.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/10/20 下午4:21
 * @modified By:
 */
public class TestLambda {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.forEach(e->{
            System.out.println(list.size());
        });


        //栈中的变量，存储的是对字符串常量池中的"abc"的引用地址
        String a="abc";
        //在堆中创建一个对象，存储的是对字符串常量池中的"abc"的引用，然后在栈中的引用变量指向这个对象
        String b=new String("abc");
        String c=new String("abc");
        String d=b;
        String f="abc";
        //intern方法直接返回"abc"常量的引用
        String e=new String("abc").intern();

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(b==d);
        System.out.println(a==f);
        System.out.println(e==a);
    }
}
