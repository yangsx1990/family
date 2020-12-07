package com.family.base;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/7/6 上午11:24
 * @modified By:
 */
public class TestException {

    private static  long userId;


    static {
        try{
            userId=getException();
            System.out.println("try:"+userId);
        }catch (Exception e){
            userId=(long)111;
            e.printStackTrace();

        }
    }

    private static long getException() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        System.out.println("userId:"+userId);
        int hash=100;
        int n=34;
        System.out.println((n-1) & hash);
        System.out.println(hash % n);

        System.out.println( 33 &100 );
    }
}
