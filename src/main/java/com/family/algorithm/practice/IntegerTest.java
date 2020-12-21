package com.family.algorithm.practice;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/21 上午10:04
 * @modified By:
 */
public class IntegerTest {
    public static void main(String[] args) {
        System.out.println(isHappy(119));
    }
    public static boolean isHappy(int n) {
        int value=0;
        String nStr=n+"";
        int j=50;
        while(j>0){
            for (int i = 0; i <nStr.length() ; i++) {
                int num=Integer.valueOf(nStr.substring(i,i+1));
                value+=num*num;
                System.out.println("value:"+value);
            }
            if(value==1){
                return true;
            }
            nStr=value+"";
            value=0;
            j--;
        }
        return false;
    }
}
