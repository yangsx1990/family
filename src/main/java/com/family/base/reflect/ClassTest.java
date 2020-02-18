package com.family.base.reflect;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/1/19 上午10:19
 * @modified By:
 */
public class ClassTest {
    public static void main(String[] args) {
        try {
            System.out.println(Class.forName("java.io.Serializable"));
            System.out.println(Class.forName("java.lang.String"));
            Class t = Class.forName("java.lang.Thread");
            System.out.println(t);
            System.out.println(Class.forName("com.family.base.reflect.ClassTest"));
            System.out.println(ClassTest.class);
            System.out.println(new ClassTest().getClass());
            //若找不到该类X 会报错 ClassNotFoundException
            Class t1 = Class.forName("X");
            System.out.println(t1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

     /*   System.out.println(ClassTest.class.getName());
        System.out.println(String.class.getName());
        System.out.println(float.class.getName());
        System.out.println((new int[3]).getClass().getName());
        System.out.println((new int[3][4]).getClass().getName());
        System.out.println((new Object[2]).getClass().getName());*/
        System.out.println(ClassTest.class.getClassLoader());//AppClassLoader
        //System.out.println(String.class.getClassLoader()); //Bootstrap加载器

        System.out.println(ClassTest.class.getClassLoader().getParent());//ExtClassLoader加载器
        System.out.println(ClassTest.class.getClassLoader().getParent().getParent());//Bootstrap加载器

      /*  System.out.println(ClassTest.class.getInterfaces());
        System.out.println("获取声明类："+ClassTest.class.getDeclaredClasses());
        System.out.println("获取构造方法："+ClassTest.class.getDeclaredConstructors());*/

    }
}
