package com.family;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/9/29 上午10:31
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        A a= new B();
        test(a);
    }
    public static  void  test(A a){
        System.out.println("test A");
        a.whoAmI();
    }
    public static  void  test(B b){
        System.out.println("test B");
        b.whoAmI();
    }
}
