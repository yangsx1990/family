package com.family.base;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/27 上午10:30
 * @modified By:
 */
public class InnerClassTest {

    private String str;

    private  static  String str1;

    public String a;

    class Test{
        private int ab;
        public int stt;

        /*public void test{
            InnerClassTest.Test innerClassTest=new InnerClassTest.Test();
            //innerClassTest.
        }*/
    }

    public static void main(String[] args) {
        InnerClassTest innerClassTest=new InnerClassTest();
        //innerClassTest.Test.
    }
}
