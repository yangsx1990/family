package com.family.leetcode;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午8:13 2019/2/21
 */
public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum reverseNum=new ReverseNum();
        int result=reverseNum.reverse(123);
        //System.out.println(result);
        System.out.println(127 /2);
    }

    public int reverse(int x) {
        int result=0;
        if(x>=0){

        }
        String xx=x+"";
        String prefix=xx.substring(0);
        int forlength=(xx.length()-1)/2;
        for (int i=0;i<=forlength;i++){
            String temp="";
            temp=xx.substring(i);

        }
        return result;

    }
}
