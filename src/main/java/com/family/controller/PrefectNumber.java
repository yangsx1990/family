package com.family.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午4:27 2018/11/28
 */
public class PrefectNumber {

    private static Set<Integer> selectedNum=new HashSet<>();


    public static void main(String[] args) {
        /*Boolean status=judgement(28);
        System.out.println(status);*/


    }



    private static Boolean judgement(int number) {
        Integer sum=1;
        selectedNum.add(1);
        for (int i=2;i<number;i++){
            if(isFactor(i,number)){
                selectedNum.add(i);
                sum=sum+i;
                System.out.println("sum:"+sum);
            }
        }
        if(sum.equals(number)){
            return true;
        }
        return false;
    }

    private static boolean isFactor(int i,int number) {
        if(number % i  ==0){
            return true;
        }
        return false;
    }
}

