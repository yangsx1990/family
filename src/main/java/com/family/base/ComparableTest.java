package com.family.base;

import java.util.Arrays;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 上午10:13
 * @modified By:
 */
public class ComparableTest {

    public static void main(String[] args) {
        ComparableModel m1=new ComparableModel(1,11);
        ComparableModel m2=new ComparableModel(2,12);
        ComparableModel m3=new ComparableModel(3,14);

        ComparableModel[] ms=new ComparableModel[3];
        ms[0]=m1; ms[1]=m2; ms[2]=m3;
        //Arrays.sort(ms);
        Arrays.sort(ms,new ComparatorModel());
        System.out.println(Arrays.toString(ms));
    }
}
